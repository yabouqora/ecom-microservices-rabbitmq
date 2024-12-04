package com.example.commandeservice.restClient;

import com.example.commandeservice.dto.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductClient {
    @GetMapping("/produits/{id}")
    ProductResponse getProductById(@PathVariable String id) ;

}
