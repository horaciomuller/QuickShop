package dev.java.ecommerce.basket_service.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Product {

    private Long id;
    private String title;
    private Long quantity;
    private BigDecimal price;
}
