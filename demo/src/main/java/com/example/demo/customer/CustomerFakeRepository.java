package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Ivan Zhang"),
                new Customer(2L,"Jamila Ahmed"),
                new Customer(3L,"James Bond")
        );
    }
}
