package ÜbList1;

public class Main {
    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.addStudent("Bela");
        sl.addStudent("Anna");
        sl.addStudent("Csilla");

        System.out.println("Diakok listaja: ");
        sl.listStudent();

        sl.remoteStudent("Bela");

        System.out.println("frissitet diakok listaja");
        sl.listStudent();
    }
}
