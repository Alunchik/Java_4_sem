package com.example.Java_4_sem_15.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Manufacture")
@Getter
@Setter
public class Manufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="address")
    private String address;
    @Column(name="name")
    private String name;
}
