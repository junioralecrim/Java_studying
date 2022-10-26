package com.vendas;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration /* É uma annotation que indica que determinada classe possui métodos que expõe
novos beans e configs. */
@Profile("development")
public class MyConfiguration {
    @Bean
    public CommandLineRunner executar(){
        return args-> {
            System.out.println("RODANDO A CONFIG DE DESENVOLVIMENTO");
        };
    }
}
