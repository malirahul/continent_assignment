package com.continent.jsons.controller;


import com.continent.jsons.entity.Continent;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/continent")
@Slf4j
public class ContinentController {

    private String apiUrl = "https://dummy-json.mock.beeceptor.com/continents";

    @Autowired
    RestTemplate restTemplate;

    @PostConstruct
    public void getContenentList() throws JsonProcessingException {
        Continent[] continents = restTemplate.getForObject(apiUrl, Continent[].class);
        List<Continent> list = Arrays.asList(continents);
        System.out.println(list.get(1));
    }


}
