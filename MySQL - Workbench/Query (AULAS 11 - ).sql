////////////////// AULA 11 - SELECT (PART 1) //////////////////;

//TRADUZINDO A LINHA ABAIXO
Selecione (select) todos os campos/colunas/atributos (*) da (from) tabela cursos;

select * from cursos;









//ORDENANDO POR COLUNA COM o By
No caso abaixo, está sendo ordenado pelo nome (do curso)
o desc (decrescente) no comando abaixo serve para ordenar na forma inversa.;

select * from cursos 
order by nome desc;










//FAZENDO A SELEÇÃO POR FILTRAGEM DE COLUNAS.
A ordem de inserção das colunas abaixo que vai definir a ordem de mostragem. Eu posso ordenar por múltiplos
parâmetros também. Abaixo, estou fazendo a ordenação dos cursos por ano e, dentro disso, a ordenação por nome.;
select ano, nome, carga from cursos
order by ano, nome;










//FAZENDO A SELEÇÃO POR FILTRAGEM DE LINHAS
abaixo estou selecionando apenas os cursos que foram realizados em 2016;

SELECT nome, descricao, carga FROM cursos
WHERE ano = '2016'
ORDER BY nome;










//TAMBÉM POSSO UTILIZAR OPERADORES RELACIONAIS NO WHERE;

SELECT ano, nome, descricao FROM cursos
WHERE ano >= 2016
ORDER BY ano, nome, descricao;










///Tambéme existem outros operadores relacionais, como por exemplo o between (entre). Que serve para 
selecionar registros entre dois registros passados (feixa de valores);

select nome, ano from cursos
where ano between 2014 and 2016
order by ano desc, nome;










//Já o IN serve para mostrar apenas os dados relacionados. Diferentemente do '=', que só mostra a partir de um parâmetro passado, o in me deixa
mostrar dados a partir de vários parâmetros selecionados;

select idcurso, nome, descricao, ano from cursos
where idcurso in (1, 5, 8, 12)
order by ano desc;










//Também é possível utilizar operadores lógicos combinados, como o and, or e not;
SELECT nome, carga, totaulas from cursos
where carga > 35 and totaulas < 30;

SELECT nome, carga, totaulas from cursos
where carga > 35 or totaulas < 30;




