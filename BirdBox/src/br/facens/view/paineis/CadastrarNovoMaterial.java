
package br.facens.view.paineis;

import br.facens.controller.MateriaisController;
import br.facens.model.dao.exception.DAOexception;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class CadastrarNovoMaterial extends javax.swing.JPanel {

    public CadastrarNovoMaterial() {
        initComponents();
        adicionarEspacamentoTexto();

    }

    private void adicionarEspacamentoTexto() {
        if (CampoCodMaterial.getText().equals("Ex: 100000")) {
            CampoCodMaterial.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoCodMaterial.setForeground(Color.gray);
        }
        if (CampoNomeMaterial.getText().equals("Ex: Chave de Fenda")) {
            CampoNomeMaterial.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoNomeMaterial.setForeground(Color.gray);
        }
        if (CampoDescMaterial.getText().equals("Ex: Chave tamanho 13")) {
            CampoDescMaterial.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoDescMaterial.setForeground(Color.gray);
        }
        if (CampoValorMaterial.getText().equals("Ex: 100.00")) {
            CampoValorMaterial.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoValorMaterial.setForeground(Color.gray);
        }
        if (CampoQtdMaterial.getText().equals("Ex: 50")) {
            CampoQtdMaterial.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoQtdMaterial.setForeground(Color.gray);
        }

    }

    public void LimparTela() {
        CampoCodMaterial.setText(null);
        CampoDescMaterial.setText(null);
        CampoNomeMaterial.setText(null);
        CampoQtdMaterial.setText(null);
        CampoValorMaterial.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelCadastrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoprincipal = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        usuario5 = new javax.swing.JLabel();
        usuario6 = new javax.swing.JLabel();
        BotaoCadastrarMaterial = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoQtdMaterial = new javax.swing.JTextField();
        CampoCodMaterial = new javax.swing.JTextField();
        CampoNomeMaterial = new javax.swing.JTextField();
        CampoDescMaterial = new javax.swing.JTextField();
        CampoValorMaterial = new javax.swing.JTextField();

        setLayout(null);

        PainelCadastrar.setBackground(new java.awt.Color(239, 239, 239));
        PainelCadastrar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Materiais");
        PainelCadastrar.add(jLabel1);
        jLabel1.setBounds(60, 20, 337, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelCadastrar.add(jSeparator1);
        jSeparator1.setBounds(62, 60, 337, 10);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_materiais.png"))); // NOI18N
        PainelCadastrar.add(logoprincipal);
        logoprincipal.setBounds(520, 80, 160, 150);

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome do Material:");
        PainelCadastrar.add(usuario2);
        usuario2.setBounds(60, 130, 350, 19);

        usuario3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(0, 0, 0));
        usuario3.setText("Digite a Descrição do Material:");
        PainelCadastrar.add(usuario3);
        usuario3.setBounds(60, 190, 350, 19);
        PainelCadastrar.add(jSeparator6);
        jSeparator6.setBounds(62, 310, 347, 0);

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite o Valor do Material:");
        PainelCadastrar.add(usuario4);
        usuario4.setBounds(60, 250, 360, 19);

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Código do Material:");
        PainelCadastrar.add(usuario5);
        usuario5.setBounds(60, 70, 350, 19);

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite a Quantidade Disponivel:");
        PainelCadastrar.add(usuario6);
        usuario6.setBounds(60, 310, 360, 19);

        BotaoCadastrarMaterial.setBackground(new java.awt.Color(166, 150, 104));
        BotaoCadastrarMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoCadastrarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMaterialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMaterialMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("CADASTRAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoCadastrarMaterialLayout = new javax.swing.GroupLayout(BotaoCadastrarMaterial);
        BotaoCadastrarMaterial.setLayout(BotaoCadastrarMaterialLayout);
        BotaoCadastrarMaterialLayout.setHorizontalGroup(
            BotaoCadastrarMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarMaterialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoCadastrarMaterialLayout.setVerticalGroup(
            BotaoCadastrarMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarMaterialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelCadastrar.add(BotaoCadastrarMaterial);
        BotaoCadastrarMaterial.setBounds(60, 390, 180, 50);

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

        PainelCadastrar.add(BotaoVoltar);
        BotaoVoltar.setBounds(6, 10, 54, 26);

        CampoQtdMaterial.setBackground(new java.awt.Color(223, 223, 223));
        CampoQtdMaterial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoQtdMaterial.setForeground(new java.awt.Color(154, 154, 154));
        CampoQtdMaterial.setText("Ex: 50");
        CampoQtdMaterial.setToolTipText("");
        CampoQtdMaterial.setBorder(null);
        CampoQtdMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoQtdMaterial.setName("email"); // NOI18N
        CampoQtdMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoQtdMaterialMousePressed(evt);
            }
        });
        CampoQtdMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoQtdMaterialActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoQtdMaterial);
        CampoQtdMaterial.setBounds(60, 330, 340, 30);

        CampoCodMaterial.setBackground(new java.awt.Color(223, 223, 223));
        CampoCodMaterial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCodMaterial.setForeground(new java.awt.Color(154, 154, 154));
        CampoCodMaterial.setText("Ex: 100000");
        CampoCodMaterial.setToolTipText("");
        CampoCodMaterial.setBorder(null);
        CampoCodMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoCodMaterial.setName("email"); // NOI18N
        CampoCodMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCodMaterialMousePressed(evt);
            }
        });
        CampoCodMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodMaterialActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoCodMaterial);
        CampoCodMaterial.setBounds(60, 90, 340, 30);

        CampoNomeMaterial.setBackground(new java.awt.Color(223, 223, 223));
        CampoNomeMaterial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNomeMaterial.setForeground(new java.awt.Color(154, 154, 154));
        CampoNomeMaterial.setText("Ex: Chave de Fenda");
        CampoNomeMaterial.setToolTipText("");
        CampoNomeMaterial.setBorder(null);
        CampoNomeMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoNomeMaterial.setName("email"); // NOI18N
        CampoNomeMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNomeMaterialMousePressed(evt);
            }
        });
        CampoNomeMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeMaterialActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoNomeMaterial);
        CampoNomeMaterial.setBounds(60, 150, 340, 30);

        CampoDescMaterial.setBackground(new java.awt.Color(223, 223, 223));
        CampoDescMaterial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoDescMaterial.setForeground(new java.awt.Color(154, 154, 154));
        CampoDescMaterial.setText("Ex: Chave tamanho 13");
        CampoDescMaterial.setToolTipText("");
        CampoDescMaterial.setBorder(null);
        CampoDescMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoDescMaterial.setName("email"); // NOI18N
        CampoDescMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoDescMaterialMousePressed(evt);
            }
        });
        CampoDescMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDescMaterialActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoDescMaterial);
        CampoDescMaterial.setBounds(60, 210, 340, 30);

        CampoValorMaterial.setBackground(new java.awt.Color(223, 223, 223));
        CampoValorMaterial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoValorMaterial.setForeground(new java.awt.Color(154, 154, 154));
        CampoValorMaterial.setText("Ex: 100.00");
        CampoValorMaterial.setToolTipText("");
        CampoValorMaterial.setBorder(null);
        CampoValorMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoValorMaterial.setName("email"); // NOI18N
        CampoValorMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoValorMaterialMousePressed(evt);
            }
        });
        CampoValorMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoValorMaterialActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoValorMaterial);
        CampoValorMaterial.setBounds(60, 270, 340, 30);

        add(PainelCadastrar);
        PainelCadastrar.setBounds(0, 0, 768, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMaterialMouseClicked
        try {
            int codigo = Integer.parseInt(CampoCodMaterial.getText());
            String nome = CampoNomeMaterial.getText();
            String descricao = CampoDescMaterial.getText();
            double valor = Double.parseDouble(CampoValorMaterial.getText());
            int quantidade = Integer.parseInt(CampoQtdMaterial.getText());
            if(!nome.equals("") && !nome.equals("Ex: Chave de Fenda") && 
               !descricao.equals("") && !descricao.equals("Ex: Chave tamanho 13")){
                MateriaisController materialController = new MateriaisController();
                materialController.insert(codigo, nome, descricao, valor, quantidade);
                LimparTela();
            } else  JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos corretamente","Erro",JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos corretamente","Erro",JOptionPane.ERROR_MESSAGE);
        } catch (DAOexception | SQLException ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        }

    }//GEN-LAST:event_BotaoCadastrarMaterialMouseClicked

    private void BotaoCadastrarMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMaterialMouseEntered
        BotaoCadastrarMaterial.setBackground(new Color(217, 200, 169));
    }//GEN-LAST:event_BotaoCadastrarMaterialMouseEntered

    private void BotaoCadastrarMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMaterialMouseExited
        BotaoCadastrarMaterial.setBackground(new Color(166, 150, 104));
    }//GEN-LAST:event_BotaoCadastrarMaterialMouseExited

    private void BotaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseExited
        BotaoVoltar.setBackground(new Color(166, 150, 104));
    }//GEN-LAST:event_BotaoVoltarMouseExited

    private void BotaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseEntered
        BotaoVoltar.setBackground(new Color(217, 200, 169));

    }//GEN-LAST:event_BotaoVoltarMouseEntered

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        PainelCadastrar.removeAll();
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
        DadosMaterial dados = new DadosMaterial();
        dados.setSize(760, 471);
        PainelCadastrar.add(dados);
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void CampoQtdMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoQtdMaterialMousePressed
        adicionarEspacamentoTexto();
        if (CampoQtdMaterial.getText().equals("Ex: 50")) {
            CampoQtdMaterial.setText("");
            CampoQtdMaterial.setForeground(Color.black);
        }
    }//GEN-LAST:event_CampoQtdMaterialMousePressed

    private void CampoQtdMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoQtdMaterialActionPerformed
        if (CampoNomeMaterial.getText().equals("Ex: Chave de Fenda")) {
            CampoNomeMaterial.setText("");
            CampoNomeMaterial.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoQtdMaterialActionPerformed

    private void CampoCodMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCodMaterialMousePressed
    if (CampoCodMaterial.getText().equals("Ex: 100000")) {
            CampoCodMaterial.setText("");
            CampoCodMaterial.setForeground(Color.black);
        }     }//GEN-LAST:event_CampoCodMaterialMousePressed

    private void CampoCodMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodMaterialActionPerformed

    private void CampoNomeMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeMaterialMousePressed
        if (CampoNomeMaterial.getText().equals("Ex: Chave de Fenda")) {
            CampoNomeMaterial.setText("");
            CampoNomeMaterial.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoNomeMaterialMousePressed

    private void CampoNomeMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeMaterialActionPerformed

    private void CampoDescMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDescMaterialMousePressed
        if (CampoDescMaterial.getText().equals("Ex: Chave tamanho 13")) {
            CampoDescMaterial.setText("");
            CampoDescMaterial.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoDescMaterialMousePressed

    private void CampoDescMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDescMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDescMaterialActionPerformed

    private void CampoValorMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoValorMaterialMousePressed
        if (CampoValorMaterial.getText().equals("Ex: 100.00")) {
            CampoValorMaterial.setText("");
            CampoValorMaterial.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoValorMaterialMousePressed

    private void CampoValorMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoValorMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoValorMaterialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrarMaterial;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoCodMaterial;
    private javax.swing.JTextField CampoDescMaterial;
    private javax.swing.JTextField CampoNomeMaterial;
    private javax.swing.JTextField CampoQtdMaterial;
    private javax.swing.JTextField CampoValorMaterial;
    private javax.swing.JPanel PainelCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    private javax.swing.JLabel usuario4;
    private javax.swing.JLabel usuario5;
    private javax.swing.JLabel usuario6;
    // End of variables declaration//GEN-END:variables
}
