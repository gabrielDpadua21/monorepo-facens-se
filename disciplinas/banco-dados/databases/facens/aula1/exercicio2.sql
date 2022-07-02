use db_aula1;

create table tb_colaborador (
	clb_cod int not null primary key auto_increment,
	clb_nome varchar(150) not null,
	clb_salario decimal(8, 2) not null,
	clb_cpf char(11) not null,
	clb_cargo varchar(80) not null
);

select * from tb_colaborador;

insert into tb_colaborador values (null, 'Gabriel', 10000.00, '40819992800', 'Desenvolvedor');