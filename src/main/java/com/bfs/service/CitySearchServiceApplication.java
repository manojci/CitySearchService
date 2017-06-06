package com.bfs.service;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfs.lookup.City;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class CitySearchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitySearchServiceApplication.class, args);
    }

    @RequestMapping(value = "/citySearch", method = RequestMethod.GET)
    public Map<String, String> request() {
        return City.getCityList();
    }
}
