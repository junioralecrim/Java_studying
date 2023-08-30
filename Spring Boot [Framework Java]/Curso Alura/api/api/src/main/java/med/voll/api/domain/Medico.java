package med.voll.api.domain;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.domain.dto.DadosAtualizacaoMedico;
import med.voll.api.domain.dto.DadosCadastroMedico;
import med.voll.api.domain.dto.DadosEndereco;
import med.voll.api.domain.enums.Especialidade;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medicos")// essa annotation especifica a tabela no qual os objetos "Medico" serão guardados. No caso, medicos
@Entity(name = "Medico")// indica que a classe Medico é uma entidade do banco de dados. Mapeando a classe para uma tabela e permitindo que a mesma seja gerenciada pela JPA que a mesma seja
@EqualsAndHashCode(of = "id")
public class Medico { //JPA (ACESSA BANCO DE DADOS)

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //essas anotações são utilizadas para definir a chave primária da entidade "Medico". Onde id define que é chave primária e GenerationType.IDENTITY define um auto incremento
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade; //utilizado para mapear o enum para uma coluna no banco de dados como String

    @Embedded
    private DadosEndereco endereco;

    private Boolean ativo;

    public Medico(DadosCadastroMedico dados) {
        this.ativo = true;
        this.id = dados.getId();
        this.nome = dados.getNome();
        this.email = dados.getEmail();
        this.crm = dados.getCrm();
        this.especialidade = dados.getEspecialidade();
        this.endereco = dados.getEndereco();
        this.telefone = dados.getTelefone();
    }

    public void atulizarInformacoes(DadosAtualizacaoMedico dados) {
        if (dados.getNome() != null) {
            this.nome = dados.getNome();
        }
        if (dados.getTelefone() != null){
            this.telefone = dados.getTelefone();
        }
        if (dados.getEndereco() != null){
            this.endereco.atualizarInformacoes(dados.getEndereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}


