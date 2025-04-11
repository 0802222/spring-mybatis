package com.grepp.spring.app.model.urlencoded.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UrlEncodedDto {

    private String userId;
    private String email;
    private String tel;
    private final LocalDateTime lastAccess = LocalDateTime.now();

}
