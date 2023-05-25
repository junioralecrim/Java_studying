package med.voll.api.domain;

import lombok.Data;
@Data
public class Endereco { //JPA (ACESSA BANCO DE DADOS)
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;
}
