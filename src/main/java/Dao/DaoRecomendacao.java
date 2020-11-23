package Dao;

import classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DaoRecomendacao{
    private static double contador = 0;
    private static double acumulador = 0;
    private static double posto = 0;
    
    
    
    public static List <DaoAvaliar> recomendacao (String login){
        //retornar uma lista de musicas não avaliadas pelo usuário mas avaliado por outros
        List<DaoAvaliar> listaRecomendacao = new ArrayList<>();  
                
        for(DaoAvaliar nav: DaoAvaliar.listarNaoAvaliado(login)){
            contador = 0;
            acumulador = 0;
            posto = 0;
            String nomeNaoAvaliado = nav.getNomeMusica();
            for(DaoAvaliar avd: DaoRecomendacao.recomendacoesDadasGenero(login)){
                String avaliado = avd.getNomeMusica();
                if(nomeNaoAvaliado.equals(avaliado)){
                    contador = contador + 1;
                    acumulador = acumulador + avd.getValorAvaliacao();
                }
            }
            if(contador == 0){
                posto = 0;
            }else{
                posto = acumulador / contador;
            }
            DaoAvaliar postoMusica = new DaoAvaliar(nav.getNomeMusica(),nav.getCompositorMusica(), posto);
            listaRecomendacao.add(postoMusica);
        }
        
        Collections.sort(listaRecomendacao);
        
        return listaRecomendacao;
    }
    
    public static List <DaoAvaliar> recomendacoesDadasGenero (String login){
        String nomeMusica, compositorMusica;
        int valorAvaliacao;
        List<DaoAvaliar> recomendacoesDadas = new ArrayList<>(); 
        String generoCliente = DaoConsultaMusica.listarGenero(login);
        
        String sql = "SELECT tb_musica.nomeMusica, tb_musica.compositorMusica, tb_avaliacao.valorAvaliacao \n" +
                     "FROM tb_avaliacao\n" +
                     "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica \n" +
                     "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente \n" +
                     "INNER JOIN tb_musicaGenero ON tb_musicaGenero.codigoMusica = tb_musica.codigoMusica \n" +
                     "INNER JOIN tb_genero ON tb_genero.codigoGenero = tb_musicaGenero.codigoGenero \n"+
                     "WHERE tb_genero.nomeGenero = " + generoCliente + ";";
        
        
                try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                nomeMusica = rs.getString("nomeMusica");
                compositorMusica = rs.getString("compositorMusica");
                valorAvaliacao = rs.getInt("valorAvaliacao");
                DaoAvaliar dav = new DaoAvaliar(nomeMusica, compositorMusica, valorAvaliacao);
                recomendacoesDadas.add(dav);
            }
            
            conexao.close();
            
            return recomendacoesDadas;   

        } catch (Exception e) {
            e.printStackTrace();            
        }  
        
        return recomendacoesDadas;    
    }
    
}
