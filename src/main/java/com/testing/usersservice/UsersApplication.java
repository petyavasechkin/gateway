package com.testing.usersservice;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@SpringBootApplication
@RestController
public class UsersApplication {


    @RequestMapping(value = "/users", method = GET)
    public String users() {
        return "User! Hello from users service: " + getClass().getSimpleName();
    }

    @RequestMapping(value = "/users", method = POST)
    public String users(@RequestBody String body) {
        return "Service users received: " + body;
    }


    public static void main(String[] args) {
        new SpringApplicationBuilder(UsersApplication.class)
                .properties("server.port=7080", "spring.application.name=users")
                .run(args);
    }
}
