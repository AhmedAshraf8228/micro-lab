package iti.jets.order.repo;

import iti.jets.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    List<Order> findByUserUserId(int userId);
}
