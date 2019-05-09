package com.stefanbanu.todowebservices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "id" })
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean isDone;

}
