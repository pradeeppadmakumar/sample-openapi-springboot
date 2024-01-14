package org.pradeep.padmakumar.person.controller;

import org.pradeep.padmakumar.person.server.api.PersonApi;
import org.pradeep.padmakumar.person.server.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController implements PersonApi {

    @Override
    public ResponseEntity<String> addPerson(Person person) {
        return ResponseEntity.status(HttpStatus.CREATED).body("created");
    }

    @Override
    public ResponseEntity<List<Person>> getPersons() {
        return ResponseEntity.ok(Arrays.asList(new Person().age(30).id(1L).name("Pradeep"), new Person().age(60).id(2L).name("Padmakumar")));
    }
}
