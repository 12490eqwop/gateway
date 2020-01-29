package com.example.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyClientSideController {


	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;




	@RequestMapping("/service/hi")
	public String service() {
		String randomString = this.restTemplate.getForObject("http://service/hello", String.class);
		return "Server Response :: " + randomString;
	}

	@RequestMapping("/service")
	public String hi() {
		String randomString = this.restTemplate.getForObject("http://service", String.class);
		return "Server Response :: " + randomString;
	}
}
