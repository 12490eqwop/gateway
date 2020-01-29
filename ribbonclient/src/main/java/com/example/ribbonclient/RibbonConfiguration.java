package com.example.ribbonclient;

import com.netflix.client.ClientFactory;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import com.netflix.niws.client.http.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

public class RibbonConfiguration {

    @Autowired
    IClientConfig config;

    @Bean
    public IPing ribbonPing(IClientConfig config) {
        System.out.println("public IPing ribbonPing(IClientConfig config)=============");
        return new PingUrl();
    }


//    @Bean
//    public IRule roundRobinRule(IClientConfig config) {
//        System.out.println(" ===roundRobinRule=============");
//
//        return new RoundRobinRule();
//    }

    @Bean
    public IRule randomRule(IClientConfig config) {
        System.out.println(" ===randomRule================");

        return new RandomRule();
    }

//    @Bean
//    public IRule weightedResponseTimeRule(IClientConfig config) {
//        System.out.println(" ====weightedResponseTimeRule=============");
//
//        return new WeightedResponseTimeRule();
//    }
}


