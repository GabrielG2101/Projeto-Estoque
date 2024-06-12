package br.facens.view.paineis;

import br.facens.controller.FuncionariosController;
import br.facens.model.dao.exception.DAOexception;
import br.facens.model.entity.Funcionarios;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class AlterarDadosFuncionario extends javax.swing.JPanel {

    public AlterarDadosFuncionario(Funcionarios funcionario) {
        initComponents();
        adicionarEspacamentoTexto();
        CampoIdFuncionario.setText("" + funcionario.getId());
        CampoNomeFuncionario.setText(funcionario.getNome());
        CampoEmailFuncionario.setText(funcionario.getEmail());
        CampoNascimentoFuncionario.setText(funcionario.getDatanascimento());
        CampoCargoFuncionario.setText(funcionario.getCargo());

    }

    private void adicionarEspacamentoTexto() {
        if (CampoIdFuncionario.getText().equals("")) {
            CampoIdFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoIdFuncionario.setForeground(Color.gray);
        }
        if (CampoNomeFuncionario.getText().equals("")) {
            CampoNomeFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoNomeFuncionario.setForeground(Color.black);
        }
        if (CampoEmailFuncionario.getText().equals("")) {
            CampoEmailFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoEmailFuncionario.setForeground(Color.black);
        }
        if (CampoNascimentoFuncionario.getText().equals("  /  /    ")) {
            CampoNascimentoFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoNascimentoFuncionario.setForeground(Color.black);
        }
        if (CampoCargoFuncionario.getText().equals("")) {
            CampoCargoFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoCargoFuncionario.setForeground(Color.black);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logoprincipal = new javax.swing.JLabel();
        usuario2 = new javax.swing.JLabel();
        usuario3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        usuario4 = new javax.swing.JLabel();
        usuario5 = new javax.swing.JLabel();
        usuario6 = new javax.swing.JLabel();
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoCargoFuncionario = new javax.swing.JTextField();
        CampoIdFuncionario = new javax.swing.JTextField();
        CampoNomeFuncionario = new javax.swing.JTextField();
        CampoEmailFuncionario = new javax.swing.JTextField();
        CampoNascimentoFuncionario = new javax.swing.JFormattedTextField();

        setLayout(null);

        PainelDados.setBackground(new java.awt.Color(239, 239, 239));
        PainelDados.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Alterar Dados Funcionários");
        PainelDados.add(jLabel1);
        jLabel1.setBounds(60, 20, 440, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelDados.add(jSeparator1);
        jSeparator1.setBounds(62, 60, 337, 10);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_func.png"))); // NOI18N
        PainelDados.add(logoprincipal);
        logoprincipal.setBounds(500, 50, 220, 160);

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome do Funcionário:");
        PainelDados.add(usuario2);
        usuario2.setBounds(60, 130, 350, 19);

        usuario3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(0, 0, 0));
        usuario3.setText("Digite o Email do Funcionário:");
        PainelDados.add(usuario3);
        usuario3.setBounds(60, 190, 350, 19);
        PainelDados.add(jSeparator6);
        jSeparator6.setBounds(62, 310, 347, 0);

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite a Data de Nascimento do Funcionário:");
        PainelDados.add(usuario4);
        usuario4.setBounds(60, 250, 360, 19);

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Id do Funcionário:");
        PainelDados.add(usuario5);
        usuario5.setBounds(60, 70, 350, 19);

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite o Cargo do  Funcionário:");
        PainelDados.add(usuario6);
        usuario6.setBounds(60, 310, 360, 19);

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
        BotaoEntrartxt.setText("ALTERAR");
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

        PainelDados.add(BotaoCadastrar);
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

        PainelDados.add(BotaoVoltar);
        BotaoVoltar.setBounds(6, 10, 54, 26);

        CampoCargoFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoCargoFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCargoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        CampoCargoFuncionario.setToolTipText("");
        CampoCargoFuncionario.setBorder(null);
        CampoCargoFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoCargoFuncionario.setName("email"); // NOI18N
        CampoCargoFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCargoFuncionarioMousePressed(evt);
            }
        });
        CampoCargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCargoFuncionarioActionPerformed(evt);
            }
        });
        PainelDados.add(CampoCargoFuncionario);
        CampoCargoFuncionario.setBounds(60, 330, 340, 30);

        CampoIdFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoIdFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoIdFuncionario.setForeground(new java.awt.Color(154, 154, 154));
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
        PainelDados.add(CampoIdFuncionario);
        CampoIdFuncionario.setBounds(60, 90, 340, 30);

        CampoNomeFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoNomeFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNomeFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        CampoNomeFuncionario.setToolTipText("");
        CampoNomeFuncionario.setBorder(null);
        CampoNomeFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoNomeFuncionario.setName("email"); // NOI18N
        CampoNomeFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNomeFuncionarioMousePressed(evt);
            }
        });
        CampoNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeFuncionarioActionPerformed(evt);
            }
        });
        PainelDados.add(CampoNomeFuncionario);
        CampoNomeFuncionario.setBounds(60, 150, 340, 30);

        CampoEmailFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoEmailFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoEmailFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        CampoEmailFuncionario.setToolTipText("");
        CampoEmailFuncionario.setBorder(null);
        CampoEmailFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoEmailFuncionario.setName("email"); // NOI18N
        CampoEmailFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoEmailFuncionarioMousePressed(evt);
            }
        });
        CampoEmailFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailFuncionarioActionPerformed(evt);
            }
        });
        PainelDados.add(CampoEmailFuncionario);
        CampoEmailFuncionario.setBounds(60, 210, 340, 30);

        CampoNascimentoFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoNascimentoFuncionario.setBorder(null);
        CampoNascimentoFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        try {
            CampoNascimentoFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoNascimentoFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNascimentoFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNascimentoFuncionarioMousePressed(evt);
            }
        });
        PainelDados.add(CampoNascimentoFuncionario);
        CampoNascimentoFuncionario.setBounds(60, 270, 340, 30);

        add(PainelDados);
        PainelDados.setBounds(0, 0, 800, 472);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCadastrarMouseClicked

        try {
            int id = Integer.parseInt(CampoIdFuncionario.getText());
            String nome = CampoNomeFuncionario.getText();
            String email = CampoEmailFuncionario.getText();
            String dataNascimento = CampoNascimentoFuncionario.getText();
            String cargo = CampoCargoFuncionario.getText();
            if (!nome.equals("")
                    && !email.equals("")
                    && !dataNascimento.equals("")
                    && !cargo.equals("")) {
                FuncionariosController funcController = new FuncionariosController();
                funcController.update(nome, email, dataNascimento, cargo, id);
                JOptionPane.showMessageDialog(null, "Alterado");
                PainelDados.removeAll();
                PainelDados.repaint();
                PainelDados.revalidate();
                DadosFuncionarios tDf = new DadosFuncionarios();
                tDf.setSize(760, 471);
                PainelDados.add(tDf);
                PainelDados.repaint();
                PainelDados.revalidate();
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos Corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
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
        PainelDados.removeAll();
        PainelDados.repaint();
        PainelDados.revalidate();
        DadosFuncionarios dados = new DadosFuncionarios();
        dados.setSize(760, 471);
        PainelDados.add(dados);
        PainelDados.repaint();
        PainelDados.revalidate();
    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void CampoCargoFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCargoFuncionarioMousePressed
        adicionarEspacamentoTexto();
        if (CampoCargoFuncionario.getText().equals("Ex: Mecânico")) {
            CampoCargoFuncionario.setText("");
            CampoCargoFuncionario.setForeground(Color.black);
        }

    }//GEN-LAST:event_CampoCargoFuncionarioMousePressed

    private void CampoCargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCargoFuncionarioActionPerformed

    private void CampoIdFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoIdFuncionarioMousePressed
        adicionarEspacamentoTexto();
        if (CampoIdFuncionario.getText().equals("Ex: 100000")) {
            CampoIdFuncionario.setText("");
            CampoIdFuncionario.setForeground(Color.black);
        }    }//GEN-LAST:event_CampoIdFuncionarioMousePressed

    private void CampoIdFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdFuncionarioActionPerformed

    private void CampoNomeFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeFuncionarioMousePressed
        adicionarEspacamentoTexto();
        if (CampoNomeFuncionario.getText().equals("Ex: Ricardo Monteiro")) {
            CampoNomeFuncionario.setText("");
            CampoNomeFuncionario.setForeground(Color.black);
        }     }//GEN-LAST:event_CampoNomeFuncionarioMousePressed

    private void CampoNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeFuncionarioActionPerformed

    private void CampoEmailFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoEmailFuncionarioMousePressed
        adicionarEspacamentoTexto();
        if (CampoEmailFuncionario.getText().equals("Ex: Ricardo@gmail.com")) {
            CampoEmailFuncionario.setText("");
            CampoEmailFuncionario.setForeground(Color.black);
        }      }//GEN-LAST:event_CampoEmailFuncionarioMousePressed

    private void CampoEmailFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailFuncionarioActionPerformed

    private void CampoNascimentoFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNascimentoFuncionarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNascimentoFuncionarioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoCadastrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPanel BotaoVoltar;
    private javax.swing.JTextField CampoCargoFuncionario;
    private javax.swing.JTextField CampoEmailFuncionario;
    private javax.swing.JTextField CampoIdFuncionario;
    private javax.swing.JFormattedTextField CampoNascimentoFuncionario;
    private javax.swing.JTextField CampoNomeFuncionario;
    private javax.swing.JPanel PainelDados;
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
