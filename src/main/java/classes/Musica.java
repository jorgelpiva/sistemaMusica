package classes;

public class Musica {
    private String nomeMusica;
    private String compositorMusica;

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
