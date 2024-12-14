package org.nk.restapi.service;

import org.nk.restapi.dto.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersonData();
    List<Person> filterDataBasedOnGender(List<Person> personList);

}
