package com.e_commerce_spring.e_commerce;

import org.springframework.boot.SpringApplication;

public class TestECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.from(EcommerceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
