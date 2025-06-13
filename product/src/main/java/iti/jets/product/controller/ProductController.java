package iti.jets.product.controller;


import iti.jets.product.dto.ProductDTO;
import iti.jets.product.entity.*;
import iti.jets.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    ProductService productService;


    @GetMapping("/order/{orderId}")
    public List<ProductDTO> getProductsByOrderId(@PathVariable int orderId) {
        return productService.getProductsByOrderId(orderId);
    }
}
