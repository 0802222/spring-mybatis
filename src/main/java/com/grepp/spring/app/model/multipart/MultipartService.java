package com.grepp.spring.app.model.multipart;


import com.grepp.spring.app.controller.api.multipart.form.MultipartForm;
import com.grepp.spring.infra.error.exceptions.CommonException;
import com.grepp.spring.infra.response.ResponseCode;
import com.grepp.spring.infra.util.file.FileUtil;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MultipartService {

    private final FileUtil util;

    public void upload(MultipartForm form) {
        FileUtil util = new FileUtil();

        try {
            util.upload(form.files(), "test");
        } catch (IOException e) {
            throw new CommonException(ResponseCode.INTERNAL_SERVER_ERROR, e);
        }
    }
}