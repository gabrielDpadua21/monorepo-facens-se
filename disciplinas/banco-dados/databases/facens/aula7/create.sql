drop database if exists Empresa;
create database Empresa;
use Empresa;

create table marcas (
	mrc_id					int 			auto_increment		primary key,
	mrc_nome				varchar(50)		not null,			
	mrc_nacionalidade		varchar(50)		
);

create table produtos (
	prd_id					int 			auto_increment 		primary key,
	prd_nome				varchar(50)		not null,
	prd_qtd_estoque			int				not null 			default 0,
	prd_estoque_mim			int 			not null			default 0,
	prd_data_fabricacao		date	 							default now(),
	prd_perecivel			boolean,
	prd_valor				decimal(10,2),
    
    prd_marca_id			int,	
	constraint fk_marcas	foreign key(prd_marca_id) references marcas(mrc_id)
);

create table fornecedores (
	frn_id					int 			auto_increment 		primary key,	
	frn_nome				varchar(50)		not null,
	frn_email				varchar(50)		
);

create table produto_fornecedor (
	pf_prod_id				int				references produtos    (prd_id),
	pf_forn_id				int				references fornecedores(frn_id),
	
	primary key (pf_prod_id, pf_forn_id)
);


insert into fornecedores values (null, 'Los Pollos Hermanos'       ,'frig@pollos.com.mx');
insert into fornecedores values (null, 'Umbrella Corporation'      ,'umbrella@umbrella.com.ca');
insert into fornecedores values (null, 'UAC'                       ,'uac@uac.com.mars.dm');
insert into fornecedores values (null, 'Huey Materiais Escolares'  ,'huey@duck.com.us');
insert into fornecedores values (null, 'Dewey Materiais Escolares' ,'dewey@duck.com.us');
insert into fornecedores values (null, 'Louie Materiais Escolares' ,'louie@duck.com.us');
insert into fornecedores values (null, 'New Informática'           ,'ni@newinf.com.br');
insert into fornecedores values (null, 'Meio Bit TI'               ,'meiobit@bitbit.com.br');
insert into fornecedores values (null, 'Ze Faisca SA'              ,'ze@faisca.com.br');
insert into fornecedores values (null, 'Facens'                    ,'facens@facens.com.br');
insert into fornecedores values (null, 'Linux'                     ,'linux@linux.br');


insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'Faber Castel'	, 'Brasil');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'Labra'			, 'Brasil');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'TOTVS'  		, 'Brasil');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'Multilaser'	, 'Brasil');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'ORCACLE'		, 'EUA');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'IBM'			, 'EUA');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'Microsoft'		, 'EUA');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'HP'			, 'EUA');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'Apple'			, 'EUA');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'SAP'			, 'Alemanha');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'Lenovo'		, 'China');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'ASUS'			, 'Taiwan');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'AOC'			, 'Taiwan');
insert into marcas (mrc_id, mrc_nome, mrc_nacionalidade) values (null, 'LG'			, 'Corea do Sul');




