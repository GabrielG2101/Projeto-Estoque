package br.facens.view.paineis;

import br.facens.controller.ADMController;
import br.facens.model.dao.exception.DAOexception;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.BorderFactory;

public class TelaAdm extends javax.swing.JPanel {

    public TelaAdm() {
        initComponents();
        adicionarEspacamentoTexto();
        adicionarEspacamentoSenha();
    }

    private void adicionarEspacamentoTexto() {
        if (CampoUsuario.getText().equals("Digite seu Email")) {
            CampoUsuario.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoUsuario.setForeground(Color.gray);
        }
    }

    private void adicionarEspacamentoSenha() {
        if (String.valueOf(CampoSenha.getPassword()).equals("********")) {
            CampoSenha.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 5));
            CampoSenha.setForeground(Color.gray);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelLoginAdm = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        logodireita = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        CampoSenha = new javax.swing.JPasswordField();
        BotaoEntrar = new javax.swing.JPanel();
        BotaoEntrartxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 239, 239));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(754, 471));
        setPreferredSize(new java.awt.Dimension(754, 471));

        PainelLoginAdm.setBackground(new java.awt.Color(239, 239, 239));
        PainelLoginAdm.setForeground(new java.awt.Color(255, 255, 255));
        PainelLoginAdm.setPreferredSize(new java.awt.Dimension(754, 471));

        bg.setBackground(new java.awt.Color(239, 239, 239));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(754, 471));
        bg.setPreferredSize(new java.awt.Dimension(754, 471));

        logodireita.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logodireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admImg.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(41, 41, 41));
        titulo.setText("ADMINISTRADOR");

        usuario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(41, 41, 41));
        usuario.setText("Usuário:");

        CampoUsuario.setBackground(new java.awt.Color(223, 223, 223));
        CampoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(154, 154, 154));
        CampoUsuario.setText("Digite seu Email");
        CampoUsuario.setToolTipText("");
        CampoUsuario.setBorder(null);
        CampoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoUsuario.setName("email"); // NOI18N
        CampoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoUsuarioMousePressed(evt);
            }
        });
        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(41, 41, 41));
        senha.setText("Senha:");

        CampoSenha.setBackground(new java.awt.Color(223, 223, 223));
        CampoSenha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CampoSenha.setForeground(new java.awt.Color(154, 154, 154));
        CampoSenha.setText("********");
        CampoSenha.setToolTipText("");
        CampoSenha.setBorder(null);
        CampoSenha.setName("senha"); // NOI18N
        CampoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoSenhaMousePressed(evt);
            }
        });

        BotaoEntrar.setBackground(new java.awt.Color(166, 150, 104));
        BotaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoEntrarMouseExited(evt);
            }
        });

        BotaoEntrartxt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt.setText("ENTRAR");
        BotaoEntrartxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoEntrarLayout = new javax.swing.GroupLayout(BotaoEntrar);
        BotaoEntrar.setLayout(BotaoEntrarLayout);
        BotaoEntrarLayout.setHorizontalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );
        BotaoEntrarLayout.setVerticalGroup(
            BotaoEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(318, 318, 318))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(309, 309, 309))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoUsuario)
                            .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(logodireita, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(51, 51, 51)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(CampoSenha))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addGap(43, 43, 43))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(CampoUsuario)
                                .addGap(100, 100, 100))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(143, 143, 143)))
                        .addGap(58, 58, 58)
                        .addComponent(BotaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(logodireita, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout PainelLoginAdmLayout = new javax.swing.GroupLayout(PainelLoginAdm);
        PainelLoginAdm.setLayout(PainelLoginAdmLayout);
        PainelLoginAdmLayout.setHorizontalGroup(
            PainelLoginAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLoginAdmLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelLoginAdmLayout.setVerticalGroup(
            PainelLoginAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLoginAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelLoginAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseExited
        BotaoEntrar.setBackground(new Color(166, 150, 104));
    }//GEN-LAST:event_BotaoEntrarMouseExited

    private void BotaoEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseEntered
        BotaoEntrar.setBackground(new Color(217, 200, 169));
    }//GEN-LAST:event_BotaoEntrarMouseEntered

    private void BotaoEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEntrarMouseClicked

        String email = CampoUsuario.getText();
        String senha = CampoSenha.getText();
        try {
            ADMController login = new ADMController();
            if (login.verificalogin(email, senha) == true) {
                PainelLoginAdm.removeAll();
                PainelLoginAdm.repaint();
                PainelLoginAdm.revalidate();
                AdmLogado log = new AdmLogado();
                log.setSize(760, 471);
                PainelLoginAdm.add(log);
                PainelLoginAdm.repaint();
                PainelLoginAdm.revalidate();
        }
        else{JOptionPane.showMessageDialog(null, "Email ou Senha errada","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    catch(SQLException | DAOexception ex){
            System.out.println("Erro criacao statement: " + ex);
        System.exit(0);
    }   
    }//GEN-LAST:event_BotaoEntrarMouseClicked

    private void CampoSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoSenhaMousePressed
       adicionarEspacamentoSenha();
        if (String.valueOf(CampoSenha.getPassword()).equals("********")) {
            CampoSenha.setText("");
            CampoSenha.setForeground(Color.black);
        }
        if (CampoUsuario.getText().isEmpty()) {
            CampoUsuario.setText("Digite seu Email");
            CampoUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CampoSenhaMousePressed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
          adicionarEspacamentoTexto();
        if (CampoUsuario.getText().equals("Digite seu Email")) {
            CampoUsuario.setText("");
            CampoUsuario.setForeground(Color.black);
        }
        if (String.valueOf(CampoSenha.getPassword()).isEmpty()) {
            CampoSenha.setText("********");
            CampoSenha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CampoUsuarioMousePressed

    public JPasswordField getCampoSenha() {
        return CampoSenha;
    }

    public void setCampoSenha(JPasswordField CampoSenha) {
        this.CampoSenha = CampoSenha;
    }

    public JTextField getCampoUsuario() {
        return CampoUsuario;
    }

    public void setCampoUsuario(JTextField CampoUsuario) {
        this.CampoUsuario = CampoUsuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoEntrar;
    private javax.swing.JLabel BotaoEntrartxt;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel PainelLoginAdm;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel logodireita;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}
