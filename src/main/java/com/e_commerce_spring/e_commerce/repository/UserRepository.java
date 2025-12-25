package com.e_commerce_spring.e_commerce.repository;


import com.e_commerce_spring.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    boolean existsEmail(String email);
}
