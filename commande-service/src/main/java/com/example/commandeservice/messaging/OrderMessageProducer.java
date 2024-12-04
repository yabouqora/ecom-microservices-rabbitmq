package com.example.commandeservice.messaging;

import com.example.commandeservice.dto.OrderMessage;
import com.example.commandeservice.entities.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.NoOpResponseErrorHandler;

@Service
public class OrderMessageProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(Order order){
        OrderMessage orderMessage= new OrderMessage();
        orderMessage.setId(order.getId());
        orderMessage.setProductId(order.getProductId());
        orderMessage.setQuantity(order.getQuantity());
        rabbitTemplate.convertAndSend("inventoryUpdatedQueue",orderMessage);


    }
}
