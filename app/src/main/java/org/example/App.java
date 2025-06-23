package org.example;

public class App {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        // add tasks
        list.add("Buy milk");
        list.add("Buy eggs");
        list.add("Do laundry");

        // mark one as complete
        list.complete("Buy eggs");

        // show all tasks
        System.out.println("All Tasks:");
        list.all();

        // show completed tasks
        System.out.println("\nCompleted Tasks:");
        list.completeTasks();

        // show incomplete tasks
        System.out.println("\nIncomplete Tasks:");
        list.incompleteTasks();

        // clear the list
        list.clear();

        // show all tasks again
        System.out.println("\nAfter clearing:");
        list.all();
    }
}
