/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Random;
import javax.swing.JProgressBar;
import javax.swing.Painter;
import javax.swing.SwingUtilities;

/**
 *
 * @author SHANMA
 */
public class Splash extends javax.swing.JFrame {
    private Image img2;
    Task task;
    String me= "false";

    public Splash() {
        initComponents();
    }
    public void me(){
        if(me.equals("true")){
            this.dispose();
            this.hide();
            this.setCursor(Cursor.DEFAULT_CURSOR);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        outPutTextarea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 12, 92));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/ajax-loader5.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        outPutTextarea.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        outPutTextarea.setForeground(new java.awt.Color(255, 255, 255));
        outPutTextarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outPutTextarea.setText("Please Wait,  Program Loading...");
        outPutTextarea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(outPutTextarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/download.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 30, 230, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Task().start();
    }//GEN-LAST:event_formWindowOpened
    public class MyPainter implements Painter<JProgressBar> {
        Color color;
        public MyPainter(Color c1){
            this.color=c1;
        }
        @Override
        public void paint(Graphics2D gd, JProgressBar t, int i, int i1) {
            gd.setColor(color);
            gd.fillRect( 0, 0,i, i1);
            //throw new UnsupportedOperationException("Not supported yet.");
            
        }
}
private class Task extends Thread{
    int i;
    String check="false";
    public Task(){
         
    }
    public void run(){
        Random rand =new Random();
        int a= rand.nextInt(30);
        for(i=0; i<=100; i+=a){
            a =rand.nextInt(30);
            final int progress=i;
            SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                try{
                    if(i==100){
                        outPutTextarea.setForeground(Color.GRAY);
                        outPutTextarea.setText("Loading Completed, Opening Project...");
                        check= "true";
                    }else{
                        outPutTextarea.setText(String.format("Loading Project, %d%% Completed ", progress));
                        check= "false";
                    }  
                }catch(Exception ex){
                    
                }  
            }
            });
            try{
                if(check.equals("false")){
                    Thread.sleep(440);
                }else if(check.equals("true")){
                    Thread.sleep(3000);
                }
                
            }catch(Exception e){}
            
        }
        me= "true";
        new MainPage().setVisible(true);
        me();
   }
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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel outPutTextarea;
    // End of variables declaration//GEN-END:variables
}
