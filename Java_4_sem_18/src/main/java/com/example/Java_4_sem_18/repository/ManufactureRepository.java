package com.example.Java_4_sem_18.repository;

import com.example.Java_4_sem_18.Entity.Manufacture;
import com.example.Java_4_sem_18.Entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ManufactureRepository extends JpaRepository<Manufacture, Long> {
    List<Manufacture> findAllByName(String name);
    List<Manufacture> findAllByAddress(String address);
    @Query(value = "select workers.* from workers join manufactures on users.id = workers.user_id where workers.id = :manufactureId", nativeQuery = true)
    List<Worker> findAllByManufactureId(Long manufactureId);
}
