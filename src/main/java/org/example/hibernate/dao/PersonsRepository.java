package org.example.hibernate.dao;

import org.example.hibernate.entity.PersonId;
import org.example.hibernate.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonId> {
    @Query("select p from Persons p where p.city = :city")
    List<Persons> findAllByCity(String city);

    @Query("select p from Persons p where p.id.age < :age order by p.id.age")
    List<Persons> findAllById_AgeLessThanOrderById_AgeAsc(int age);

    @Query("select p from Persons p where p.id.name = :name and p.id.surname = :surname")
    Optional<Persons> findById_NameAndId_Surname(String name, String surname);
}
