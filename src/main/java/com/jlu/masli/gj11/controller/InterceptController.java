package com.jlu.masli.gj11.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptController {

    /*
        intercept.OneInterceptor   : 1、url==http://127.0.0.1:8005/reqUrl
        intercept.TwoInterceptor   : 2、url==http://127.0.0.1:8005/reqUrl
        intercept.TwoInterceptor   : 2、postHandle
        intercept.OneInterceptor   : 1、postHandle
        intercept.TwoInterceptor   : 2、afterCompletion
        intercept.OneInterceptor   : 1、afterCompletion
     */

    @RequestMapping("/reqUrl")
    public String reqUrl() {
        return "success";
    }

}
