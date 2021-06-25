package com.tmo.example.cloudconsulvault.controller;

import com.tmo.example.cloudconsulvault.configuration.ConsulConfig;
import com.tmo.example.cloudconsulvault.model.TestProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Autowired private ConsulConfig props;

    @GetMapping({"/"})
    public TestProperty indexServer(){
        return props.getValue();
    }
}
