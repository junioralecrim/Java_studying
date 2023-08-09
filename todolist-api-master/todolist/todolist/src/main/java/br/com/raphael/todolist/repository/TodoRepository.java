package br.com.raphael.todolist.repository;

import br.com.raphael.todolist.domain.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
