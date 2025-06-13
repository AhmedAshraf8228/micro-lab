package iti.jets.product.dto;

import lombok.Data;


@Data
public class OrderDTO {
    private int orderId;
    private double totalPrice;
    private int userId;
}
