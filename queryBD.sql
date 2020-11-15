CREATE DATABASE srMusicas;

USE srMusicas;

CREATE TABLE tb_pessoa(
	codigoPessoa INT PRIMARY KEY AUTO_INCREMENT,
    nomePessoa VARCHAR(200),
    loginPessoa VARCHAR(50),
    senhaPessoa VARCHAR(50),
    emailPessoa VARCHAR(200)
);

CREATE TABLE tb_genero(
	codigoGenero INT PRIMARY KEY AUTO_INCREMENT,
    nomeGenero VARCHAR(200)
);

CREATE TABLE tb_musica(
	codigoMusica INT PRIMARY KEY AUTO_INCREMENT,
    nomeMusica VARCHAR(200),
    compositorMusica VARCHAR(200)
);

CREATE TABLE tb_avaliacao(
	codigoAvaliacao INT PRIMARY KEY AUTO_INCREMENT,
    codigoMusica INT,
    codigoCliente INT
);

ALTER TABLE tb_avaliacao ADD column valorAvaliacao int(4);

CREATE TABLE tb_pessoaGenero(
	codigoPessoaGenero INT PRIMARY KEY AUTO_INCREMENT,
    codigoMusica INT,
    codigoPessoa INT,
    avaliacao INT
);

CREATE TABLE tb_musicaGenero(
	codigoMusicaGenero INT PRIMARY KEY AUTO_INCREMENT,
    codigoMusica INT,
    codigoGenero INT
);

INSERT INTO tb_pessoa (nomePessoa, loginPessoa, senhaPessoa, emailPessoa) VALUES ('Administrador', 'admin', '123456','admin@email.com');

INSERT INTO tb_genero(nomeGenero) VALUES ('Hard rock');
INSERT INTO tb_genero(nomeGenero) VALUES ('Heavy Metal');
INSERT INTO tb_genero(nomeGenero) VALUES ('Rock progressivo');
INSERT INTO tb_genero(nomeGenero) VALUES ('Rock psicodélico');
INSERT INTO tb_genero(nomeGenero) VALUES ('Grunge');
INSERT INTO tb_genero(nomeGenero) VALUES ('Blues');

INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Pink Floyd','High Hopes');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Pink Floyd','Comfortably Numb');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Led Zeppelin','Since I´ve been loving you');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Led Zeppelin','Baby Im gonna leave you');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Yes','Yesterday and today');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('King Crimson','21st Century Schizoid Man');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Genesis','Mama');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('ACDC','Highway to Hell');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Guns N’ Roses','Estranged');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('The Rolling Stones','Its Only Rock n Roll');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Black Sabbath','Sabbath Bloody Sabbath');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Metallica','Nothing Else Matters');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Iron Maiden','The Number of the Beast');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Alice In Chains','Love, Hate, Love');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Soundgarden','Black hole sun');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Nirvana','The man who sold the world');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Temple of the Dog','Hunger Strike');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Pearl Jam','Rearviewmirror');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('B.B. King','The Blues Come Over Me');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Jimi Hendrix','Hey Joe');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Stevie Ray Vaughan','The sky is crying');
INSERT INTO tb_musica(compositorMusica, nomeMusica) VALUES ('Eric Clapton','Let It Grow');

INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (1,3);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (1,4);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (2,3);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (2,4);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (3,4);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (3,1);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (4,4);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (4,1);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (5,3);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (5,4);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (6,3);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (6,6);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (7,3);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (8,1);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (9,1);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (9,2);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (10,1);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (10,2);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (11,2);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (12,2);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (13,2);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (14,5);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (15,5);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (16,5);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (17,5);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (18,5);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (19,6);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (20,6);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (21,6);
INSERT INTO tb_musicaGenero(codigoMusica, codigoGenero) VALUES (22,6);

ALTER TABLE tb_avaliacao ADD FOREIGN KEY (codigoMusica) REFERENCES tb_musica(codigoMusica);
ALTER TABLE tb_avaliacao ADD FOREIGN KEY (codigoCliente) REFERENCES tb_pessoa(codigoPessoa);

ALTER TABLE tb_musicaGenero ADD FOREIGN KEY (codigoMusica) REFERENCES tb_musica(codigoMusica);
ALTER TABLE tb_musicaGenero ADD FOREIGN KEY (codigoGenero) REFERENCES tb_genero(codigoGenero);

ALTER TABLE tb_pessoaGenero ADD FOREIGN KEY (codigoMusica) REFERENCES tb_musica(codigoMusica);
ALTER TABLE tb_pessoaGenero ADD FOREIGN KEY (codigoPessoa) REFERENCES tb_pessoa(codigoPessoa);



SELECT tb_genero.nomeGenero FROM tb_pessoaGenero
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa 
WHERE tb_pessoa.loginPessoa = 'jorgelpiva';

SELECT * FROM tb_pessoa;

SELECT tb_musica.nomeMusica, tb_avaliacao.valorAvaliacao FROM tb_avaliacao
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica;

SELECT codigoPessoa FROM tb_pessoa WHERE loginPessoa = 'jorgelpiva';

SELECT * FROM tb_pessoaGenero;

SELECT * FROM tb_genero;

SELECT * FROM tb_musica;

INSERT INTO tb_avaliacao(codigoMusica, codigoCliente, valorAvaliacao) VALUES (22, 6, 3);
INSERT INTO tb_avaliacao(codigoMusica, codigoCliente, valorAvaliacao) VALUES (1, 8, 2);
INSERT INTO tb_avaliacao(codigoMusica, codigoCliente, valorAvaliacao) VALUES (7, 9, 1);

select * from tb_musicaGenero;

SELECT tb_musica.nomeMusica, tb_musica.codigoMusica, tb_genero.nomeGenero, tb_genero.codigoGenero FROM tb_musicaGenero
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica;

SELECT tb_genero.nomeGenero, tb_avaliacao.valorAvaliacao FROM tb_pessoaGenero
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
LEFT JOIN tb_avaliacao ON tb_avaliacao.codigoCliente = tb_pessoaGenero.codigoPessoa;

SELECT tb_musica.nomeMusica, tb_genero.nomeGenero, tb_pessoa.loginPessoa,
tb_avaliacao.valorAvaliacao FROM tb_avaliacao
INNER JOIN tb_musicaGenero ON tb_musicaGenero.codigoMusica = tb_avaliacao.codigoMusica
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente 
WHERE tb_pessoa.loginPessoa = 'rebeca';

select * from tb_avaliacao;


select * from tb_pessoaGenero;

select * from tb_pessoa;

select * from tb_musicaGenero;

select * from tb_pessoaGenero;

select tb_pessoa.nomePessoa, tb_genero.nomeGenero from tb_pessoaGenero
Inner join tb_pessoa on tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa
Inner join tb_genero on tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero where tb_pessoa.loginPessoa = 'jorgelpiva';


