package com.example.commandeservice.services;

import com.example.commandeservice.dto.ProductResponse;
import com.example.commandeservice.entities.Order;
import com.example.commandeservice.messaging.OrderMessageProducer;
import com.example.commandeservice.repositories.OrderRepository;
import com.example.commandeservice.restClient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository ;
    @Autowired
    OrderMessageProducer orderMessageProducer;

    @Autowired
    private ProductClient productClient;

    public List<Order> getAllOrders() {
        return orderRepository.findAll() ;
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null) ;
    }

    public Order addOrder(Order order) {
        ProductResponse product = productClient.getProductById(order.getProductId()) ;

        if (product != null) {
            orderMessageProducer.sendMessage(order);
            return orderRepository.save(order) ;
        } else {
            throw new RuntimeException("Produit non trouvé") ;
        }
    }

}
