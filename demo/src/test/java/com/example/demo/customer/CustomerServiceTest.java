package com.example.demo.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {


    private CustomerService underTest;
    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        Customer jamila = new Customer(1L,
                "jamila",
                "password",
                "jamila@email.com"
        );
        Customer ali = new Customer(2L,
                "ali",
                "password",
                "ali@email.com"
        );

        customerRepository.saveAll(Arrays.asList(jamila, ali));

        List<Customer> customers = underTest.getCustomers();

        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {
        Customer jamila = new Customer(1L,
                "jamila",
                "password",
                "jamila@email.com"
        );

        customerRepository.save(jamila);

        Customer customer = underTest.getCustomer(1L);

        assertEquals(1L, customer.getId());
        assertEquals("jamila", customer.getName());
        assertEquals("password", customer.getPassword());
        assertEquals("jamila@email.com", customer.getEmail());
    }
}