package com.example.demo.controllers;

import com.example.demo.entity.Manufacture;
import com.example.demo.entity.Worker;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkerController {
    ArrayList<Worker> workers = new ArrayList<>();

    @GetMapping("/worker")
    public List<Worker> getAllWorkers(){
        return workers;
    }

    @PostMapping("/worker")
    public Worker addManufacture(@RequestBody Worker worker){
        workers.add(worker);
        return worker;
    }
    @DeleteMapping("/worker")
    public Worker deleteWorker(@RequestBody Worker worker){
        for (Worker worker1: workers){
            if (worker.getLastName()==worker1.getLastName()){
                if(workers.remove(worker1)){
                    return worker1;
                }
            }
        }
        return null;
    }
}
