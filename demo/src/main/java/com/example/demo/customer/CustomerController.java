package com.example.demo.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v1/customer")
@RestController
@Deprecated
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping(value = "all")
    List<Customer> getCustomer() {
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody Customer customer) {
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping
    void newCustomer(@RequestBody Customer customer){
        System.out.println("UPDATE REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST...");
        System.out.println(id);
    }
}
