package com.e_commerce_spring.e_commerce.repository;

import com.e_commerce_spring.e_commerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

   
    List<Order> findAllByUserIdOrderByCreatedAtDesc(Long userId);

    // Sipariş koduna göre bulma
    // Optional<Order> findByOrderNumber(String orderNumber);
}