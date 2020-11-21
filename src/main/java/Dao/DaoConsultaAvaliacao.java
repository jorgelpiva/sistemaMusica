package Dao;

import classes.Avaliar;
import classes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoConsultaAvaliacao {
    
    public static void excluirAvaliacao(String login, String musica){
        
        int codigoPessoa = 0, codigoMusica = 0;
        String sqlS = "SELECT tb_pessoa.codigoPessoa, tb_musica.codigoMusica \n" +
                      "FROM tb_avaliacao \n" +
                      "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente \n" +
                      "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica \n" +
                      "WHERE tb_pessoa.loginPessoa = ? AND tb_musica.nomeMusica = ?;";
        
        String sqlD = "DELETE FROM tb_avaliacao WHERE codigoCliente = ? AND codigoMusica = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement psS = conexao.prepareStatement(sqlS);
            psS.setString(1, login);
            psS.setString(2, musica);
            ResultSet rsS = psS.executeQuery();
            
            if (rsS.next()){
                codigoPessoa = rsS.getInt("codigoPessoa");
                codigoMusica = rsS.getInt("codigoMusica");
            }
            
            
            PreparedStatement psD = conexao.prepareStatement(sqlD);
            psD.setInt(1, codigoPessoa);
            psD.setInt(2, codigoMusica);
            psD.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    }    
        
    
    public static List<DaoAvaliar> avaliacoesConcedidas (String login) {
        List <DaoAvaliar> avaliado = new ArrayList<>();
        int valorAvaliacao;
        String nomeMusica, compositorMusica;
        String sql =  "SELECT tb_musica.nomeMusica, tb_musica.compositorMusica, tb_avaliacao.valorAvaliacao "+
                      "FROM tb_avaliacao \n" +
                      "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente \n" +
                      "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica \n" +
                      "WHERE tb_pessoa.loginPessoa = ?"+";";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
                    
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                nomeMusica = rs.getString("nomeMusica");
                compositorMusica = rs.getString("compositorMusica");
                valorAvaliacao = rs.getInt("valorAvaliacao");
                DaoAvaliar av = new DaoAvaliar(nomeMusica, compositorMusica, valorAvaliacao);
                avaliado.add(av);
            }
        
            conexao.close();
            
            return avaliado;

        } catch (Exception e) {
            e.printStackTrace();            
        }       
        return null;
    }    
    
    public static void alterarAvaliacao(String login, String musica, int avaliacao){
        int codigoPessoa = 0, codigoMusica = 0;
        String sqlS = "SELECT tb_pessoa.codigoPessoa, tb_musica.codigoMusica \n" +
                      "FROM tb_avaliacao \n" +
                      "INNER JOIN tb_pessoa ON tb_pessoa.codigoPessoa = tb_avaliacao.codigoCliente \n" +
                      "INNER JOIN tb_musica ON tb_musica.codigoMusica = tb_avaliacao.codigoMusica \n" +
                      "WHERE tb_pessoa.loginPessoa = ? AND tb_musica.nomeMusica = ?;";
        
        String sqlU = "UPDATE tb_avaliacao SET valorAvaliacao = ? WHERE codigoCliente = ? AND codigoMusica = ?;";
        
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement psS = conexao.prepareStatement(sqlS);
            psS.setString(1, login);
            psS.setString(2, musica);
            ResultSet rsS = psS.executeQuery();
            
            if (rsS.next()){
                codigoPessoa = rsS.getInt("codigoPessoa");
                codigoMusica = rsS.getInt("codigoMusica");
            }
            
            PreparedStatement psU = conexao.prepareStatement(sqlU);
            psU.setInt(1, avaliacao);
            psU.setInt(2, codigoPessoa);
            psU.setInt(3, codigoMusica);
            psU.execute();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    }    
    
}
