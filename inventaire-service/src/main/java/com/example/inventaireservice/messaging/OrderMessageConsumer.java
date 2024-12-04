package com.example.inventaireservice.messaging;

//import com.example.inventaireservice.dto.OrderMessage;
import com.example.inventaireservice.services.InventoryService;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class OrderMessageConsumer {
//    @Autowired
//    private InventoryService inventoryService;
//
//    @RabbitListener(queues = "inventoryUpdatedQueue")
//    public void consumeMessage(OrderMessage orderMessage){
//        System.out.println(orderMessage);
//    }
}
