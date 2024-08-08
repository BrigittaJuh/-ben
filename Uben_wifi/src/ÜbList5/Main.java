package ÜbList5;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask("bevasarlas");
        tm.addTask("futas");
        tm.addTask("takarittas");
        tm.addTask("hajmosas");
        tm.addTask("fözes");

        System.out.println("Az összes feladat: ");
        tm.listAllTasks();

        tm.markTaskAsCompleted("fözes");
        tm.markTaskAsCompleted("futas");

        System.out.println("Kesz feladatok: ");
        tm.listTasksByCompletionStatus(true);

        System.out.println("nem kesz feladatok :");
        tm.listTasksByCompletionStatus(false);

        tm.remoteTask("hajmosas");

        System.out.println("Frissitett lista: ");
        tm.listAllTasks();

    }
}
