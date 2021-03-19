package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.entity.UserInfoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Rest 风格接口测试
 */
@RestController // 等价 @Controller + @ResponseBody 返回Json格式数据
@RequestMapping("rest")
public class RestApiController {
    private static final Logger LOG = LoggerFactory.getLogger(RestApiController.class);

    /**
     * 保存
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam UserInfoEntity userInfo) {
        System.out.println(-1 / 0);
        LOG.info("===>>" + userInfo);
        LOG.info("===>>" + userInfo.getName());
        return "success";
    }

    /**
     * 查询
     */
    @RequestMapping(value = "/select/{id}", method = RequestMethod.GET)
    public String select(@PathVariable Integer id) {
        System.out.println(-1 / 0);
        LOG.info("===>>" + id);
        return "success";
    }
}
