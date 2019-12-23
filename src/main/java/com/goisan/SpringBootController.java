package com.goisan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

    @RequestMapping("/demo")
    public String demo(){
        return "success";
    }
}
