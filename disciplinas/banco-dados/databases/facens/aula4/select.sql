use db_aula4;

select pz_sabor as Pizza, pzo_nome as Pizzaiolo from tb_pizza_pizzaiolo
	inner join tb_pizza on rel_pz_cod = pz_cod
	inner join tb_pizzaiolo on rel_pzo_cod = pzo_cod;
	
select pz_sabor as Pizza, ing_nome as Ingrediente from tb_pizza
	inner join tb_ingredientes on pz_cod = ing_pz_cod;
	

select ing_nome as Ingrediente, pz_sabor as Pizza from tb_ingredientes
	inner join tb_pizza on ing_pz_cod = pz_cod;
	
select pz_sabor as Pizza, pzo_nome as Pizzaiolo, rct_instrucoes as Intrucoes
from tb_pizza_pizzaiolo
	inner join tb_pizza on rel_pz_cod = pz_cod
	inner join tb_pizzaiolo on rel_pzo_cod = pzo_cod
	inner join tb_receita on pz_rct_cod = rct_cod;