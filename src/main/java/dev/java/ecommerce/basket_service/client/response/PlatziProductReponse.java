package dev.java.ecommerce.basket_service.client.response;

import java.io.Serializable;
import java.math.BigDecimal;

public record PlatziProductReponse(
        Long id,
        String title,
        BigDecimal price
) implements Serializable {
}
