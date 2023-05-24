package med.voll.api.model.endereco;

import lombok.Data;
@Data
public class DadosEndereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;
}
