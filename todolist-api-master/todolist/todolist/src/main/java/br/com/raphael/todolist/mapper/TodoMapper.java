package br.com.raphael.todolist.mapper;

import br.com.raphael.todolist.domain.dto.TodoCreateRequest;
import br.com.raphael.todolist.domain.dto.TodoResponse;
import br.com.raphael.todolist.domain.dto.TodoUpdateRequest;
import br.com.raphael.todolist.domain.model.Todo;

import java.util.List;
import java.util.stream.Collectors;

public class TodoMapper {
    public static Todo toTodo(TodoCreateRequest request) {
        Todo todo = new Todo();
        todo.setTitle(request.title());
        todo.setDescription(request.description());
        todo.setPriority(request.priority());
        return todo;
    }

    public static Todo todoUpdateProperties(TodoUpdateRequest todoUpdateRequest,
                                            Todo todo) {
        if (todoUpdateRequest.title() != null) {
            todo.setTitle(todoUpdateRequest.title());
        }
        if (todoUpdateRequest.description() != null) {
            todo.setDescription(todoUpdateRequest.description());
        }
        if (todoUpdateRequest.priority() != 0) {
            todo.setPriority(todoUpdateRequest.priority());
        }

        return todo;
    }

    public static TodoResponse toResponse(Todo todo) {
        return new TodoResponse(
                todo.getId(), todo.getTitle(), todo.getDescription(),
                todo.isConcluded(), todo.getCreationDate(), todo.getCompletionDate(),
                todo.getPriority());

    }

    public static List<TodoResponse> toResponseList(List<Todo> todoList) {
        return todoList.stream()
                .map(TodoMapper::toResponse)
                .collect(Collectors.toList());
    }


}
