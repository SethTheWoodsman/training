package com.woodmen.hello.service;

import com.woodmen.hello.domain.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    final PersonProperties personProperties;

    public HelloService(PersonProperties personProperties) {
        this.personProperties = personProperties;
    }

    public Hello helloWorld() {
        return new Hello(String.format("Hello, %s!", personProperties.getName()));
    }
}
