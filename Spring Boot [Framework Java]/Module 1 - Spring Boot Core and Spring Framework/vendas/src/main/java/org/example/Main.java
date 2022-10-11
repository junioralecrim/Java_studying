package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
notations
*/
@SpringBootApplication
@RestController /* A anotation RestController está basicamente dizendo que eu posso mandar msgs pro browser
 através da classe Main*/
public class Main {
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}