package com.twy.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldController
 * @Description
 * @author twy
 * @date 2020-05-10 21:30
 */
@RestController
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello springboot!";
    }
}
