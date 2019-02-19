package com.stefanbanu.todowebservices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "id" })
public class Todo {

    private long id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean isDone;

}
