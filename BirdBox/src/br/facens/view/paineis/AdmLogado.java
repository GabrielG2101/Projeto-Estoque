package br.facens.view.paineis;

import java.awt.Color;

public class AdmLogado extends javax.swing.JPanel {

    public AdmLogado() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelAdm = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtOp = new javax.swing.JLabel();
        BotaoFunc = new javax.swing.JPanel();
        BotaoEntrartxt1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFunc = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtRequisicoes = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BotaoRequisicoes = new javax.swing.JPanel();
        BotaoEntrartxt5 = new javax.swing.JLabel();
        BotaoMaterial = new javax.swing.JPanel();
        BotaoEntrartxt4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtMateriais = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 239, 239));
        setLayout(null);

        PainelAdm.setBackground(new java.awt.Color(239, 239, 239));

        Titulo.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Administrador");
        Titulo.setToolTipText("");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtOp.setBackground(new java.awt.Color(0, 0, 0));
        txtOp.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtOp.setForeground(new java.awt.Color(0, 0, 0));
        txtOp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtOp.setText("O que deseja?");

        BotaoFunc.setBackground(new java.awt.Color(217, 200, 169));
        BotaoFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoFuncMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoFuncMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoFuncMouseExited(evt);
            }
        });

        BotaoEntrartxt1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt1.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt1.setText("DADOS DOS FUNCIONÁRIOS");
        BotaoEntrartxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoFuncLayout = new javax.swing.GroupLayout(BotaoFunc);
        BotaoFunc.setLayout(BotaoFuncLayout);
        BotaoFuncLayout.setHorizontalGroup(
            BotaoFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoFuncLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoFuncLayout.setVerticalGroup(
            BotaoFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoFuncLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(166, 150, 104));

        txtFunc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFunc.setForeground(new java.awt.Color(255, 255, 255));
        txtFunc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        txtFunc.setText("Funcionários");
        txtFunc.setIconTextGap(20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(166, 150, 104));

        txtRequisicoes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtRequisicoes.setForeground(new java.awt.Color(255, 255, 255));
        txtRequisicoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRequisicoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/requisicoes.png"))); // NOI18N
        txtRequisicoes.setText("Requisições");
        txtRequisicoes.setIconTextGap(20);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRequisicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRequisicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BotaoRequisicoes.setBackground(new java.awt.Color(217, 200, 169));
        BotaoRequisicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoRequisicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoRequisicoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoRequisicoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoRequisicoesMouseExited(evt);
            }
        });

        BotaoEntrartxt5.setBackground(new java.awt.Color(217, 200, 169));
        BotaoEntrartxt5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt5.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt5.setText("DADOS DE REQUISIÇÕES");
        BotaoEntrartxt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoRequisicoesLayout = new javax.swing.GroupLayout(BotaoRequisicoes);
        BotaoRequisicoes.setLayout(BotaoRequisicoesLayout);
        BotaoRequisicoesLayout.setHorizontalGroup(
            BotaoRequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoRequisicoesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoRequisicoesLayout.setVerticalGroup(
            BotaoRequisicoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoEntrartxt5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        BotaoMaterial.setBackground(new java.awt.Color(217, 200, 169));
        BotaoMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotaoMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMaterialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoMaterialMouseExited(evt);
            }
        });

        BotaoEntrartxt4.setBackground(new java.awt.Color(217, 200, 169));
        BotaoEntrartxt4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        BotaoEntrartxt4.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEntrartxt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotaoEntrartxt4.setText("DADOS DE MATERIAIS");
        BotaoEntrartxt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotaoMaterialLayout = new javax.swing.GroupLayout(BotaoMaterial);
        BotaoMaterial.setLayout(BotaoMaterialLayout);
        BotaoMaterialLayout.setHorizontalGroup(
            BotaoMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoMaterialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BotaoMaterialLayout.setVerticalGroup(
            BotaoMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotaoMaterialLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotaoEntrartxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(166, 150, 104));

        txtMateriais.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMateriais.setForeground(new java.awt.Color(255, 255, 255));
        txtMateriais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/material.png"))); // NOI18N
        txtMateriais.setText("Materiais");
        txtMateriais.setIconTextGap(20);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMateriais, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMateriais, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelAdmLayout = new javax.swing.GroupLayout(PainelAdm);
        PainelAdm.setLayout(PainelAdmLayout);
        PainelAdmLayout.setHorizontalGroup(
            PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAdmLayout.createSequentialGroup()
                .addGroup(PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAdmLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelAdmLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelAdmLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelAdmLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoRequisicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtOp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        PainelAdmLayout.setVerticalGroup(
            PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAdmLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtOp)
                .addGap(8, 8, 8)
                .addGroup(PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelAdmLayout.createSequentialGroup()
                        .addGroup(PainelAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelAdmLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(BotaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelAdmLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotaoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoRequisicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        add(PainelAdm);
        PainelAdm.setBounds(0, 0, 740, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMaterialMouseExited
        BotaoMaterial.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoMaterialMouseExited

    private void BotaoMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMaterialMouseEntered
        BotaoMaterial.setBackground(new Color(166,150,104));
    }//GEN-LAST:event_BotaoMaterialMouseEntered

    private void BotaoMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMaterialMouseClicked
        PainelAdm.removeAll();
        PainelAdm.repaint();
        PainelAdm.revalidate();
        DadosMaterial dados = new DadosMaterial();
        dados.setSize(760, 471);
        PainelAdm.add(dados);
        PainelAdm.repaint();
        PainelAdm.revalidate();
    }//GEN-LAST:event_BotaoMaterialMouseClicked

    private void BotaoFuncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFuncMouseExited
        BotaoFunc.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoFuncMouseExited

    private void BotaoFuncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFuncMouseEntered
        BotaoFunc.setBackground(new Color(166,150,104));
    }//GEN-LAST:event_BotaoFuncMouseEntered

    private void BotaoFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoFuncMouseClicked
        PainelAdm.removeAll();
        PainelAdm.repaint();
        PainelAdm.revalidate();
        DadosFuncionarios dados = new DadosFuncionarios();
        dados.setSize(760, 471);
        PainelAdm.add(dados);
        PainelAdm.repaint();
        PainelAdm.revalidate();
    }//GEN-LAST:event_BotaoFuncMouseClicked

    private void BotaoRequisicoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRequisicoesMouseClicked
        PainelAdm.removeAll();
        PainelAdm.repaint();
        PainelAdm.revalidate();
        DadosRequisicoes dados = new DadosRequisicoes();
        dados.setSize(760, 471);
        PainelAdm.add(dados);
        PainelAdm.repaint();
        PainelAdm.revalidate();
    }//GEN-LAST:event_BotaoRequisicoesMouseClicked

    private void BotaoRequisicoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRequisicoesMouseEntered
        BotaoRequisicoes.setBackground(new Color(166,150,104));
    }//GEN-LAST:event_BotaoRequisicoesMouseEntered

    private void BotaoRequisicoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoRequisicoesMouseExited
        BotaoRequisicoes.setBackground(new Color(217,200,169));
    }//GEN-LAST:event_BotaoRequisicoesMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotaoEntrartxt1;
    private javax.swing.JLabel BotaoEntrartxt4;
    private javax.swing.JLabel BotaoEntrartxt5;
    private javax.swing.JPanel BotaoFunc;
    private javax.swing.JPanel BotaoMaterial;
    private javax.swing.JPanel BotaoRequisicoes;
    private javax.swing.JPanel PainelAdm;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtFunc;
    private javax.swing.JLabel txtMateriais;
    private javax.swing.JLabel txtOp;
    private javax.swing.JLabel txtRequisicoes;
    // End of variables declaration//GEN-END:variables
}
