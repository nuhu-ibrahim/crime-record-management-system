package com.main;

import com.dataStructures.DBConnection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class EditCrimeInfo extends javax.swing.JDialog {

    String crimeName1; String crimeStatus1; String rdate1; String odate1;
    EditCitizenCrime main;
    PoliceMenuPage mainmenu;
    
    public EditCrimeInfo(java.awt.Frame parent, PoliceMenuPage mainmenu, boolean modal, String NIN, EditCitizenCrime main, String crimeName, String crimeStatus, String reportDate, String occDate) {
        super(parent, modal);
        this.mainmenu= mainmenu;
        this.main = main;
        initComponents();
        try{
            crimeName1= crimeName; 
            crimeStatus1=crimeStatus; 
            rdate1=reportDate; 
            odate1=occDate;
            
            String sql="select * from crimetbl,citizeninfo where crimetbl.NIN='"+NIN+"' AND crime_name='"+crimeName+"' AND crime_status='"+crimeStatus+"' AND report_date='"+reportDate+"' AND occurence_date='"+occDate+"' AND crimetbl.NIN = citizeninfo.NIN";
            DBConnection.rs=DBConnection.st.executeQuery(sql);
            if(DBConnection.rs.next()){
                this.NIN.setText(NIN);
                fullName.setText(DBConnection.rs.getString("fname") + (DBConnection.rs.getString("mname") == "" ? " ": " "+DBConnection.rs.getString("mname")+" ") + DBConnection.rs.getString("lname"));
                this.crimeName.setText(DBConnection.rs.getString("crime_name"));
                this.crime_status.setText(DBConnection.rs.getString("crime_status"));
                this.reportDate.setDate(new java.util.Date(DBConnection.rs.getString("report_date").replaceAll("-", "/")));
                this.occDate.setDate(new java.util.Date(DBConnection.rs.getString("occurence_date").replaceAll("-", "/")));
                crimeLocation.setText(DBConnection.rs.getString("crime_locatiom"));
                complainantNIN.setText(DBConnection.rs.getString("complainant_ID"));
                complainantComment.setText(DBConnection.rs.getString("complainant_comment"));
                evidence_info.setText(DBConnection.rs.getString("evidence_info"));
                DPO_comment.setText(DBConnection.rs.getString("DPO_comment"));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/com/images/png/glyphicons-197-exclamation-sign.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        close = new javax.swing.JButton();
        fullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crimeName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        complainantNIN = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complainantComment = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        crimeLocation = new javax.swing.JTextField();
        occDate = new com.toedter.calendar.JDateChooser();
        reportDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        NIN = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        evidence_info = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DPO_comment = new javax.swing.JTextArea();
        crime_status = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setPreferredSize(new java.awt.Dimension(709, 524));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT CITIZEN CRIME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Update the Information");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel2.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 250, 35));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 80, 35));

        fullName.setEditable(false);
        fullName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 370, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Citizen full name ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Crime status");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        crimeName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(crimeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 370, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Crime location");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Crime Occurence Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Complainant Comment");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        complainantNIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(complainantNIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 370, 26));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Crime Name");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        complainantComment.setColumns(24);
        complainantComment.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        complainantComment.setLineWrap(true);
        complainantComment.setRows(2);
        complainantComment.setTabSize(5);
        jScrollPane1.setViewportView(complainantComment);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 370, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Compainant NIN");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Crime Report Date");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        crimeLocation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(crimeLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 370, -1));
        jPanel2.add(occDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 220, 25));
        jPanel2.add(reportDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 220, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("NIN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, -1));

        NIN.setEditable(false);
        NIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 370, -1));

        evidence_info.setColumns(24);
        evidence_info.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        evidence_info.setLineWrap(true);
        evidence_info.setRows(2);
        evidence_info.setTabSize(5);
        jScrollPane2.setViewportView(evidence_info);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 370, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Evidences Information");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("DPO's Comment");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        DPO_comment.setColumns(24);
        DPO_comment.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        DPO_comment.setLineWrap(true);
        DPO_comment.setRows(2);
        DPO_comment.setTabSize(5);
        jScrollPane3.setViewportView(DPO_comment);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 370, 70));

        crime_status.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        crime_status.setEnabled(false);
        jPanel2.add(crime_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 370, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if(fullName.getText().trim().equals("") || crimeName.getText().trim().equals("")||
            reportDate.getDate() == null ||
            crime_status.getText().equals("") || complainantNIN.getText().trim().equals("")||
            complainantComment.getText().trim().equals("") ||
            occDate.getDate() == null || crimeLocation.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                ValidateCitizenBiometricUpdateCrime c= new ValidateCitizenBiometricUpdateCrime(mainmenu, true, NIN.getText().trim(), EditCrimeInfo.this);
                c.setLocationRelativeTo(null);
                c.setVisible(true); 
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertActionPerformed

    public void update(){
        try{
            PreparedStatement st;

            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String rdate = ft.format(reportDate.getDate());
            String odate = ft.format(occDate.getDate());
            String sql1="update crimetbl set "
                    + "crime_name=?, crime_status=?, report_date=?, occurence_date=?, crime_locatiom=?, complainant_ID=?, complainant_comment=?, evidence_info=?, DPO_comment=? "
                    + "where crimetbl.NIN=? AND crime_name=? AND crime_status=? AND report_date=? AND occurence_date=?";
            st = DBConnection.con.prepareStatement(sql1);

            st.setString(1, crimeName.getText().trim());
            st.setString(2, ""+crime_status.getText());
            st.setString(3, rdate);
            st.setString(4, odate);
            st.setString(5, crimeLocation.getText());
            st.setString(6, complainantNIN.getText());
            st.setString(7, complainantComment.getText().trim());
            st.setString(8, evidence_info.getText());
            st.setString(9, DPO_comment.getText().trim());
            st.setString(10, NIN.getText().trim());
            st.setString(11, crimeName1);
            st.setString(12, crimeStatus1);
            st.setString(13, rdate1);
            st.setString(14, odate1);
            st.executeUpdate();

            JOptionPane.showMessageDialog(this, "Citizen Crime Information succesfully Updated","Information!",JOptionPane.INFORMATION_MESSAGE);

            main.unblur();
            this.hide();
            this.dispose();

            main.createTable();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        main.unblur();
        this.hide();
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    public String ucfirst(String s){
        try{
            String first, second;
            first=s.substring(0,1);
            second=s.substring(1);
            return first.toUpperCase()+second.toLowerCase();
        }catch(Exception ex){
            return "";
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea DPO_comment;
    private javax.swing.JTextField NIN;
    private javax.swing.JButton close;
    public static javax.swing.JTextArea complainantComment;
    private javax.swing.JTextField complainantNIN;
    private javax.swing.JTextField crimeLocation;
    private javax.swing.JTextField crimeName;
    private javax.swing.JTextField crime_status;
    public static javax.swing.JTextArea evidence_info;
    private javax.swing.JTextField fullName;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser occDate;
    private com.toedter.calendar.JDateChooser reportDate;
    // End of variables declaration//GEN-END:variables
}
