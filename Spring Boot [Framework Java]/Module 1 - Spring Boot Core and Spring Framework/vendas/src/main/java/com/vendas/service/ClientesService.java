package com.vendas.service;

import com.vendas.model.Cliente;
import com.vendas.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    public void salvarCliente (Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }

}
