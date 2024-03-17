package com.todolist.todolist.model.todo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

// ToDoItem.java
@Entity
@Data
public class ToDoItem {
    @javax.persistence.Id
    @Id
    private Long id;

    private String title;
    private boolean completed;


}