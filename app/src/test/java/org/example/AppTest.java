package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class TodoListTest {

    @Test
    void testAddTask() {
        TodoList list = new TodoList();
        list.add("Buy milk");

        ArrayList<Task> tasks = list.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Buy milk", tasks.get(0).getDescription());
    }

    @Test
    void testMarkTaskComplete() {
        TodoList list = new TodoList();
        list.add("Do homework");
        list.complete("Do homework");

        ArrayList<Task> tasks = list.getTasks();
        assertTrue(tasks.get(0).isComplete());
    }

    @Test
    void testCompletedTasks() {
        TodoList list = new TodoList();
        list.add("A");
        list.add("B");
        list.complete("A");

        ArrayList<Task> completed = new ArrayList<>();
        for (Task task : list.getTasks()) {
            if (task.isComplete()) {
                completed.add(task);
            }
        }

        assertEquals(1, completed.size());
        assertEquals("A", completed.get(0).getDescription());
    }

    @Test
    void testIncompleteTasks() {
        TodoList list = new TodoList();
        list.add("X");
        list.add("Y");
        list.complete("X");

        ArrayList<Task> incomplete = new ArrayList<>();
        for (Task task : list.getTasks()) {
            if (!task.isComplete()) {
                incomplete.add(task);
            }
        }

        assertEquals(1, incomplete.size());
        assertEquals("Y", incomplete.get(0).getDescription());
    }

    @Test
    void testClear() {
        TodoList list = new TodoList();
        list.add("Something");
        list.add("Another thing");
        list.clear();

        assertEquals(0, list.getTasks().size());
    }
}
