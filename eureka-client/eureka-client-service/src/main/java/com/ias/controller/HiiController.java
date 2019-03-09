package com.ias.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiiController {
    @RequestMapping("/hi")
    public String sayHiFromClient(String name) {
        System.out.println("last hhhhhhhhhhhhhhhhhhhhhh");
        return null;
    }
}
