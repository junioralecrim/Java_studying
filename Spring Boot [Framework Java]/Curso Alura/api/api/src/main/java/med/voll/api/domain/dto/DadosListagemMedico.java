package med.voll.api.domain.dto;

import lombok.Data;
import med.voll.api.domain.Medico;
import med.voll.api.domain.enums.Especialidade;

@Data
public class DadosListagemMedico {
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    public DadosListagemMedico(Medico medico) {
        this.id = medico.getId();
        this.crm = medico.getCrm();
        this.email = medico.getEmail();
        this.nome = medico.getNome();
        this.especialidade = medico.getEspecialidade();
    }
}
