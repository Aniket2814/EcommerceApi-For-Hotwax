package com.hotwax.ECommerce.Services;

import com.hotwax.ECommerce.Entities.OrderHeader;
import com.hotwax.ECommerce.respositories.OrderHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderHeaderService {

    @Autowired
    private OrderHeaderRepository orderHeaderRepository;

    // Create OrderHeader
    public OrderHeader createOrderHeader(OrderHeader orderHeader) {
        return orderHeaderRepository.save(orderHeader);
    }

    // Get all OrderHeaders
    public List<OrderHeader> getAllOrderHeaders() {
        return orderHeaderRepository.findAll();
    }

    // Get OrderHeader by ID
    public OrderHeader getOrderHeaderById(int id) {
        Optional<OrderHeader> optionalOrderHeader = orderHeaderRepository.findById(id);
        return optionalOrderHeader.orElseThrow(() -> new RuntimeException("OrderHeader not found with ID: " + id));
    }

    // Update OrderHeader
    public OrderHeader updateOrderHeader(int id, OrderHeader updatedOrderHeader) {
        OrderHeader existingOrderHeader = getOrderHeaderById(id);
        existingOrderHeader.setOrderDate(updatedOrderHeader.getOrderDate());
        existingOrderHeader.setCustomer(updatedOrderHeader.getCustomer());
        existingOrderHeader.setShippingContactMech(updatedOrderHeader.getShippingContactMech());
        existingOrderHeader.setBillingContactMech(updatedOrderHeader.getBillingContactMech());
        return orderHeaderRepository.save(existingOrderHeader);
    }

    // Delete OrderHeader
    public void deleteOrderHeader(int id) {
        orderHeaderRepository.deleteById(id);
    }
}
