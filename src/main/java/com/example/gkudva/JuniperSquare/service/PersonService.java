package com.example.gkudva.JuniperSquare.service;

import com.example.gkudva.JuniperSquare.dao.PersonDAO;
import com.example.gkudva.JuniperSquare.model.Person;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {
    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int createPerson(Person person) {
        return this.personDAO.createPerson(person);
    }

    public List<Person> getAllPeople() {
        return this.personDAO.getAllPeople();
    }

    public Person getPersonById(String id) {
        UUID uuid = UUID.fromString(id);
        return this.personDAO.getUserById(uuid);
    }
}
