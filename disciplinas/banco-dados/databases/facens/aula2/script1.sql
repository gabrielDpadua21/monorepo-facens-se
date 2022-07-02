create database db_aula2;

use db_aula2;

create table tb_animal (
	anm_cod int primary key auto_increment,
	anm_nome varchar(80) not null,
	anm_data_nascimento date not null,
	anm_peso decimal(8, 2) not null,
	cor varchar(15) not null
);


select * from tb_animal;

insert into tb_animal values (null, 'Frajola', '2015-08-21', 5.2, 'Preto e Branco');
insert into tb_animal values (null, 'Thor', '2015-08-21', 8.2, 'Malhado');
insert into tb_animal values (null, 'Lucifer', '2015-08-21', 9.2, 'Listrado');

insert into tb_animal values (null, 'Frajola2', '2015-08-21', 5.2, 'Preto e Branco');
insert into tb_animal values (null, 'Thor2', '2015-08-21', 8.2, 'Malhado');
insert into tb_animal values (null, 'Lucifer2', '2015-08-21', 9.2, 'Listrado');

insert into tb_animal values (null, 'Frajola3', '2015-08-21', 5.2, 'Preto e Branco');
insert into tb_animal values (null, 'Thor3', '2015-08-21', 8.2, 'Malhado');
insert into tb_animal values (null, 'Lucifer3', '2015-08-21', 9.2, 'Listrado');

insert into tb_animal values (null, 'Frajola3', '2015-08-21', 4.2, 'Preto e Branco');
insert into tb_animal values (null, 'Thor3', '2015-08-21', 7.2, 'Malhado');
insert into tb_animal values (null, 'Lucifer3', '2015-08-21', 20.2, 'Listrado');

insert into tb_animal values (null, 'Frajola5', '2015-08-21', 1.2, 'Preto e Branco');
insert into tb_animal values (null, 'Thor5', '2015-08-21', 45.2, 'Malhado');
insert into tb_animal values (null, 'Lucifer5', '2015-08-21', 12.2, 'Listrado');

insert into tb_animal values (null, 'Frajola6', '2015-08-21', 12.2, 'Preto e Branco');
insert into tb_animal values (null, 'Thor6', '2015-08-21', 32.2, 'Malhado');
insert into tb_animal values (null, 'Lucifer6', '2015-08-21', 9.2, 'Listrado');

update tb_animal
set anm_nome = 'Lucifer4'
where anm_cod = 12;

select * from tb_animal where anm_nome like '%t%' order by anm_nome asc;










