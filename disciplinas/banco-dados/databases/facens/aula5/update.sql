use db_aula5;

update tb_animals
set nome = 'Goofy'
where nome = 'Pateta';

update tb_animals
set peso = 10.0
where nome = 'Garfield';

update tb_animals
	inner join tb_especies on tb_animals.id_especie = tb_especies.id
set cor = 'laranja'
where tb_especies.nome = 'gato';

alter table tb_animals add column altura decimal(6, 2);

alter table tb_animals add column observacao varchar(200);

delete from tb_animals where peso > 200.0;

delete from tb_animals where nome like "C%";

alter table tb_ drop column cor;

alter table tb_animals change column nome nome varchar(80);

delete a.* from tb_animals a 
	inner join tb_especies e on a.id_especie = e.id
where e.nome = 'gato' or e.nome = 'cachorro';

alter table tb_animals drop column data_nasc;

truncate table tb_animals;

drop table tb_animals, tb_especies;