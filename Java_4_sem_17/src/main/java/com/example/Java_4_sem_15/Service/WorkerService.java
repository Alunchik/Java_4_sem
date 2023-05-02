package com.example.Java_4_sem_15.Service;


import com.example.Java_4_sem_15.Entity.Manufacture;
import com.example.Java_4_sem_15.Entity.Worker;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@Service
@RequiredArgsConstructor
public class WorkerService {
    private final SessionFactory sessionFactory;
    private Session session;

    CriteriaBuilder builder;
    CriteriaQuery<Manufacture> workerCriteriaQuery;
    Root<Manufacture> root;
    @PostConstruct
    void init(){
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        workerCriteriaQuery = builder.createQuery(Manufacture.class);
        root = workerCriteriaQuery.from(Manufacture.class);
    }
    public List<Worker> getWorkers(){
        return session.createQuery("select u from Worker u", Worker.class).getResultList();
    }

    public List<Manufacture> getWorkersByLastName(String name){
        workerCriteriaQuery.select(root).where(builder.equal(root.get("lastName"), name));
        return session.createQuery(workerCriteriaQuery).getResultList();
    }

    public List<Manufacture> getWorkersByFirstName(String name){
        workerCriteriaQuery.select(root).where(builder.equal(root.get("firstName"), name));
        return session.createQuery(workerCriteriaQuery).getResultList();
    }

    public List<Manufacture> getWorkersByMiddleName(String name){
        workerCriteriaQuery.select(root).where(builder.equal(root.get("middleName"), name));
        return session.createQuery(workerCriteriaQuery).getResultList();
    }

    public Manufacture getManufactureByWorker(Long workerId){
        return session.createQuery("from Worker where id =:id", Worker.class).setParameter("id", workerId).getSingleResult().getManufacture();
    }
    @GetMapping("/worker")
    public List<Worker> getAllWorkers(){
        return getWorkers();
    }

    @PostMapping("/worker")
    public Long addWorker(@RequestBody Worker worker){
        var transaction = session.beginTransaction();
        session.saveOrUpdate(worker);
        transaction.commit();
        return worker.getId();
    }
    @DeleteMapping("/worker")
    public Worker deleteWorker(@RequestBody Worker worker){
        session.remove(worker);
        return worker;
    }

    @GetMapping("/worker/{workerId}/manufacture")
    public @ResponseBody Manufacture getWorkerManufacture(@PathVariable("workerId") Long workerId){
        return getManufactureByWorker(workerId);
    }
}
