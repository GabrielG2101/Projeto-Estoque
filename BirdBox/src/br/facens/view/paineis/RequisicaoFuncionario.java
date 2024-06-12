package br.facens.view.paineis;

import br.facens.controller.RequisicaoController;
import br.facens.model.dao.exception.DAOexception;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class RequisicaoFuncionario extends javax.swing.JPanel {

    public RequisicaoFuncionario(int id) {
        initComponents();
        adicionarEspacamentoTexto();
        CampoIdFuncionario.setText(String.valueOf(id));
    }

    private void adicionarEspacamentoTexto() {
        if (CampoIdFuncionario.getText().equals("Ex: 100000")) {
            CampoIdFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoIdFuncionario.setForeground(Color.gray);
        }
        if (CampoNomeFuncionario1.getText().equals("Ex: Ricardo Monteiro")) {
            CampoNomeFuncionario1.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoNomeFuncionario1.setForeground(Color.gray);
        }
         if (CampoRequisicao.getText().equals("Ex: Parafusos para a mecânica")) {
            CampoRequisicao.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoRequisicao.setForeground(Color.gray);
        }

    }

    public void LimparTela(int id_funcionario) {
        CampoIdFuncionario.setText(Integer.toString(id_funcionario));
        CampoNomeFuncionario1.setText(null);
        CampoRequisicao.setText(null);
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
        usuario5 = new javax.swing.JLabel();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoIdFuncionario = new javax.swing.JTextField();
        CampoRequisicao = new javax.swing.JTextField();
        CampoNomeFuncionario1 = new javax.swing.JTextField();

        PainelCadastrar.setBackground(new java.awt.Color(239, 239, 239));
        PainelCadastrar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Requisição");
        PainelCadastrar.add(jLabel1);
        jLabel1.setBounds(60, 20, 380, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelCadastrar.add(jSeparator1);
        jSeparator1.setBounds(62, 60, 337, 10);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_func.png"))); // NOI18N
        PainelCadastrar.add(logoprincipal);
        logoprincipal.setBounds(520, 30, 190, 180);

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome do Funcionário:");
        PainelCadastrar.add(usuario2);
        usuario2.setBounds(60, 130, 350, 17);

        usuario3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(0, 0, 0));
        usuario3.setText("Solicite o Material:");
        PainelCadastrar.add(usuario3);
        usuario3.setBounds(60, 190, 350, 17);
        PainelCadastrar.add(jSeparator6);
        jSeparator6.setBounds(62, 310, 347, 0);

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Id do Funcionário:");
        PainelCadastrar.add(usuario5);
        usuario5.setBounds(60, 70, 350, 17);

        BotaoCadastrar.setBackground(new java.awt.Color(166, 150, 104));
        BotaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoCadastrarMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("CADASTRAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoCadastrarLayout = new javax.swing.GroupLayout(BotaoCadastrar);
        BotaoCadastrar.setLayout(BotaoCadastrarLayout);
        BotaoCadastrarLayout.setHorizontalGroup(
            BotaoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoCadastrarLayout.setVerticalGroup(
            BotaoCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoCadastrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelCadastrar.add(BotaoCadastrar);
        BotaoCadastrar.setBounds(60, 390, 180, 50);

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
        BotaoVoltar.setBounds(6, 10, 49, 25);

        CampoIdFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoIdFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoIdFuncionario.setForeground(new java.awt.Color(154, 154, 154));
        CampoIdFuncionario.setText("Ex: 100000");
        CampoIdFuncionario.setToolTipText("");
        CampoIdFuncionario.setBorder(null);
        CampoIdFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoIdFuncionario.setFocusable(false);
        CampoIdFuncionario.setName("email"); // NOI18N
        CampoIdFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoIdFuncionarioMousePressed(evt);
            }
        });
        CampoIdFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdFuncionarioActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoIdFuncionario);
        CampoIdFuncionario.setBounds(60, 90, 340, 30);

        CampoRequisicao.setBackground(new java.awt.Color(223, 223, 223));
        CampoRequisicao.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoRequisicao.setForeground(new java.awt.Color(154, 154, 154));
        CampoRequisicao.setText("Ex: Parafusos para a mecânica");
        CampoRequisicao.setToolTipText("");
        CampoRequisicao.setBorder(null);
        CampoRequisicao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoRequisicao.setName("email"); // NOI18N
        CampoRequisicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoRequisicaoMousePressed(evt);
            }
        });
        CampoRequisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoRequisicaoActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoRequisicao);
        CampoRequisicao.setBounds(60, 210, 340, 150);

        CampoNomeFuncionario1.setBackground(new java.awt.Color(223, 223, 223));
        CampoNomeFuncionario1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNomeFuncionario1.setForeground(new java.awt.Color(154, 154, 154));
        CampoNomeFuncionario1.setText("Ex: Ricardo Monteiro");
        CampoNomeFuncionario1.setToolTipText("");
        CampoNomeFuncionario1.setBorder(null);
        CampoNomeFuncionario1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoNomeFuncionario1.setName("email"); // NOI18N
        CampoNomeFuncionario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNomeFuncionario1MousePressed(evt);
            }
        });
        CampoNomeFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeFuncionario1ActionPerformed(evt);
            }
        });
        PainelCadastrar.add(CampoNomeFuncionario1);
        CampoNomeFuncionario1.setBounds(60, 150, 340, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked
        int id_funcionario = Integer.parseInt(CampoIdFuncionario.getText());
        String texto = CampoRequisicao.getText();

        try {
            RequisicaoController reqController = new RequisicaoController();
            reqController.insert(id_funcionario, texto);
            JOptionPane.showMessageDialog(null, "Feito");
            LimparTela(id_funcionario);
        } catch (DAOexception | SQLException ex) {
            System.out.println("Erro criacao statement: " + ex);
            System.exit(0);
        }

    }//GEN-LAST:event_BotaoCadastrarMouseClicked

    private void BotaoCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseEntered
        BotaoCadastrar.setBackground(new Color(217, 200, 169));
    }//GEN-LAST:event_BotaoCadastrarMouseEntered

    private void BotaoCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseExited
        BotaoCadastrar.setBackground(new Color(166, 150, 104));
    }//GEN-LAST:event_BotaoCadastrarMouseExited

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
        TelaFunc func = new TelaFunc();
        func.setSize(760, 471);
        PainelCadastrar.add(func);
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void CampoIdFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIdFuncionarioMousePressed
        adicionarEspacamentoTexto();
        if (CampoIdFuncionario.getText().equals("Ex: 100000")) {
            CampoIdFuncionario.setText("");
            CampoIdFuncionario.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoIdFuncionarioMousePressed

    private void CampoIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdFuncionarioActionPerformed

    private void CampoRequisicaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoRequisicaoMousePressed
         adicionarEspacamentoTexto();
        if (CampoRequisicao.getText().equals("Ex: Parafusos para a mecânica")) {
            CampoRequisicao.setText("");
            CampoRequisicao.setForeground(Color.black);
        }     }//GEN-LAST:event_CampoRequisicaoMousePressed

    private void CampoRequisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoRequisicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoRequisicaoActionPerformed

    private void CampoNomeFuncionario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeFuncionario1MousePressed
 adicionarEspacamentoTexto();
        if (CampoNomeFuncionario1.getText().equals("Ex: Ricardo Monteiro")) {
            CampoNomeFuncionario1.setText("");
            CampoNomeFuncionario1.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoNomeFuncionario1MousePressed

    private void CampoNomeFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeFuncionario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeFuncionario1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoIdFuncionario;
    private javax.swing.JTextField CampoNomeFuncionario1;
    private javax.swing.JTextField CampoRequisicao;
    private javax.swing.JPanel PainelCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel logoprincipal;
    private javax.swing.JLabel usuario2;
    private javax.swing.JLabel usuario3;
    private javax.swing.JLabel usuario5;
    // End of variables declaration//GEN-END:variables
}
