package med.voll.api.domain.dto;

import lombok.Data;
import med.voll.api.domain.enums.Especialidade;

//Essa é a entidade JPA, que serve para manipulação de dados da API. É diferente do DTO, que serve como modelo para

//acesso aos objetos do banco de dados. Precisa ser feito dessa forma!

@Data
public class DadosCadastroMedico { //DTO (PEGA AS INFOS DO JPA)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private DadosEndereco endereco;


}
