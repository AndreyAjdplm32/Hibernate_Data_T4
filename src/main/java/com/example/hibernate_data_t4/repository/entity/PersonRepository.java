package com.example.hibernate_data_t4.repository.entity;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class PersonRepository {
    private final Map <String, Person> userMap = new ConcurrentHashMap<>();


}
