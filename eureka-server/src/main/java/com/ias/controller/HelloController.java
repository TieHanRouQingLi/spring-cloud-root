package com.ias.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping(value = "/index")
    public String index(){
        logger.debug("debug-test");
        logger.info("info-test");
        logger.error("error-test");
        return "index";
    }
}
