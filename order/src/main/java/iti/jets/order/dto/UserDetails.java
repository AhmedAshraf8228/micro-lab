package iti.jets.order.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDetails {
    private UserDTO user;
    private List<OrderDTO> orders;
}
