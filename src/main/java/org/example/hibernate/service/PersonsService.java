package org.example.hibernate.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.hibernate.dao.PersonsRepository;
import org.example.hibernate.entity.Persons;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class PersonsService {
    private final PersonsRepository personsRepository;

    public List<Persons> getPersonsByCity(String city) {
        return personsRepository.findAllByCity(city);
    }

    public List<Persons> getPersonsByAgeLessAsc(int age) {
        return personsRepository.findAllById_AgeLessThanOrderById_AgeAsc(age);
    }

    public Optional<Persons> getPersonsByNameAndSurname(String name, String surname) {
        return personsRepository.findById_NameAndId_Surname(name, surname);
    }
}
