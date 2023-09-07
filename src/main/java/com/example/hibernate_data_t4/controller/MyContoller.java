package com.example.hibernate_data_t4.controller;

import com.example.hibernate_data_t4.repository.entity.Person;
import com.example.hibernate_data_t4.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class MyContoller {
    private final Service service;

    public MyContoller(Service service) {
        this.service = service;
    }
    @GetMapping("persons/{city}")
    public List<Person> getPersonsByCity(@RequestParam ("city") String city) {
        return service.getPersonByCity(city);
    }

}
