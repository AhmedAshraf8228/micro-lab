package iti.jets.user.service;


import iti.jets.user.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "order")
public interface MyFeignClient {
    @GetMapping("/order")
    List<OrderDTO> callOrderService();
}
