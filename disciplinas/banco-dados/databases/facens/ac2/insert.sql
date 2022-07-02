use db_ac2;

insert into tb_marca (mrc_nome) values ('Cormier, Stamm and Vandervort');
insert into tb_marca (mrc_nome) values ('Hartmann LLC');
insert into tb_marca (mrc_nome) values ('Fisher, Herman and Satterfield');
insert into tb_marca (mrc_nome) values ('Morissette Inc');
insert into tb_marca (mrc_nome) values ('Barton LLC');
insert into tb_marca (mrc_nome) values ('Cole, Tromp and Dickinson');
insert into tb_marca (mrc_nome) values ('Leffler LLC');
insert into tb_marca (mrc_nome) values ('Brown-Hoppe');
insert into tb_marca (mrc_nome) values ('Conn, Murazik and Nicolas');
insert into tb_marca (mrc_nome) values ('Ullrich Group');

insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Linoel', 'lderuggiero0@blinklist.com', '1486391244');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Gerrard', 'gvowels1@bing.com', '8792324586');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Shirline', 'solwen2@hexun.com', '8629734586');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Mycah', 'mgrigoriev3@wufoo.com', '6908230712');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Jonathan', 'jinkles4@time.com', '9705581463');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Jennifer', 'jingilson5@noaa.gov', '1564254794');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Janka', 'jgullivent6@alibaba.com', '5155369015');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Vidovic', 'vbamlet7@google.es', '9074858540');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Freddy', 'fcritchell8@slideshare.net', '4686071802');
insert into tb_fornecedor (frc_nome, frc_email, frc_telefone) values ('Jerrome', 'jingall9@toplist.cz', '6157402598');


insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Lamb - Whole, Frozen', 77.83, 412.16, 4, 6);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Pork Loin Bine - In Frenched', 41.66, 217.56, 4, 10);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Coffee - Egg Nog Capuccino', 55.53, 66.31, 3, 6);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Beans - Fava, Canned', 26.67, 194.42, 3, 7);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Pork - Back, Long Cut, Boneless', 19.69, 424.23, 3, 1);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Tandoori Curry Paste', 86.62, 16.56, 2, 6);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Sea Urchin', 40.25, 896.44, 8, 6);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Cup - Paper 10oz 92959', 40.81, 698.42, 8, 4);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Wine - Magnotta - Cab Sauv', 94.35, 272.72, 8, 8);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Oil - Sunflower', 18.16, 62.72, 3, 7);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Miso Paste White', 53.62, 528.38, 5, 1);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Aspic - Light', 66.79, 97.88, 7, 8);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Flavouring - Rum', 30.25, 193.88, 9, 6);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Beans - Kidney, Canned', 94.54, 905.77, 1, 1);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Hinge W Undercut', 52.3, 824.91, 9, 5);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Bar - Sweet And Salty Chocolate', 82.58, 510.48, 6, 3);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Alize Sunset', 86.5, 858.51, 5, 5);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Sauce - Demi Glace', 46.83, 978.0, 1, 1);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Tortillas - Flour, 12', 73.72, 260.51, 3, 7);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Basil - Seedlings Cookstown', 26.37, 506.69, 4, 7);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Croissant, Raw - Mini', 49.8, 874.69, 4, 2);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Cheese - Mozzarella, Shredded', 58.86, 926.32, 7, 4);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Salmon - Fillets', 46.72, 465.62, 1, 6);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Tart - Butter Plain Squares', 78.93, 580.01, 7, 9);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Yoplait - Strawbrasp Peac', 81.95, 601.26, 2, 1);
insert into tb_produto (prod_nome, prod_preco, prod_tamanho, prod_mrc_cod, prod_frc_cod) values ('Bread - French Baquette', 55.04, 963.93, 6, 2);

insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Garrot Durtnell', 'gdurtnell0@squidoo.com', '92108047058', 1.78);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Debora Gonsalo', 'dgonsalo1@aboutads.info', '35412200485', 7.14);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Marijn Norquay', 'mnorquay2@istockphoto.com', '19582275422', 4.96);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Laurena Killock', 'lkillock3@canalblog.com', '69384582985', 3.48);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Hastings Hadkins', 'hhadkins4@abc.net.au', '13558870953', 3.02);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Sunny Passion', 'spassion5@cbsnews.com', '33131500260', 7.57);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Bebe Lanigan', 'blanigan6@reuters.com', '94577502523', 4.3);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Garrot Rumsby', 'grumsby7@gizmodo.com', '81316323502', 4.99);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Dominique Duthy', 'dduthy8@about.com', '82836456344', 8.87);
insert into tb_cliente (cli_nome, cli_email, cli_cpf, cli_avaliacao) values ('Hugibert Fulcher', 'hfulcher9@storify.com', '59752312628', 5.02);

insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('52713337', 'Clemons', 217, 'Crossing', 'Capelinha', 'SP', 1);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('26137459', 'Tennyson', 29118, 'Plaza', 'Cruzeiro do Oeste', 'SP', 2);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('85235935', 'Steensland', 567, 'Drive', 'Valença do Piauí', 'SP', 3);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('96769630', '4th', 9687, 'Trail', 'Gaspar', 'SP', 4);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('74084554', 'Atwood', 8, 'Pass', 'Ouricuri', 'RJ', 5);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('58714613', 'Hudson', 8302, 'Alley', 'Itajubá', 'RJ', 6);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('12456427', 'Dayton', 33615, 'Junction', 'Jaguaribe', 'SP', 7);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('90825108', 'Elka', 47, 'Junction', 'Cascavel', 'RJ', 8);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('51138030', 'Shelley', 3, 'Lane', 'Itajuípe', 'MG', 9);
insert into tb_endereco (end_cep, end_logradouro, end_numero, end_bairro, end_cidade, end_uf, end_cli_cod) values ('74906336', 'Nova', 8, 'Pass', 'Catende', 'MG', 10);

insert into tb_pedido (pdd_total, pdd_cli_cod) values(150.25, 1);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(120.25, 2);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(100.25, 1);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(200.50, 3);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(90.25, 4);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(10.25, 1);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(50.25, 6);
insert into tb_pedido (pdd_total, pdd_cli_cod) values(300.25, 10);

insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 1, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(2, 1, 1);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 2, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 3, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 4, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 5, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 6, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(1, 7, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(2, 8, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(3, 5, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(5, 6, 3);
insert into tb_pedido_venda(pdv_prod_cod, pdv_pdd_cod, pdv_quantidade) values(6, 7, 3);






















