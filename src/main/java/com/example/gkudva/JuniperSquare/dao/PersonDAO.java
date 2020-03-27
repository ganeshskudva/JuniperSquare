package com.example.gkudva.JuniperSquare.dao;

import com.example.gkudva.JuniperSquare.model.Person;

import java.util.*;

public interface PersonDAO {
    int createPerson(UUID id, Person person);

    default int createPerson(Person person) {
        UUID id = UUID.randomUUID();
        createPerson(id, person);

        return 0;
    }

    List<Person> getAllPeople();

    Person getUserById(UUID id);
}
