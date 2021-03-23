package com.jlu.masli.gj11.transaction.service.impl;

import com.jlu.masli.gj11.transaction.service.AccountService;
import com.jlu.masli.gj11.transaction.service.TradeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

@Service
public class TradeServiceImpl implements TradeService {

    @Resource
    private AccountService accountService;
    @Resource
    private TransactionTemplate transactionTemplate;

    @Override
    public void trade1(String outer, String inner, Integer money) {
        accountService.out(outer, money);
        // 抛出异常
        int i = 1 / 0;
        accountService.in(inner, money);
    }

    @Override
    public void trade2(String outer, String inner, Integer money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            public void doInTransactionWithoutResult(TransactionStatus arg0) {
                accountService.out(outer, money);
                // 抛出异常
                int i = 1 / 0;
                accountService.in(inner, money);
            }
        });
    }

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRED)
    @Override
    public void trade3(String outer, String inner, Integer money) {
        accountService.out(outer, money);
        // 抛出异常
        int i = 1 / 0;
        accountService.in(inner, money);
    }
}
