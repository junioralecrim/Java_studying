package med.voll.api.model;

import lombok.Data;

@Data
public class DadosCadastroMedico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
}
