package com.area.services;

import com.area.models.Person;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingKey}")
    private String routingKey;

    public void send(Person person) {
        rabbitTemplate.convertAndSend(exchange, routingKey, person);
        System.out.println("Send msg = " + person);
    }
}