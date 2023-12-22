package org.example.hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.example.hibernate.entity.Persons;
import org.example.hibernate.service.PersonsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonsController {
    private final PersonsService personsService;

    @GetMapping("/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return personsService.getPersonsByCity(city);
    }

    @GetMapping("/by-age")
    public List<Persons> getPersonsByAgeLess(@RequestParam int age) {
        return personsService.getPersonsByAgeLessAsc(age);
    }

    @GetMapping("/by-name-surname")
    public Optional<Persons> getPersonsByNameAndSurname(@RequestParam String name, String surname) {
        return personsService.getPersonsByNameAndSurname(name, surname);
    }

}
