/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;
import static javafx.scene.paint.Color.color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author FELIPE
 */
public class APSTeclado extends javax.swing.JFrame {

String []Pangrama = {"Jane quer LP, fax, CD, giz, TV e bom whisky","TV faz quengo explodir com whisky JB","Um pequeno jabuti xereta viu dez cegonhas felizes","Gazeta publica hoje breve nota de faxina na quermesse","Blitz prende ex-vesgo com cheque fajuto"};
int indc = 0;
 int erros = 0;
int tmn = 0;
int esp = 0;
float rs = 0;
    
    
    
    
    
    
    
    
    public APSTeclado() {
        initComponents();
        Frose.setFocusTraversalKeysEnabled(false);
        getContentPane().setBackground(Color.DARK_GRAY);
        
        
        
        
        
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unbnt = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a5 = new javax.swing.JButton();
        a6 = new javax.swing.JButton();
        a1 = new javax.swing.JButton();
        a7 = new javax.swing.JButton();
        bkbnt = new javax.swing.JButton();
        mabnt = new javax.swing.JButton();
        minbnt = new javax.swing.JButton();
        a0 = new javax.swing.JButton();
        a9 = new javax.swing.JButton();
        a8 = new javax.swing.JButton();
        qbnt = new javax.swing.JButton();
        capbnt = new javax.swing.JButton();
        abnt = new javax.swing.JButton();
        sbnt = new javax.swing.JButton();
        dbnt = new javax.swing.JButton();
        fbnt = new javax.swing.JButton();
        gbnt = new javax.swing.JButton();
        tdbnt = new javax.swing.JButton();
        hbnt = new javax.swing.JButton();
        kbnt = new javax.swing.JButton();
        jbnt = new javax.swing.JButton();
        upbnt = new javax.swing.JButton();
        lbnt = new javax.swing.JButton();
        Entbnt = new javax.swing.JButton();
        poobnt = new javax.swing.JButton();
        backbnt = new javax.swing.JButton();
        hjbnt = new javax.swing.JButton();
        VIBNT = new javax.swing.JButton();
        cirbnt = new javax.swing.JButton();
        tabbnt = new javax.swing.JButton();
        ebnt = new javax.swing.JButton();
        wbnt = new javax.swing.JButton();
        rbnt = new javax.swing.JButton();
        tbnt = new javax.swing.JButton();
        ybnt = new javax.swing.JButton();
        ubnt = new javax.swing.JButton();
        ibnt = new javax.swing.JButton();
        obnt = new javax.swing.JButton();
        pbnt = new javax.swing.JButton();
        babnt = new javax.swing.JButton();
        cbnt = new javax.swing.JButton();
        bbnt = new javax.swing.JButton();
        mbnt = new javax.swing.JButton();
        nbnt = new javax.swing.JButton();
        vbnt = new javax.swing.JButton();
        ribnt = new javax.swing.JButton();
        xbnt = new javax.swing.JButton();
        zbnt = new javax.swing.JButton();
        lebnt = new javax.swing.JButton();
        shifbnt = new javax.swing.JButton();
        leftbnt = new javax.swing.JButton();
        downbnt = new javax.swing.JButton();
        rightbnt = new javax.swing.JButton();
        Frose = new javax.swing.JTextField();
        escbnt = new javax.swing.JButton();
        AreaPng = new javax.swing.JLabel();
        prrbnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pcrbnt = new javax.swing.JLabel();

        unbnt.setText("<html>\"<br>'<htrml/>");
        unbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unbntActionPerformed(evt);
            }
        });

        a4.setText("<html>$<br>4<html/>");

        a3.setText("<html>#<br>3<html/>");

        a2.setText("<html>@<br>2<html/>");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a5.setText("<html>%<br>5<html/>");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });

        a6.setText("<html>¨<br>6<html/>");

        a1.setText("<html>!<br>9</html>");
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        a7.setText("<html>&<br>7<html/>");

        bkbnt.setText("BACKSPACE");
        bkbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkbntActionPerformed(evt);
            }
        });

        mabnt.setText("<html>+<br>=<html/>");
        mabnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mabntActionPerformed(evt);
            }
        });

        minbnt.setText("<html>_<br>-<html/>");
        minbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minbntActionPerformed(evt);
            }
        });

        a0.setText("<html>)<br>0<html/>");

        a9.setText("<html>(<br>9<html/>");

        a8.setText("<html>*<br>8<html/>");

        qbnt.setText("Q");
        qbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qbntActionPerformed(evt);
            }
        });

        capbnt.setText("CAPS");
        capbnt.setToolTipText("");
        capbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capbntActionPerformed(evt);
            }
        });

        abnt.setText("A");
        abnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abntActionPerformed(evt);
            }
        });

        sbnt.setText("S");
        sbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbntActionPerformed(evt);
            }
        });

        dbnt.setText("D");
        dbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbntActionPerformed(evt);
            }
        });

        fbnt.setText("F");
        fbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbntActionPerformed(evt);
            }
        });

        gbnt.setText("G");
        gbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbntActionPerformed(evt);
            }
        });

        tdbnt.setText("<html>:<br>;<html/>");
        tdbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdbntActionPerformed(evt);
            }
        });

        hbnt.setText("H");
        hbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hbntActionPerformed(evt);
            }
        });

        kbnt.setText("K");
        kbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbntActionPerformed(evt);
            }
        });

        jbnt.setText("J");
        jbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbntActionPerformed(evt);
            }
        });

        upbnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teclado/if_icon-arrow-up-b_211623 (2).png"))); // NOI18N
        upbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbntActionPerformed(evt);
            }
        });

        lbnt.setText("L");
        lbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbntActionPerformed(evt);
            }
        });

        Entbnt.setText("ENTER");
        Entbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntbntActionPerformed(evt);
            }
        });
        Entbnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EntbntKeyPressed(evt);
            }
        });

        poobnt.setText("<html>><br>.<html/>");
        poobnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poobntActionPerformed(evt);
            }
        });

        backbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbntActionPerformed(evt);
            }
        });

        hjbnt.setText("<html>?<br>/<html/>");
        hjbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hjbntActionPerformed(evt);
            }
        });

        VIBNT.setText("<html> &lt <br>.</html>");
        VIBNT.setToolTipText("");
        VIBNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIBNTActionPerformed(evt);
            }
        });

        cirbnt.setText("<html>^<br>~<htrml/>");
        cirbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirbntActionPerformed(evt);
            }
        });

        tabbnt.setText("Tab");
        tabbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabbntActionPerformed(evt);
            }
        });

        ebnt.setText("E");
        ebnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebntActionPerformed(evt);
            }
        });

        wbnt.setText("W");
        wbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wbntActionPerformed(evt);
            }
        });
        wbnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wbntKeyPressed(evt);
            }
        });

        rbnt.setText("R");
        rbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbntActionPerformed(evt);
            }
        });

        tbnt.setText("T");
        tbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbntActionPerformed(evt);
            }
        });

        ybnt.setText("Y");
        ybnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ybntActionPerformed(evt);
            }
        });

        ubnt.setText("U");
        ubnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubntActionPerformed(evt);
            }
        });

        ibnt.setText("I");
        ibnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ibntActionPerformed(evt);
            }
        });

        obnt.setText("O");
        obnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obntActionPerformed(evt);
            }
        });

        pbnt.setText("P");
        pbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbntActionPerformed(evt);
            }
        });

        babnt.setText("<html>`<br>´<htrml/>");
        babnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                babntActionPerformed(evt);
            }
        });

        cbnt.setText("C");
        cbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbntActionPerformed(evt);
            }
        });

        bbnt.setText("B");
        bbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbntActionPerformed(evt);
            }
        });

        mbnt.setText("M");
        mbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbntActionPerformed(evt);
            }
        });

        nbnt.setText("N");
        nbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbntActionPerformed(evt);
            }
        });

        vbnt.setText("V");
        vbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vbntActionPerformed(evt);
            }
        });

        ribnt.setText("<html>{<br>[<htrml/>");
        ribnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ribntActionPerformed(evt);
            }
        });

        xbnt.setText("X");
        xbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xbntActionPerformed(evt);
            }
        });

        zbnt.setText("Z");
        zbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zbntActionPerformed(evt);
            }
        });

        lebnt.setText("<html>}<br>]<htrml/>");
        lebnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lebntActionPerformed(evt);
            }
        });

        shifbnt.setText("SHIFT");
        shifbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shifbntActionPerformed(evt);
            }
        });

        leftbnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teclado/if_icon-arrow-left-b_211617 (2).png"))); // NOI18N
        leftbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftbntActionPerformed(evt);
            }
        });

        downbnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teclado/if_icon-arrow-down-b_211614 (3).png"))); // NOI18N
        downbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downbntActionPerformed(evt);
            }
        });

        rightbnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teclado/if_icon-play_211876 (5).png"))); // NOI18N
        rightbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightbntActionPerformed(evt);
            }
        });

        Frose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FroseActionPerformed(evt);
            }
        });
        Frose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FroseKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FroseKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FroseKeyTyped(evt);
            }
        });

        escbnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teclado/if_icon-ios7-gear_211751.png"))); // NOI18N

        AreaPng.setText("                                                                    SELECIONE UM TEXTO PARA DIGITAR                ");

        jLabel1.setText("Aperte TAB");

        jLabel2.setText("Quantidade de Erro(s):");

        jLabel3.setText("Porcentagem de Erro(s):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(unbnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minbnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mabnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bkbnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Frose)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(capbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(abnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(kbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cirbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lebnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(shifbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(xbnt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(backbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbnt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(vbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nbnt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mbnt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(VIBNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(poobnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tdbnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hjbnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(upbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(leftbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(rightbnt))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(downbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tabbnt)
                                .addGap(9, 9, 9)
                                .addComponent(qbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wbnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ebnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ybnt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ibnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pbnt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(babnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ribnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Entbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(escbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AreaPng, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(pcrbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prrbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prrbnt, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                                    .addComponent(pcrbnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10))
                            .addComponent(AreaPng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(Frose, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bkbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mabnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ribnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(babnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tabbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ubnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ibnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(obnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(qbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ebnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ybnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(capbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(abnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lebnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cirbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zbnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shifbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tdbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(poobnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VIBNT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bbnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hjbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Entbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(leftbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rightbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(downbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        downbnt.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void mabntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mabntActionPerformed
       mabnt.setBackground(Color.red);
    }//GEN-LAST:event_mabntActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void ybntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ybntActionPerformed
       ybnt.setBackground(Color.red);
    }//GEN-LAST:event_ybntActionPerformed

    private void bbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbntActionPerformed
      bbnt.setBackground(Color.red);
    }//GEN-LAST:event_bbntActionPerformed

    private void nbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbntActionPerformed
      nbnt.setBackground(Color.red);
    }//GEN-LAST:event_nbntActionPerformed

    private void mbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbntActionPerformed
       mbnt.setBackground(Color.red);
    }//GEN-LAST:event_mbntActionPerformed

    private void cirbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirbntActionPerformed
       cirbnt.setBackground(Color.red);
    }//GEN-LAST:event_cirbntActionPerformed

    private void wbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wbntActionPerformed
     
      wbnt.setBackground(Color.red);
        

    }//GEN-LAST:event_wbntActionPerformed

    private void wbntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wbntKeyPressed
        wbnt.setBackground(Color.red);
    }//GEN-LAST:event_wbntKeyPressed

   public void comparaTexto(){
       
      
        
        int acertos = 0;
        String a = AreaPng.getText();
        String b = Frose.getText();
       erros = 0;
       
       
            
        if(a.equals(b)){
            AreaPng.setText("Frase Correta!");
            prrbnt.setText(erros+"");
        }
        
        else {
            try {
                  for(int j = 0; j < b.length(); j++){
                 if(a.charAt(j) != b.charAt(j)){
                     erros++;
                
                 } 
   
             }
            } catch (StringIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null," Sua frase possui mais letras que o Pangrama");
            }
        
                
           
           AreaPng.setText("<html>ERRADO:  "+b+"<br /> CERTO: "+a+"</html>");
           prrbnt.setText(erros+"");
          
          
        } 
   Frose.setText("");
        
   }
   
   
   public void EscText(){
       Random r2 = new Random();
       indc = r2.nextInt(Pangrama.length);
     
     AreaPng.setText(Pangrama[indc]);
   
          
      
   
   
                
     }
   public void Erresc(){
       esp = 0;
       tmn = 0;
       String c = Pangrama[indc];
       for(int y = 0; y < c.length(); y++){
          if(c.charAt(y) == ' '){
              esp++;
          }else{
           tmn++;
          }
          }
       System.out.println(tmn);
       System.out.println(esp);
       tmn = tmn - esp;
       System.out.println(tmn);
       rs = erros*100;
       rs = rs/tmn;
       NumberFormat nf = NumberFormat.getInstance();
       nf.setMaximumFractionDigits(1);
       String resulNf = nf.format(rs);
       pcrbnt.setText(resulNf+"%");
       
       
       
       
       
       
   }
   
   
   
   
   
   
    
    private void FroseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FroseKeyPressed
 
        
        
        
        if(evt.getKeyCode() == KeyEvent.VK_W){
            wbnt.setBackground(Color.red);
            
      }if(evt.getKeyCode() == KeyEvent.VK_A){
          abnt.setBackground(Color.red);
        
      }if(evt.getKeyCode() == KeyEvent.VK_B){
          bbnt.setBackground(Color.red);
        
      } if(evt.getKeyCode() == KeyEvent.VK_C){
          cbnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_D){
           dbnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_Z){
          zbnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_X){
          xbnt.setBackground(Color.red);
         
      } if(evt.getKeyCode() == KeyEvent.VK_G){
          gbnt.setBackground(Color.red);
         
      } if(evt.getKeyCode() == KeyEvent.VK_H){
          hbnt.setBackground(Color.red);
        
      }if(evt.getKeyCode() == KeyEvent.VK_L){
          lbnt.setBackground(Color.red);
        
      } if(evt.getKeyCode() == KeyEvent.VK_J){
          jbnt.setBackground(Color.red);
          
      }if(evt.getKeyCode() == KeyEvent.VK_V){
          vbnt.setBackground(Color.red);
          
      } if(evt.getKeyCode() == KeyEvent.VK_P){
          pbnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_S){
          sbnt.setBackground(Color.red);
          
      } if(evt.getKeyCode() == KeyEvent.VK_E){
          ebnt.setBackground(Color.red);
          
      }if(evt.getKeyCode() == KeyEvent.VK_F){
          fbnt.setBackground(Color.red);
         
      } if(evt.getKeyCode() == KeyEvent.VK_I){
          ibnt.setBackground(Color.red);
        
      }if(evt.getKeyCode() == KeyEvent.VK_M){
          mbnt.setBackground(Color.red);
        
      } if(evt.getKeyCode() == KeyEvent.VK_N){
          nbnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_Q){
          qbnt.setBackground(Color.red);
       
      }if(evt.getKeyCode() == KeyEvent.VK_O){
          obnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_T){
          tbnt.setBackground(Color.red);
         
      }if(evt.getKeyCode() == KeyEvent.VK_V){
          vbnt.setBackground(Color.red);
       
      }if(evt.getKeyCode() == KeyEvent.VK_U){
          ubnt.setBackground(Color.red);
         
      } if(evt.getKeyCode() == KeyEvent.VK_R){
          rbnt.setBackground(Color.red);
        
      }if(evt.getKeyCode() == KeyEvent.VK_Y){
          ybnt.setBackground(Color.red);
          
      }if(evt.getKeyCode() == KeyEvent.VK_K){
          kbnt.setBackground(Color.red);
       
      }
       if(evt.getKeyCode() == KeyEvent.VK_1){
          a1.setBackground(Color.red);
       } 
      if(evt.getKeyCode() == KeyEvent.VK_2){
          a2.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_3){
          a3.setBackground(Color.red);
      }
       if(evt.getKeyCode() == KeyEvent.VK_4){
          a4.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_5){
          a5.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_6){
          a6.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_7){
          a7.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_8){
          a8.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_9){
          a9.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_0){
          a0.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_UP){
          upbnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_DOWN){
          downbnt.setBackground(Color.red);
      }
      if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
          rightbnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_LEFT){
          leftbnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_SPACE){
          backbnt.setBackground(Color.red);
          
      }if(evt.getKeyCode() == KeyEvent.VK_SHIFT){
          shifbnt.setBackground(Color.red);
          System.exit(0);
      }if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
          capbnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_TAB){
          tabbnt.setBackground(Color.red);
         EscText();
      }if(evt.getKeyCode() == KeyEvent.VK_COMMA){
          VIBNT.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_MINUS){
          minbnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_PERIOD){
          poobnt.setBackground(Color.red);
          
      }if(evt.getKeyCode() == KeyEvent.VK_EQUALS){
          mabnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_SEMICOLON){
          tdbnt.setBackground(Color.red);
      }if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
          bkbnt.setBackground(Color.red);   
       }if(evt.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET){
          lebnt.setBackground(Color.red);
      } if(evt.getKeyCode() == KeyEvent.VK_OPEN_BRACKET){
          ribnt.setBackground(Color.red);
      } if(evt.getKeyChar() == '/'){
          hjbnt.setBackground(Color.red);
      } if(evt.getKeyCode() == KeyEvent.VK_DEAD_TILDE){
          cirbnt.setBackground(Color.red);
      } if(evt.getKeyCode() == KeyEvent.VK_DEAD_ACUTE){
          babnt.setBackground(Color.red);
      }   if(evt.getKeyCode() == KeyEvent.VK_QUOTE){
          unbnt.setBackground(Color.red);
      }

       
       
       
       
       
       
       
       
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         Entbnt.setBackground(Color.red);
         if(Frose.getText().equals("")){
          JOptionPane.showMessageDialog(null," Nenhuma Frase Digitada");
         
      }else if (AreaPng.getText().equals("SELECIONE UM TEXTO PARA DIGITAR")){
        JOptionPane.showMessageDialog(null," Nenhum texto selecionado");
     
      }
         comparaTexto();  
         }if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
         escbnt.setBackground(Color.red);
        Erresc();
      }
       
       
       
      
       
    }//GEN-LAST:event_FroseKeyPressed
    
       
       
       
    private void abntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abntActionPerformed
       abnt.setBackground(Color.red);
    }//GEN-LAST:event_abntActionPerformed

    private void qbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qbntActionPerformed
       qbnt.setBackground(Color.red);
    }//GEN-LAST:event_qbntActionPerformed

    private void ebntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebntActionPerformed
        ebnt.setBackground(Color.red);
    }//GEN-LAST:event_ebntActionPerformed

    private void rbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbntActionPerformed
       rbnt.setBackground(Color.red);
    }//GEN-LAST:event_rbntActionPerformed

    private void tbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbntActionPerformed
      tbnt.setBackground(Color.red);
    }//GEN-LAST:event_tbntActionPerformed

    private void ubntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubntActionPerformed
      ubnt.setBackground(Color.red);
    }//GEN-LAST:event_ubntActionPerformed

    private void ibntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ibntActionPerformed
        ibnt.setBackground(Color.red);
    }//GEN-LAST:event_ibntActionPerformed

    private void obntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obntActionPerformed
        obnt.setBackground(Color.red);
    }//GEN-LAST:event_obntActionPerformed

    private void pbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbntActionPerformed
        pbnt.setBackground(Color.red);
    }//GEN-LAST:event_pbntActionPerformed

    private void sbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbntActionPerformed
        sbnt.setBackground(Color.red);
    }//GEN-LAST:event_sbntActionPerformed

    private void dbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbntActionPerformed
       cbnt.setBackground(Color.red);
    }//GEN-LAST:event_dbntActionPerformed

    private void fbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbntActionPerformed
        fbnt.setBackground(Color.red);
    }//GEN-LAST:event_fbntActionPerformed

    private void gbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbntActionPerformed
        gbnt.setBackground(Color.red);
    }//GEN-LAST:event_gbntActionPerformed

    private void hbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hbntActionPerformed
        hbnt.setBackground(Color.red);
    }//GEN-LAST:event_hbntActionPerformed

    private void jbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbntActionPerformed
       jbnt.setBackground(Color.red);
    }//GEN-LAST:event_jbntActionPerformed

    private void kbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbntActionPerformed
       kbnt.setBackground(Color.red);
    }//GEN-LAST:event_kbntActionPerformed

    private void lbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbntActionPerformed
       lbnt.setBackground(Color.red);
    }//GEN-LAST:event_lbntActionPerformed

    private void zbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zbntActionPerformed
       zbnt.setBackground(Color.red);
    }//GEN-LAST:event_zbntActionPerformed

    private void xbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xbntActionPerformed
        xbnt.setBackground(Color.red);
    }//GEN-LAST:event_xbntActionPerformed

    private void cbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbntActionPerformed
        cbnt.setBackground(Color.red);
    }//GEN-LAST:event_cbntActionPerformed

    private void vbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vbntActionPerformed
      vbnt.setBackground(Color.red);
    }//GEN-LAST:event_vbntActionPerformed

    private void upbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbntActionPerformed
        upbnt.setBackground(Color.red);
    }//GEN-LAST:event_upbntActionPerformed

    private void downbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downbntActionPerformed
        downbnt.setBackground(Color.red);
    }//GEN-LAST:event_downbntActionPerformed

    private void leftbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftbntActionPerformed
       leftbnt.setBackground(Color.red);
    }//GEN-LAST:event_leftbntActionPerformed

    private void rightbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightbntActionPerformed
        rightbnt.setBackground(Color.red);
    }//GEN-LAST:event_rightbntActionPerformed

    private void backbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbntActionPerformed
       backbnt.setBackground(Color.red);
    }//GEN-LAST:event_backbntActionPerformed

    private void shifbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shifbntActionPerformed
        shifbnt.setBackground(Color.red);
    }//GEN-LAST:event_shifbntActionPerformed

    private void capbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capbntActionPerformed
       capbnt.setBackground(Color.red);
    }//GEN-LAST:event_capbntActionPerformed

    private void tabbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabbntActionPerformed
        tabbnt.setBackground(Color.red);
    }//GEN-LAST:event_tabbntActionPerformed

    private void hjbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hjbntActionPerformed
        hjbnt.setBackground(Color.red);
    }//GEN-LAST:event_hjbntActionPerformed

    private void babntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_babntActionPerformed
       babnt.setBackground(Color.red);
    }//GEN-LAST:event_babntActionPerformed

    private void unbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unbntActionPerformed
        unbnt.setBackground(Color.red);
    }//GEN-LAST:event_unbntActionPerformed

    private void ribntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ribntActionPerformed
       ribnt.setBackground(Color.red);
    }//GEN-LAST:event_ribntActionPerformed

    private void lebntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lebntActionPerformed
       lebnt.setBackground(Color.red);
    }//GEN-LAST:event_lebntActionPerformed

    private void minbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minbntActionPerformed
       minbnt.setBackground(Color.red);
    }//GEN-LAST:event_minbntActionPerformed

    private void VIBNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIBNTActionPerformed
    VIBNT.setBackground(Color.red);
    }//GEN-LAST:event_VIBNTActionPerformed

    private void poobntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poobntActionPerformed
        poobnt.setBackground(Color.red);
    }//GEN-LAST:event_poobntActionPerformed

    private void tdbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdbntActionPerformed
       tdbnt.setBackground(Color.red);
    }//GEN-LAST:event_tdbntActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
      a1.getBackground();
    }//GEN-LAST:event_a1ActionPerformed

    private void bkbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkbntActionPerformed
       bkbnt.setBackground(Color.red);
    }//GEN-LAST:event_bkbntActionPerformed

    private void EntbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntbntActionPerformed
      
        
    }//GEN-LAST:event_EntbntActionPerformed

    private void EntbntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EntbntKeyPressed
     
    }//GEN-LAST:event_EntbntKeyPressed

    private void FroseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FroseActionPerformed
     
    }//GEN-LAST:event_FroseActionPerformed

    private void FroseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FroseKeyTyped
       String carc = "0123456789";
       if(carc.contains(evt.getKeyChar()+"")){
           evt.consume();
       }
       
       
    }//GEN-LAST:event_FroseKeyTyped

    private void FroseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FroseKeyReleased
      
        wbnt.setBackground(new Color(240,240,240));
        abnt.setBackground(new Color(240,240,240));
 bbnt.setBackground(new Color(240,240,240));
 cbnt.setBackground(new Color(240,240,240));
