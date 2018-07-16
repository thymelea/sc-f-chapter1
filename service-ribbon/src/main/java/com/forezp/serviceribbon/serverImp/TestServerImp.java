package com.forezp.serviceribbon.serverImp;


import com.forezp.serviceribbon.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServerImp implements TestServer {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String testFun(String name) {

        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
