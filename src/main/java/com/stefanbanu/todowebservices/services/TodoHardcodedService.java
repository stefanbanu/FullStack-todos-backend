package com.stefanbanu.todowebservices.services;

import com.stefanbanu.todowebservices.dto.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoHardcodedService {
    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "stefan", "learn spring boot", LocalDate.now(), false));
        todos.add(new Todo(++idCounter, "stefan", "learn microservices 2", LocalDate.now(), false));
        todos.add(new Todo(++idCounter, "stefan", "learn angular", LocalDate.now(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteById(Long id) {
        Todo todo = findById(id);
        if (todo == null) return null;
        if (todos.remove(todo)) return todo;

        return null;
    }

    public Todo findById(Long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public Todo save(Todo todo) {
        if (todo.getId() == -1 || todo.getId() == 0) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }

        return todo;
    }
}
