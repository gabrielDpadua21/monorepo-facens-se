use db_ac2;

create procedure proc_insert_pedido_produto(
	cliCod int, 
	prodCod int,
	quantidade int
)
begin
	declare prodPrice decimal(8, 2) DEFAULT 0.0;

	select prod_preco into prodPrice from tb_produto where prod_cod = prodCod;

	insert into tb_pedido (pdd_total, pdd_cli_cod) values(prodPrice * quantidade, cliCod);
end;