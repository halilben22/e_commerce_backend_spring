package com.e_commerce_spring.e_commerce.model;

import com.e_commerce_spring.e_commerce.enums.PromotionType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "promotions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code; // Kullanıcının gireceği kod: "YAZ2024"

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PromotionType type; // Hesaplama stratejisini belirler

    @Column(nullable = false)
    private BigDecimal discountValue; // %10 veya 50 TL

    private BigDecimal minOrderAmount; // Bu promosyon için min sepet tutarı (Opsiyonel)

    @Column(nullable = false)
    private LocalDateTime startDate; // Başlangıç tarihi

    @Column(nullable = false)
    private LocalDateTime endDate;   // Bitiş tarihi

    @Column(nullable = false)
    private boolean isActive; // Acil durumda kampanyayı kapatmak için

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}