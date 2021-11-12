package com.realstate.HW3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Service
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    @PersistenceUnit
    EntityManagerFactory entityManagerFactory;

    @Autowired
    User user;

    public void persist(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        user.setActive(true);
        user.setEmail("aaaa@gmail.com");
        user.setFirstName("Rez");
        user.setLastName("ASHTON");
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }
}
