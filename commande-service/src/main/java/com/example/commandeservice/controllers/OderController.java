package com.example.commandeservice.controllers;

import com.example.commandeservice.entities.Order;
import com.example.commandeservice.messaging.OrderMessageProducer;
import com.example.commandeservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OderController {

    @Autowired
    private OrderService orderService ;
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders() ;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id) ;
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return null;

//        return orderService.addOrder(order) ;
    }

}
