package Dao;

public class DaoGeneroPreferido implements Comparable<DaoGeneroPreferido> {
    
    private String nomeGenero;
    private double notaGenero;

    public DaoGeneroPreferido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeGenero() {
        return nomeGenero;
    }    
    
    public DaoGeneroPreferido(String nomeGenero, double notaGenero) {
        this.nomeGenero = nomeGenero;
        this.notaGenero = notaGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public double getNotaGenero() {
        return notaGenero;
    }

    public void setNotaGenero(double notaGenero) {
        this.notaGenero = notaGenero;
    }



    @Override
    public String toString() {
        return "nomeGenero=" + nomeGenero + ", notaGenero=" + notaGenero+"\n";
    }
    

    @Override
    public int compareTo(DaoGeneroPreferido t) {
        if(this.notaGenero > t.getNotaGenero()){
            return -1;
        }else if(this.notaGenero < t.getNotaGenero()){
            return 1;
        }
        return 0;
    }
    
}
