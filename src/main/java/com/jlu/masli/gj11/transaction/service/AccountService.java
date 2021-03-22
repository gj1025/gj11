package com.jlu.masli.gj11.transaction.service;

public interface AccountService {
    /**
     * 汇款
     */
    void out (String outer , Integer money);
    /**
     * 收款
     */
    void in (String inner , Integer money);
}
