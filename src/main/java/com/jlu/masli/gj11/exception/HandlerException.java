package com.jlu.masli.gj11.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
// 异常以Json格式返回 等同 ExceptionHandler + ResponseBody 注解
// @RestControllerAdvice
public class HandlerException {
    /**
     * 自定义业务异常映射,返回JSON格式提示
     */
    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public ReturnException handler01(HttpServletRequest request, ServiceException e) {
        ReturnException returnException = new ReturnException();
        returnException.setCode(600);
        returnException.setMsg(e.getMessage());
        returnException.setUrl(String.valueOf(request.getRequestURL()));
        return returnException;
    }

    /**
     * 服务异常
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String handler02(HttpServletRequest request, Exception e) {
        System.out.println("异常＝{]" + e);
        return e.getMessage();
    }
}
