package com.azure.demo.autoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
    
    @RequestMapping(method = RequestMethod.GET, path = "/push/{message}")
    public String getMessage(@PathVariable("message") String value){
        return "You have sent message to Auto Service is -> " + value;
    }
}
