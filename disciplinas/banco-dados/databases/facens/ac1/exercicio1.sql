create database db_produtos;

use db_produtos;

create table tb_marca (
	mrc_cod int auto_increment primary key,
	mrc_name varchar(100) not null,
	mrc_site varchar(80) not null,
	mrc_telefone char(12) not null 
);


create table tb_produto (
	prod_cod int auto_increment primary key,
	prod_name varchar(100) not null,
	prod_preco_curso decimal(8, 2) not null,
	proc_preco_venda decimal (8, 2) not null,
	prod_data_validade datetime not null,
	prod_mrc_cod int,
	foreign key (prod_mrc_cod) references tb_marca (mrc_cod)
);

show tables;


insert into tb_marca values(null, 'Ferrari', 'ferrari.com.br', '551133445566');
insert into tb_marca values(null, 'Apple', 'apple.com', '551132345466');
insert into tb_marca values(null, 'Acer', 'acer.com.br', '551532335678');

select * from tb_marca;


insert into tb_produto values(null, 'Spider', 100000, 150000, '2050-10-10', 1);
insert into tb_produto values(null, 'Enzos', 180000, 200000, '2060-10-10', 1);
insert into tb_produto values(null, 'F8', 300000, 350000, '2100-10-10', 1);

insert into tb_produto values(null, 'Macbook', 10000, 15000, '2030-09-09', 2);
insert into tb_produto values(null, 'Iphone', 5000, 6000, '2030-09-09', 2);
insert into tb_produto values(null, 'Ipad', 3000, 5000, '2030-09-09', 2);

insert into tb_produto values (null, 'Notbook Gamer', 4000, 5000, '2025-09-09', 3);
insert into tb_produto values (null, 'Monitor', 1000, 1500, '2030-09-09', 3);

select * from tb_produto;
















