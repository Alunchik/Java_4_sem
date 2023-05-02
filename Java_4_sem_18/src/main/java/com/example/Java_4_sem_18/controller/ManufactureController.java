package com.example.Java_4_sem_18.controller;

import com.example.Java_4_sem_18.Entity.Manufacture;
import com.example.Java_4_sem_18.Service.ManufactureServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ManufactureController {

    private final ManufactureServiceImpl manufactureService;

    @GetMapping("/manufacture")
    public List<Manufacture> getAllManufactures(){
        return manufactureService.getAllManufactures();
    }

    @PostMapping("/manufacture")
    public Manufacture addManufacture(@RequestBody Manufacture manufacture){
        manufactureService.saveOrUpdate(manufacture);
        return manufacture;
    }
    @DeleteMapping("/manufacture")
    public Manufacture deleteManufacture(@RequestBody Manufacture manufacture){
        manufactureService.delete(manufacture);
        return manufacture;
    }
}
