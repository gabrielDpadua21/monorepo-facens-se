CREATE TABLE tb_diretor (
	id_diretor INT NOT NULL,
	nome_diretor VARCHAR(50) NOT NULL,
	PRIMARY KEY (id_diretor)
);

SELECT * FROM tb_diretor;

CREATE TABLE tb_filme (
	id_filme INT NOT NULL,
	nome_filme VARCHAR(50) NOT NULL,
	id_filme_diretor INT NOT NULL,
	id_filme_produtora INT NOT NULL,
	categoria VARCHAR(40) NOT NULL,
	PRIMARY KEY (id_filme),
	FOREIGN KEY (id_filme_diretor) REFERENCES tb_diretor(id_diretor)
);

SELECT * FROM tb_filme;

CREATE TABLE tb_produtora (
	id_produtora INT NOT NULL,
	nome_produtora VARCHAR(40) NOT NULL,
	PRIMARY KEY (id_produtora)
);

select * from tb_produtora;


alter table tb_filme
add constraint fk_id_filme_produtora foreign key (id_filme_produtora) 
references tb_produtora (id_produtora);
