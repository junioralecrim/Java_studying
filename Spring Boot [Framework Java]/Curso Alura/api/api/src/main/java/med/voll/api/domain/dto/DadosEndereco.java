package med.voll.api.domain.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import med.voll.api.domain.Endereco;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DadosEndereco { //DTO (PEGA AS INFOS DO JPA)
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;

    public DadosEndereco(Endereco dadosEndereco) {
        this.logradouro = dadosEndereco.getLogradouro();
        this.bairro = dadosEndereco.getBairro();
        this.cep = dadosEndereco.getCep();
        this.cidade = dadosEndereco.getCidade();
        this.uf = dadosEndereco.getUf();
        this.numero = dadosEndereco.getNumero();
        this.complemento = dadosEndereco.getComplemento();
    }
}
