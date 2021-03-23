package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.exception.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExeController {

    /**
     * {
     * "code": 600,
     * "msg": "业务异常：ID 不能为空",
     * "url": "http://localhost:8003/exception01"
     * }
     */
    @RequestMapping("/exception01")
    public String exception01() throws ServiceException {
        throw new ServiceException("业务异常：ID 不能为空");
    }

    @RequestMapping("/exception02")
    public String exception02() throws Exception {
        throw new Exception("出现异常，全体卧倒");
    }
}