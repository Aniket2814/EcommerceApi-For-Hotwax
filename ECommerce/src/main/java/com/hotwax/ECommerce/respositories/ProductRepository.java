package com.hotwax.ECommerce.respositories;
import com.hotwax.ECommerce.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

