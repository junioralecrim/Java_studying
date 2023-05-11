## Spring Boot Core Container
**O que é o core container:** onde está a implementação da inversão de controle (IoC) 

**- IoC:** Padrão de projeto em que um objeto vai declarar as suas dependências, mas não vai criá-las.
    Quem vai criar essas dependêncais vai ser o framework (no caso, o Spring), dentro do Core Container.
---
 Spring Boot
---
**O que é o Spring Boot :** _Spring Framework_ + _Servidor Embutido (Tomcat ou Netty)_ - _XML <bean> Configuration
ou @Configuration_
- antes era preciso fazer várias configurações para dar start na aplicação, agora com o SB, tudo ficou bem mais
simples do que antes.
---
Overview do Projeto
---
**Nome :** Parking Control API - Parking Spot

**Do que se trata :** API para controle de estacionamento e vaga de estacionamento

**O que vai ser utilizado :**

- Spring Boot: para iciar a aplicação
- Spring MVC: para construir a aplicação
- Spring Data JPA: transações com bd postgrees
- Spring Validation: validações

**Métodos da API :** 

- GET: paginação e solicitação de determinada pag, def número da pag e ordenação 
- GET one: obter os detalhes de um único recurso por um id
- POST: salvar novos controles de estacionamento
- PUT: atualizar uma nova vaga de estacionamento
- DELETE: deletar o registro

---
_time video: 25min_ 