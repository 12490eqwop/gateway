package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@SpringBootApplication
public class ServiceApplication {

    @RequestMapping(value = "/gate")
    public String gate(){
        return "gate";
    }

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }





    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
