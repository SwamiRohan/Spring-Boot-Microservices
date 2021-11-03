package com.example.springboot.springbootmicroservices.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloWorldBean")
    public HelloWorldBean helloWorldBean(){
      return new HelloWorldBean("Hello Spring Boot");
    }

    @GetMapping("/helloWorldPath/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world,%s",name));
    }

}
