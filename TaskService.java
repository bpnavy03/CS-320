/*
 * Bryan Pirrone
 * Professor Jacks
 * CS-320
 * 11/19/2023
 */

package TaskService;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<Task>();

    public TaskService() {
        this.tasks = new ArrayList<Task>();

    }

    //Get all tasks

    public List<Task> getTasks() {
        return tasks;
    }

    //Add task

    public boolean addTask(final Task newTask) {
        boolean taskExists = false;
        for(Task task : tasks) {
            if (newTask.getTaskId() == task.getTaskId()) {
                taskExists = true;
            }
        }
        
        if (!taskExists) {
            tasks.add(newTask);
        }

        else {
            System.out.println("Task already exists");
        }

        return taskExists;

    }

    //Delete task

    public boolean deleteTask(final int taskID) {
        boolean taskExists = false;
        for (Task task : tasks) {
            if (String.valueOf(taskID).equals(task.getTaskId())) {
                taskExists = true;
                tasks.remove(task);
                break;
            }
        }

        if (!taskExists) {
            System.out.println("Task does not exist");
        }

        return taskExists;
    }

    //Edit task name

    public boolean editTaskName(final int taskID, final String taskName) {
        boolean taskExists = false;
        for(Task task : tasks) {
            if (String.valueOf(taskID).equals(task.getTaskId())) {
                taskExists = true;
                task.setTaskName(taskName);
                break;
            }
        }

        if (!taskExists) {
            System.out.println("Task does not exist");
        }

        return taskExists;
    }

    //Edit task description
    
    public boolean editTaskDescription(final int taskID, final String taskDescription) {
        boolean taskExists = false;
        for(Task task : tasks) {
            if (String.valueOf(taskID).equals(task.getTaskId())) {
                taskExists = true;
                task.setTaskDescription(taskDescription);
                break;
            }
        }

        if (!taskExists) {
            System.out.println("Task does not exist");
        }

        return taskExists;
    }
}
