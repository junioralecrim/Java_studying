package br.com.raphael.todolist.domain.dto;

public record TodoUpdateRequest(
        String title,
        String description,
        int priority
) {
}
