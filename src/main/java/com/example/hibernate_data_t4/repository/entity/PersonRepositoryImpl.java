package com.example.hibernate_data_t4.repository.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class PersonRepositoryImpl implements PersonRepository {
    @PersistenceContext
    private EntityManager em;


    @Transactional
    @Override
    public List<Person> getPersonByCity(String city) {
       return em.createQuery("select p from Person p where p.city =:city").setParameter("city",city).getResultList();
        //return em.createQuery("select p from Person p", Person.class).getResultStream().filter(person -> person.getCity().equals(city)).toList();
    }
}
