package com.stefanbanu.todowebservices.repository;

import com.stefanbanu.todowebservices.dto.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

    List<Todo> findAllByUsername(String username);
}
