package com.example.hibernate_data_t4.repository.entity;


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
@Table(name="PersonTable")


public class Person {


    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String city;
    @EmbeddedId
    private PersonId personId;

}
