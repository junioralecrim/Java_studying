package med.voll.api.domain.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import med.voll.api.domain.enums.Especialidade;

//Essa é a entidade JPA, que serve para manipulação de dados da API. É diferente do DTO, que serve como modelo para

//acesso aos objetos do banco de dados. Precisa ser feito dessa forma!

@Data
public class DadosCadastroMedico { //DTO (PEGA AS INFOS DO JPA)
    private Long id;
    @NotBlank //verifica se ocampo nem é nulo e nem vem vazio e só vale para strings.
    private String nome;
    @NotBlank
    @Email //faz as validações de email, verificando se já está vindo no formato correto
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    @Pattern(regexp = "\\d{4,6}") // o \\d significa que são digitos e o {4,6} especifica que é entre 4 e 6 digitos
    private String crm;
    @NotNull  //não pode ser nulo
    private Especialidade especialidade;
    @NotNull
    @Valid //o spring vai validar tbm os atributos do objeto
    private DadosEndereco endereco;
}
