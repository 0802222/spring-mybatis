package com.grepp.spring.app.controller.api.multipart;

import com.grepp.spring.app.controller.api.multipart.form.MultipartForm;
import com.grepp.spring.app.model.multipart.MultipartService;
import com.grepp.spring.infra.response.ApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("multipart")
@Slf4j
public class MultipartController {

    private final MultipartService multipartService;

    @PostMapping("upload")
    public ResponseEntity<ApiResponse<?>> upload(
        @Valid MultipartForm form) {
        log.info("multiPartFile : {} ", form.files()
        );

        multipartService.upload(form);
        return ResponseEntity.ok(ApiResponse.noContent());
    }

}
