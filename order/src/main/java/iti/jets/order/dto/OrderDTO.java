package iti.jets.order.dto;

import lombok.Data;

import java.util.List;


@Data
public class OrderDTO {
    private int orderId;
    private double totalPrice;
    private int userId;
    private List<ProductDTO> products;
}
