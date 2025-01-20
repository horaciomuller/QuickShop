package dev.java.ecommerce.basket_service.controller.response;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public class BasketResponse {

    private String basketId;

    private Long clientId;

    private List<ProductResponse> products;

    private BigDecimal totalPrice;

}
