package com.joshop.products.repository;

import com.joshop.products.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByProductId(UUID productId);
}
