package iti.jets.product.dto;

import iti.jets.product.dto.UserDTO;
import lombok.Data;

import java.util.List;

@Data
public class UserDetails {
    private UserDTO user;
    private List<OrderDTO> orders;
}
