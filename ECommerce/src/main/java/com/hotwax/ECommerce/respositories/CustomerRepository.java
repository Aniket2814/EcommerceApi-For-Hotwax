package com.hotwax.ECommerce.respositories;

import com.hotwax.ECommerce.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
