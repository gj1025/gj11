package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.transaction.service.TradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/trade")
public class TradeTestController {

    @Resource
    private TradeService tradeService;

    /**
     * 没有事务管理
     * jack 减少了1000块钱，但是rose得到1000块钱
     * 1	jack	9000
     * 2	rose	10000
     */
    @RequestMapping("/trade1")
    @ResponseBody
    public void testTrade1() {
        tradeService.trade1("jack", "rose", 1000);
    }

    /**
     * 手动管理事务
     * 1	jack	10000
     * 2	rose	10000
     */
    @RequestMapping("/trade2")
    @ResponseBody
    public void testTrade2() {
        tradeService.trade2("jack", "rose", 1000);
    }

    /**
     * 注解管理事务
     * 1	jack	10000
     * 2	rose	10000
     */
    @RequestMapping("/trade3")
    @ResponseBody
    public void testTrade3() {
        tradeService.trade3("jack", "rose", 1000);
    }
}
