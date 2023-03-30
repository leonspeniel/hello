package com.leons.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping(path="/")
public class HelloController {

    @GetMapping
    public Map<String, String> getHello(HttpServletRequest request) {

        Map<String, String> msg = new HashMap<>();
        msg.put("message","Hi Ravi");
        return msg;
    }
}
