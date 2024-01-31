package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//@Repository
//@Primary
public class CustomerRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Arrays.asList(
                new Customer(1L,"Ivan Zhang", "password1"),
                new Customer(2L,"Jamila Ahmed", "password2")
        );
    }
}
