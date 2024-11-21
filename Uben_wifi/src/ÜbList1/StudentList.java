package ÜbList1;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<String> students;

    public StudentList (){
        students = new ArrayList<>();
    }

    public void addStudent(String name){
        students.add(name);

    }
    public void removeStudent(String name){
        students.remove(name);
    }

    public void listStudents(){
        for (String student : students){
            System.out.println(student);
        }
    }
}
