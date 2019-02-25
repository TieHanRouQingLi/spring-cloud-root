package com.ias.controller;

import com.its.service.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private ServiceHi serviceHi;

    @RequestMapping(value = "/hi1")
    public String sayHi(@RequestParam(value = "name") String name)
    {
        System.out.println("11111111111111111");
        return serviceHi.sayHiFromClient(name);
    }

}
