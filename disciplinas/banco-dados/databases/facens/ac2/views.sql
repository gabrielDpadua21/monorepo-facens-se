use db_ac2;

create view clientes as 
select cli_cod, cli_nome, cli_email, cli_cpf, cli_avaliacao, end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf
from tb_cliente
inner join tb_endereco
	on cli_cod = end_cli_cod;


select * from clientes


create view produtos as
select prod_cod, prod_nome, prod_preco, prod_tamanho, mrc_nome, frc_nome, frc_email, frc_telefone
from tb_produto
inner join tb_marca
	on mrc_cod = prod_mrc_cod
inner join tb_fornecedor
	on frc_cod = prod_frc_cod;

select * from produtos;
	

create view vendas as
select cli_cod, pdd_cod, cli_nome, cli_email, prod_nome, mrc_nome
from tb_cliente
inner join tb_pedido
	on cli_cod = pdd_cli_cod
inner join tb_pedido_venda
	on pdd_cod = pdv_pdd_cod
inner join tb_produto
	on pdv_prod_cod = prod_cod
inner join tb_marca
	on mrc_cod = prod_mrc_cod;


select * from vendas;