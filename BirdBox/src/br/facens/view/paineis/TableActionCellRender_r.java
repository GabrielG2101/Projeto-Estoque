
package br.facens.view.paineis;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender_r extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);
        PainelAction_r action = new PainelAction_r();
        if (isSeleted == false && row % 2 == 0) {
            action.setBackground(com.getBackground());
        } else {
            action.setBackground(com.getBackground());
        }
        return action;
    }
}
