package Dao;

import classes.ConnectionFactory;
import classes.Musica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class DaoAvaliar {
    
    private String nomeMusica;
    private String compositorMusica;
    private int valorAvaliacao;
    
    public DaoAvaliar(){
        
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getCompositorMusica() {
        return compositorMusica;
    }

    public void setCompositorMusica(String compositorMusica) {
        this.compositorMusica = compositorMusica;
    }

    public int getValorAvaliacao() {
        return valorAvaliacao;
    }

    public void setValorAvaliacao(int valorAvaliacao) {
        this.valorAvaliacao = valorAvaliacao;
    }
    
    public DaoAvaliar(String nomeMusica, String compositorMusica, int valorAvaliacao){
        this.nomeMusica = nomeMusica;
        this.compositorMusica = compositorMusica;
        this.valorAvaliacao = valorAvaliacao;    
    }
    
    public static void enviarAvaliacao(String musica, String login, int avaliacao){
        int codigoMusica = 0, codigoPessoa = 0;
        String sqlMusica = "SELECT tb_musica.codigoMusica FROM tb_musica WHERE tb_musica.nomeMusica = ? ;";
        String sqlPessoa = "SELECT tb_pessoa.codigoPessoa FROM tb_pessoa WHERE tb_pessoa.loginPessoa = ? ;";
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            
            PreparedStatement psm = conexao.prepareStatement(sqlMusica);
            psm.setString(1, musica);
            ResultSet rsm = psm.executeQuery();
            if (rsm.next()){
                codigoMusica = rsm.getInt("codigoMusica");
            }
            
            
            PreparedStatement psp = conexao.prepareStatement(sqlPessoa);
            psp.setString(1, login);
            ResultSet rsp = psp.executeQuery();
            if (rsp.next()){
                codigoPessoa = rsp.getInt("codigoPessoa");
            }
            
            String sqlInserirAv = "INSERT INTO tb_avaliacao(codigoMusica, codigoCliente, valorAvaliacao) VALUES (?, ?, ?);";
                PreparedStatement psi = conexao.prepareStatement(sqlInserirAv);
                psi.setInt(1, codigoMusica);
                psi.setInt(2, codigoPessoa);
                psi.setInt(3, avaliacao);
                
                psi.execute();
            
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();            
        }       
    }
    
    public List<DaoAvaliar> listarNaoAvaliado(String login){
        List<DaoAvaliar> paraAvaliar = new ArrayList<>();
        String generoCliente = DaoConsultaMusica.listarGenero(login);
        int cont = 0;
        
                 
            for(Musica mc: DaoConsultaMusica.listMusicaCliente(generoCliente)){
                cont = 0;
                
                for(String st: DaoConsultaMusica.listarAvaliacoes(login)){
                    if(st.equals(mc.getNomeMusica().toString())){
                        cont += 1;
                    }
                }
                if(cont == 0){
                    DaoAvaliar dav = new DaoAvaliar(mc.getNomeMusica(),mc.getCompositorMusica(), 0);
                    paraAvaliar.add(dav);
                }
            }
        return paraAvaliar;
    }    
    
}
