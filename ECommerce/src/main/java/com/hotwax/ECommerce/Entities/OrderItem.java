package com.hotwax.ECommerce.Entities;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemSeqId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderHeader orderHeader;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
    private String status;

    public int getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public OrderItem() {
    }

    public OrderItem(int orderItemSeqId, OrderHeader orderHeader, Product product, int quantity, String status) {
        this.orderItemSeqId = orderItemSeqId;
        this.orderHeader = orderHeader;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public void setOrderItemSeqId(int orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderItem(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }



    // Getters and Setters
}
