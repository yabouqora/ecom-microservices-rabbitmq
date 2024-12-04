package com.example.commandeservice.messaging;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    @Bean
    public Queue inventoryUpdatedQueue(){
        return new Queue("inventoryUpdatedQueue");
    }
    @Bean
    public MessageConverter jsonmessageconverter(){
       return new Jackson2JsonMessageConverter();
    }
    @Bean
    public RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate= new RabbitTemplate();
        rabbitTemplate.setMessageConverter(jsonmessageconverter());
        return rabbitTemplate;
    }
}
