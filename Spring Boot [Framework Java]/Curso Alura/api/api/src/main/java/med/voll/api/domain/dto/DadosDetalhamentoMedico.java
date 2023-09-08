package med.voll.api.domain.dto;

import med.voll.api.domain.Endereco;
import med.voll.api.domain.Medico;
import med.voll.api.domain.enums.Especialidade;

public class DadosDetalhamentoMedico {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private Especialidade especialidade;
    private DadosEndereco endereco;
    private Boolean ativo;
    public DadosDetalhamentoMedico(Medico medico) {
        this.id = medico.getId();
        this.nome = medico.getNome();
        this.email = medico.getEmail();
        this.telefone = medico.getTelefone();
        this.crm = medico.getCrm();
        this.especialidade = medico.getEspecialidade();
        this.endereco = medico.getEndereco();
        this.ativo = medico.getAtivo();
    }
}
