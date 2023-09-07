package com.example.hibernate_data_t4.service;

import com.example.hibernate_data_t4.repository.entity.Person;
import com.example.hibernate_data_t4.repository.entity.PersonRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private PersonRepositoryImpl personRepository;

    public List<Person> getPersonByCity(String city) {
        return personRepository.getPersonByCity(city);
    }
}
