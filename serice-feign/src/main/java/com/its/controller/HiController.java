package com.its.controller;

import com.its.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private ServiceHi serviceHi;

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name){
        return serviceHi.sayHiFromClient(name);
    }

}
