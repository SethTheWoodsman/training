package com.woodmen.hello.controller;

import com.woodmen.hello.domain.Hello;
import com.woodmen.hello.domain.PlanCategory;
import com.woodmen.hello.repository.PlanCategoryRepository;
import com.woodmen.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    PlanCategoryRepository planCategoryRepository;

    @GetMapping("/hello")
    public Hello sayHello() {
        return helloService.helloWorld();
    }

    @GetMapping("/database")
    public List<PlanCategory> getAllCategories() {
        return planCategoryRepository.findAll();
    }
}
