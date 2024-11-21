package ÜbList1;

public class Main {
    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.addStudent("Anna");
        sl.addStudent("Csilla");
        sl.addStudent("Bela");
        sl.addStudent("Karoly");

        System.out.println("Diakok listalya");
        sl.listStudents();
        sl.removeStudent("Anna");
        System.out.println("Frissitett lsita ");
        sl.listStudents();
    }
}
