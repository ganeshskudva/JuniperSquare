package com.example.gkudva.JuniperSquare.api;

import com.example.gkudva.JuniperSquare.model.Person;
import com.example.gkudva.JuniperSquare.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.*;

@RequestMapping(value = {"api/v1/users","api/v1/users/{userId}"})
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<?> addPerson(@Validated @NonNull @RequestBody Person person) {
        int resp = this.personService.createPerson(person);
        if(resp == 0)
            return new ResponseEntity<>(null, HttpStatus.CREATED);
        else
            return new ResponseEntity<>(null, HttpStatus.NOT_ACCEPTABLE);
    }


    //@GetMapping
    @RequestMapping(value = ("/"), method = RequestMethod.GET)
    public List<Person> getPeople() {
        return personService.getAllPeople();
    }



    //@GetMapping
    @RequestMapping(value={"/{userId}"}, method = RequestMethod.GET)
    @ResponseBody
    public Map<Object, Object> getPersonById(@NotBlank @NotNull @Valid @PathVariable(value="userId")String id) {
        Person person =  this.personService.getPersonById(id);
        Map<Object, Object> resp = new HashMap<>();
        if (id == null || id.isEmpty()) {
            resp.put("code", 404);
            resp.put("message", "Invalid user id");
        }

        else if (person == null) {
            resp.put("code", 404);
            resp.put("message", "No user with provided id");
        } else {
            resp.put("id", person.getId());
            resp.put("email", person.getEmail());
            resp.put("name", person.getName());
            resp.put("tags", person.getTags());
        }

        return resp;
    }



}
