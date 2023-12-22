package org.example.hibernate.dao;

import org.example.hibernate.entity.PersonId;
import org.example.hibernate.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonId> {
    List<Persons> findAllByCity(String city);

    List<Persons> findAllById_AgeLessThanOrderById_AgeAsc(int age);

    Optional<Persons> findById_NameAndId_Surname(String name, String surname);
}
