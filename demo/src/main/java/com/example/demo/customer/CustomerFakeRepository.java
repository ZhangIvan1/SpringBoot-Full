package com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Ivan Zhang", "password1", "email@gmail.com"),
                new Customer(2L, "Jamila Ahmed", "password2", "email@gmail.com"),
                new Customer(3L, "James Bond", "password3", "email@gmail.com")
        );
    }
}
