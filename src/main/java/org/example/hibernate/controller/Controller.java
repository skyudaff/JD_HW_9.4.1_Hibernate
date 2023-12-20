package org.example.hibernate.controller;

import lombok.RequiredArgsConstructor;
import org.example.hibernate.entity.Persons;
import org.example.hibernate.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Service service;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return service.getPersonsByCity(city);
    }
}
