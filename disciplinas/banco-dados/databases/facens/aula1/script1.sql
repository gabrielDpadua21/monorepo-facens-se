create database db_aula1;

use db_aula1;

create table tb_animal (
	id int not null auto_increment primary key,
	nome varchar(60) not null,
	data_nasc date,
	peso decimal(8, 2) not null,
	cor varchar(15) not null
);

select * from tb_animal;

alter table tb_animal modify peso decimal(8, 3);

insert into tb_animal (nome, peso, cor) values ('Frajola', 5.2, 'Preto e Branco');
insert into tb_animal (nome, peso, data_nasc, cor) values ('Thor', 10.2, '2015-08-21' ,'Malhado');
insert into tb_animal (nome, peso, cor) values ('Lucyfer', 3.123, 'Listrado');