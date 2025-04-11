package com.grepp.spring.app.controller.api.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.OffsetDateTime;

public record RestPayload(
    Integer id,
    String email,
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    OffsetDateTime lastAccess,
    Long LastAccessTimestamp
) {

}
