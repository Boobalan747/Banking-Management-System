package com.bankapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bankapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}