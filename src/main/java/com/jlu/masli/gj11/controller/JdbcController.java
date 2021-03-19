/*
package com.jlu.masli.gj11.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
    private static final Logger LOG = LoggerFactory.getLogger(JdbcController.class);

    // 数据源一
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate primaryJdbcTemplate ;

    // 数据源二
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate secondaryJdbcTemplate ;

    */
/**
     * 多数据源查询
     *//*

    @RequestMapping("/queryData")
    public String queryData (){
        String sql = "SELECT COUNT(1) FROM user_info" ;
        Integer countOne = primaryJdbcTemplate.queryForObject(sql,Integer.class) ;
        Integer countTwo = secondaryJdbcTemplate.queryForObject(sql,Integer.class) ;
        LOG.info("countOne=="+countOne+";;countTwo=="+countTwo);
        return "SUCCESS" ;
    }
}

*/
