
package Model;

import classes.Genero;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaGenero extends AbstractTableModel {
    private List<Genero> generoPref = new ArrayList();

    @Override
    public int getRowCount() {
        return generoPref.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Genero g = generoPref.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
        if(columnIndex == 0){
            return g.getNomeGenero();
        }else if (columnIndex == 1){
            return (double)g.getClassificacao();
        }else{
            return "";
        }
    }
    
    public void adicionar(Genero g){
        generoPref.add(g);
        fireTableRowsInserted(generoPref.size() -1, generoPref.size() -1);
    }
    
    public void remover (Genero g){
        generoPref.remove(g);
        fireTableRowsInserted(generoPref.size() -1, generoPref.size() -1);
    }
    
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "Gêneros Escolhidos";
        }else if(column == 1){
            return "Ranking Gênero";
        }else{
            return "";
        }
    }
    
    public Genero getGenero(int linha){
        return generoPref.get(linha);
        
    }
    
    
}
