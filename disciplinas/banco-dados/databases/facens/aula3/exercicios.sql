use db_aula3;

select anm.nome as "Animal", esp.nome as "Especie" from tb_animals anm
	inner join tb_especies esp on anm.id_especie = esp.id;
	

select anm.nome as "Gato" from tb_animals anm
	inner join tb_especies esp on anm.id_especie = esp.id
where esp.nome = 'gato';

select anm.nome as "Gato" from tb_animals anm
	inner join tb_especies esp on anm.id_especie = esp.id
where esp.nome = 'gato' and anm.cor = 'caramelo';

select anm.nome as "Aquatico" from tb_animals anm
	inner join tb_especies esp on anm.id_especie = esp.id
where esp.nome in ('baleia', 'sardinha', 'bacalhau', 'tubarão', 'lambari');

select anm.nome as "Aquatico" from tb_animals anm
	inner join tb_especies esp on anm.id_especie = esp.id
where esp.nome in ('baleia', 'sardinha', 'bacalhau', 'tubarão', 'lambari') and peso > 70;

select count(*) from tb_animals;

select count(peso) from tb_animals anm
	inner join tb_especies esp on anm.id_especie = esp.id
where esp.nome = 'gato';