use db_aula4;

insert into tb_receita values(null, 'Quebrar o ovo', 'Jeam Lui');

insert into tb_pizzaiolo values(null, 'Fogazza', 10000.00);

insert into tb_embalagens values(null, 'papelao', 'broto', 20.90);

insert into tb_pizza 
values(null, 'peperoni', 40.85, 'massa, molho e peperoni', 'broto', 1, 1);

insert into tb_ingredientes 
values(null, 1, 'peperoni');

insert into tb_ingredientes 
values(null, 1, 'massa');

insert into tb_ingredientes 
values(null, 1, 'molho');

insert into tb_pizza_pizzaiolo values(1, 1);