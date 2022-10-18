package com.vendas;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration /* É uma annotation que indica que determinada classe possui métodos que expõe
novos beans e configs. */
public class MyConfiguration {
    @Bean(name = "applicationName") /* O Spring deve invocar esse método e gerenciar o objeto retornado
    por ele. Quando digo gerenciar é que agora este objeto pode ser injetado em qualquer
    ponto da sua aplicação.

    o objeto vai ser criado no contexto da aplicação. Ou seja, posso usar
    dentro da aplicação onde eu quiser*/
    public String applicationName(){
        return "Sistema de Vendas";
    }

    /*
    * Acima, se trata de uma config básica. Mas poderia ser uma configuração de conexão com uma base de dados,
    * por exemplo.
    * */
}
