package com.example.gkudva.JuniperSquare.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Person {

    UUID id;
    String name;
    String email;
    List<String> tags;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("email") String email,
                  @JsonProperty("tags") List<String> tags) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tags = tags;
    }

    public Person(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.tags = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
