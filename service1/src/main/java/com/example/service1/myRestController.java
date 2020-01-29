package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String service1() {
        return "service1";
    }

    @GetMapping("/hello")
    public String hi() {
        System.out.println("hi i'm service1...11111111");

        String serverPort = environment.getProperty("local.server.port");

        System.out.println("port : " + serverPort);

        return "hello service1!!  port  : " + serverPort;
    }
}
