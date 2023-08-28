package med.voll.api.domain.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DadosAtualizacaoMedico {
    @NotNull
    private Long id;
    private String nome;
    private String telefone;
    private DadosEndereco endereco;
}
