package iti.jets.order.controller;



import iti.jets.order.dto.OrderDTO;
import iti.jets.order.entity.Order;
import iti.jets.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

     @Autowired
     private OrderService orderService;

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }



}
