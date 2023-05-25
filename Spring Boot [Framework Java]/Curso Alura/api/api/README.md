# Conceitos utilizados nesse projeto

## Diferenças entre as classes JPA e DTO no Spring Boot

**JPA (Java Persistence API)**

A classe JPA é usada para mapear objetos Java para o banco de dados, permitindo a persistência e manipulação dos dados. Ela é responsável por criar entidades que representam tabelas no banco de dados e oferece métodos para operações de persistência, como inserção, atualização e exclusão.

**DTO (Data Transfer Object)**

A classe DTO é usada para transferir dados entre diferentes camadas da aplicação ou entre a aplicação e serviços externos. Ela fornece uma representação simplificada de dados, geralmente contendo apenas os campos necessários para uma operação específica. Os DTOs são úteis para evitar vazamento de informações sensíveis e reduzir a quantidade de dados transferidos.

**Diferenças**

- **Propósito**: A classe JPA é usada para persistência de dados no banco de dados, enquanto a classe DTO é usada para transferir dados entre camadas da aplicação.

- **Estrutura**: A classe JPA mapeia objetos Java diretamente para tabelas do banco de dados, representando entidades completas. Já a classe DTO representa uma estrutura de dados mais simples, contendo apenas os campos necessários para uma operação específica.

- **Campos**: A classe JPA geralmente contém todos os campos relacionados a uma entidade no banco de dados, enquanto a classe DTO pode selecionar apenas os campos necessários para transferência de dados, evitando a sobrecarga de informações desnecessárias.

- **Segurança**: Os DTOs são úteis para evitar o vazamento de informações sensíveis, permitindo que apenas os dados relevantes sejam transferidos entre as camadas da aplicação.

---

## Algumas anotations importantes do Spring JPA:

| Anotação                      | Descrição                                                                                                                                                     |
|-------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `@Entity`                     | Indica que a classe é uma entidade mapeada para uma tabela no banco de dados.                                                                                 |
| `@Table`                      | Especifica o nome da tabela no banco de dados para mapeamento da entidade.                                                                                     |
| `@Id`                         | Define o campo como a chave primária da entidade.                                                                                                              |
| `@GeneratedValue`            | Especifica a estratégia de geração de valor para a chave primária.                                                                                             |
| `@Column`                     | Permite personalizar as propriedades da coluna no banco de dados (nome, tamanho, nullable, etc.).                                                             |
| `@Enumerated`                 | Especifica como um campo enum será persistido no banco de dados (como string ou valor numérico).                                                               |
| `@Embedded`                   | Mapeia um objeto embutido dentro da entidade, permitindo que seus atributos sejam armazenados como colunas na tabela da entidade principal.                     |
| `@ManyToOne`                  | Especifica uma associação muitos-para-um entre entidades, indicando que a entidade contém uma referência para outra entidade.                                 |
| `@OneToMany`                  | Indica uma associação um-para-muitos entre entidades, onde uma entidade possui uma coleção de outras entidades.                                               |
| `@OneToOne`                   | Especifica uma associação um-para-um entre entidades, indicando que uma entidade está relacionada com outra entidade através de um único objeto.              |
| `@JoinColumn`                 | Permite personalizar a coluna usada para a associação entre entidades.                                                                                         |
| `@Transient`                  | Indica que um campo não deve ser persistido no banco de dados, sendo ignorado pelo JPA.                                                                       |
| `@Query`                      | Permite escrever consultas personalizadas em JPQL, SQL nativo ou outras linguagens de consulta para acessar o banco de dados.                                |
| `@Transactional`              | Indica que um método ou classe deve ser executado em uma transação, garantindo atomicidade e consistência dos dados.                                          |
| `@Repository`                 | Indica que a classe é um repositório, responsável por realizar operações de acesso a dados (CRUD) para a entidade correspondente.                              |
| `@Service`                    | Indica que a classe é um serviço, contendo a lógica de negócio e processamento relacionados a uma ou mais entidades.                                          |


---
## Migrations com Flyway

O Flyway é uma ferramenta de migração de banco de dados que automatiza o controle e versionamento das alterações no esquema do banco de dados. Com o Flyway, é possível manter um histórico das alterações e facilitar a colaboração entre desenvolvedores.

### Configuração

Adicione a dependência do Flyway ao seu projeto:

```xml
<dependency>
  <groupId>org.flywaydb</groupId>
  <artifactId>flyway-core</artifactId>
  <version>7.0.3</version>
</dependency>
```

### Migrations

As Migrations são scripts SQL que contêm as alterações a serem aplicadas no banco de dados. Elas são nomeadas seguindo um padrão numérico (exemplo: `V1__criar_tabela.sql`). Coloque os scripts em um diretório específico, como `src/main/resources/db/migration`.

### Execução

Ao iniciar a aplicação, o Flyway verifica as Migrations já aplicadas e executa apenas as pendentes. Dessa forma, as alterações no esquema do banco de dados são aplicadas automaticamente.

### Controle de Versão

O Flyway mantém um registro das Migrations aplicadas em uma tabela chamada `flyway_schema_history`. Isso garante que cada Migration seja executada apenas uma vez e na ordem correta.

### Vantagens

- Controle e versionamento das alterações no esquema do banco de dados.
- Facilidade de colaboração entre desenvolvedores em equipes.
- Execução automática e controlada das Migrations pendentes.
- Histórico completo das alterações realizadas no banco de dados.

Para mais detalhes, consulte a [documentação oficial do Flyway](https://flywaydb.org/documentation).