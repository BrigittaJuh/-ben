package ÜbStreams1.logic;

import ÜbStreams1.Person;

import java.util.List;
import java.util.stream.Collectors;

public class personService {
    public List<Person> filterAdult(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());
    }
}
