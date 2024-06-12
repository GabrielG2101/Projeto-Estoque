
package br.facens.view.paineis;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import br.facens.view.paineis.PainelAction;

public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);
        PainelAction action = new PainelAction();
        if (isSeleted == false && row % 2 == 0) {
            action.setBackground(com.getBackground());
        } else {
            action.setBackground(com.getBackground());
        }
        return action;
    }
}
