package com.grepp.spring.app.controller.api.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record RestForm(
    @NotNull
    Integer id,

    @Email
    String email,

    @NotBlank
    String name,

    LocalDateTime createdAt
) {

}

