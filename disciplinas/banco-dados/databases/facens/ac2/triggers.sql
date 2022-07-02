use db_ac2;

create table tb_logs (
	log_cod int auto_increment primary key,
	log_table varchar(50) not null,
	log_operation varchar(50) not null,
	log_date datetime not null
);

create procedure proc_insert_log(
	tb varchar(50),
	op varchar(50)
)
begin
	insert into tb_logs (log_table, log_operation, log_date) values (tb, op, NOW());
end;

create trigger trg_insert_cliente
	after insert
	on tb_cliente
	for each row
	call proc_insert_log('tb_cliente', 'INSERT');

create trigger trg_update_cliente
	after update
	on tb_cliente
	for each row
	call proc_insert_log('tb_cliente', 'UPDATE');

create trigger trg_delete_cliente
	after delete
	on tb_cliente
	for each row
	call proc_insert_log('tb_cliente', 'DELETE');


create trigger trg_insert_produto
	after insert
	on tb_produto
	for each row
	call proc_insert_log('tb_produto', 'INSERT');

create trigger trg_update_produto
	after update
	on tb_produto
	for each row
	call proc_insert_log('tb_produto', 'UPDATE');

create trigger trg_delete_produto
	after delete
	on tb_produto
	for each row
	call proc_insert_log('tb_produto', 'DELETE');


create trigger trg_insert_pedido
	after insert
	on tb_pedido
	for each row
	call proc_insert_log('tb_pedido', 'INSERT');

create trigger trg_update_pedido
	after update
	on tb_pedido
	for each row
	call proc_insert_log('tb_pedido', 'UPDATE');

create trigger trg_delete_pedido
	after delete
	on tb_pedido
	for each row
	call proc_insert_log('tb_pedido', 'DELETE');
	

select * from tb_logs;