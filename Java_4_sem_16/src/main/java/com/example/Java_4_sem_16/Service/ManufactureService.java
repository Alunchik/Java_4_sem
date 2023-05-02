package com.example.Java_4_sem_16.Service;

import com.example.Java_4_sem_16.Entity.Manufacture;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequiredArgsConstructor
public class ManufactureService {
    private final SessionFactory sessionFactory;
    private Session session;
    @PostConstruct
    void init(){
        session = sessionFactory.openSession();
    }
    public List<Manufacture> getManufactures(){
        return session.createQuery("select u from Manufacture u", Manufacture.class).getResultList();
    }


    @GetMapping("/manufacture")
    public List<Manufacture> getAllManufactures(){
        return getManufactures();
    }

    @PostMapping("/manufacture")
    public Manufacture addManufacture(@RequestBody Manufacture manufacture){
        var transaction = session.beginTransaction();
        session.saveOrUpdate(manufacture);
        transaction.commit();
        return manufacture;
    }
    @DeleteMapping("/manufacture")
    public Manufacture deleteManufacture(@RequestBody Manufacture manufacture){
        session.remove(manufacture);
        return manufacture;
    }
}
