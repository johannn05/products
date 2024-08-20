package com.joshop.products.service;

import com.joshop.products.entity.Product;
import com.joshop.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(UUID productId) {
        return productRepository.findById(String.valueOf(productId));
    }

    public Product updateProduct(UUID productId, Product product) {
        if (productRepository.existsById(String.valueOf(productId))) {
            product.setProductId(productId);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(UUID productId) {
        productRepository.deleteById(String.valueOf(productId));
    }
}
