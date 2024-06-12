package br.facens.view.paineis;

import br.facens.controller.FuncionariosController;
import br.facens.model.dao.exception.DAOexception;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class CadastrarNovoFuncionario extends javax.swing.JPanel {

    public CadastrarNovoFuncionario() {
        initComponents();
        adicionarEspacamentoTexto();

    }

    private void adicionarEspacamentoTexto() {
        if (CampoIdFuncionario.getText().equals("Ex: 100000")) {
            CampoIdFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoIdFuncionario.setForeground(Color.gray);
        }
        if (CampoNomeFuncionario.getText().equals("Ex: Ricardo Monteiro")) {
            CampoNomeFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoNomeFuncionario.setForeground(Color.gray);
        }
        if (CampoEmailFuncionario.getText().equals("Ex: Ricardo@gmail.com")) {
            CampoEmailFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoEmailFuncionario.setForeground(Color.gray);
        }
        if (CampoNascimentoFuncionario.getText().equals("  /  /    ")) {
            CampoNascimentoFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoNascimentoFuncionario.setForeground(Color.gray);
        }
        if (CampoCargoFuncionario.getText().equals("Ex: Mecânico")) {
            CampoCargoFuncionario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoCargoFuncionario.setForeground(Color.gray);
        }

    }

    public void LimparTela() {
        CampoIdFuncionario.setText(null);
        CampoNomeFuncionario.setText(null);
        CampoEmailFuncionario.setText(null);
        CampoNascimentoFuncionario.setText(null);
        CampoCargoFuncionario.setText(null);
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
        BotaoCadastrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoCargoFuncionario = new javax.swing.JTextField();
        CampoIdFuncionario = new javax.swing.JTextField();
        CampoNomeFuncionario = new javax.swing.JTextField();
        CampoEmailFuncionario = new javax.swing.JTextField();
        CampoNascimentoFuncionario = new javax.swing.JFormattedTextField();

        PainelCadastrar.setBackground(new java.awt.Color(239, 239, 239));
        PainelCadastrar.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastrar Funcionários");
        PainelCadastrar.add(jLabel1);
        jLabel1.setBounds(60, 20, 380, 40);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PainelCadastrar.add(jSeparator1);
        jSeparator1.setBounds(62, 60, 337, 10);

        logoprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/img_func.png"))); // NOI18N
        PainelCadastrar.add(logoprincipal);
        logoprincipal.setBounds(490, 80, 190, 180);

        usuario2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario2.setForeground(new java.awt.Color(0, 0, 0));
        usuario2.setText("Digite o Nome do Funcionário:");
        PainelCadastrar.add(usuario2);
        usuario2.setBounds(60, 130, 350, 19);

        usuario3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario3.setForeground(new java.awt.Color(0, 0, 0));
        usuario3.setText("Digite o Email do Funcionário:");
        PainelCadastrar.add(usuario3);
        usuario3.setBounds(60, 190, 350, 19);
        PainelCadastrar.add(jSeparator6);
        jSeparator6.setBounds(62, 310, 347, 0);

        usuario4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario4.setForeground(new java.awt.Color(0, 0, 0));
        usuario4.setText("Digite a Data de Nascimento do Funcionário:");
        PainelCadastrar.add(usuario4);
        usuario4.setBounds(60, 250, 360, 19);

        usuario5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario5.setForeground(new java.awt.Color(0, 0, 0));
        usuario5.setText("Digite o Id do Funcionário:");
        PainelCadastrar.add(usuario5);
        usuario5.setBounds(60, 70, 350, 19);

        usuario6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario6.setForeground(new java.awt.Color(0, 0, 0));
        usuario6.setText("Digite o Cargo do Funcionário:");
        PainelCadastrar.add(usuario6);
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
        BotaoVoltar.setBounds(6, 10, 54, 26);

        CampoCargoFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoCargoFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoCargoFuncionario.setForeground(new java.awt.Color(154, 154, 154));
        CampoCargoFuncionario.setText("Ex: Mecânico");
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
        PainelCadastrar.add(CampoCargoFuncionario);
        CampoCargoFuncionario.setBounds(60, 330, 340, 30);

        CampoIdFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoIdFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoIdFuncionario.setForeground(new java.awt.Color(154, 154, 154));
        CampoIdFuncionario.setText("Ex: 100000");
        CampoIdFuncionario.setToolTipText("");
        CampoIdFuncionario.setBorder(null);
        CampoIdFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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

        CampoNomeFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoNomeFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoNomeFuncionario.setForeground(new java.awt.Color(154, 154, 154));
        CampoNomeFuncionario.setText("Ex: Ricardo Monteiro");
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
        PainelCadastrar.add(CampoNomeFuncionario);
        CampoNomeFuncionario.setBounds(60, 150, 340, 30);

        CampoEmailFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoEmailFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoEmailFuncionario.setForeground(new java.awt.Color(154, 154, 154));
        CampoEmailFuncionario.setText("Ex: Ricardo@gmail.com");
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
        PainelCadastrar.add(CampoEmailFuncionario);
        CampoEmailFuncionario.setBounds(60, 210, 340, 30);

        CampoNascimentoFuncionario.setBackground(new java.awt.Color(223, 223, 223));
        CampoNascimentoFuncionario.setBorder(null);
        CampoNascimentoFuncionario.setForeground(new java.awt.Color(154, 154, 154));
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
        PainelCadastrar.add(CampoNascimentoFuncionario);
        CampoNascimentoFuncionario.setBounds(60, 270, 340, 30);

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
        try {
            int id = Integer.parseInt(CampoIdFuncionario.getText());
            String nome = CampoNomeFuncionario.getText();
            String email = CampoEmailFuncionario.getText();
            String dataNascimento = CampoNascimentoFuncionario.getText();
            String cargo = CampoCargoFuncionario.getText();
            if(!nome.equals("") && !nome.equals("Ex: Ricardo Monteiro") 
               && !email.equals("") && !email.equals("Ex: Ricardo@gmail.com")
               && !dataNascimento.equals("") && !dataNascimento.equals("  /  /    ")
               && !cargo.equals("") && !cargo.equals("Ex: Mecânico")) {
               FuncionariosController funcController = new FuncionariosController();
               funcController.insert(id, nome, email, dataNascimento, cargo);
               
               LimparTela();   
            } else {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos","Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos","Erro",JOptionPane.ERROR_MESSAGE);
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
        DadosFuncionarios dados = new DadosFuncionarios();
        dados.setSize(760, 471);
        PainelCadastrar.add(dados);
        PainelCadastrar.repaint();
        PainelCadastrar.revalidate();
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
