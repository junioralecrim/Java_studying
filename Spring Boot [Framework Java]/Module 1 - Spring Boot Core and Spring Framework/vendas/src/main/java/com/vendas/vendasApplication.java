package com.vendas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;


/*
notations
*/
@SpringBootApplication
@RestController /* A anotation RestController está basicamente dizendo que eu posso mandar msgs pro browser
 através da classe Main*/

/* @ComponentScan(basePackages =
        {"com.vendas.repository"}
) --> Especificar quais os componentes (classes de config e objetos que eu tenho que escanear
em busca de configs, beans, controllers, repositorys e serviços). Convém utilizar quando
eu coloco a classe dentro de outros pacotes, pois o SB já faz o scanner automático de todas essas notations
dentro do meu pacote base. Ex: com.vendas*/

public class vendasApplication {

    @Autowired /*Anotação utilizada para marcar o ponto de injeção na sua classe. Você pode colocar ela
    sobre atributos ou sobre o seu construtor com argumentos.*/
    @Qualifier(value = "applicationName") /*marca qual injeção que quero fazer na minha aplicação*/
    private String applicationName;

    @GetMapping("/home")
    public String home(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(vendasApplication.class, args);
    }
}