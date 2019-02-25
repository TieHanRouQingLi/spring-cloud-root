package com.its.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "eureka-client", fallback = SchedualServiceHiHystric.class)
@FeignClient(value = "eureka-client")
public interface ServiceHi {
    @RequestMapping(value = "/sayHiFromClient", method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);
}
