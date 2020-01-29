package com.example.service3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String service3() {
        return "service3";
    }

    @GetMapping("/hello")
    public String hi() {
        System.out.println("hi i'm service3...33333333");

        String serverPort = environment.getProperty("local.server.port");

        System.out.println("port : " + serverPort);

        return "hello service3!!  port  : " + serverPort;
    }
}
