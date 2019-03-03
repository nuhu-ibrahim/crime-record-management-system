package com.main;

import com.dataStructures.DBConnection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProfileCourtInformation extends javax.swing.JDialog {

    int crime_id;
    public ProfileCourtInformation(java.awt.Frame parent, boolean modal, String NIN, int crime_id) {
        super(parent, modal);
        this.crime_id = crime_id;
        initComponents();
        try{
            String sql="select * from court_info, crimetbl where court_info.crime_id = "+crime_id+" AND court_info.crime_id = crimetbl.crime_id";
            DBConnection.rs=DBConnection.st.executeQuery(sql);
            if(DBConnection.rs.next()){
                this.NIN.setText(NIN);
                this.crime_name.setText(DBConnection.rs.getString("crime_name"));
                this.judge_descision.setSelectedItem(DBConnection.rs.getString("crime_status"));
                this.judge_name.setText(DBConnection.rs.getString("judge_name"));
                this.judge_desc.setText(DBConnection.rs.getString("judge_decision"));
                this.case_file_address.setText(DBConnection.rs.getString("case_file_address"));
            }else{
                sql="select * from crimetbl where crime_id = "+crime_id;
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    this.NIN.setText(NIN);
                    this.crime_name.setText(DBConnection.rs.getString("crime_name"));
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/com/images/png/glyphicons-197-exclamation-sign.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NIN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        judge_desc = new javax.swing.JTextArea();
        judge_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        crime_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        close1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        case_file_address = new javax.swing.JTextArea();
        close2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        judge_descision = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setEnabled(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(709, 555));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COURT JUDGEMENT INFORMATION PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        NIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        NIN.setEnabled(false);
        jPanel3.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 370, 26));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("NIN");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Judgement Description");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        judge_desc.setColumns(24);
        judge_desc.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        judge_desc.setLineWrap(true);
        judge_desc.setRows(2);
        judge_desc.setTabSize(5);
        jScrollPane1.setViewportView(judge_desc);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 370, 60));

        judge_name.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel3.add(judge_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 370, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Judge Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        crime_name.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        crime_name.setEnabled(false);
        jPanel3.add(crime_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 370, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Crime Name");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        close1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close1.setText("Update Court Information");
        close1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });
        jPanel3.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 250, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Case File Address");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        case_file_address.setColumns(24);
        case_file_address.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        case_file_address.setLineWrap(true);
        case_file_address.setRows(2);
        case_file_address.setTabSize(5);
        jScrollPane2.setViewportView(case_file_address);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 370, 60));

        close2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close2.setText("Close");
        close2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close2ActionPerformed(evt);
            }
        });
        jPanel3.add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 80, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Judgement Decision");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        judge_descision.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        judge_descision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Granted Bail", "Send to Prison" }));
        jPanel3.add(judge_descision, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
        if(judge_name.getText().trim().equals("") || judge_desc.getText().trim().equals("")||
            case_file_address.getText().trim().equals("") || judge_descision.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;

                String sql1="insert into court_info (crime_id, judge_name, judge_decision, case_file_address) values (?, ?, ?, ?)";
                st = DBConnection.con.prepareStatement(sql1);
                st.setInt(1, crime_id);
                st.setString(2, judge_name.getText().trim());
                st.setString(3, judge_desc.getText().trim());
                st.setString(4, case_file_address.getText().trim());
                
                st.executeUpdate();

                sql1="update crimetbl set crime_status = ? where crime_id = ?";
                st = DBConnection.con.prepareStatement(sql1);

                st.setString(1, ""+judge_descision.getSelectedItem());
                st.setInt(2,crime_id);

                st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Judgement Information succesfully Uploaded","Success",JOptionPane.INFORMATION_MESSAGE);
                this.hide();
                this.dispose();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_close1ActionPerformed

    private void close2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close2ActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_close2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIN;
    public static javax.swing.JTextArea case_file_address;
    private javax.swing.JButton close1;
    private javax.swing.JButton close2;
    private javax.swing.JTextField crime_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea judge_desc;
    private javax.swing.JComboBox judge_descision;
    private javax.swing.JTextField judge_name;
    // End of variables declaration//GEN-END:variables
}
