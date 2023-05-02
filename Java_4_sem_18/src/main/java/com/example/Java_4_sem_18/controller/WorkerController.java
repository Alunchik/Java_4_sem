package com.example.Java_4_sem_18.controller;

import com.example.Java_4_sem_18.Entity.Worker;
import com.example.Java_4_sem_18.Service.WorkerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
public class WorkerController {

    private final WorkerServiceImpl workerService;

    @GetMapping("/worker")
    public List<Worker> getAllWorkers(){
        return getAllWorkers();
    }

    @PostMapping("/worker")
    public Worker addWorker(@RequestBody Worker worker){
        workerService.saveOrUpdate(worker);
        return worker;
    }
    @DeleteMapping("/worker")
    public Worker deleteWorker(@RequestBody Worker worker){
        workerService.delete(worker);
        return worker;
    }
}
