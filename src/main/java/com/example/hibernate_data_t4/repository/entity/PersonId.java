package com.example.hibernate_data_t4.repository.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;
}
