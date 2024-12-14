package org.nk.restapi.controller;

import org.nk.restapi.dto.Person;
import org.nk.restapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TinderController {
@Autowired
PersonService personService;

@GetMapping("/getPerson")
public List<Person> getAllPerson(){
    List<Person> allPersonData = personService.getAllPersonData();
    List<Person> filterData = personService.filterDataBasedOnGender(allPersonData);
    return filterData;
}
    @PostMapping("/create-person")
    public Person createUser(@RequestBody Person person)
    {
        return person;
    }

}
