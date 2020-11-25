
package Model;

import classes.Genero;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaCrudGenero extends AbstractTableModel {
    private List<Genero> genero = new ArrayList();

    @Override
    public int getRowCount() {
        return genero.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Genero g = genero.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
        if(columnIndex == 0){
            return g.getNomeGenero();
        }else{
            return "";
        }
    }
    
    public void adicionar(Genero g){
        genero.add(g);
        fireTableRowsInserted(genero.size() -1, genero.size() -1);
    }
    
    public void remover (Genero g){
        genero.remove(g);
        fireTableRowsInserted(genero.size() -1, genero.size() -1);
    }
    
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "Gêneros Cadastrados";
        }else{
            return "";
        }
    }
    
    public Genero getGenero(int linha){
        return genero.get(linha);
        
    }
    
    
}
