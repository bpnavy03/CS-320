/*
 * Bryan Pirrone
 * Professor Jacks
 * CS-320
 * 11/19/2023
 */

package TaskService;

public class Task {
    private String taskID; //not null, blank, or gt 10 chars
    private String taskName; //not null, blank, or gt 20 chars
    private String taskDescription; //not null, blank, or gt 50 chars

    private Task() {}
    
    public Task(String taskID, String taskName, String taskDescription) {
        this();

        if (taskID == null || taskID.isBlank() || taskID.length() > 10 || taskName == null || taskName.isBlank() || taskName.length() > 20 || taskDescription == null || taskDescription.isBlank() || taskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid task parameters");
        }
        
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    //getters

    public String getTaskId() {
        return taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    //setters

    public void setTaskId(String taskID) {
        if (taskID == null || taskID.isBlank() || taskID.length() > 10) {
            throw new IllegalArgumentException("Invalid taskID");
        }

        this.taskID = taskID;
    }

    public void setTaskName(String taskName) {
        if (taskName == null || taskName.isBlank() || taskName.length() > 20) {
            throw new IllegalArgumentException("Invalid taskName");
        }

        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        if (taskDescription == null || taskDescription.isBlank() || taskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid taskDescription");
        }

        this.taskDescription = taskDescription;
    }
}
