package com.example.Java_4_sem_18.Service;

import com.example.Java_4_sem_18.Entity.Manufacture;
import com.example.Java_4_sem_18.Entity.Worker;
import com.example.Java_4_sem_18.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerServiceImpl {
    private final WorkerRepository workerRepository;
    public Manufacture getManufactureByWorker(Long workerId){
        return workerRepository.findById(workerId).orElseThrow(()->
                new IllegalStateException("Worker with this id not found")).getManufacture();
    }


    public List<Worker> getAllWorkers(){
        return workerRepository.findAll();
    }
    public List<Worker> getWorkersByFirstName(String name){
        return workerRepository.findAllByFirstName(name);
    }
    public List<Worker> getWorkersByLastName(String name){
        return workerRepository.findAllByLastName(name);
    }
    public List<Worker> getWorkersByMiddleName(String name){
        return workerRepository.findAllByMiddleName(name);
    }
    public void saveOrUpdate(Worker worker){
        workerRepository.save(worker);
    }
    public void delete(Worker worker){
        workerRepository.delete(worker);
    }
}
