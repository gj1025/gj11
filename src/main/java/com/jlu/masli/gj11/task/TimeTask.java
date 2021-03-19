package com.jlu.masli.gj11.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间定时任务
 */
@Component
public class TimeTask {
    Logger LOG = LoggerFactory.getLogger(TimeTask.class.getName()) ;
    private static final SimpleDateFormat format =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;

    /*
     * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
     * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
     * @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
     * @Scheduled(cron="/5") ：通过cron表达式定义规则
     */

    /**
     * 每3秒打印一次系统时间
     */
    @Scheduled(fixedDelay = 3000)
    public void systemDate (){
        LOG.info("当前时间::::"+format.format(new Date()));
    }
}
