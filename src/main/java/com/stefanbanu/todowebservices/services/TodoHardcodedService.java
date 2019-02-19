package com.stefanbanu.todowebservices.services;

import com.stefanbanu.todowebservices.dto.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoHardcodedService {
    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static{
        todos.add(new Todo(++idCounter, "stefan", "learn spring boot", LocalDate.now(), false));
        todos.add(new Todo(++idCounter, "stefan", "learn microservices 2", LocalDate.now(), false));
        todos.add(new Todo(++idCounter, "stefan", "learn angular", LocalDate.now(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if (todo==null) return null;
        if(todos.remove(todo)) return todo;

        return null;
    }

    public Todo findById(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }
}
