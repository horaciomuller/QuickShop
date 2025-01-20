package dev.java.ecommerce.basket_service.service;

import dev.java.ecommerce.basket_service.client.PlatziStoreClient;
import dev.java.ecommerce.basket_service.client.response.PlatziProductReponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductService {

    private final PlatziStoreClient storeClient;

    public ProductService(PlatziStoreClient storeClient) {
        this.storeClient = storeClient;
    }

    @Cacheable(value = "produtos")
    public List<PlatziProductReponse> getAllProducts() {
        log.info("Getting all products");
        return storeClient.getAllProducts();
    }

    @Cacheable(value = "produto", key = "#productId")
    public PlatziProductReponse getProduct(Long productId) {
        log.info("Getting product with id: {}", productId);
        return storeClient.getProduct(productId);
    }
}
