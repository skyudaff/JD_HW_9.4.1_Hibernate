package org.example.hibernate.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.hibernate.entity.Persons;

import java.util.List;

@RequiredArgsConstructor
@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private final EntityManager entityManager;

    @Transactional
    public List<Persons> getPersonsByCity(String city) {
        return entityManager
                .createQuery("select p from Persons p where p.city = :city", Persons.class)
                .setParameter("city", city)
                .getResultList();
    }
}
