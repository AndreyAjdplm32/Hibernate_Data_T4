package com.example.hibernate_data_t4.service;

import com.example.hibernate_data_t4.repository.entity.Person;
import com.example.hibernate_data_t4.repository.entity.PersonRepositoryImpl;


import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private PersonRepositoryImpl personRepository;
    
    public List<Person> getPersonByCity (String city){
        return personRepository.getPersonByCity(city);
    }
}
