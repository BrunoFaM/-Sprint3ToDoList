package com.mindhub.todolist.exceptions;

public class TaskNotFoundException extends Exception {

    public TaskNotFoundException(String msg){
        super(msg);
    }
}