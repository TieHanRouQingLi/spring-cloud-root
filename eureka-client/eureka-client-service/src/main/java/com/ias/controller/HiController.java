package com.ias.controller;

import com.its.service.ServiceHi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController implements ServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        System.out.println("last hhhhhhhhhhhhhhhhhhhhhh");
        return null;
    }
}
