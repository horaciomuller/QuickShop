package dev.java.ecommerce.basket_service.controller.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BasketRequest {

    @NotEmpty(message = "Id do cliente é obrigatório.")
    private Long clientId;

    @NotNull
    private List<ProductRequest> products;

}
