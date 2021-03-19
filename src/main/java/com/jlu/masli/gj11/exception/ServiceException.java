package com.jlu.masli.gj11.exception;

/**
 * 自定义业务异常
 */
public class ServiceException extends Exception {
    public ServiceException (String msg){
        super(msg);
    }
}
