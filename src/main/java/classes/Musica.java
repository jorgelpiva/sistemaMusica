package classes;

public class Musica {
    private String nomeMusica;
    private String compositorMusica;
    private double avaliacaoMusica;

    public Musica(String nomeMusica, String compositorMusica, double avaliacaoMusica) {
        this.nomeMusica = nomeMusica;
        this.compositorMusica = compositorMusica;
        this.avaliacaoMusica = avaliacaoMusica;
    }

    public double getAvaliacaoMusica() {
        return avaliacaoMusica;
    }

    public void setAvaliacaoMusica(double avaliacaoMusica) {
        this.avaliacaoMusica = avaliacaoMusica;
    }

    public Musica(){
        
    }
    
    public Musica(String nomeMusica, String compositorMusica){
        this.nomeMusica = nomeMusica;
        this.compositorMusica = compositorMusica;
    }
    
    public String getNomeMusica(){
        return nomeMusica;
    }
    public String getCompositorMusica(){
        return compositorMusica;
    }

    @Override
    public String toString() {
        return nomeMusica;
    }
        
    
    public void inserirMusica(){
        
    }
    
    public void excluirMusica(){
        
    }
    
    public void atualizarMusica(){
        
    }
    
    public void consultarMusica(){
        
    }
}
