package med.voll.api.model.medico.repository;

import med.voll.api.model.medico.Medico;
import med.voll.api.model.medico.dto.DadosCadastroMedico;
import org.springframework.data.jpa.repository.JpaRepository;

//Essa interface serve para herdar de uma outra interface do SpringData, onde eu passo os generics com dois tipos de objetos
//O primeiro é qual o tipo da enteidade que o repository vai trabalhar e o segundo é qual o tipo de atributo da chave primária dessa classe
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
