package com.springboot.demo.myfirstapp.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    @GetMapping("/hi")
    public String sayHello(){
        return "Hello world";
    }
}
