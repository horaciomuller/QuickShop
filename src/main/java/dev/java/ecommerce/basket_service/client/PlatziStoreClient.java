package dev.java.ecommerce.basket_service.client;

import dev.java.ecommerce.basket_service.client.response.PlatziProductReponse;
import dev.java.ecommerce.basket_service.exception.CustomErrorDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PlatziStoreClient", url = "${basket.client.platzi}", configuration = { CustomErrorDecoder.class })
public interface PlatziStoreClient {

    @GetMapping("/products")
    List<PlatziProductReponse> getAllProducts();

    @GetMapping("/products/{id}")
    PlatziProductReponse getProduct(@PathVariable Long id);
}
