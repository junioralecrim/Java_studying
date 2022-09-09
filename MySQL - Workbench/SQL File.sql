/////////////////// LISTA DE COMANDOS ('aprendidos até o momento')///////////////////
DDL - "Date Definition Language"
CREATE DATABASE
CREATE TABLE
ALTER TABLE
DROP TABLE

DML - "Date Definition Language"
INSERT INTO
UPDATE
DELETE
TRUNCATE;


create database faculdade;
use faculdade;


create table alunos (
	id int not null auto_increment,
    matricula varchar(20) not null unique,
    cpf varchar(15) not null unique,
    nome varchar(30) not null,
    nascimento date,
	primary key (id)
) default charset = utf8mb4;

alter table alunos
change column id id_aluno int not null auto_increment; 

select * from alunos;

