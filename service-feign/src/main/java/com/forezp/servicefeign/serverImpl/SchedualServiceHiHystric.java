package com.forezp.servicefeign.serverImpl;

import com.forezp.servicefeign.server.HiServer;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HiServer{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
