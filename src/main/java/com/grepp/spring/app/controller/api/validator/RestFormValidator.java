package com.grepp.spring.app.controller.api.validator;

import com.grepp.spring.app.controller.api.form.RestForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RestFormValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return RestForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RestForm form = (RestForm) target;
        if(form.id() == null || form.id() == 0) {
            errors.rejectValue("id", "Id", "아이디가 유효하지 않습니다.");

        }
    }
}
