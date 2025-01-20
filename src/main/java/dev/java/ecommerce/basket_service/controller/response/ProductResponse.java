package dev.java.ecommerce.basket_service.controller.response;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public class ProductResponse {

    private Long id;
    private String name;
    private BigDecimal price;
    private Long quantity;
}
