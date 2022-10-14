Spring Boot - Spring Framework
---
### Padrão MVC
_**Model - coração da aplicação:**_ 
- regras de negócio
- entidades
- camada de acesso a dados

_**View - renderização da resposta:**_

- renderiza a pag de acordo com a requisição. Vai ser usado JavaScript, 
CSS, HTMl, templates engines

_**Controller - controle de fluxo:**_

- Faz toda a parte de intermédio entre a camada de visualização (view) e a camada model
- Coordena o fluxo de dados

### Analogia comparativa com um prédio (aplicação MVC). 

Eu não posso entregar/pedir diretamente em um andar de um prédio algum documento. Pra isso,
seria entregue a recepcionista (framework que possui a inteligência de distribuir os requests), a recepcionista vai passar as informações 
a algum funcionário e este vai em busca da resposta requerida(controller vai no model), trazendo essa resposta.

---

### Fluxo: como as informações passam do browser para a aplicação?
Browser --> Web Server --> Aplicação --> Controller (primeira camada que recebe a aplicação)

**Cenário 1 - Requisição não precisa acessar dados**

Não vai precisar passar pela camada model, ou seja, vai apenas querer mostrar alguma tela no browser, sem necessidade
de dados para renderizar a tela.

![MVC-sem-acesso-dados](https://cdn.discordapp.com/attachments/545784069481431044/1030531074876526623/MVC_sem_acesso_a_dados.png)

**Cenário 2 - Requisição precisa acessar dados**

![MVC](https://cdn.discordapp.com/attachments/545784069481431044/1030531494239813652/unknown.png)
