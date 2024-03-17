package com.todolist.todolist.repository;

import com.todolist.todolist.model.todo.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// ToDoItemRepository.java
@Repository
public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {
}
