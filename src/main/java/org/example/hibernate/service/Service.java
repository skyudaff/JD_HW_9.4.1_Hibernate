package org.example.hibernate.service;

import lombok.RequiredArgsConstructor;
import org.example.hibernate.dao.Repository;
import org.example.hibernate.entity.Persons;

import java.util.List;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public List<Persons> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
