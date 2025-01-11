package com.hotwax.ECommerce.Services;
import com.hotwax.ECommerce.Entities.Customer;
import com.hotwax.ECommerce.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Create or Save Customer
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get Customer by ID
    public Customer getCustomerById(int customerId) {
        return customerRepository.findById(customerId).orElse(null); // Returns null if not found
    }

    // Update Customer
    public Customer updateCustomer(int customerId, Customer updatedCustomer) {
        if (customerRepository.existsById(customerId)) {
            updatedCustomer.setCustomerId(customerId); // Make sure the ID is correct
            return customerRepository.save(updatedCustomer);
        }
        return null; // Return null if customer doesn't exist
    }

    // Delete Customer
    public void deleteCustomer(int customerId) {
        customerRepository.deleteById(customerId);
    }
}
