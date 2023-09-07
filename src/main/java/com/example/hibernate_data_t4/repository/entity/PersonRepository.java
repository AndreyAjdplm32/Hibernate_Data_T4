package com.example.hibernate_data_t4.repository.entity;

import java.util.List;

public interface PersonRepository {
    List<Person> getPersonByCity(String city);
}


