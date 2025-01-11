package com.hotwax.ECommerce.Controller;

import com.hotwax.ECommerce.Entities.OrderItem;
import com.hotwax.ECommerce.Services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    // Create OrderItem (POST)
    @PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.createOrderItem(orderItem);
    }

    // Get All OrderItems (GET)
    @GetMapping
    public List<OrderItem> getAllOrderItems() {
        return orderItemService.getAllOrderItems();
    }

    // Get OrderItem by ID (GET)
    @GetMapping("/{id}")
    public OrderItem getOrderItemById(@PathVariable int id) {
        return orderItemService.getOrderItemById(id);
    }

    // Update OrderItem (PUT)
    @PutMapping("/{id}")
    public OrderItem updateOrderItem(@PathVariable int id, @RequestBody OrderItem updatedOrderItem) {
        return orderItemService.updateOrderItem(id, updatedOrderItem);
    }

    // Delete OrderItem (DELETE)
    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable int id) {
        orderItemService.deleteOrderItem(id);
    }
}
