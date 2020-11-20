package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Genero {
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    private String nomeGenero;
    
    public Genero (String nomeGenero){
        this.nomeGenero = nomeGenero;
    }
    

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }
    
    public Genero(){
        
    }
        public List<Genero> preencherCmbBox() {
        List<Genero> generos = new ArrayList<>();
        //1 Definir o comando SQL
        String sql = "SELECT nomeGenero FROM tb_genero";
        //2.Abrir conexão
        try (Connection conexao = new ConnectionFactory().obterConexao()) {
            //3.Pré compilar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. Executar
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String genero = rs.getString("nomeGenero");
                Genero g = new Genero(genero);
                generos.add(g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return generos;
    }
    
    public void inserirGenero(){
        
    }
    
    public void excluirGenero(){
        
    }
    
    public void atualizarGenero(){
        
    }
    
    public void consultarGenero(){
        
    }
}
