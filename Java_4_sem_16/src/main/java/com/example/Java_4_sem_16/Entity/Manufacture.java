package com.example.Java_4_sem_16.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="manufactures")
@Getter
@Setter
public class Manufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="address")
    private String address;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy =  "manufacture")
    private List<Worker> workerList;
}
