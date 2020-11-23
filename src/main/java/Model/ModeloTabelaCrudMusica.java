
package Model;

import Dao.DaoAvaliar;
import classes.Musica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaCrudMusica extends AbstractTableModel {
    private List<Musica> musica = new ArrayList();

    @Override
    public int getRowCount() {
        return musica.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Musica m = musica.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
        if(columnIndex == 0){
            return m.getNomeMusica();
        }else if (columnIndex == 1){
            return m.getCompositorMusica();
        }else{
            return "";
        }
    }
    
    public void adicionar(Musica m){
        musica.add(m);
        fireTableRowsInserted(musica.size() -1, musica.size() -1);
    }
    
    public void remover (Musica m){
        musica.remove(m);
        fireTableRowsInserted(musica.size() -1, musica.size() -1);
    }
    
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "Nome da Música";
        }else if(column == 1){
            return "Compositor Música";
        }else{
            return "";
        }
    }
    
    public Musica getMusica(int linha){
        return musica.get(linha);
        
    }
    
    
}
