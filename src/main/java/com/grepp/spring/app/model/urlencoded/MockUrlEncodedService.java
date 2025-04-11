package com.grepp.spring.app.model.urlencoded;

import org.springframework.stereotype.Service;

@Service
public class MockUrlEncodedService {

    public boolean isDuplicatedId(String userId){
        return userId.equals("super");
    }

}
