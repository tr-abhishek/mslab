package com.example.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Arrays;

@RequestMapping("/orders")
@RestController
public class OrderController 
{
    private List<Order> orders =  Arrays.asList(
        new Order(1,1,"test1"),
        new Order(2,2,"test2"),
        new Order(3,3,"test2"),
        new Order(4,4,"test2"),
        new Order(5,5,"test2"));

    @GetMapping()
    public List<Order> getAllOrders()
    {
        return orders;        
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id)
    {
        return orders.stream()
                     .filter(order -> order.getId()==id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);         
    }
}
