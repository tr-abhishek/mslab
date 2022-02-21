package com.example.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/customers")
@RestController
    
public class CustomerController {

    private List<Customer> customers = Arrays.asList(
        new Customer(1,"test1"),
        new Customer(2,"test2"));

    @GetMapping()
    public List<Customer> getAllCustomers(){
        return customers;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id)
    {
        return customers.stream()
                        .filter(customer -> customer.getId()== id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);       
    }
}