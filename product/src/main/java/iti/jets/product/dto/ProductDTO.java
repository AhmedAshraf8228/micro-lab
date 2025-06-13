package iti.jets.product.dto;

import lombok.Data;


@Data
public class ProductDTO {
    private int productId;
    private String productName;
    private int quantity;
    private double price;
    private int orderId;
}