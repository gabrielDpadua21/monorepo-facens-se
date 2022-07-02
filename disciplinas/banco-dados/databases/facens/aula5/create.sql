create database db_aula5;

use db_aula5;

create table tb_especies(
	id int auto_increment primary key,
	nome varchar(20),
	descricao varchar(200)
);

ALTER TABLE tb_especies
CHANGE COLUMN descricao alimentacao varchar(100);

create table tb_animals (
	id int auto_increment primary key,
	nome varchar(100) not null,
	data_nasc date not null,
	id_especie int,
	foreign key(id_especie ) references tb_especies(id)
);

ALTER TABLE tb_animals ADD COLUMN peso decimal(6, 2);

ALTER TABLE tb_animals ADD COLUMN cor varchar(80);

insert into tb_especies(id, nome, alimentacao) values (null, 'gato'     , 'carnívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'cachorro' , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'morcego'  , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'rato'     , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'ramister' , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'baleia'   , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'sardinha' , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'bacalhau' , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'tubarão'  , 'carnívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'lambari'  , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'corvina'  , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'iguana'   , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'camaleão' , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'lagarto'  , 'onívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'cobra'    , 'carnívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'cacatua'  , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'pardal'   , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'bentevi'  , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'canario'  , 'herbívoro');
insert into tb_especies(id, nome, alimentacao) values (null, 'virus'    , '');
insert into tb_especies(id, nome, alimentacao) values (null, 'bactéria' , '');

insert into tb_animals values (null, 'Ágata',         '2015-04-09', 1, 13.9,   'branco');
insert into tb_animals values (null, 'Félix',         '2016-06-06', 1, 14.3,   'preto');
insert into tb_animals values (null, 'Tom',           '2013-02-08', 1, 11.2,   'azul');
insert into tb_animals values (null, 'Garfield',      '2015-07-06', 1, 17.1,   'laranja');
insert into tb_animals values (null, 'Frajola',       '2013-08-01', 1, 13.7,   'preto');
insert into tb_animals values (null, 'Manda-chuva',   '2012-02-03', 1, 12.3,   'amarelo');
insert into tb_animals values (null, 'Snowball',      '2014-04-06', 1, 13.2,   'preto');
insert into tb_animals values (null, 'Ágata',         '2015-08-03', 1, 11.9,   'azul');
insert into tb_animals values (null, 'Ágata',         '2016-03-04', 1, 18.6,   'roxo');
insert into tb_animals values (null, 'Gato de Botas', '2012-12-10', 1, 11.6,   'amarelo');
insert into tb_animals values (null, 'Bola de pelo',  '2020-04-06', 1, 11.6,   'amarelo');
insert into tb_animals values (null, 'Milu',          '2013-02-04', 2, 17.9,   'branco');
insert into tb_animals values (null, 'Pluto',         '2012-01-03', 2, 12.3,   'amarelo');
insert into tb_animals values (null, 'Pateta',        '2015-05-01', 2, 17.7,   'preto');
insert into tb_animals values (null, 'Snoopy',        '2013-07-02', 2, 18.2,   'branco');
insert into tb_animals values (null, 'bidu',          '2012-09-08', 2, 12.4,   'azul');
insert into tb_animals values (null, 'Dum Dum',       '2015-04-06', 2, 11.2,   'laranja');
insert into tb_animals values (null, 'Muttley',       '2011-02-03', 2, 14.3,   'laranja');
insert into tb_animals values (null, 'Scooby',        '2012-01-02', 2, 19.9,   'marrom');
insert into tb_animals values (null, 'Rufus',         '2014-04-05', 2, 19.7,   'branco');
insert into tb_animals values (null, 'Costelinha',    '2016-05-02', 2, 13.4,   'branco');
insert into tb_animals values (null, 'Coragem',       '2013-07-08', 2, 12.2,   'vermelho');
insert into tb_animals values (null, 'Jake',          '2012-02-07', 2, 11.6,   'vermelho');
insert into tb_animals values (null, 'K900',          '2012-11-25', 2, 11.6,   'amarelo');
insert into tb_animals values (null, 'Jerry',         '2010-02-04', 4, 06.6,   'laranja');
insert into tb_animals values (null, 'Ligeirinho',    '2011-05-03', 4, 04.4,   'amarelo');
insert into tb_animals values (null, 'Mikey',         '2012-07-01', 4, 02.2,   'preto');
insert into tb_animals values (null, 'Minie',         '2013-09-03', 4, 03.2,   'preta');
insert into tb_animals values (null, 'Topo Gigio',    '2016-06-08', 4, 05.5,   'amarelo');
insert into tb_animals values (null, 'Bafo de Onça',  '2016-06-08', null, 05.5,   'amarelo');
insert into tb_animals values (null, 'Susan Murphy',  '2016-06-08', null, 05.5,   'amarelo');
insert into tb_animals values (null, 'Insectosauro',  '2016-06-08', null, 05.5,   'amarelo');
insert into tb_animals values (null, 'Gallaxhar'   ,  '2016-06-08', null, 05.5,   'amarelo');
insert into tb_animals values (null, 'Hathaway'    ,  '2016-06-08', null, 05.5,   'amarelo');
insert into tb_animals values (null, 'Tutubarão',     '2010-02-06', 9, 101.9,  'branca');
insert into tb_animals values (null, 'Prof. Pardal',  '2012-04-04', 17, 1.7,    'amarelo');
insert into tb_animals values (null, 'Mobie',         '2014-05-02', 6, 5069.4, 'branca');