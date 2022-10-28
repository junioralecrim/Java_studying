package com.vendas.service;

import com.vendas.model.Cliente;
import com.vendas.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    @Autowired
    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    } /* INJEÇÃO DA DEPENDÊNCIA NO CONTAINER DO SPRING BOOT*/

    public void salvarCliente (Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente); /**/
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }

}
