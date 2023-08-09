package med.voll.api.domain.dto;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import med.voll.api.domain.Endereco;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DadosEndereco { //DTO (PEGA AS INFOS DO JPA)
    @NotBlank
    private String logradouro;
    @NotBlank
    private String bairro;
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    private String cep;
    @NotBlank
    private String cidade;
    @NotBlank
    private String uf;
    private String complemento;
    private String numero;

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
