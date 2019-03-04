package com.area.controllers;

import com.area.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.area.services.RabbitMQSender;


@RestController
@RequestMapping(value = "/api/")
public class RabbitMQWebController {

    @Autowired
    private RabbitMQSender rabbitMQSender;

    @GetMapping(value = "/producer")
    public String producer(@RequestParam("name") String name, @RequestParam("age") Integer age) {

        Person emp = new Person();
        emp.setName(name);
        emp.setAge(age);
        rabbitMQSender.send(emp);

        return "Message sent to the RabbitMQ!";
    }
}