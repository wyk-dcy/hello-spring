package com.wyk.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyongkang
 * @date 2020年12月23日 10:00 上午
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sayHi() {
        return "Hello Spring Boot";
    }
}
