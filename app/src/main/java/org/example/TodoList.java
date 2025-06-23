package org.example;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String description) {
        tasks.add(new Task(description));
    }

    public void complete(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.markComplete();
                break;
            }
        }
    }

    public void all() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void completeTasks() {
        for (Task task : tasks) {
            if (task.isComplete()) {
                System.out.println(task);
            }
        }
    }

    public void incompleteTasks() {
        for (Task task : tasks) {
            if (!task.isComplete()) {
                System.out.println(task);
            }
        }
    }

    public void clear() {
        tasks.clear();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
}
