package com.grepp.spring.app.controller.api.multipart.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public record MultipartForm(
    @NotBlank
    String title,
    @NotBlank
    String content,
    @NotNull
    List<MultipartFile> files
) {

}
