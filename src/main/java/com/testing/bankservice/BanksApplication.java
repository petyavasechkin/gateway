package com.testing.bankservice;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@SpringBootApplication
@RestController
public class BanksApplication {


    @RequestMapping(value = "/banks", method = GET)
    public String banks() {
        return "User! Hello from banks service: " + getClass().getSimpleName();
    }

    @RequestMapping(value = "/banks", method = POST)
    public String banks(@RequestBody String body) {
        return "Service banks received: " + body;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(BanksApplication.class)
                .properties("server.port=10080", "spring.application.name=banks")
                .run(args);
    }

}
