package com.dhruv.springboot.courseapi.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

    @RequestMapping("/health")
    public String checkHealth() {
        return "Course Api is Up and Running";
    }

}
