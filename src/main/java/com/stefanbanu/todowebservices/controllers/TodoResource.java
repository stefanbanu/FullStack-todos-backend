package com.stefanbanu.todowebservices.controllers;

import com.stefanbanu.todowebservices.dto.Todo;
import com.stefanbanu.todowebservices.services.TodoHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoResource {

    private TodoHardcodedService todoHardcodedService;

    @Autowired
    public TodoResource(TodoHardcodedService todoHardcodedService) {
        this.todoHardcodedService = todoHardcodedService;
    }

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username) {

        return todoHardcodedService.findAll();
    }
}
