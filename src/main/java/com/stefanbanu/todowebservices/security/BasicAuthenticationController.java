package com.stefanbanu.todowebservices.security;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    // hello-world bean
    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean() {
//        throw new RuntimeException("error happened.");
        return new AuthenticationBean("You are authenticated.");
    }

}
