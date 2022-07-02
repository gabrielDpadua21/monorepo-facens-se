use aula7;

select * from marcas;
select * from produtos;
select * from fornecedores;
select * from produto_fornecedor;

show tables;

select mrc_id, mrc_nome
from marcas;

select mrc_id, mrc_nome, count(prd_id)
from marcas
	inner join produtos on mrc_id = prd_marca_id
group by mrc_id, mrc_nome;

select mrc_id, mrc_nome, avg(prd_valor)
from marcas
	inner join produtos on mrc_id = prd_marca_id
group by mrc_id, mrc_nome;

select	
case 
	when prd_perecivel = 0 then 'Perecivel'
	when prd_perecivel = 1 then 'Não perecivel'
end
prd_nome, prd_valor
from produtos
group by prd_perecivel, prd_nome, prd_valor;


select prd_nome, avg(prd_valor)
from produtos
group by prd_nome;

select mrc_nome, prd_nome, avg(prd_valor), sum(prd_qtd_estoque)
from marcas
	inner join produtos on mrc_id = prd_marca_id
group by mrc_nome, prd_nome;

select prd_nome, mrc_nome, prd_qtd_estoque
from produtos 
	inner join marcas on prd_marca_id = mrc_id
where prd_valor = (select max(prd_valor) from produtos);

select prd_nome, mrc_nome, prd_qtd_estoque
from produtos 
	inner join marcas on prd_marca_id = mrc_id
order by prd_valor desc
limit 1;

select prd_nome
from produtos
where prd_valor > (select avg(prd_valor) from produtos);

select frn_nome, count(prd_qtd_estoque)
from produtos
	inner join produto_fornecedor on prd_id = pf_prod_id
	inner join fornecedores on frn_id = pf_forn_id
group by frn_nome;
	
	
	
	
	


