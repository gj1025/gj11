package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.aop.config.LogFilter;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @LogFilter("保存请求日志")
    @RequestMapping("/saveRequestLog")
    @ApiOperation(value = "保存请求日志", notes = "保存正常请求日志")
    public String saveRequestLog(@RequestParam("name") String name) {
        return "success：" + name;
    }

    @LogFilter("保存异常日志")
    @RequestMapping("/saveExceptionLog")
    @ApiOperation(value = "保存请求日志１", notes = "保存异常请求日志")
    @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
    public String saveExceptionLog(@RequestParam("name") String name) {
        int error = 100 / 0;
        System.out.println(error);
        return "success：" + name;
    }
}

