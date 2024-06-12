package br.facens.view.paineis;

//import br.unimontes.ccet.dcc.pg1.controller.SecretariaController;
//import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOexception;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BotaoAdm = new javax.swing.JPanel();
        txtAdm = new javax.swing.JLabel();
        BotaoFuncionario = new javax.swing.JPanel();
        txtFuncionario = new javax.swing.JLabel();
        BotaoMateriais = new javax.swing.JPanel();
        txtMateriais = new javax.swing.JLabel();
        Versão = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        slogan = new javax.swing.JLabel();
        topo = new javax.swing.JPanel();
        msgbemvindo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        botaoFechar = new javax.swing.JPanel();
        txtFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(239, 239, 239));

        menu.setBackground(new java.awt.Color(166, 150, 104));
        menu.setForeground(new java.awt.Color(239, 239, 239));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        Logo.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Logo.setForeground(new java.awt.Color(41, 41, 41));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(239, 239, 239));
        jSeparator1.setForeground(new java.awt.Color(239, 239, 239));

        BotaoAdm.setBackground(new java.awt.Color(166, 150, 104));
        BotaoAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoAdmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAdmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAdmMouseExited(evt);
            }
        });

        txtAdm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAdm.setForeground(new java.awt.Color(239, 239, 239));
        txtAdm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/admin.png"))); // NOI18N
        txtAdm.setText("Administrador");
        txtAdm.setIconTextGap(20);

        javax.swing.GroupLayout BotaoAdmLayout = new javax.swing.GroupLayout(BotaoAdm);
        BotaoAdm.setLayout(BotaoAdmLayout);
        BotaoAdmLayout.setHorizontalGroup(
            BotaoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAdmLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoAdmLayout.setVerticalGroup(
            BotaoAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAdm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoFuncionario.setBackground(new java.awt.Color(166, 150, 104));
        BotaoFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoFuncionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoFuncionarioMouseExited(evt);
            }
        });

        txtFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFuncionario.setForeground(new java.awt.Color(239, 239, 239));
        txtFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        txtFuncionario.setText("Funcionário");
        txtFuncionario.setIconTextGap(20);

        javax.swing.GroupLayout BotaoFuncionarioLayout = new javax.swing.GroupLayout(BotaoFuncionario);
        BotaoFuncionario.setLayout(BotaoFuncionarioLayout);
        BotaoFuncionarioLayout.setHorizontalGroup(
            BotaoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoFuncionarioLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoFuncionarioLayout.setVerticalGroup(
            BotaoFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoMateriais.setBackground(new java.awt.Color(166, 150, 104));
        BotaoMateriais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMateriaisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoMateriaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoMateriaisMouseExited(evt);
            }
        });

        txtMateriais.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMateriais.setForeground(new java.awt.Color(239, 239, 239));
        txtMateriais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/material.png"))); // NOI18N
        txtMateriais.setText("Materiais");
        txtMateriais.setIconTextGap(20);

        javax.swing.GroupLayout BotaoMateriaisLayout = new javax.swing.GroupLayout(BotaoMateriais);
        BotaoMateriais.setLayout(BotaoMateriaisLayout);
        BotaoMateriaisLayout.setHorizontalGroup(
            BotaoMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoMateriaisLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtMateriais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BotaoMateriaisLayout.setVerticalGroup(
            BotaoMateriaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotaoMateriaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMateriais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Versão.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        Versão.setForeground(new java.awt.Color(239, 239, 239));
        Versão.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Versão.setText("v 1.0");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoMateriais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(Versão, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoMateriais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Versão)
                .addContainerGap())
        );

        header.setBackground(new java.awt.Color(217, 200, 169));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        nome.setFont(new java.awt.Font("Roboto Medium", 2, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(41, 41, 41));
        nome.setText("AutoPeças");

        slogan.setFont(new java.awt.Font("Roboto Light", 2, 18)); // NOI18N
        slogan.setForeground(new java.awt.Color(41, 41, 41));
        slogan.setText("\"Sua melhor solução em gerenciamento de materiais!\"");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        topo.setBackground(new java.awt.Color(239, 239, 239));

        msgbemvindo.setBackground(new java.awt.Color(41, 41, 41));
        msgbemvindo.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        msgbemvindo.setForeground(new java.awt.Color(41, 41, 41));
        msgbemvindo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgbemvindo.setText("Seja Bem-Vindo !");

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topoLayout = new javax.swing.GroupLayout(topo);
        topo.setLayout(topoLayout);
        topoLayout.setHorizontalGroup(
            topoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(msgbemvindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(topoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topoLayout.setVerticalGroup(
            topoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(msgbemvindo)
                .addGap(19, 19, 19))
        );

        content.setBackground(new java.awt.Color(239, 239, 239));
        content.setMinimumSize(new java.awt.Dimension(775, 478));
        content.setPreferredSize(new java.awt.Dimension(775, 478));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        botaoFechar.setBackground(new java.awt.Color(239, 239, 239));
        botaoFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoFecharMouseExited(evt);
            }
        });

        txtFechar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtFechar.setForeground(new java.awt.Color(41, 41, 41));
        txtFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFechar.setText("X");

        javax.swing.GroupLayout botaoFecharLayout = new javax.swing.GroupLayout(botaoFechar);
        botaoFechar.setLayout(botaoFecharLayout);
        botaoFecharLayout.setHorizontalGroup(
            botaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botaoFecharLayout.setVerticalGroup(
            botaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botaoFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtFechar))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAdmMouseEntered
        BotaoAdm.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoAdmMouseEntered

    private void BotaoAdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAdmMouseExited
        BotaoAdm.setBackground(new Color(166,150,104));
    }//GEN-LAST:event_BotaoAdmMouseExited

    private void BotaoFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFuncionarioMouseEntered
        BotaoFuncionario.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoFuncionarioMouseEntered

    private void BotaoFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFuncionarioMouseExited
        BotaoFuncionario.setBackground(new Color(166,150,104));
    }//GEN-LAST:event_BotaoFuncionarioMouseExited

    private void BotaoMateriaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMateriaisMouseEntered
        BotaoMateriais.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoMateriaisMouseEntered

    private void BotaoMateriaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMateriaisMouseExited
        BotaoMateriais.setBackground(new Color(166,150,104));

    }//GEN-LAST:event_BotaoMateriaisMouseExited

    private void BotaoAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAdmMouseClicked
        TelaAdm tAdm = new TelaAdm();
        tAdm.setSize(760, 471);
        tAdm.setLocation(0, 0);
        content.removeAll();
        content.add(tAdm, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_BotaoAdmMouseClicked

    private void BotaoFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFuncionarioMouseClicked
        TelaFunc tFunc = new TelaFunc();
        tFunc.setSize(760, 471);
        tFunc.setLocation(0, 0);
        content.removeAll();
        content.add(tFunc, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BotaoFuncionarioMouseClicked

    private void BotaoMateriaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMateriaisMouseClicked
        TelaMateriais materia = new TelaMateriais();
        materia.setSize(760, 471);
        materia.setLocation(0, 0);
        content.removeAll();
        content.add(materia, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_BotaoMateriaisMouseClicked

    private void botaoFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseEntered
        botaoFechar.setBackground(Color.red);
        txtFechar.setForeground(new Color(239,239,239));
    }//GEN-LAST:event_botaoFecharMouseEntered

    private void botaoFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseExited
        botaoFechar.setBackground(new Color(239,239,239));
        txtFechar.setForeground(new Color(30,30,30));    
    }//GEN-LAST:event_botaoFecharMouseExited

    private void botaoFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botaoFecharMouseClicked

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotaoAdm;
    private javax.swing.JPanel BotaoFuncionario;
    private javax.swing.JPanel BotaoMateriais;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Versão;
    private javax.swing.JPanel background;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel msgbemvindo;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel slogan;
    private javax.swing.JPanel topo;
    private javax.swing.JLabel txtAdm;
    private javax.swing.JLabel txtFechar;
    private javax.swing.JLabel txtFuncionario;
    private javax.swing.JLabel txtMateriais;
    // End of variables declaration//GEN-END:variables
}
