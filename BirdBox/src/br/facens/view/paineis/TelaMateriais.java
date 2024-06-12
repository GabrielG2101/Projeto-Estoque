package br.facens.view.paineis;

import br.facens.controller.MateriaisController;
import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Materiais;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;

public class TelaMateriais extends javax.swing.JPanel {

    public TelaMateriais() {
       initComponents();
       adicionarEspacamentoTexto();
       try {
            DefaultTableModel tableModel = (DefaultTableModel) TabelaMateriais.getModel();
            tableModel.setRowCount(0);
            MateriaisController materiaisController = new MateriaisController();
            ArrayList<Materiais> materiais = materiaisController.findAll();
            materiais.forEach((Materiais mat) -> {

                tableModel.addRow(new Object[]{mat.getCodigo(), mat.getNome(), mat.getDescricao(), mat.getValor(), mat.getQuantidade()});
            });
            TabelaMateriais.setModel(tableModel);
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        }

    }
    private void adicionarEspacamentoTexto() {
        if (CampoPesquisar.getText().equals("Digite o nome do material")) {
            CampoPesquisar.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoPesquisar.setForeground(Color.gray);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        CampoPesquisar = new javax.swing.JTextField();
        BotaoBuscar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        tabelaDeDados = new raven.scroll.win11.ScrollPaneWin11();
        TabelaMateriais = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));

        Titulo.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(41, 41, 41));
        Titulo.setText("Materiais");

        CampoPesquisar.setBackground(new java.awt.Color(223, 223, 223));
        CampoPesquisar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoPesquisar.setForeground(new java.awt.Color(41, 41, 41));
        CampoPesquisar.setText("Digite o nome do material");
        CampoPesquisar.setToolTipText("");
        CampoPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CampoPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoPesquisarMousePressed(evt);
            }
        });

        BotaoBuscar.setBackground(new java.awt.Color(166, 150, 104));
        BotaoBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoBuscarMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("BUSCAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoBuscarLayout = new javax.swing.GroupLayout(BotaoBuscar);
        BotaoBuscar.setLayout(BotaoBuscarLayout);
        BotaoBuscarLayout.setHorizontalGroup(
            BotaoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoBuscarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BotaoEntrartxt)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        BotaoBuscarLayout.setVerticalGroup(
            BotaoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TabelaMateriais.setBackground(new java.awt.Color(239, 239, 239));
        TabelaMateriais.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TabelaMateriais.setForeground(new java.awt.Color(0, 0, 0));
        TabelaMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Descrição", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaMateriais.setFocusable(false);
        TabelaMateriais.setGridColor(new java.awt.Color(255, 255, 255));
        TabelaMateriais.setRowHeight(40);
        TabelaMateriais.setSelectionBackground(new java.awt.Color(166, 150, 104));
        TabelaMateriais.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TabelaMateriais.getTableHeader().setReorderingAllowed(false);
        tabelaDeDados.setViewportView(TabelaMateriais);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tabelaDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(tabelaDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CampoPesquisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoPesquisarMousePressed
        if (CampoPesquisar.getText().equals("Digite o nome do material")) {
            CampoPesquisar.setText("");
            CampoPesquisar.setForeground(Color.black);
        }

    }//GEN-LAST:event_CampoPesquisarMousePressed

    private void BotaoBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoBuscarMouseEntered
        BotaoBuscar.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoBuscarMouseEntered

    private void BotaoBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoBuscarMouseExited
        BotaoBuscar.setBackground(new Color(166,150,104));
    }//GEN-LAST:event_BotaoBuscarMouseExited

    private void BotaoBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoBuscarMouseClicked
        String pesquisar = CampoPesquisar.getText();
       try{
        DefaultTableModel tableModel = (DefaultTableModel) TabelaMateriais.getModel();
            tableModel.setRowCount(0);
            MateriaisController materiaisController = new MateriaisController();
            ArrayList<Materiais> materiais = materiaisController.consultaMaterial(pesquisar);
            materiais.forEach((Materiais mat) -> {

                tableModel.addRow(new Object[]{mat.getCodigo(), mat.getNome(), mat.getDescricao(), mat.getValor(), mat.getQuantidade()});
            });
            TabelaMateriais.setModel(tableModel);
        } catch (SQLException | DAOexception ex) {
            System.out.println("ERROR: " + ex);

        } catch (NumberFormatException ex) {
            System.out.println("ERROR: " + ex);
        
        }
    }//GEN-LAST:event_BotaoBuscarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoBuscar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JTable TabelaMateriais;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane tabelaDeDados;
    // End of variables declaration//GEN-END:variables
}
