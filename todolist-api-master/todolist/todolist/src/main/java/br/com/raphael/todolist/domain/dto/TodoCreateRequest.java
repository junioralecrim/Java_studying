package br.com.raphael.todolist.domain.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record TodoCreateRequest(
        @NotBlank
        String title,
        @NotBlank
        String description,
        @Min(1)
        @Max(5)
        int priority
) {
}
