package com.example.Java_4_sem_15.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Entity")
@Getter
@Setter
public class Manufacture {
    @Id
    @SequenceGenerator(name = "manufactures_seq", sequenceName =
            "manufactures_sequence", allocationSize = 1)
    @GeneratedValue(generator = "manufactures_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="address")
    private String address;
    @Column(name="name")
    private String name;
}
