package com.bankapp.service;

import java.util.List;
import com.bankapp.model.Customer;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    void deleteCustomer(Long id);
}