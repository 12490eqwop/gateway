package com.example.ribbonserver1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String health() {
        return "ribbonServer1";
    }

    @GetMapping("/backend")
    public String backend() {
        System.out.println("MyRestController::backend...11111111");

        String serverPort = environment.getProperty("local.server.port");

        System.out.println("port : " + serverPort);

        return "hello backend!!  port  : " + serverPort;
    }
}
