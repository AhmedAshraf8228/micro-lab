package iti.jets.order.service;

import iti.jets.order.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "product" , path = "/product")
public interface ProductFeign {

    @GetMapping("/order/{orderId}")
    List<ProductDTO> getOrderById(@PathVariable("orderId") int orderId);

}