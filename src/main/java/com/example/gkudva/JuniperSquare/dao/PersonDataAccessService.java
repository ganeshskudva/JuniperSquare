package com.example.gkudva.JuniperSquare.dao;

import com.example.gkudva.JuniperSquare.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("personDAO")
public class PersonDataAccessService implements PersonDAO {
    List<Person> lst;
    Map<UUID, Person> mp;

    public PersonDataAccessService(List<Person> lst, Map<UUID, Person> mp) {
        this.lst = lst;
        this.mp = mp;
    }

    public PersonDataAccessService() {
        this.lst = new ArrayList<>();
        this.mp = new HashMap<>();
    }

    @Override
    public int createPerson(UUID id, Person person) {
        Person p = new Person(id, person.getName(), person.getEmail(), person.getTags());
        lst.add(p);
        mp.put(id, p);

        return 0;
    }

    @Override
    public List<Person> getAllPeople() {
        return this.lst;
    }

    @Override
    public Person getUserById(UUID id) {
        if (!mp.containsKey(id))
            return null;

        return mp.get(id);
    }
}
