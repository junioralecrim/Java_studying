package com.vendas;


import com.annotations.Cachorro;
import com.vendas.interfaces.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/*
notations
*/
@SpringBootApplication
@RestController /* A anotation RestController está basicamente dizendo que eu posso mandar msgs pro browser
 através da classe Main*/

/*@ComponentScan(basePackages = //convém utilziar quando uso libs de terceiros
        {"com.vendas.repository", "com.vendas.service", "com.OutraBiblioteca.projeto"}
) --> Especificar quais os componentes (classes de config e objetos que eu tenho que escanear
em busca de configs, beans, controllers, repositorys e serviços). Convém utilizar quando
eu coloco a classe dentro de outros pacotes, pois o SB já faz o scanner automático de todas essas notations
dentro do meu pacote base. Ex: com.vendas*/

public class vendasApplication {

    @Value("${application.name}")
    private String applicationName;


    @Cachorro
    private Animal animal;
    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
            this.animal.fazerBarulho();
        };
    }

    @GetMapping("/home")
    public String home(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(vendasApplication.class, args);
    }
}