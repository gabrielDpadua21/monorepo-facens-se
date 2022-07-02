create database db_aula4;

use db_aula4;

create table tb_receita(
	rct_cod int auto_increment primary key,
	rct_instrucoes text not null,
	rct_autor varchar(80) not null
)

create table tb_pizzaiolo(
	pzo_cod int auto_increment primary key,
	pzo_nome varchar(80) not null,
	pzo_salario decimal(8, 2) not null
)

create table tb_embalagens(
	emb_cod int auto_increment primary key,
	emb_material varchar(80) not null,
	emb_tamanho ENUM('broto', 'media', 'grande', 'familia') not null,
	emb_preco decimal(8, 2) not null
)

create table tb_pizza(
	pz_cod int auto_increment primary key,
	pz_sabor varchar(80) not null,
	pz_preco decimal(6, 2) not null,
	pz_descricao text not null,
	emb_tamanho ENUM('broto', 'media', 'grande', 'familia') not null,
	pz_rct_cod int,
	pz_emb_cod int,
	foreign key(pz_rct_cod) references tb_receita(rct_cod),
	foreign key(pz_emb_cod) references tb_embalagens(emb_cod)
)

create table tb_ingredientes(
	ing_cod int auto_increment primary key,
	ing_pz_cod int,
	ing_nome varchar(80),
	foreign key (ing_pz_cod) references tb_pizza(pz_cod)
)

create table tb_pizza_pizzaiolo (
	rel_pz_cod int not null,
	rel_pzo_cod int not null,
	primary key (rel_pz_cod, rel_pzo_cod),
	foreign key (rel_pz_cod) references tb_pizza(pz_cod),
	foreign key (rel_pzo_cod) references tb_pizzaiolo(pzo_cod)
)