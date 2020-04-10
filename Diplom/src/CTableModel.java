
import javax.swing.table.DefaultTableModel;


public class CTableModel extends DefaultTableModel {

    private String tableName;
    
    public CTableModel(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        
        boolean ret = true;
        
        if (tableName.equals("jTable_1") && col == 0)
            ret = false;
        
        if (tableName.equals("jTable_2") && col == 0)
            ret = false;
        
        if (tableName.equals("jTable_3") && (col == 0 || col == 1 || col == 2))
            ret = false;
        
        return ret;
    }
}

