
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class CCellRenderer extends DefaultTableCellRenderer {

    private String tableName;
    
    public CCellRenderer(String tableName) {
        this.tableName = tableName;
    }
 
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
				                   boolean hasFocus, int row, int col) {
        
	super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        //выравнивание ячейки
        setHorizontalAlignment(col > 0 ? SwingConstants.CENTER : SwingConstants.LEFT);
        
        //цвет ячейки
        Color color = Color.WHITE;
        if (col > 0) {
            if (tableName.equals("jTable_1")) {
                color = new Color(240, 255, 255);
            }
            if (tableName.equals("jTable_2")) {
                color = new Color(240, 240, 255);
            }
            if (tableName.equals("jTable_3")) {
                if (col > 2) {
                    color = col % 2 == 0 ? new Color(255, 210, 210) : new Color(255, 255, 240);
                }
            }
        }
        setBackground(color);
        
        if (tableName.equals("jTable_3") && (col == 1 || col == 2)) {
            setText("X");
        }
        
	return this;
    }
}