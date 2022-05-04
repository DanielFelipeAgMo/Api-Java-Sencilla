package com.example.apiJava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class LocalDataTimeDisplay {

    @RequestMapping(method = RequestMethod.GET, path = "/time")
    public String displayCurrentTime(){
        return LocalDateTime.now().toString();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/date")
    public String displayCurrentDate(){
        return LocalDateTime.now().toString();
    }

}
