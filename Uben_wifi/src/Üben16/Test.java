package Üben16;

public class Test {
    public static void main(String[] args) {

        Student[] studenten = {
            new Student("Bela",3564),
            new Student("reka",1564),
            new Student("anna",564),
            new Student("karoly",364),
            new Student("marika",7564),
            new Student("Bea",4564),
            new Student("jolan",9564),
            new Student("janos",664),
            new Student("vilma",564),
        };

        for ( Student student : studenten){
            if (student.getMatrikelnummer() > 1000){
                System.out.println(student.getName());
            }
        }

    }
}
