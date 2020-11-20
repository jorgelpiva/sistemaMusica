
package Model;

import Dao.DaoAvaliar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaAvaliacao extends AbstractTableModel {
    private List<DaoAvaliar> avaliar = new ArrayList();

    @Override
    public int getRowCount() {
        return avaliar.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DaoAvaliar av = avaliar.get(rowIndex); //To change body of generated methods, choose Tools | Templates.
        if(columnIndex == 0){
            return av.getNomeMusica();
        }else if (columnIndex == 1){
            return av.getCompositorMusica();
        }else if (columnIndex == 2){
            return av.getValorAvaliacao();
        }else{
            return "";
        }
    }
    
    public void adicionar(DaoAvaliar av){
        avaliar.add(av);
        fireTableRowsInserted(avaliar.size() -1, avaliar.size() -1);
    }
    
    public void remover (DaoAvaliar av){
        avaliar.remove(av);
        fireTableRowsInserted(avaliar.size() -1, avaliar.size() -1);
    }
    
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "Nome da Música";
        }else if(column == 1){
            return "Compositor Música";
        }else if (column == 2){
            return "Avaliação da Música";
        }else{
            return "";
        }
    }
    
    public DaoAvaliar getAvaliar(int linha){
        return avaliar.get(linha);
        
    }
    
    
}