dbnt.setBackground(new Color(240,240,240));
 zbnt.setBackground(new Color(240,240,240));
xbnt.setBackground(new Color(240,240,240));
gbnt.setBackground(new Color(240,240,240));
hbnt.setBackground(new Color(240,240,240));
lbnt.setBackground(new Color(240,240,240));
 jbnt.setBackground(new Color(240,240,240));
vbnt.setBackground(new Color(240,240,240));
pbnt.setBackground(new Color(240,240,240));
 sbnt.setBackground(new Color(240,240,240));
ebnt.setBackground(new Color(240,240,240));
fbnt.setBackground(new Color(240,240,240));
ibnt.setBackground(new Color(240,240,240));
 mbnt.setBackground(new Color(240,240,240));
 nbnt.setBackground(new Color(240,240,240));
 qbnt.setBackground(new Color(240,240,240));
 obnt.setBackground(new Color(240,240,240));
 tbnt.setBackground(new Color(240,240,240));
vbnt.setBackground(new Color(240,240,240));
ubnt.setBackground(new Color(240,240,240));
   rbnt.setBackground(new Color(240,240,240));
 ybnt.setBackground(new Color(240,240,240));
 kbnt.setBackground(new Color(240,240,240));
  a1.setBackground(new Color(240,240,240));
 a2.setBackground(new Color(240,240,240));
