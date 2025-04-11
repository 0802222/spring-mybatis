package com.grepp.spring.app.model.error;

import com.grepp.spring.infra.error.exceptions.CommonException;
import com.grepp.spring.infra.response.ResponseCode;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {
    // service 안에서 CommonException 을 던지는 경우
    public void webException(){
        throw new CommonException(ResponseCode.BAD_REQUEST);
    }

    // service 안에서 CommonException 을 던지는 경우
    public void restApiException(){
        throw new CommonException(ResponseCode.BAD_REQUEST);
    }

}
