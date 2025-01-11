package com.hotwax.ECommerce.respositories;

import com.hotwax.ECommerce.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