a3.setBackground(new Color(240,240,240));
a4.setBackground(new Color(240,240,240));
a5.setBackground(new Color(240,240,240));
a6.setBackground(new Color(240,240,240));
a7.setBackground(new Color(240,240,240));
a8.setBackground(new Color(240,240,240));
 a9.setBackground(new Color(240,240,240));
  a0.setBackground(new Color(240,240,240));
upbnt.setBackground(new Color(240,240,240));
downbnt.setBackground(new Color(240,240,240));
 rightbnt.setBackground(new Color(240,240,240));
leftbnt.setBackground(new Color(240,240,240));
 backbnt.setBackground(new Color(240,240,240));
shifbnt.setBackground(new Color(240,240,240));
capbnt.setBackground(new Color(240,240,240));
tabbnt.setBackground(new Color(240,240,240));
VIBNT.setBackground(new Color(240,240,240));
 minbnt.setBackground(new Color(240,240,240));
poobnt.setBackground(new Color(240,240,240));
mabnt.setBackground(new Color(240,240,240));
tdbnt.setBackground(new Color(240,240,240));
bkbnt.setBackground(new Color(240,240,240));
 lebnt.setBackground(new Color(240,240,240));
ribnt.setBackground(new Color(240,240,240));
 hjbnt.setBackground(new Color(240,240,240));
  cirbnt.setBackground(new Color(240,240,240));
