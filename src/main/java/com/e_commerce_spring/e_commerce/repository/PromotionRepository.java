package com.e_commerce_spring.e_commerce.repository;

import com.e_commerce_spring.e_commerce.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

    // Kodu bul ve aktifse getir
    Optional<Promotion> findByCodeAndIsActiveTrue(String code);
}