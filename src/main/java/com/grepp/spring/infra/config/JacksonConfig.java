package com.grepp.spring.infra.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());  // 빈이 올라가는 시점부터 제이슨파싱 가능(로컬데이터 못읽어오는거 해결됨)
        return mapper;
    }
}