babnt.setBackground(new Color(240,240,240));
 unbnt.setBackground(new Color(240,240,240));
Entbnt.setBackground(new Color(240,240,240));
escbnt.setBackground(new Color(240,240,240));






        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_FroseKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(APSTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APSTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APSTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APSTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APSTeclado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreaPng;
    private javax.swing.JButton Entbnt;
    private javax.swing.JTextField Frose;
    private javax.swing.JButton VIBNT;
    private javax.swing.JButton a0;
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton a5;
    private javax.swing.JButton a6;
    private javax.swing.JButton a7;
    private javax.swing.JButton a8;
    private javax.swing.JButton a9;
    private javax.swing.JButton abnt;
    private javax.swing.JButton babnt;
    private javax.swing.JButton backbnt;
    private javax.swing.JButton bbnt;
    private javax.swing.JButton bkbnt;
    private javax.swing.JButton capbnt;
    private javax.swing.JButton cbnt;
    private javax.swing.JButton cirbnt;
    private javax.swing.JButton dbnt;
    private javax.swing.JButton downbnt;
    private javax.swing.JButton ebnt;
    private javax.swing.JButton escbnt;
    private javax.swing.JButton fbnt;
    private javax.swing.JButton gbnt;
    private javax.swing.JButton hbnt;
    private javax.swing.JButton hjbnt;
    private javax.swing.JButton ibnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbnt;
    private javax.swing.JButton kbnt;
    private javax.swing.JButton lbnt;
    private javax.swing.JButton lebnt;
    private javax.swing.JButton leftbnt;
    private javax.swing.JButton mabnt;
    private javax.swing.JButton mbnt;
    private javax.swing.JButton minbnt;
    private javax.swing.JButton nbnt;
    private javax.swing.JButton obnt;
    private javax.swing.JButton pbnt;
    private javax.swing.JLabel pcrbnt;
    private javax.swing.JButton poobnt;
    private javax.swing.JLabel prrbnt;
    private javax.swing.JButton qbnt;
    private javax.swing.JButton rbnt;
    private javax.swing.JButton ribnt;
    private javax.swing.JButton rightbnt;
    private javax.swing.JButton sbnt;
    private javax.swing.JButton shifbnt;
    private javax.swing.JButton tabbnt;
    private javax.swing.JButton tbnt;
    private javax.swing.JButton tdbnt;
    private javax.swing.JButton ubnt;
    private javax.swing.JButton unbnt;
    private javax.swing.JButton upbnt;
    private javax.swing.JButton vbnt;
    private javax.swing.JButton wbnt;
    private javax.swing.JButton xbnt;
    private javax.swing.JButton ybnt;
    private javax.swing.JButton zbnt;
    // End of variables declaration//GEN-END:variables
}
