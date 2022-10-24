package com.vendas.repository;
import com.vendas.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository /* É pra dizer que essa classe vai acessar a base de dados */
public class ClientesRepository {
    public void persistir(Cliente cliente) {
        //acessa a base e salva o cliente
    }
}
