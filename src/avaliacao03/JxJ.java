package avaliacao03;

import javax.swing.JOptionPane;

public class JxJ extends javax.swing.JFrame {

    public JxJ() {
        initComponents();
        t.xTrue();
        w.setV("V", 0);
        w.setV("V", 1);
        w.setV("V", 2);
        w.setV("V", 3);
        w.setV("V", 4);
        w.setV("V", 5);
        w.setV("V", 6);
        w.setV("V", 7);
        w.setV("V", 8);
    }

    XO t = new XO();
    Vitoria w = new Vitoria();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        X = new javax.swing.JButton();
        O = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton1InputMethodTextChanged(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(O, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 32, Short.MAX_VALUE)
                                .addComponent(Voltar)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Voltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton1InputMethodTextChanged

    }//GEN-LAST:event_jButton1InputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!"X".equals(jButton1.getText())) {
            if (!"O".equals(jButton1.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton1.setText("X");
                    w.setV("X", 0);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton1.setText("O");
                    w.setV("O", 0);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!"X".equals(jButton2.getText())) {
            if (!"O".equals(jButton2.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton2.setText("X");
                    w.setV("X", 1);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton2.setText("O");
                    w.setV("O", 1);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!"X".equals(jButton3.getText())) {
            if (!"O".equals(jButton3.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton3.setText("X");
                    w.setV("X", 2);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton3.setText("O");
                    w.setV("O", 2);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!"X".equals(jButton4.getText())) {
            if (!"O".equals(jButton4.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton4.setText("X");
                    w.setV("X", 3);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton4.setText("O");
                    w.setV("O", 3);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!"X".equals(jButton5.getText())) {
            if (!"O".equals(jButton5.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton5.setText("X");
                    w.setV("X", 4);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton5.setText("O");
                    w.setV("O", 4);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!"X".equals(jButton6.getText())) {
            if (!"O".equals(jButton6.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton6.setText("X");
                    w.setV("X", 5);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton6.setText("O");
                    w.setV("O", 5);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!"X".equals(jButton7.getText())) {
            if (!"O".equals(jButton7.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton7.setText("X");
                    w.setV("X", 6);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton7.setText("O");
                    w.setV("O", 6);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!"X".equals(jButton8.getText())) {
            if (!"O".equals(jButton8.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton8.setText("X");
                    w.setV("X", 7);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton8.setText("O");
                    w.setV("O", 7);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!"X".equals(jButton9.getText())) {
            if (!"O".equals(jButton9.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton9.setText("X");
                    w.setV("X", 8);
                    t.oTrue();
                } else if (t.isO() == true && t.isX() == false) {
                    jButton9.setText("O");
                    w.setV("O", 8);
                    t.xTrue();
                }
            }
        }
        if (w.isZ() == false) {
            w.vitoria();
        }
        if (w.isZ() == false) {
            int j = 0;
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 9) {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        t.xTrue();
    }//GEN-LAST:event_XActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        t.oTrue();
    }//GEN-LAST:event_OActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        w.setV("v", 0);
        w.setV("v", 1);
        w.setV("v", 2);
        w.setV("v", 3);
        w.setV("v", 4);
        w.setV("v", 5);
        w.setV("v", 6);
        w.setV("v", 7);
        w.setV("v", 8);
        w.setZ(false);
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        t.xTrue();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Menu frame = new Menu();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JxJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JxJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JxJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JxJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JxJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton O;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton X;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
