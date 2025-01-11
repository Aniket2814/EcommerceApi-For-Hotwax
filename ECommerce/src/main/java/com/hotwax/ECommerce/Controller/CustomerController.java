package com.hotwax.ECommerce.Controller;

import com.hotwax.ECommerce.Entities.Customer;
import com.hotwax.ECommerce.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Create Customer (POST)
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    // Get Customer by ID (GET)
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }
    // Get All Customers (GET)
//    @GetMapping
//    public List<Customer> getAllCustomers() {
//        return customerService.getAllCustomers();
//    }


    // Update Customer (PUT)
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer updatedCustomer) {
        return customerService.updateCustomer(id, updatedCustomer);
    }

    // Delete Customer (DELETE)
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
    }
}
