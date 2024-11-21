package ÜbStreams1;

import ÜbStream1.Logic.PersonService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 17),
                new Person("Jane", 20),
                new Person("Max", 15),
                new Person("Anna", 30)
        );

        PersonService service = new PersonService();
        List<Person> adults = service.filterAdults(people);

        adults.forEach(person -> System.out.println(person.name() + " is an adult."));
    }
}
