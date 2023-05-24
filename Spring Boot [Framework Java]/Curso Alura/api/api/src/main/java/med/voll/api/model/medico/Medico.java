package med.voll.api.model.medico;

import lombok.Data;
import med.voll.api.model.endereco.Endereco;
import med.voll.api.model.medico.dto.DadosCadastroMedico;
import med.voll.api.model.medico.enums.Especialidade;


//Essa é a entidade JPA, que serve para manipulação de dados da API. É diferente do DTO, que serve como modelo para

//acesso aos objetos do banco de dados. Precisa ser feito dessa forma!

@Data
public class Medico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.getNome();
        this.email = dados.getEmail();
        this.crm = dados.getCrm();
        this.endereco = new Endereco(dados.getEndereco());
    }
}
