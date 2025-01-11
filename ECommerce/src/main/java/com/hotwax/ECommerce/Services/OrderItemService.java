
package com.hotwax.ECommerce.Services;

import com.hotwax.ECommerce.Entities.OrderItem;
import com.hotwax.ECommerce.respositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    // Create or Save OrderItem
    public OrderItem createOrderItem(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    // Get All OrderItems
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    // Get OrderItem by ID
    public OrderItem getOrderItemById(int id) {
        Optional<OrderItem> orderItem = orderItemRepository.findById(id);
        return orderItem.orElse(null);
    }

    // Update OrderItem
    public OrderItem updateOrderItem(int id, OrderItem updatedOrderItem) {
        Optional<OrderItem> existingOrderItem = orderItemRepository.findById(id);
        if (existingOrderItem.isPresent()) {
            OrderItem orderItem = existingOrderItem.get();
            orderItem.setOrderHeader(updatedOrderItem.getOrderHeader());
            orderItem.setProduct(updatedOrderItem.getProduct());
            orderItem.setQuantity(updatedOrderItem.getQuantity());
            orderItem.setStatus(updatedOrderItem.getStatus());
            return orderItemRepository.save(orderItem);
        }
        return null;
    }

    // Delete OrderItem
    public void deleteOrderItem(int id) {
        orderItemRepository.deleteById(id);
    }
}
