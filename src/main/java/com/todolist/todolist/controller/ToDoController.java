package com.todolist.todolist.controller;

import com.todolist.todolist.model.todo.ToDoItem;
import com.todolist.todolist.repository.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ToDoController {
    @Autowired
    private ToDoItemRepository toDoItemRepository;

    // Mapping to display todo list
    @GetMapping("/todos")
    public String showToDoList(Model model) {
        List<ToDoItem> todos = toDoItemRepository.findAll();
        model.addAttribute("todos", todos);
        return "todo-list";
    }

    // Mapping to display the form for adding a new todo item
    @GetMapping("/todo/add")
    public String showAddForm(Model model) {
        model.addAttribute("todo", new ToDoItem());
        return "add-todo";
    }

    // Mapping to handle form submission for adding a new todo item
    @PostMapping("/todo/add")
    public String addTodoItem(ToDoItem todoItem) {
        toDoItemRepository.save(todoItem);
        return "redirect:/todos"; // Redirect to the todo list after adding the item
    }
}
