package com.example.boot.controll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by jinyugai on 2018/5/23.
 */
@RestController
public class HelloController {

    @RequestMapping("/helloboot")
    public String Hello(){
        return  "Hello SpringBoot!";
    }

}
