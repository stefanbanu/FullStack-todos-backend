package com.stefanbanu.todowebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    // GET
    // URI - /hello-world
    // method - "Hello World"

    @GetMapping(value = "hello-world")
    public String helloWorld() {
        return "Hello World";
    }


    // hello-world bean
    @GetMapping(value = "hello-world-bean")
    public HelloWorldBean helloWorldBean() {
//        throw new RuntimeException("error happened.");
        return new HelloWorldBean("Hello World -");
    }

    @GetMapping(value = "hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVar(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
