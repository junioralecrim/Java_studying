Herança
---
**Visitante - Herança pobre:** Herança do tipo "pobre", pois não vai ter atributos e/ou métodos
da classe a não ser os herdados pela superclasse/classe mãe "Pessoa".

**Visitante - Herança de implementação:** É um tipo de herança que apenas implementa
uma classe abstrata

---
| --+--      | Abstrato                                                  | Final                                                                               |
|------------|-----------------------------------------------------------|-------------------------------------------------------------------------------------|
| **Classe** | Não pode ser instânciada. Só pode servir como progenitora | Não pode ser herdada por outra classe _(não pode ter filhos)_. Obrigatoriamente folha |
| **Método** | Declarado, mas não implementado na progenitora            | Não pode ser sobrescrito pelas suas sub-classes. Obrigatoriamente herdado           |
---
Devo usar final na classe quando eu quiser que ela **_não tenha filhos_**. E final nos métodos quando eu quiser que eles
**_não sejam sobrepostos_** (@Overrided no java).