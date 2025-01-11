package com.hotwax.ECommerce.respositories;

import com.hotwax.ECommerce.Entities.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Integer> {
}
