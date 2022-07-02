create database db_filmes;

use db_filmes;

create table tb_categoria (
	cat_cod int auto_increment primary key,
	cat_nome varchar(80) not null, 
	cat_publico_alvo varchar(100) not null
);

create table tb_filme (
	flm_cod int auto_increment primary key,
	flm_titulo varchar(100) not null, 
	flm_sinopse text not null,
	flm_estudio varchar(80) not null,
	flm_cat_cod int,
	foreign key (flm_cat_cod) references tb_categoria (cat_cod)
);

insert into tb_categoria values(null, 'Acao', 'Todos');
insert into tb_categoria values(null, 'Aventura', 'Todos');
insert into tb_categoria values(null, 'Super Heroi', 'Todos');

select * from tb_categoria;


insert into tb_filme values(null, 'Vingadores 1', 'Lorem lorem lorem lorem lorem lorem', 'Marvel', 3);
insert into tb_filme values(null, 'Vingadores Era de ultron', 'Lorem lorem lorem lorem lorem lorem', 'Marvel', 3);
insert into tb_filme values(null, 'Vingadores Guerra Civil', 'Lorem lorem lorem lorem lorem lorem', 'Marvel', 3);
insert into tb_filme values(null, 'Vingadores Ultimato', 'Lorem lorem lorem lorem lorem lorem', 'Marvel', 3);
insert into tb_filme values(null, 'Vingadores Guerra Infinita', 'Lorem lorem lorem lorem lorem lorem', 'Marvel', 3);
insert into tb_filme values(null, 'Rambo', 'Lorem lorem lorem lorem lorem lorem', 'Universal', 1);
insert into tb_filme values(null, 'Rock', 'Lorem lorem lorem lorem lorem lorem', 'Sony', 1);
insert into tb_filme values(null, 'Rock II', 'Lorem lorem lorem lorem lorem lorem', 'Sony', 1);


select * from tb_filme;




