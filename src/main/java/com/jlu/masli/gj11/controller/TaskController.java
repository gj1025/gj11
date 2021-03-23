package com.jlu.masli.gj11.controller;

import com.jlu.masli.gj11.task.AsyncTask;
import com.jlu.masli.gj11.task.TimeTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TaskController {
    @Resource
    private AsyncTask asyncTask;

    @Resource
    private TimeTask timeTask;

    @RequestMapping("/asyncTask")
    public String asyncTask() {
        asyncTask.asyncTask0();
        asyncTask.asyncTask1();
        return "success";
    }

    @RequestMapping("/timeTask")
    public String timeTask() {
        timeTask.systemDate();
        return "success";
    }
}
