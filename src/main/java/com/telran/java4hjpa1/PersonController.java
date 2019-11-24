package com.telran.java4hjpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonDetailsRepository personDetailsRepository;

    @PostMapping("/save")
    public Person save(@RequestBody PersonDto person) { //firstName, lastName

        //firstName, lastName, id (by database)
        Person savedPerson = Person.builder()
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .build();
        personRepository.save(savedPerson);

        System.out.println(person.getDateOfBirth());
        PersonDetails details = PersonDetails.builder()
                .city(person.getCity())
                .dateOfBirth(person.getDateOfBirth())
                .person(savedPerson)
                .build();

        personDetailsRepository.save(details);
        return savedPerson;
    }

    @GetMapping("/all")
    public List<PersonDetails> findAll() {
        return personDetailsRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        personRepository.deleteById(id);
    }
}
