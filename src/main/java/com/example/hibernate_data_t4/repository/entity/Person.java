package com.example.hibernate_data_t4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "person",schema = "hibernate")
@IdClass(PersonId.class)

public class Person {

    @Id
    @Column(nullable = false)
    private String name;
    @Id
    @Column(nullable = false)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String city;

}
