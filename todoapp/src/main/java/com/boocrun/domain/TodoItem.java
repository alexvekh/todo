package com.boocrun.domain;

public class TodoItem {
    //Integer stores 2,147,483,643 
    private Integer id;
    private String task;
    private Boolean isDone;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public Boolean getIsDone() {
        return isDone;
    }
    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }
    
    
    

}
