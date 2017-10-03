package avaliacao03;

import javax.swing.JOptionPane;

public class Normal extends javax.swing.JFrame {

    public Normal() {
        initComponents();
        t.xTrue();
        m.JButton[0] = jButton1;
        m.JButton[1] = jButton2;
        m.JButton[2] = jButton3;
        m.JButton[3] = jButton4;
        m.JButton[4] = jButton5;
        m.JButton[5] = jButton6;
        m.JButton[6] = jButton7;
        m.JButton[7] = jButton8;
        m.JButton[8] = jButton9;
        w.setV("V", 0);
        w.setV("V", 1);
        w.setV("V", 2);
        w.setV("V", 3);
        w.setV("V", 4);
        w.setV("V", 5);
        w.setV("V", 6);
        w.setV("V", 7);
        w.setV("V", 8);
        m.setA(20);
    }

    XO t = new XO();
    Ia m = new Ia();
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
        Reset = new javax.swing.JButton();
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

        jButton2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton2InputMethodTextChanged(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton3InputMethodTextChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton4InputMethodTextChanged(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton5InputMethodTextChanged(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton6InputMethodTextChanged(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton7InputMethodTextChanged(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton8InputMethodTextChanged(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jButton9InputMethodTextChanged(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(Reset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Voltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton1InputMethodTextChanged

    }//GEN-LAST:event_jButton1InputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!"X".equals(jButton1.getText())) {                         //laço para verificar se pode marcar x
            if (!"O".equals(jButton1.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton1.setText("X");
                    w.setV("X", 0);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[0].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[8].getText()) && !"X".equals(m.JButton[8].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[8].setText("O");
                        w.setV("O", 8);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[0].getText()) && "X".equals(m.JButton[8].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[0].getText()) && "X".equals(m.JButton[1].getText())
                        && !"O".equals(m.JButton[2].getText()) && !"X".equals(m.JButton[2].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[2].setText("O");
                        w.setV("O", 2);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[0].getText()) && "X".equals(m.JButton[2].getText())
                        && !"O".equals(m.JButton[1].getText()) && !"X".equals(m.JButton[1].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[1].setText("O");
                        w.setV("O", 1);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[0].getText()) && "X".equals(m.JButton[3].getText())
                        && !"O".equals(m.JButton[6].getText()) && !"X".equals(m.JButton[6].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[6].setText("O");
                        w.setV("O", 6);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[0].getText()) && "X".equals(m.JButton[6].getText())
                        && !"O".equals(m.JButton[3].getText()) && !"X".equals(m.JButton[3].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[3].setText("O");
                        w.setV("O", 3);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton2InputMethodTextChanged

    }//GEN-LAST:event_jButton2InputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!"X".equals(jButton2.getText())) {
            if (!"O".equals(jButton2.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton2.setText("X");
                    w.setV("X", 1);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[1].getText()) && "X".equals(m.JButton[0].getText())
                        && !"O".equals(m.JButton[2].getText()) && !"X".equals(m.JButton[2].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[2].setText("O");
                        w.setV("O", 2);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[1].getText()) && "X".equals(m.JButton[2].getText())
                        && !"O".equals(m.JButton[0].getText()) && !"X".equals(m.JButton[0].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[0].setText("O");
                        w.setV("O", 0);
                        t.xTrue();
                        w.vitoria();
                    }
                }else if ("X".equals(m.JButton[1].getText()) && "X".equals(m.JButton[7].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[1].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[7].getText()) && !"X".equals(m.JButton[7].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[7].setText("O");
                        w.setV("O", 7);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton3InputMethodTextChanged

    }//GEN-LAST:event_jButton3InputMethodTextChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!"X".equals(jButton3.getText())) {
            if (!"O".equals(jButton3.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton3.setText("X");
                    w.setV("X", 2);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[2].getText()) && "X".equals(m.JButton[0].getText())
                        && !"O".equals(m.JButton[1].getText()) && !"X".equals(m.JButton[1].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[1].setText("O");
                        w.setV("O", 1);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[2].getText()) && "X".equals(m.JButton[1].getText())
                        && !"O".equals(m.JButton[0].getText()) && !"X".equals(m.JButton[0].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[0].setText("O");
                        w.setV("O", 0);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[2].getText()) && "X".equals(m.JButton[5].getText())
                        && !"O".equals(m.JButton[8].getText()) && !"X".equals(m.JButton[8].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[8].setText("O");
                        w.setV("O", 8);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[2].getText()) && "X".equals(m.JButton[8].getText())
                        && !"O".equals(m.JButton[5].getText()) && !"X".equals(m.JButton[5].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[5].setText("O");
                        w.setV("O", 5);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[2].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[6].getText()) && !"X".equals(m.JButton[6].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[6].setText("O");
                        w.setV("O", 6);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[2].getText()) && "X".equals(m.JButton[6].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton4InputMethodTextChanged

    }//GEN-LAST:event_jButton4InputMethodTextChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!"X".equals(jButton4.getText())) {
            if (!"O".equals(jButton4.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton4.setText("X");
                    w.setV("X", 3);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[3].getText()) && "X".equals(m.JButton[0].getText())
                        && !"O".equals(m.JButton[6].getText()) && !"X".equals(m.JButton[6].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[6].setText("O");
                        w.setV("O", 6);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[3].getText()) && "X".equals(m.JButton[6].getText())
                        && !"O".equals(m.JButton[0].getText()) && !"X".equals(m.JButton[0].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[0].setText("O");
                        w.setV("O", 0);
                        t.xTrue();
                        w.vitoria();
                    }
                }else if ("X".equals(m.JButton[3].getText()) && "X".equals(m.JButton[5].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[3].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[5].getText()) && !"X".equals(m.JButton[5].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[5].setText("O");
                        w.setV("O", 5);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton5InputMethodTextChanged

    }//GEN-LAST:event_jButton5InputMethodTextChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!"X".equals(jButton5.getText())) {
            if (!"O".equals(jButton5.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton5.setText("X");
                    w.setV("X", 4);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[4].getText()) && "X".equals(m.JButton[0].getText())
                        && !"O".equals(m.JButton[8].getText()) && !"X".equals(m.JButton[8].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[8].setText("O");
                        w.setV("O", 8);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[4].getText()) && "X".equals(m.JButton[8].getText())
                        && !"O".equals(m.JButton[0].getText()) && !"X".equals(m.JButton[0].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[0].setText("O");
                        w.setV("O", 0);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[4].getText()) && "X".equals(m.JButton[1].getText())
                        && !"O".equals(m.JButton[7].getText()) && !"X".equals(m.JButton[7].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[7].setText("O");
                        w.setV("O", 7);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[4].getText()) && "X".equals(m.JButton[7].getText())
                        && !"O".equals(m.JButton[1].getText()) && !"X".equals(m.JButton[1].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[1].setText("O");
                        w.setV("O", 1);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[4].getText()) && "X".equals(m.JButton[2].getText())
                        && !"O".equals(m.JButton[6].getText()) && !"X".equals(m.JButton[6].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[6].setText("O");
                        w.setV("O", 6);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[4].getText()) && "X".equals(m.JButton[6].getText())
                        && !"O".equals(m.JButton[2].getText()) && !"X".equals(m.JButton[2].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[2].setText("O");
                        w.setV("O", 2);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton6InputMethodTextChanged

    }//GEN-LAST:event_jButton6InputMethodTextChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!"X".equals(jButton6.getText())) {
            if (!"O".equals(jButton6.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton6.setText("X");
                    w.setV("X", 5);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[5].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[3].getText()) && !"X".equals(m.JButton[3].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[3].setText("O");
                        w.setV("O", 3);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[5].getText()) && "X".equals(m.JButton[3].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                }else if ("X".equals(m.JButton[5].getText()) && "X".equals(m.JButton[2].getText())
                        && !"O".equals(m.JButton[8].getText()) && !"X".equals(m.JButton[8].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[8].setText("O");
                        w.setV("O", 8);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[5].getText()) && "X".equals(m.JButton[8].getText())
                        && !"O".equals(m.JButton[2].getText()) && !"X".equals(m.JButton[2].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[2].setText("O");
                        w.setV("O", 2);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton7InputMethodTextChanged

    }//GEN-LAST:event_jButton7InputMethodTextChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!"X".equals(jButton7.getText())) {
            if (!"O".equals(jButton7.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton7.setText("X");
                    w.setV("X", 6);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[6].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[2].getText()) && !"X".equals(m.JButton[2].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[2].setText("O");
                        w.setV("O", 2);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[6].getText()) && "X".equals(m.JButton[2].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[6].getText()) && "X".equals(m.JButton[3].getText())
                        && !"O".equals(m.JButton[0].getText()) && !"X".equals(m.JButton[0].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[0].setText("O");
                        w.setV("O", 0);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[6].getText()) && "X".equals(m.JButton[0].getText())
                        && !"O".equals(m.JButton[3].getText()) && !"X".equals(m.JButton[3].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[3].setText("O");
                        w.setV("O", 3);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[6].getText()) && "X".equals(m.JButton[7].getText())
                        && !"O".equals(m.JButton[8].getText()) && !"X".equals(m.JButton[8].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[8].setText("O");
                        w.setV("O", 8);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[6].getText()) && "X".equals(m.JButton[8].getText())
                        && !"O".equals(m.JButton[7].getText()) && !"X".equals(m.JButton[7].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[7].setText("O");
                        w.setV("O", 7);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton8InputMethodTextChanged

    }//GEN-LAST:event_jButton8InputMethodTextChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!"X".equals(jButton8.getText())) {
            if (!"O".equals(jButton8.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton8.setText("X");
                    w.setV("X", 7);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[7].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[1].getText()) && !"X".equals(m.JButton[1].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[1].setText("O");
                        w.setV("O", 1);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[7].getText()) && "X".equals(m.JButton[1].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                }else if ("X".equals(m.JButton[7].getText()) && "X".equals(m.JButton[6].getText())
                        && !"O".equals(m.JButton[8].getText()) && !"X".equals(m.JButton[8].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[8].setText("O");
                        w.setV("O", 8);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[7].getText()) && "X".equals(m.JButton[8].getText())
                        && !"O".equals(m.JButton[6].getText()) && !"X".equals(m.JButton[6].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[6].setText("O");
                        w.setV("O", 6);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jButton9InputMethodTextChanged

    }//GEN-LAST:event_jButton9InputMethodTextChanged

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!"X".equals(jButton9.getText())) {
            if (!"O".equals(jButton9.getText())) {
                if (t.isX() == true && t.isO() == false) {
                    jButton9.setText("X");
                    w.setV("X", 8);
                    t.oTrue();
                }
            }
        }
        int j = 0;
        w.vitoria();
        if (w.isZ() == false) {
            for (int i = 0; i < 9; i++) {
                if ("X".equals(w.getV(i)) || "O".equals(w.getV(i))) {
                    j = j + 1;
                }
                if (j == 8) {
                    w.setZ(true);
                }
            }
            if (w.isZ() == false) {
                if ("X".equals(m.JButton[8].getText()) && "X".equals(m.JButton[4].getText())
                        && !"O".equals(m.JButton[0].getText()) && !"X".equals(m.JButton[0].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[0].setText("O");
                        w.setV("O", 0);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[8].getText()) && "X".equals(m.JButton[0].getText())
                        && !"O".equals(m.JButton[4].getText()) && !"X".equals(m.JButton[4].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[4].setText("O");
                        w.setV("O", 4);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[8].getText()) && "X".equals(m.JButton[5].getText())
                        && !"O".equals(m.JButton[2].getText()) && !"X".equals(m.JButton[2].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[2].setText("O");
                        w.setV("O", 2);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[8].getText()) && "X".equals(m.JButton[2].getText())
                        && !"O".equals(m.JButton[5].getText()) && !"X".equals(m.JButton[5].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[5].setText("O");
                        w.setV("O", 5);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[8].getText()) && "X".equals(m.JButton[7].getText())
                        && !"O".equals(m.JButton[6].getText()) && !"X".equals(m.JButton[6].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[6].setText("O");
                        w.setV("O", 6);
                        t.xTrue();
                        w.vitoria();
                    }
                } else if ("X".equals(m.JButton[8].getText()) && "X".equals(m.JButton[6].getText())
                        && !"O".equals(m.JButton[7].getText()) && !"X".equals(m.JButton[7].getText())) {
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[7].setText("O");
                        w.setV("O", 7);
                        t.xTrue();
                        w.vitoria();
                    }
                } else {
                    m.setA(Math.round(Math.random() * 8));
                    while ("O".equals(m.JButton[(int) m.getA()].getText()) || "X".equals(m.JButton[(int) m.getA()].getText())) {
                        m.setA(Math.round(Math.random() * 8));
                    }
                    if (t.isO() == true && t.isX() == false) {
                        m.JButton[(int) m.getA()].setText("O");
                        w.setV("O", (int) m.getA());
                        t.xTrue();
                        w.vitoria();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Empate");
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        m.setA(20);
        t.xTrue();
        w.setZ(false);
        w.setV("V", 0);
        w.setV("V", 1);
        w.setV("V", 2);
        w.setV("V", 3);
        w.setV("V", 4);
        w.setV("V", 5);
        w.setV("V", 6);
        w.setV("V", 7);
        w.setV("V", 8);
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        Menu frame = new Menu();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Normal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Normal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Normal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Normal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Normal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jButton1;
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
