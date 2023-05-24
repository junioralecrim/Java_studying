package med.voll.api.model.medico.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import med.voll.api.model.endereco.Endereco;
import med.voll.api.model.medico.enums.Especialidade;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "medicos")// essa annotation especifica a tabela no qual os objetos "DadosCadastroMedico" serão guardados. No caso, medicos
@Entity(name = "DadosCadastroMedico")// indica que a classe DadosCadastroMedico é uma entidade do banco de dados. Mapeando a classe para uma tabela e permitindo que a mesma seja gerenciada pela JPA que a mesma seja
public class DadosCadastroMedico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //essas anotações são utilizadas para definir a chave primária da entidade "DadosCadastroMedico". Onde id define que é chave primária e GenerationType.IDENTITY define um auto incremento
    private Long id;

    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade; //utilizado para mapear o enum para uma coluna no banco de dados como String

    @Embedded
    private Endereco endereco;

}


