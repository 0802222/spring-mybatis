package com.grepp.spring.infra.response;

public record ApiResponse <T>(
    String code,
    String message,
    T data   // data 를 ApiResponse 로 감싸서 보내줄것임
){

    //static method 에서 ApiResponse 의 제네릭을 쓸 수 없어서, 새로 선언함
    // 성공 -바디 있는 경우
    public static <T> ApiResponse<T> success(T data){
        return new ApiResponse<>(ResponseCode.OK.code(), ResponseCode.OK.message(), data);
    }

    // 성공 -바디 없는 경우
    public static <T> ApiResponse<T> noContent(){
        return new ApiResponse<>(ResponseCode.OK.code(), ResponseCode.OK.message(), null);
    }

    // 실패
    public static <T> ApiResponse<T> error(ResponseCode code){
        return new ApiResponse<>(code.code(), code.message(), null);
    }

    // 실패-바디 있는 경우
    public static <T> ApiResponse<T> error(ResponseCode code, T data){
        return new ApiResponse<>(code.code(), code.message(), data);
    }

}
