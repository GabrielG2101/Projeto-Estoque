package br.facens.view.paineis;

import br.facens.controller.RequisicaoController;
import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Requisicao;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DadosRequisicoes extends javax.swing.JPanel {

    public DadosRequisicoes() {
        initComponents();
        try {
            DefaultTableModel tableModel = (DefaultTableModel) TabelaRequisicoes.getModel();
            tableModel.setRowCount(0);
            RequisicaoController reqController = new RequisicaoController();
            ArrayList<Requisicao> reqs = reqController.findAll();
            reqs.forEach((Requisicao ent) -> {

                tableModel.addRow(new Object[]{ent.getId(), ent.getId_funcionario(), ent.getTexto_requisicao(), ent.getStatus()});
            });
            TabelaRequisicoes.setModel(tableModel);
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }

        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                PainelDados.removeAll();
                PainelDados.repaint();
                PainelDados.revalidate();
                CadastrarNovoMaterialRequisicao alterar = new CadastrarNovoMaterialRequisicao();
                alterar.setSize(760, 471);
                PainelDados.add(alterar);
                PainelDados.repaint();
                PainelDados.revalidate();
                row = TabelaRequisicoes.getSelectedRow();

                try {
                    DefaultTableModel tableModel = (DefaultTableModel) TabelaRequisicoes.getModel();
                    RequisicaoController reqController = new RequisicaoController();
                    int idInt = (int) tableModel.getValueAt(row, 0);
                    reqController.delete(idInt);
                    tableModel.removeRow(row);
                    
                } catch (NumberFormatException ex) {
                    System.out.println("ERROR: " + ex);
                } catch (DAOexception ex) {
                    System.out.println("ERROR: " + ex);
                } catch (SQLException ex) {
                    System.out.println("ERROR: " + ex);
                }
            }

            @Override
            public void onDelete(int row) {

                int resultado = JOptionPane.showConfirmDialog(null, "Deseja excluir a Requisicao?", "Excluir Requisicao", 0);
                if (resultado == JOptionPane.YES_OPTION) {
                    row = TabelaRequisicoes.getSelectedRow();

                    try {
                        DefaultTableModel tableModel = (DefaultTableModel) TabelaRequisicoes.getModel();
                        RequisicaoController reqController = new RequisicaoController();
                        int idInt = (int) tableModel.getValueAt(row, 0);
                        reqController.delete(idInt);
                        JOptionPane.showMessageDialog(null, "Requisicao Removida!");
                        tableModel.removeRow(row);
                        PainelDados.removeAll();
                        PainelDados.repaint();
                        PainelDados.revalidate();
                        AdmLogado tAdm = new AdmLogado();
                        tAdm.setSize(760, 471);
                        PainelDados.add(tAdm);
                        PainelDados.repaint();
                        PainelDados.revalidate();
                    } catch (NumberFormatException ex) {
                        System.out.println("ERROR: " + ex);
                    } catch (DAOexception ex) {
                        System.out.println("ERROR: " + ex);
                    } catch (SQLException ex) {
                        System.out.println("ERROR: " + ex);
                    }
                }

            }

            @Override
            public void onView(int row) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        TabelaRequisicoes.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender_r());
        TabelaRequisicoes.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor_r(event));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new raven.scroll.win11.ScrollPaneWin11();
        TabelaRequisicoes = new javax.swing.JTable();

        setBackground(new java.awt.Color(239, 239, 239));
        setLayout(null);

        PainelDados.setBackground(new java.awt.Color(239, 239, 239));
        PainelDados.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Dados das Requisições");
        PainelDados.add(jLabel1);
        jLabel1.setBounds(60, 50, 400, 40);
        PainelDados.add(jSeparator6);
        jSeparator6.setBounds(60, 310, 347, 0);

        BotaoVoltar.setBackground(new java.awt.Color(166, 150, 104));
        BotaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VOLTAR");

        javax.swing.GroupLayout BotaoVoltarLayout = new javax.swing.GroupLayout(BotaoVoltar);
        BotaoVoltar.setLayout(BotaoVoltarLayout);
        BotaoVoltarLayout.setHorizontalGroup(
            BotaoVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoVoltarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        BotaoVoltarLayout.setVerticalGroup(
            BotaoVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoVoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelDados.add(BotaoVoltar);
        BotaoVoltar.setBounds(6, 10, 54, 26);

        TabelaRequisicoes.setBackground(new java.awt.Color(239, 239, 239));
        TabelaRequisicoes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TabelaRequisicoes.setForeground(new java.awt.Color(0, 0, 0));
        TabelaRequisicoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Id Funcionario", "Requisição", "Status", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaRequisicoes.setFocusable(false);
        TabelaRequisicoes.setGridColor(new java.awt.Color(255, 255, 255));
        TabelaRequisicoes.setRowHeight(40);
        TabelaRequisicoes.setSelectionBackground(new java.awt.Color(166, 150, 104));
        TabelaRequisicoes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TabelaRequisicoes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaRequisicoes);

        PainelDados.add(jScrollPane1);
        jScrollPane1.setBounds(6, 131, 690, 290);

        add(PainelDados);
        PainelDados.setBounds(6, 6, 850, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelDados.removeAll();
        PainelDados.repaint();
        PainelDados.revalidate();
        AdmLogado tAdm = new AdmLogado();
        tAdm.setSize(760, 471);
        PainelDados.add(tAdm);
        PainelDados.repaint();
        PainelDados.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(217, 200, 169));
    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(166, 150, 104));
    }//GEN-LAST:event_BotaoVoltarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JTable TabelaRequisicoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
