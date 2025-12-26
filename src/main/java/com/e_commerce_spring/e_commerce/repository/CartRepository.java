package com.e_commerce_spring.e_commerce.repository;

import com.e_commerce_spring.e_commerce.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    
    Optional<Cart> findByUserId(Long userId);
}
