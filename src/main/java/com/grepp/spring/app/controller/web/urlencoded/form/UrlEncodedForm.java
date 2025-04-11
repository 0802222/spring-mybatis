package com.grepp.spring.app.controller.web.urlencoded.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class UrlEncodedForm {
    @NotBlank
    private String userId;

    @Length(min = 4, max = 20)
    private String password;

    @Email(message = "이메일 양식이 아닙니다.")
    private String email;

    @Length(min=9, max=11, message = "전화번호는 9~11자리 입니다.")
    private String tel;
}