insert into produtos values (null, 'Lapis'				, 4502, 100, '2016-3-3', false, 002.5, 1);
insert into produtos values (null, 'Lapis'				, 8800, 100, '2015-5-5', false, 014.0, 2);
insert into produtos values (null, 'Borracha'			, 2907, 100, '2013-7-8', false, 004.2, 1);
insert into produtos values (null, 'Borracha'			, 5408, 100, '2015-8-2', false, 002.0, 2);
insert into produtos values (null, 'Caderno'			, 7004, 100, '2016-3-4', false, 022.5, 1);
insert into produtos values (null, 'Caneta'				, 8030, 100, '2013-2-4', false, 011.0, 1);
insert into produtos values (null, 'ERP'				, 0060, 100, '2016-5-7', false, 937.5, 3);
insert into produtos values (null, 'ERP'				, 3070, 100, '2014-6-5', false, 472.0, 4);
insert into produtos values (null, 'ERP'				, 2083, 100, '2015-8-4', false, 252.0, 5);
insert into produtos values (null, 'Windows'			, 5040, 100, '2012-9-2', false, 532.0, 7);
insert into produtos values (null, 'IOS'				, 6020, 100, '2014-3-3', false, 756.5, 9);
insert into produtos values (null, 'Teclado'			, 7030, 100, '2016-5-8', false, 412.5, 4);
insert into produtos values (null, 'Teclado'			, 0024, 100, '2013-4-7', false, 172.5, 11);
insert into produtos values (null, 'Teclado'			, 9070, 100, '2015-5-4', false, 192.0, 8);
insert into produtos values (null, 'Mouse'				, 1303, 100, '2016-7-3', false, 142.0, 4);
insert into produtos values (null, 'Mouse'				, 3050, 100, '2013-9-2', false, 122.5, 8);
insert into produtos values (null, 'Mouse'				, 0007, 100, '2012-3-7', false, 152.0, 7);
insert into produtos values (null, 'Pendrive'			, 6070, 100, '2014-5-6', false, 172.0, 4);
insert into produtos values (null, 'CD'					, 8080, 100, '2015-6-4', false, 012.5, 4);
insert into produtos values (null, 'Monitor'			, 9040, 100, '2016-5-2', false, 332.0, 8);
insert into produtos values (null, 'Monitor'			, 0001, 100, '2013-3-6', false, 172.0, 11);
insert into produtos values (null, 'Monitor'			, 2300, 100, '2015-2-5', false, 312.5, 14);
insert into produtos values (null, 'Monitor'			, 6620, 100, '2014-3-3', false, 272.0, 6);
insert into produtos values (null, 'Joystick'			, 0063, 100, '2014-5-7', false, 152.0, 4);
insert into produtos values (null, 'Módulo de memória'	, 7230, 100, '2013-6-8', false, 512.5, 6);
insert into produtos values (null, 'Módulo de memória'	, 9032, 100, '2013-7-8', false, 612.0, 12);
insert into produtos values (null, 'Processador'		, 4509, 100, '2016-8-6', false, 282.5, 6);
insert into produtos values (null, 'Placa de Vídeo'		, 2408, 100, '2015-3-5', false, 152.0, 6);
insert into produtos values (null, 'Placa de Vídeo'		, 0066, 100, '2012-2-3', false, 612.5, 13);
insert into produtos values (null, 'Fonte de Energia'	, 9044, 100, '2013-5-2', false, 112.0, 4);
insert into produtos values (null, 'Fonte de Energia'	, 4054, 100, '2014-7-3', false, 012.5, 8);
insert into produtos values (null, 'HD externo'			, 0400, 100, '2016-8-4', false, 412.5, 14);
insert into produtos values (null, 'Mesa'				, 0240, 100, '2014-4-8', false, 632.5, null);
insert into produtos values (null, 'Cadeira'			, 0490, 100, '2012-3-7', false, 342.0, null);
insert into produtos values (null, 'Rack'				, 0030, 100, '2013-2-6', false, 262.0, null);
insert into produtos values (null, 'Armario'			, 0404, 100, '2012-5-4', false, 412.5, null);
insert into produtos values (null, 'Pera'				, 0069, 100, '2014-7-6', true , 612.0, null);
insert into produtos values (null, 'Maça'				, 0020, 100, '2015-3-5', true , 716.8, null);
insert into produtos values (null, 'Banana'				, 0081, 100, '2016-5-8', true , 512.0, null);

insert into produto_fornecedor values (1,1);
insert into produto_fornecedor values (4,2);

insert into produto_fornecedor values (
	(select prd_id from produtos join marcas on produtos.prd_marca_id = marcas.mrc_id where prd_nome = 'borracha' and mrc_nome = 'Labra') -- 4
		,
	(select frn_id from fornecedores where frn_nome = 'Los Pollos Hermanos')  -- 1
);

insert into produto_fornecedor values (
	(select prd_id from produtos left join marcas on produtos.prd_marca_id = marcas.mrc_id where prd_nome = 'lapis' and mrc_nome = 'Labra')
		,
	(select frn_id  from fornecedores where frn_nome = 'Los Pollos Hermanos')
);

insert into produto_fornecedor values (
	(select prd_id from produtos left join marcas on produtos.prd_marca_id = marcas.mrc_id where prd_nome = 'caderno' and mrc_nome = 'Faber Castel')
		,
	(select frn_id from fornecedores where frn_nome = 'Los Pollos Hermanos')
);


