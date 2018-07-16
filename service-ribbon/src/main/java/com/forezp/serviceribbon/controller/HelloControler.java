package com.forezp.serviceribbon.controller;

import com.forezp.serviceribbon.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    TestServer helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.testFun( name );
    }
}
