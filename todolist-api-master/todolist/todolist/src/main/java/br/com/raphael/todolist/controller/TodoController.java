package br.com.raphael.todolist.controller;

import br.com.raphael.todolist.domain.dto.TodoCreateRequest;
import br.com.raphael.todolist.domain.dto.TodoResponse;
import br.com.raphael.todolist.domain.dto.TodoUpdateRequest;
import br.com.raphael.todolist.domain.model.Todo;
import br.com.raphael.todolist.mapper.TodoMapper;
import br.com.raphael.todolist.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/todos", produces = {"application/json"})
@Tag(name = "todolist-api")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    @Operation(summary = "Criar uma nova todo", method = "POST")
    public ResponseEntity<List<TodoResponse>> create(@RequestBody @Valid TodoCreateRequest todoCreateRequest) {
        Todo todo = TodoMapper.toTodo(todoCreateRequest);
        List<Todo> updatedTodoList = todoService.create(todo);
        List<TodoResponse> todoResponses = TodoMapper.toResponseList(updatedTodoList);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoResponses);
    }

    @GetMapping
    @Operation(summary = "Listar todas as Todos", method = "GET")
    public ResponseEntity<List<Todo>> list() {
        return ResponseEntity.status(HttpStatus.OK).body(todoService.list());
    }

    @PutMapping("/edit/{id}")
    @Operation(summary = "Atualizar 1 atributo ou mais de uma todo pelo id", method = "PUT")
    public ResponseEntity<List<TodoResponse>> updateEdit(@PathVariable(value = "id") Long id,
                                                         @RequestBody TodoUpdateRequest todoUpdate) {
        Todo todo;
        todo = todoService.findById(id);
        TodoMapper.todoUpdateProperties(todoUpdate, todo);
        todoService.update(todo);
        List<Todo> todoList = todoService.list();
        List<TodoResponse> todoResponseList = TodoMapper.toResponseList(todoList);
        return ResponseEntity.status(HttpStatus.OK).body(todoResponseList);
    }

    @PutMapping("/concluded/{id}")
    @Operation(summary = "Marcar uma todo como concluída", method = "PUT")
    public ResponseEntity<List<TodoResponse>> updateFinish(@PathVariable(value = "id") Long id) {
        Todo todo;
        todo = todoService.findById(id);
        todo.setConcluded(true);
        todo.setCompletionDate(LocalDateTime.now());
        todoService.update(todo);
        List<Todo> todoList = todoService.list();
        List<TodoResponse> todoResponseList = TodoMapper.toResponseList(todoList);
        return ResponseEntity.status(HttpStatus.OK).body(todoResponseList);
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar uma todo pelo id", method = "DELETE")
    public ResponseEntity<List<Todo>> delete(@PathVariable(value = "id") Long id) {
        List<Todo> todoList = todoService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body(todoList);
    }
}
