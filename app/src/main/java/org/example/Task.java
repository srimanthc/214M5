package org.example;

public class Task {
    private String description;
    private boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        isComplete = true;
    }

    @Override
    public String toString() {
    if (isComplete) {
        return "[X] " + description;
        } 
    else {
        return "[ ] " + description;
        }
    }

}
