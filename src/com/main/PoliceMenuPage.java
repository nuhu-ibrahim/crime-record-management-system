package com.main;

import com.dataStructures.DBConnection;
import com.dataStructures.BlurLayerUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class PoliceMenuPage extends javax.swing.JFrame {

    public PoliceMenuPage() {
        DBConnection.connect();
        initComponents();
        
    }
    
    public void blur(){
        c=this.getContentPane();
        JLayer<Component> blurLayer = new JLayer<>(this.getContentPane(), new BlurLayerUI());
        this.setContentPane(blurLayer);
        this.setVisible(false);
        this.setVisible(true);
    }
    public void unblur(){
        this.setContentPane(getContent());
    }
    
    Container c;
    
    public Container getContent(){
        return c;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nigeria Police Force");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        desktop1.setBackground(new java.awt.Color(255, 255, 255));
        desktop1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/SP.jpg"))); // NOI18N
        desktop1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 0, 730, -1));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton1.setText("      Register Citizen");
        jButton1.setToolTipText("Register Student");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setIconTextGap(8);
        jButton1.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktop1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 188, 180, -1));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        desktop1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 700, 480));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton2.setText("       Edit Citizen Info");
        jButton2.setToolTipText("Register School");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.setIconTextGap(8);
        jButton2.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        desktop1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton3.setText("      Profile Citizen Crime");
        jButton3.setToolTipText("Edit Student Record");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setIconTextGap(8);
        jButton3.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        desktop1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton4.setText("       Edit Citizen Crime");
        jButton4.setToolTipText("Upload Result");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.setIconTextGap(8);
        jButton4.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        desktop1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 40));

        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton5.setText("View Citizen Crimes");
        jButton5.setToolTipText("Edit Result");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusable(false);
        jButton5.setIconTextGap(8);
        jButton5.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        desktop1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 40));

        jButton6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton6.setText("      View Crimes");
        jButton6.setToolTipText("View Result");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusable(false);
        jButton6.setIconTextGap(8);
        jButton6.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        desktop1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 180, 20));

        jButton7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton7.setText("       Search Citizens");
        jButton7.setToolTipText("View all Student");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusable(false);
        jButton7.setIconTextGap(8);
        jButton7.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        desktop1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, -1));

        jButton8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton8.setText("Log Off");
        jButton8.setToolTipText("View all Schools");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusable(false);
        jButton8.setIconTextGap(8);
        jButton8.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        desktop1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 20));

        jButton9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton9.setText("       View Crime History");
        jButton9.setToolTipText("Log off");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusable(false);
        jButton9.setIconTextGap(8);
        jButton9.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        desktop1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 40));

        jButton10.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton10.setText("   Exit");
        jButton10.setToolTipText("Log off");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusable(false);
        jButton10.setIconTextGap(8);
        jButton10.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton10MouseExited(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        desktop1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 180, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/pic.png"))); // NOI18N
        desktop1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 180, 40));

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        desktop1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 148, 480));

        jButton11.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton11.setText("   Log off");
        jButton11.setToolTipText("Log off");
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusable(false);
        jButton11.setIconTextGap(8);
        jButton11.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton11MouseExited(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        desktop1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 20));

        jButton12.setFont(new java.awt.Font("Tempus Sans ITC", 0, 16)); // NOI18N
        jButton12.setText("   Log off");
        jButton12.setToolTipText("Log off");
        jButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusable(false);
        jButton12.setIconTextGap(8);
        jButton12.setMargin(new java.awt.Insets(4, 23, 2, 14));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton12MouseExited(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        desktop1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(936, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(Color.RED);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(Color.RED);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setForeground(Color.RED);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setForeground(Color.RED);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
       jButton5.setForeground(Color.RED);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setForeground(Color.RED);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setForeground(Color.RED);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        jButton8.setForeground(Color.RED);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        jButton8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        jButton9.setForeground(Color.RED);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        jButton9.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                RegJFrame reg = new RegJFrame(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                EditReg reg = new EditReg(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ProfileOffence reg = new ProfileOffence(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                EditCitizenCrime reg = new EditCitizenCrime(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                SearchCitizenCrime reg = new SearchCitizenCrime(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to Quit Window?");
        if (result == JOptionPane.YES_OPTION)
            System.exit(0);
        else {
            int keepOpen = WindowConstants.DO_NOTHING_ON_CLOSE;
            setDefaultCloseOperation(keepOpen);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                SearchCitizenPage reg = new SearchCitizenPage();
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to Log Off?");
        if (result == JOptionPane.YES_OPTION){
            this.dispose();
            this.hide();
            new MainPage().setVisible(true);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Thread runner = new Thread() {

            public void run() {
                SearchCrimePage reg=new SearchCrimePage(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Thread runner = new Thread() {

            public void run() {
                ViewOffences reg=new ViewOffences(PoliceMenuPage.this);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseEntered

    private void jButton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to Quit Window?");
        if (result == JOptionPane.YES_OPTION)
            System.exit(0);
        else {
            int keepOpen = WindowConstants.DO_NOTHING_ON_CLOSE;
            setDefaultCloseOperation(keepOpen);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseEntered

    private void jButton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12MouseExited

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseExited

    private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseEntered

public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PoliceMenuPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel contentPanel;
    public static javax.swing.JDesktopPane desktop1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
