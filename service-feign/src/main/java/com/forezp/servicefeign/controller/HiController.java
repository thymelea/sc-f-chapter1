package com.forezp.servicefeign.controller;

import com.forezp.servicefeign.server.HiServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiServer hiServer;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String name) {
        return hiServer.sayHiFromClientOne( name );
    }
}
