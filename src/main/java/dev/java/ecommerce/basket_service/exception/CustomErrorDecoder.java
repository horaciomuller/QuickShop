package dev.java.ecommerce.basket_service.exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            case 400:
                return new BusinessException("Product Not Found");
            default:
                return new Exception("Exception while getting product");
        }
    }
}
