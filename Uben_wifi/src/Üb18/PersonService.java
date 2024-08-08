package Üb18;

public class PersonService {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Teri", 17),
                new Person("feri", 49),
                new Person("mari", 23),
                new Person("kata", 29),

        };
        System.out.println("18 evesek multak");
        for (Person person : persons){
            if (person.getAge() > 18){
                System.out.println(person.getName());
            }
        }

    }
}
