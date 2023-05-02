package com.example.Java_4_sem_18.repository;

import com.example.Java_4_sem_18.Entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    List<Worker> findAllByLastName(String lastName);
    List<Worker> findAllByFirstName(String firstName);
    List<Worker> findAllByMiddleName(String middleName);


}
