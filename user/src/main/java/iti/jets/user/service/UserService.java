package iti.jets.user.service;

import iti.jets.user.dto.*;
import iti.jets.user.entity.User;
import iti.jets.user.mapper.UserMapper;
import iti.jets.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    UserMapper userMapper;

    @Autowired
    RestTemplate  restTemplate;

    private final MyFeignClient client;

    public UserService(MyFeignClient client) {
        this.client = client;
    }

    public List<UserDetails> getAllUsers() {
        List<UserDTO> userDTOs = userMapper.toDTOs(userRepo.findAll());

//        ResponseEntity<List<OrderDTO>> response = restTemplate.exchange(
//                "http://localhost:8081/order",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<OrderDTO>>() {}
//        );
//        List<OrderDTO> orderDTO = response.getBody();


        List<OrderDTO> orderDTO = client.callOrderService();
        List<UserDetails> userDetails = new ArrayList<>();
        for (UserDTO userDTO : userDTOs) {
            UserDetails details = new UserDetails();
            details.setUser(userDTO);
            List<OrderDTO> userOrders = new ArrayList<>();
            for (OrderDTO order : orderDTO) {
                if (order.getUserId() == userDTO.getUserId()) {
                    userOrders.add(order);
                }
            }
            details.setOrders(userOrders);
            userDetails.add(details);
        }
        return userDetails;
    }


}
