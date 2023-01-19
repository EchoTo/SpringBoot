package com.priv.controller;

import com.priv.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 十一
 * @data : 13:39 2022/12/29
 * When in doubt, use brute force.
 * Rest模式
 */
@RestController
@RequestMapping("/books")
public class BookController {

    /**
     * 读取yaml数据中的单一数据
     */
    @Value("${country}")
    private String country1;

    @Value("${user1.name}")
    private String name1;

    @Value("${likes[1]}")
    private String likes1;

    @Autowired
    private Environment env;

    @Autowired
    private DataSource dataSource;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("user1.name"));
        System.out.println(dataSource);
        return "springboot is running...";
    }
}
