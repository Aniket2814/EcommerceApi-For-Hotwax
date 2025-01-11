package com.hotwax.ECommerce.Controller;

import com.hotwax.ECommerce.Entities.Product;
import com.hotwax.ECommerce.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create Product (POST)
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    // Get all Products (GET)
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get Product by ID (GET)
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // Update Product (PUT)
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        return productService.updateProduct(id, updatedProduct);
    }

    // Delete Product (DELETE)
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
