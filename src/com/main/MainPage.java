package com.main;

import com.dataStructures.DBConnection;
import java.util.Random;
import javax.swing.JFrame;

public class MainPage extends javax.swing.JFrame {

    public static String userType;
    public MainPage() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        DBConnection.connect();
        initComponents();
        valLogin.setVisible(false);
        valDot2.setVisible(false);
        valDot1.setVisible(false);
    }
  
    public void student(){
        this.dispose();
        this.hide();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        uDemo = new javax.swing.JLabel();
        pDemo = new javax.swing.JLabel();
        perfCred = new javax.swing.JButton();
        pText = new javax.swing.JPasswordField();
        uText = new javax.swing.JTextField();
        iconm = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valDot2 = new javax.swing.JLabel();
        valLogin = new javax.swing.JLabel();
        valDot1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentPanel.setBackground(new java.awt.Color(204, 204, 255));
        contentPanel.setPreferredSize(new java.awt.Dimension(719, 422));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/SP.jpg"))); // NOI18N
        contentPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 85, 116));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uDemo.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        uDemo.setForeground(new java.awt.Color(0, 0, 102));
        uDemo.setText("Username");
        jPanel1.add(uDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 97, 130, 20));

        pDemo.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        pDemo.setForeground(new java.awt.Color(0, 0, 102));
        pDemo.setText("Password");
        jPanel1.add(pDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 147, 130, 20));

        perfCred.setBackground(new java.awt.Color(44, 168, 44));
        perfCred.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        perfCred.setForeground(new java.awt.Color(0, 0, 102));
        perfCred.setText("Login");
        perfCred.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        perfCred.setMaximumSize(new java.awt.Dimension(61, 30));
        perfCred.setMinimumSize(new java.awt.Dimension(61, 30));
        perfCred.setPreferredSize(new java.awt.Dimension(61, 30));
        perfCred.setSelected(true);
        perfCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfCredActionPerformed(evt);
            }
        });
        jPanel1.add(perfCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 100, 33));

        pText.setBackground(new java.awt.Color(44, 168, 44));
        pText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pText.setForeground(new java.awt.Color(255, 255, 255));
        pText.setText("ADMIN");
        pText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        pText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pTextMouseClicked(evt);
            }
        });
        pText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pTextFocusLost(evt);
            }
        });
        pText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pTextKeyReleased(evt);
            }
        });
        jPanel1.add(pText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 30));

        uText.setBackground(new java.awt.Color(44, 168, 44));
        uText.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        uText.setForeground(new java.awt.Color(255, 255, 255));
        uText.setText("ADMIN");
        uText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        uText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uTextMouseClicked(evt);
            }
        });
        uText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uTextFocusLost(evt);
            }
        });
        uText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uTextKeyReleased(evt);
            }
        });
        jPanel1.add(uText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 30));
        jPanel1.add(iconm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 50, -1));

        message.setBackground(new java.awt.Color(255, 255, 255));
        message.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        message.setForeground(new java.awt.Color(0, 102, 0));
        message.setText("Validating User...");
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 270, 30));

        jLabel2.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Forgot Password?. Please contact an administrator");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 460, -1));

        valDot2.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        valDot2.setForeground(new java.awt.Color(0, 0, 102));
        valDot2.setText("...");
        jPanel1.add(valDot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 40, -1));

        valLogin.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        valLogin.setForeground(new java.awt.Color(0, 0, 102));
        valLogin.setText("Validating login details");
        jPanel1.add(valLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 510, -1));

        valDot1.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        valDot1.setForeground(new java.awt.Color(0, 0, 102));
        valDot1.setText("...");
        jPanel1.add(valDot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 40, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/dw.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Untitled.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        contentPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 186, 540, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Untitled.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        contentPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        getContentPane().add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 710, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Untitled.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTextMouseClicked
        pDemo.setVisible(false);
        //if(!pText.getText().equals(""))
        //pText.setHighlighter();

    }//GEN-LAST:event_pTextMouseClicked

    private void pTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pTextFocusGained
        if(pText.getText().equals(""))
        pDemo.setVisible(true);
        else
        pDemo.setVisible(false);
    }//GEN-LAST:event_pTextFocusGained

    private void pTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pTextFocusLost
        if(pText.getText().equals(""))
        pDemo.setVisible(true);
        else
        pDemo.setVisible(false);
    }//GEN-LAST:event_pTextFocusLost

    private void pTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pTextKeyReleased
        if(pText.getText().equals(""))
        pDemo.setVisible(true);
        else
        pDemo.setVisible(false);
    }//GEN-LAST:event_pTextKeyReleased

    private void uTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uTextMouseClicked
        uDemo.setVisible(false);
        //if(!uText.getText().equals(""))
        //uText.setHighlighter();
        //Highlight
    }//GEN-LAST:event_uTextMouseClicked

    private void uTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uTextFocusGained
        if(uText.getText().equals(""))
        uDemo.setVisible(true);
        else
        uDemo.setVisible(false);
    }//GEN-LAST:event_uTextFocusGained

    private void uTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uTextFocusLost
        if(uText.getText().equals(""))
        uDemo.setVisible(true);
        else
        uDemo.setVisible(false);
    }//GEN-LAST:event_uTextFocusLost

    private void uTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uTextKeyReleased
        if(uText.getText().equals(""))
        uDemo.setVisible(true);
        else
        uDemo.setVisible(false);
    }//GEN-LAST:event_uTextKeyReleased

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if(uText.getText().equals(""))
            uDemo.setVisible(true);
        else
            uDemo.setVisible(false);
        if(pText.getText().equals(""))
            pDemo.setVisible(true);
        else
            pDemo.setVisible(false);
    }//GEN-LAST:event_formMouseMoved

    private void perfCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfCredActionPerformed
        valLogin.setForeground(new java.awt.Color(0,0,102));
        valLogin.setText("Validating login details");
        valLogin.setVisible(true);
        valDot1.setText(".");
        valDot1.setVisible(false);
        valDot2.setVisible(false);
        Thread runner = new Thread(){
            public void run() {
                try{
                    Random rand= new Random();
                    int a=rand.nextInt(15);
                    for(int i=0; i<=a;i++){
                        Thread.sleep(500);
                        if(valDot1.getText().equals(".")){
                            valLogin.setText("Validating login details.");
                            valDot1.setText("..");
                        }else if(valDot1.getText().equals("..")){
                            valLogin.setText("Validating login details..");
                            valDot1.setText("...");
                        }else if(valDot1.getText().equals("...")){
                            valLogin.setText("Validating login details...");
                            valDot1.setText(".");
                        }
                    }
                    String pass="empty";
                    String user="empty";
                    String sql1= "select * from usertbl where Username='"+uText.getText()+"'";
                    DBConnection.rs= DBConnection.st.executeQuery(sql1);
                    if(DBConnection.rs.next()){
                        pass=DBConnection.rs.getString("Password");
                        user=DBConnection.rs.getString("Username");
                        userType=DBConnection.rs.getString("Usertype");
                    }
                    if(uText.getText().equals("") || pText.getText().equals("")){
                        valLogin.setForeground(new java.awt.Color(248, 90, 43));
                        valLogin.setText("The username or password is incorrect");
                        valDot1.setVisible(false);
                        valDot2.setVisible(false);
                    }else if (pass.equals(pText.getText()) && user.equalsIgnoreCase(uText.getText())){
                        valLogin.setForeground(new java.awt.Color(0,0,102));
                        valLogin.setText("Welcome, loading");
                        try{
                            valLogin.setVisible(true);
                            valDot2.setVisible(false);
                            valDot1.setVisible(false);
                            //Put dot readings here
                            Random rand2= new Random();
                            int ab=rand2.nextInt(15);
                            for(int i=0; i<=ab;i++){
                                Thread.sleep(500);
                                if(valDot2.getText().equals(".")){
                                    valLogin.setText("Welcome, loading.");
                                    valDot2.setText("..");
                                }else if(valDot2.getText().equals("..")){
                                    valLogin.setText("Welcome, loading..");
                                    valDot2.setText("...");
                                }else if(valDot2.getText().equals("...")){
                                    valLogin.setText("Welcome, loading...");
                                    valDot2.setText(".");
                                }
                            }
                            if(userType.equals("ROLE_POLICE")){
                                new PoliceMenuPage().setVisible(true);
                            }else{
                                new CourtMenuPage().setVisible(true);
                            }
                            
                            here();
                            
                        } catch (Exception e) {
                        }
                        
                    }else{
                        valLogin.setForeground(new java.awt.Color(248, 90, 43));
                        valLogin.setText("The username or password is incorrect");
                        valDot1.setVisible(false);
                        valDot2.setVisible(false);
                    }
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_perfCredActionPerformed
    public void here(){
        this.dispose();
        this.hide();
    }
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    public static javax.swing.JLabel iconm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel message;
    private javax.swing.JLabel pDemo;
    private javax.swing.JPasswordField pText;
    public static javax.swing.JButton perfCred;
    private javax.swing.JLabel uDemo;
    public static javax.swing.JTextField uText;
    private javax.swing.JLabel valDot1;
    private javax.swing.JLabel valDot2;
    private javax.swing.JLabel valLogin;
    // End of variables declaration//GEN-END:variables
}
