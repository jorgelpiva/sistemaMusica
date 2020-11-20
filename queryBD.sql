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
    codigoMusica INT,
    codigoCliente INT,
    valorAvaliacao INT,
    FOREIGN KEY (codigoMusica) REFERENCES tb_musica(codigoMusica),
    FOREIGN KEY (codigoCliente) REFERENCES tb_pessoa(codigoPessoa),
    PRIMARY KEY (codigoMusica, codigoCliente)
);

CREATE TABLE tb_pessoaGenero(
    codigoGenero INT,
    codigoPessoa INT,
    FOREIGN KEY (codigoGenero) REFERENCES tb_musica(codigoMusica),
    FOREIGN KEY (codigoPessoa) REFERENCES tb_pessoa(codigoPessoa),
    PRIMARY KEY (codigoGenero, codigoPessoa)
);

CREATE TABLE tb_musicaGenero(
    codigoMusica INT,
    codigoGenero INT,
    FOREIGN KEY (codigoMusica) REFERENCES tb_musica(codigoMusica),
    FOREIGN KEY (codigoGenero) REFERENCES tb_genero(codigoGenero),
    PRIMARY KEY (codigoMusica, codigoGenero)
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