package com.vendas;

import com.vendas.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

/*
notations
*/
@SpringBootApplication
public class vendasApplication {
    public static void main(String[] args) {
        @Bean
        public CommandLineRunner init(@Autowired Clientes cl)

        SpringApplication.run(vendasApplication.class, args);
    }
}