package com.example.Java_4_sem_18.Service;

import com.example.Java_4_sem_18.Entity.Manufacture;
import com.example.Java_4_sem_18.Entity.Worker;
import com.example.Java_4_sem_18.repository.ManufactureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ManufactureServiceImpl{
    private final ManufactureRepository manufactureRepository;


    public List<Worker> getWorkersByManufacture(Long id){
        return manufactureRepository.findAllByManufactureId(id);
    }
    public List<Manufacture> getAllManufactures(){
        return manufactureRepository.findAll();
    }
    public List<Manufacture> getManufacturesByName(String name){
        return manufactureRepository.findAllByName(name);
    }
    public List<Manufacture> getManufacturesByAddress(String address){
        return manufactureRepository.findAllByAddress(address);
    }
    public void saveOrUpdate(Manufacture manufacture){
        manufactureRepository.save(manufacture);
    }
    public void delete(Manufacture manufacture){
        manufactureRepository.delete(manufacture);
    }
}
