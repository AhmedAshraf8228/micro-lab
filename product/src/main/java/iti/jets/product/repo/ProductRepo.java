package iti.jets.product.repo;

import iti.jets.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByOrderOrderId(int orderId);
}
