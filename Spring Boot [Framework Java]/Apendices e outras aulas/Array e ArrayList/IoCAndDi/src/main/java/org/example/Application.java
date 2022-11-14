package org.example;
import org.example.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    @Autowired
    static Teste teste;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        teste.teste();
    }
}
