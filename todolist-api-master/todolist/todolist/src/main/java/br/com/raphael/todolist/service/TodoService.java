package br.com.raphael.todolist.service;

import br.com.raphael.todolist.domain.model.Todo;
import br.com.raphael.todolist.exception.ServiceException;
import br.com.raphael.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todo.setCreationDate(LocalDateTime.now());
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "priority");
        return todoRepository.findAll(sort);
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new ServiceException("Task not found"));
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
