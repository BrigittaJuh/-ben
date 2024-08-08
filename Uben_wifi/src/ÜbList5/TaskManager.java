package ÜbList5;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void remoteTask(String description){
        tasks.removeIf(tasks -> tasks.getDescription().equalsIgnoreCase(description));
    }

    public void markTaskAsCompleted(String description){
        for (Task task : tasks){
            if (task.getDescription().equalsIgnoreCase(description)){
                task.setCompleted(true);
                return;
            }

        }
    }
    public void listAllTasks(){
        for (Task task : tasks){
            System.out.println(task);
        }
    }
    public void listTasksByCompletionStatus(boolean isCompleted){
        for (Task task : tasks){
            if (task.isCompleted() == isCompleted){
                System.out.println(task);
            }
        }
    }
}
