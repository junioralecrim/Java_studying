package com.vendas.repository;

import com.vendas.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //para sb entender que é uma classe que acessa a base de dados
/* Quase todas as Exceptions vão ser traduzidas (vai ter o exception translator) */
public class Clientes {

    private static String INSERT = "insert into cliente (nome) values (?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente salvar(Cliente cliente){

        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()});
        return cliente;
    }
}
