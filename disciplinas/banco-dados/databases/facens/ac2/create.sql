create database db_ac2;

use db_ac2;

create table tb_marca(
	mrc_cod int auto_increment primary key,
	mrc_nome varchar(100) not null
);

create table tb_fornecedor(
	frc_cod int auto_increment primary key,
	frc_nome varchar(100) not null,
	frc_email varchar(60) not null,
	frc_telefone char(11) not null
);

create table tb_produto(
	prod_cod int auto_increment primary key,
	prod_nome varchar(100) not null,
	prod_preco decimal(8, 2) not null,
	prod_tamanho decimal(10, 2) not null,
	prod_mrc_cod int not null,
	prod_frc_cod int not null,
	constraint fk_marcas foreign key(prod_mrc_cod) references tb_marca(mrc_cod),
	constraint fk_fornecedor foreign key(prod_frc_cod) references tb_fornecedor(frc_cod)
);


create table tb_cliente(
	cli_cod int auto_increment primary key,
	cli_nome varchar(100) not null,
	cli_email varchar(60) not null,
	cli_cpf char(12) not null,
	cli_avaliacao decimal(4, 2)
);

create table tb_endereco(
	end_cod int auto_increment primary key,
	end_cep char(8) not null,
	end_logradouro varchar(100) not null,
	end_numero int,
	end_bairro varchar(50) not null,
	end_cidade varchar(50) not null,
	end_uf char(2) not null,
	end_cli_cod int not null,
	constraint fk_end_cliente foreign key(end_cli_cod) references tb_cliente(cli_cod)
);

create table tb_pedido(
	pdd_cod int auto_increment primary key,
	pdd_total decimal(10, 2) not null,
	pdd_cli_cod int not null,
	constraint fk_pdd_cliente foreign key(pdd_cli_cod) references tb_cliente(cli_cod)
);

create table tb_pedido_venda(
	pdv_prod_cod int not null,
	pdv_pdd_cod int not null,
	pdv_quantidade int not null,
	constraint fk_pdv_prod foreign key(pdv_prod_cod) references tb_produto(prod_cod),
	constraint fk_pdv_pdd foreign key(pdv_pdd_cod) references tb_pedido(pdd_cod)
);

alter table tb_pedido_venda add primary key(pdv_prod_cod, pdv_pdd_cod);


