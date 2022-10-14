package com.vendas;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean(name = "applicationName") /*o objeto vai ser criado no contexto da aplicação. Ou seja, posso usar
    dentro da aplicação onde eu quiser*/
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
