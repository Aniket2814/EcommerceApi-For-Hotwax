
package com.hotwax.ECommerce.Services;

import com.hotwax.ECommerce.Entities.Product;
import com.hotwax.ECommerce.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Create a new Product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Get all Products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get Product by ID
    public Product getProductById(int id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }

    // Update a Product
    public Product updateProduct(int id, Product updatedProduct) {
        Product existingProduct = getProductById(id);
        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setColor(updatedProduct.getColor());
        existingProduct.setSize(updatedProduct.getSize());
        return productRepository.save(existingProduct);
    }

    // Delete a Product
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
