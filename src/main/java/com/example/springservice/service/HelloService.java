package com.example.springservice.service;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Component(value = "helloService")
@WebService
public class HelloService {
    @WebMethod
    public String sayHello(String name){
        return String.format("Hello World , %s",name);
    }
}
