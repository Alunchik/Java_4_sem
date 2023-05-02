package com.example.Java_4_sem_15.Service;

import com.example.Java_4_sem_15.Entity.Manufacture;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
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

    CriteriaBuilder builder;
    CriteriaQuery<Manufacture> manufactureCriteriaQuery;
    Root<Manufacture> root;


    @PostConstruct
    void init(){
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        manufactureCriteriaQuery = builder.createQuery(Manufacture.class);
        root = manufactureCriteriaQuery.from(Manufacture.class);
    }
    public List<Manufacture> getManufactures(){
        return session.createQuery("select u from Manufacture u", Manufacture.class).getResultList();
    }

    public List<Manufacture> getManufacturesByName(String name){
        manufactureCriteriaQuery.select(root).where(builder.equal(root.get("name"), name));
        return session.createQuery(manufactureCriteriaQuery).getResultList();
    }

    public List<Manufacture> getManufacturesByAddress(String address){
        manufactureCriteriaQuery.select(root).where(builder.equal(root.get("address"), address));
        return session.createQuery(manufactureCriteriaQuery).getResultList();
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
