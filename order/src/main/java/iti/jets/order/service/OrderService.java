package iti.jets.order.service;

import iti.jets.order.dto.*;
import iti.jets.order.entity.*;
import iti.jets.order.mapper.OrderMapper;
import iti.jets.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RestTemplate restTemplate;

    private ProductFeign productFeign;

    public OrderService(ProductFeign productFeign) {
        this.productFeign = productFeign;
    }

    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepo.findAll();
        List<OrderDTO> orderDTOs = orderMapper.toDTOs(orders);

        orderDTOs.forEach(orderDTO -> {

//            ResponseEntity<List<ProductDTO>> response = restTemplate.exchange(
//                    "http://localhost:8082/product/order/" + orderDTO.getOrderId(),
//                    HttpMethod.GET,
//                    null,
//                    new ParameterizedTypeReference<List<ProductDTO>>() {}
//            );
//            List<ProductDTO> products = response.getBody();

            List<ProductDTO> products = productFeign.getOrderById(orderDTO.getOrderId());

            orderDTO.setProducts(products);
        });


        return orderDTOs;
    }

}
