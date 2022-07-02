use db_aula1

create table tb_endereco_aluno (
	aln_end_cod int not null primary key auto_increment,
	aln_end_logradouro varchar(10) not null,
	aln_end_nome varchar(100) not null,
	aln_end_numero int not null,
	aln_end_bairro varchar(80) not null,
	aln_end_cidade varchar(50) not null,
	aln_end_estado varchar(50) not null
);

create table tb_alunos (
	aln_cod int primary key auto_increment,
	aln_ra int not null,
	aln_nome varchar(100) not null,
	aln_email varchar(80) not null,
	aln_data_nasc date not null,
	aln_end int,
	foreign key (aln_end) references tb_endereco_aluno(aln_end_cod)
);

insert into tb_endereco_aluno values (null, 'Rua', 'Ubaldino amaral', 237, 'Centro', 'Sorocaba', 'SP');

insert into tb_alunos values(null, 12345, 'Gabriel D. Padua', 'gabriel.padua@teste.com', '1995-08-21', 1);

select * from tb_alunos
 inner join tb_endereco_aluno on aln_end = aln_end_cod;