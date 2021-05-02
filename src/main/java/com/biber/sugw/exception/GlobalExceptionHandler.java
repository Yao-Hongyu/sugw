package com.biber.sugw.exception;

import com.biber.sugw.vo.CommonResultVo;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResultVo MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        BindingResult bindingResult = e.getBindingResult();
        String message = null;
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            if (fieldError != null)
            {
                message = fieldError.getField()+fieldError.getDefaultMessage();
            }
        }
        return CommonResultVo.PostFail(message);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public CommonResultVo MissingServletRequestParameterExceptionHandler(MissingServletRequestParameterException e) {
//        StringBuffer message = new StringBuffer();
//        message.append(e.getParameterName());
//        message.append("不能为空");
        return CommonResultVo.PostFail(e.getParameterName()+"不能为空");
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public CommonResultVo HttpRequestMethodNotSupportedExceptionHandler(HttpRequestMethodNotSupportedException e) {
        log.error(e.getMessage(), e);
        return CommonResultVo.HttpMethodError();
    }

}
