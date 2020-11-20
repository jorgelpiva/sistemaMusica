SELECT DISTINCT tb_musica.nomeMusica, tb_pessoa.loginPessoa, tb_avaliacao.valorAvaliacao FROM tb_avaliacao
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente
INNER JOIN tb_musicaGenero ON tb_musicaGenero.codigoMusica = tb_musica.codigoMusica
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero
WHERE tb_pessoa.loginPessoa = 'jorgelpiva' AND tb_genero.nomeGenero = 'blues' 
OR tb_genero.nomeGenero = 'Grunge'
;

select * from tb_pessoa;

/*ESTE CODIGO LISTA OS GENEROS DE UMA DETERMINADA PESSOA*/
SELECT tb_genero.nomeGenero FROM tb_pessoaGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
WHERE tb_pessoa.loginPessoa = 'carmemir';
/*DESENVOLVER INSTRUCAO PARA LISTAR EM UM ARRAY E MONTAR UMA STRING COM ELE

/*ESTA CONSULTA BUSCA TODAS AS MUSICAS POR GENERO SUBSTITUIR OS FILTROS POR UMA STRING*/
SELECT DISTINCT tb_musica.nomeMusica, tb_musica.compositorMusica FROM tb_musicaGenero
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_musicaGenero.codigoMusica
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero
WHERE tb_genero.nomeGenero = 'Hard rock' OR tb_genero.nomeGenero = 'heavy metal';
/*COLOCAR A INSTRUCAO ANTERIOR DENTRO DO WHERE*/

/*ESTA INSTRUCAO TRAS TODAS AS AVALIACOES DE DETERMINADO CLIENTE*/
SELECT tb_musica.nomeMusica FROM tb_avaliacao
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica
WHERE tb_pessoa.loginPessoa = 'jorgelpiva';

SELECT tb_pessoa.codigoPessoa, tb_genero.codigoGenero FROM tb_pessoaGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
WHERE tb_pessoa.loginPessoa = 'jorgelpiva' and tb_genero.nomeGenero = 'Hard Rock'
;


/*CONSULTAR SE O GENERO ESTÁ CADASTRADO*/
SELECT tb_genero.nomeGenero FROM tb_pessoaGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
WHERE tb_pessoa.loginPessoa = 'carmemir' AND tb_genero.nomeGenero = 'Grunge';

SELECT tb_genero.nomeGenero FROM tb_pessoaGenero
INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero
INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa 
WHERE tb_pessoa.loginPessoa = 'jorgelpiva';


SELECT tb_musica.nomeMusica, tb_avaliacao.valorAvaliacao FROM tb_avaliacao
INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica;

SELECT codigoPessoa FROM tb_pessoa WHERE loginPessoa = 'jorgelpiva';

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
WHERE tb_pessoa.loginPessoa = 'mbanzato' or tb_pessoa.loginPessoa = 'jorgelpiva';

select tb_pessoa.nomePessoa, tb_genero.nomeGenero from tb_pessoaGenero
Inner join tb_pessoa on tb_pessoa.codigoPessoa = tb_pessoaGenero.codigoPessoa
Inner join tb_genero on tb_genero.codigoGenero = tb_pessoaGenero.codigoGenero where tb_pessoa.loginPessoa = 'jorgelpiva';
