package com.jlu.masli.gj11.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ParamConfig {
    @Value("${user.author}")
    private String author;
    @Value("${user.title}")
    private String title;
    @Value("${user.time}")
    private String time;
    // 省略 get 和 set 方法


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
