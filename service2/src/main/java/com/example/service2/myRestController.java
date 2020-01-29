package com.example.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String service2() {
        return "service2";
    }

    @GetMapping("/hello")
    public String hi() {
        System.out.println("hi i'm service2..2222222222");

        String serverPort = environment.getProperty("local.server.port");

        System.out.println("port : " + serverPort);

        return "hello backend!!  port  : " + serverPort;
    }
}
