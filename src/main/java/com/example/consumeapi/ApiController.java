package com.example.consumeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {

    private static final String url = "https://uselessfacts.jsph.pl/api/v2/facts/random?language=en";
    private static final String countriesUrl = "https://restcountries.com/v3.1/all?fields=name,flags,capital";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/unusefulFact")
    public Object getRandomFact() {
        restTemplate.getForObject(url, Object.class);
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping(path = "/countries")
    public List<Object> getCountries() {
        Object[] countries = restTemplate.getForObject(countriesUrl, Object[].class);
        return Arrays.asList(countries);

    }
}
