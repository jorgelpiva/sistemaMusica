
package classes;


public class Avaliar  implements Comparable<Avaliar>{
    private String nomeMusica;
    private String nomeCliente;
    private double valorAvaliacao;
    private String compositorMusica;

    public String getCompositorMusica() {
        return compositorMusica;
    }

    public void setCompositorMusica(String compositorMusica) {
        this.compositorMusica = compositorMusica;
    }
    
    public Avaliar(String nomeMusica, String compositorMusica, double valorAvaliacao){
        this.nomeMusica = nomeMusica;
        this.compositorMusica = compositorMusica;
        this.valorAvaliacao = valorAvaliacao;    
    }
    
    public Avaliar(String nomeMusica, double valorAvaliacao, String nomeCliente){
        this.nomeMusica = nomeMusica;
        this.nomeCliente = nomeCliente;
        this.valorAvaliacao = valorAvaliacao;    
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public double getValorAvaliacao() {
        return valorAvaliacao;
    }

    @Override
    public int compareTo(Avaliar t) {
        if(this.valorAvaliacao > t.getValorAvaliacao()){
            return -1;
        }else if(this.valorAvaliacao < t.getValorAvaliacao()){
            return 1;
        }
        return 0;
    }
}
