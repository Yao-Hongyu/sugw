package com.biber.sugw.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResultVo<T> {


    private String code;
    private String message;
    private T data;

    /**
     * 1.post
     */
    public static <T> CommonResultVo<T> PostSuccess(String code,String message,T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> PostSuccess(){
        return PostSuccess("0000","提交成功",null);
    }

    public static <T> CommonResultVo<T> PostFail(String code,String message,T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> PostFail(){
        return PostFail("0001","提交失败",null);
    }

    public static <T> CommonResultVo<T> PostFail(String message){
        return PostFail("0001","提交失败,"+message,null);
    }


    /**
     *2.login
     */

    public static <T> CommonResultVo<T> LoginSuccess(String code, String message, T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> LoginSuccess(T data){
        return LoginSuccess("0000","LoginSuccess",data);
    }

    public static <T> CommonResultVo<T> LoginFail(String code, String message, T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> LoginFail(){
        return LoginFail("1000","用户名或密码错误",null);
    }

    /**
     *3.token
     */

    public static <T> CommonResultVo<T> WrongToken(String code, String message, T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> WrongToken(){
        return WrongToken("1001","Token错误",null);
    }


    /**
     * 4.getRole
     */

    public static <T> CommonResultVo<T> getRoleSuccess(String code,String message,T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> getRoleSuccess(T data){
        return getRoleSuccess("0000","获取成功",data);
    }
    /**
     *5.operation
     */
    public static <T> CommonResultVo<T> OperationSuccess(String code,String message,T data){
        return new CommonResultVo<>(code, message, data);
    }
    public static <T> CommonResultVo OperationSuccess(T data){
        return OperationSuccess("0000","操作成功",data);
    }

    public static <T> CommonResultVo<T> OperationError(String code, String message, T data){
        return new CommonResultVo<>(code,message,data);
    }
    public static <T> CommonResultVo<T> OperationError(){
        return OperationError("1002","操作失败",null);
    }

    /**
     *6.userOperation
     */
    public static <T> CommonResultVo<T> UserOperationError(String code,String message,T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> UserOperationError(){
        return UserOperationError("2000","用户操作异常",null);
    }

    /**
     * 7.form
     */
    public static <T> CommonResultVo<T> FormError(String code, String message, T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> FormError(){
        return FormError("2001","表单参数异常",null);
    }

    public static <T> CommonResultVo<T> FormError(String message){
        return FormError("2001",message,null);
    }


    /**
     * 8.Method
     */
    public static <T> CommonResultVo<T> HttpMethodError(String code,String message,T data){
        return new CommonResultVo<>(code,message,data);
    }

    public static <T> CommonResultVo<T> HttpMethodError(){
        return HttpMethodError("2002","请求方式错误",null);
    }
}
