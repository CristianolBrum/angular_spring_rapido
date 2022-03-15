package io.github.cursodesousa.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.cursodesousa.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
