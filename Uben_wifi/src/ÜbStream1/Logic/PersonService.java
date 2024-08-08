package ÜbStream1.Logic;

import ÜbStream1.date.Person;

import java.util.List;

public class PersonService {
    public Double getAverageAge (List<Person> persons){
        return persons.stream()
                .mapToDouble(person -> person.age())
                .average()
                .getAsDouble();
    }
}
