package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Genero implements Comparable<Genero> {
    
    private double classificacao;
    private String nomeGenero;
    
    public Genero(){
        
    }
    
    public Genero(String nomeGenero, double classificacao){
        this.classificacao = classificacao;
        this.nomeGenero = nomeGenero;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    
    
    public Genero (String nomeGenero){
        this.nomeGenero = nomeGenero;
    }
    

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }
    
    public int compareTo(Genero t) {
        if(this.classificacao > t.getClassificacao()){
            return -1;
        }else if(this.classificacao < t.getClassificacao()){
            return 1;
        }
        return 0;
    }
}
