package com.grepp.spring.app.controller.web.urlencoded.validator;

import com.grepp.spring.app.controller.web.urlencoded.form.UrlEncodedForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UrlEncodedValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return UrlEncodedForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UrlEncodedForm form = (UrlEncodedForm) target;
        if(form.getUserId().startsWith("GM")){
            errors.rejectValue("userId",
                "userId",
                "아이디는 GM 으로 시작할 수 없습니다.");
        }
    }
}