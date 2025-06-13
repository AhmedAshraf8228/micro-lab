package iti.jets.product.service;

import iti.jets.product.dto.ProductDTO;
import iti.jets.product.entity.Product;
import iti.jets.product.repo.ProductRepo;
import iti.jets.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ProductMapper productMapper;

    public List<ProductDTO> getProductsByOrderId(int orderId) {
        List<Product> products = productRepo.findByOrderOrderId(orderId);
        return products.stream()
                       .map(productMapper::toDTO)
                       .collect(Collectors.toList());
    }

}
