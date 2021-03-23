package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.config.ParamConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 环境配置，参数绑定
 */
@RestController
public class ParamController {

    @Resource
    private ParamConfig paramConfig;

    @RequestMapping("/getParam")
    public String getParam(@RequestParam String a) {
        return "[" + paramConfig.getAuthor() + ";" 
                + paramConfig.getTitle() + ";" 
                + paramConfig.getTime() + "]";
    }
}