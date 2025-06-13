package iti.jets.user.dto;


import lombok.Data;

import java.util.List;


@Data
public class UserDTO {
    private int userId;
    private String userName;
    private List<OrderDTO> orders;

}