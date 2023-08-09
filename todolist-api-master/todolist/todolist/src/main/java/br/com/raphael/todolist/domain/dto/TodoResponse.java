package br.com.raphael.todolist.domain.dto;

import java.time.LocalDateTime;

public record TodoResponse(
        Long id,
        String title,
        String description,
        boolean concluded,
        LocalDateTime creationDate,
        LocalDateTime completionDate,
        int priority) {
}
