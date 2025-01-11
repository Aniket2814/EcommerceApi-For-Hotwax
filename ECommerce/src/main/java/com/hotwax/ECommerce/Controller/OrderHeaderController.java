package com.hotwax.ECommerce.Controller;

import com.hotwax.ECommerce.Entities.OrderHeader;
import com.hotwax.ECommerce.Services.OrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-headers")
public class OrderHeaderController {

    @Autowired
    private OrderHeaderService orderHeaderService;

    // Create OrderHeader (POST)
    @PostMapping
    public OrderHeader createOrderHeader(@RequestBody OrderHeader orderHeader) {
        return orderHeaderService.createOrderHeader(orderHeader);
    }

    // Get all OrderHeaders (GET)
    @GetMapping
    public List<OrderHeader> getAllOrderHeaders() {
        return orderHeaderService.getAllOrderHeaders();
    }

    // Get OrderHeader by ID (GET)
    @GetMapping("/{id}")
    public OrderHeader getOrderHeaderById(@PathVariable int id) {
        return orderHeaderService.getOrderHeaderById(id);
    }

    // Update OrderHeader (PUT)
    @PutMapping("/{id}")
    public OrderHeader updateOrderHeader(@PathVariable int id, @RequestBody OrderHeader updatedOrderHeader) {
        return orderHeaderService.updateOrderHeader(id, updatedOrderHeader);
    }

    // Delete OrderHeader (DELETE)
    @DeleteMapping("/{id}")
    public void deleteOrderHeader(@PathVariable int id) {
        orderHeaderService.deleteOrderHeader(id);
    }
}
