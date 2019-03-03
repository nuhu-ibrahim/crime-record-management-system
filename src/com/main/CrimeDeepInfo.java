package com.main;

import com.dataStructures.DBConnection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CrimeDeepInfo extends javax.swing.JDialog {
    
    SearchCitizenCrime main;
    public CrimeDeepInfo(java.awt.Frame parent, boolean modal, String NIN, SearchCitizenCrime main, String crimeName, String crimeStatus, String reportDate, String occDate) {
        super(parent, modal);
        this.main = main;
        initComponents();
        try{
            String sql="select * from crimetbl,citizeninfo where crimetbl.NIN='"+NIN+"' AND crime_name='"+crimeName+"' AND crime_status='"+crimeStatus+"' AND report_date='"+reportDate+"' AND occurence_date='"+occDate+"' AND crimetbl.NIN = citizeninfo.NIN";
            DBConnection.rs=DBConnection.st.executeQuery(sql);
            if(DBConnection.rs.next()){
                this.NIN.setText(NIN);
                this.address.setText(DBConnection.rs.getString("address"));
                this.dob.setDate(new java.util.Date(DBConnection.rs.getString("dob").replaceAll("-", "/")));
                
                Icon iicon= new ImageIcon(DBConnection.rs.getString("passport"));
                me1.setIcon(iicon);
                
                fullName.setText(DBConnection.rs.getString("fname") + (DBConnection.rs.getString("mname") == "" ? " ": " "+DBConnection.rs.getString("mname")+" ") + DBConnection.rs.getString("lname"));
                this.crimeName.setText(DBConnection.rs.getString("crime_name"));
                this.crimeStatus.setText(DBConnection.rs.getString("crime_status"));
                this.reportDate.setDate(new java.util.Date(DBConnection.rs.getString("report_date").replaceAll("-", "/")));
                this.occDate.setDate(new java.util.Date(DBConnection.rs.getString("occurence_date").replaceAll("-", "/")));
                crimeLocation.setText(DBConnection.rs.getString("crime_locatiom"));
                complainantNIN.setText(DBConnection.rs.getString("complainant_ID"));
                complainantComment.setText(DBConnection.rs.getString("complainant_comment"));
                evidence_info.setText(DBConnection.rs.getString("evidence_info"));
                DPO_comment.setText(DBConnection.rs.getString("DPO_comment"));
                crime_id = DBConnection.rs.getInt("crime_id");
                
                sql="select * from court_info where crime_id = "+crime_id;
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    view_court_judgement.setEnabled(true);
                }else{
                    view_court_judgement.setEnabled(false);
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/com/images/png/glyphicons-197-exclamation-sign.png")));
        }
    }
    
    SearchCrimePage main2;
    int crime_id;
    public CrimeDeepInfo(java.awt.Frame parent, boolean modal, String NIN, SearchCrimePage main2, String crimeName, String crimeStatus, String reportDate, String occDate) {
        super(parent, modal);
        this.main2 = main2;
        initComponents();
        try{
            String sql="select * from crimetbl,citizeninfo where crimetbl.NIN='"+NIN+"' AND crime_name='"+crimeName+"' AND crime_status='"+crimeStatus+"' AND report_date='"+reportDate+"' AND occurence_date='"+occDate+"' AND crimetbl.NIN = citizeninfo.NIN";
            DBConnection.rs=DBConnection.st.executeQuery(sql);
            if(DBConnection.rs.next()){
                this.NIN.setText(NIN);
                this.address.setText(DBConnection.rs.getString("address"));
                this.dob.setDate(new java.util.Date(DBConnection.rs.getString("dob").replaceAll("-", "/")));
                
                Icon iicon= new ImageIcon(DBConnection.rs.getString("passport"));
                me1.setIcon(iicon);
                
                fullName.setText(DBConnection.rs.getString("fname") + (DBConnection.rs.getString("mname") == "" ? " ": " "+DBConnection.rs.getString("mname")+" ") + DBConnection.rs.getString("lname"));
                this.crimeName.setText(DBConnection.rs.getString("crime_name"));
                this.crimeStatus.setText(DBConnection.rs.getString("crime_status"));
                this.reportDate.setDate(new java.util.Date(DBConnection.rs.getString("report_date").replaceAll("-", "/")));
                this.occDate.setDate(new java.util.Date(DBConnection.rs.getString("occurence_date").replaceAll("-", "/")));
                crimeLocation.setText(DBConnection.rs.getString("crime_locatiom"));
                complainantNIN.setText(DBConnection.rs.getString("complainant_ID"));
                complainantComment.setText(DBConnection.rs.getString("complainant_comment"));
                evidence_info.setText(DBConnection.rs.getString("evidence_info"));
                DPO_comment.setText(DBConnection.rs.getString("DPO_comment"));
                crime_id = DBConnection.rs.getInt("crime_id");
                
                sql="select * from court_info where crime_id = "+crime_id;
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    view_court_judgement.setEnabled(true);
                }else{
                    view_court_judgement.setEnabled(false);
                }
            } 
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/com/images/png/glyphicons-197-exclamation-sign.png")));
        }
    }
    
    ViewOffences main3;
    public CrimeDeepInfo(java.awt.Frame parent, boolean modal, String NIN, ViewOffences main3, String crimeName, String crimeStatus, String reportDate, String occDate) {
        super(parent, modal);
        this.main3 = main3;
        initComponents();
        try{
            String sql="select * from crimetbl,citizeninfo where crimetbl.NIN='"+NIN+"' AND crime_name='"+crimeName+"' AND crime_status='"+crimeStatus+"' AND report_date='"+reportDate+"' AND occurence_date='"+occDate+"' AND crimetbl.NIN = citizeninfo.NIN";
            DBConnection.rs=DBConnection.st.executeQuery(sql);
            if(DBConnection.rs.next()){
                this.NIN.setText(NIN);
                this.address.setText(DBConnection.rs.getString("address"));
                this.dob.setDate(new java.util.Date(DBConnection.rs.getString("dob").replaceAll("-", "/")));
                
                Icon iicon= new ImageIcon(DBConnection.rs.getString("passport"));
                me1.setIcon(iicon);
                
                fullName.setText(DBConnection.rs.getString("fname") + (DBConnection.rs.getString("mname") == "" ? " ": " "+DBConnection.rs.getString("mname")+" ") + DBConnection.rs.getString("lname"));
                this.crimeName.setText(DBConnection.rs.getString("crime_name"));
                this.crimeStatus.setText(DBConnection.rs.getString("crime_status"));
                this.reportDate.setDate(new java.util.Date(DBConnection.rs.getString("report_date").replaceAll("-", "/")));
                this.occDate.setDate(new java.util.Date(DBConnection.rs.getString("occurence_date").replaceAll("-", "/")));
                crimeLocation.setText(DBConnection.rs.getString("crime_locatiom"));
                complainantNIN.setText(DBConnection.rs.getString("complainant_ID"));
                complainantComment.setText(DBConnection.rs.getString("complainant_comment"));
                evidence_info.setText(DBConnection.rs.getString("evidence_info"));
                DPO_comment.setText(DBConnection.rs.getString("DPO_comment"));
                crime_id = DBConnection.rs.getInt("crime_id");
                
                sql="select * from court_info where crime_id = "+crime_id;
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    view_court_judgement.setEnabled(true);
                }else{
                    view_court_judgement.setEnabled(false);
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
        us = new javax.swing.JPanel();
        me = new javax.swing.JLabel();
        me1 = new javax.swing.JLabel();
        NIN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        view_court_judgement = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        fullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crimeName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        complainantNIN = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        complainantComment = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        crimeLocation = new javax.swing.JTextField();
        occDate = new com.toedter.calendar.JDateChooser();
        reportDate = new com.toedter.calendar.JDateChooser();
        crimeStatus = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        evidence_info = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        DPO_comment = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(709, 555));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OFFENCE INFORMATION PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        us.setBackground(new java.awt.Color(255, 255, 255));
        us.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        us.setMaximumSize(new java.awt.Dimension(150, 150));
        us.setMinimumSize(new java.awt.Dimension(150, 150));
        us.setPreferredSize(new java.awt.Dimension(150, 150));
        us.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        us.add(me, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        us.add(me1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        NIN.setEditable(false);
        NIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel3.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 370, 26));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("NIN");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Address");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        address.setEditable(false);
        address.setColumns(24);
        address.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        address.setLineWrap(true);
        address.setRows(2);
        address.setTabSize(5);
        address.setEnabled(false);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 370, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Date of Birth");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        view_court_judgement.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        view_court_judgement.setText("View Court Judgement");
        view_court_judgement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        view_court_judgement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_court_judgementActionPerformed(evt);
            }
        });
        jPanel3.add(view_court_judgement, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 230, 35));

        dob.setEnabled(false);
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 220, 25));

        fullName.setEditable(false);
        fullName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel3.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 370, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Citizen full name ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Crime status");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        crimeName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        crimeName.setEnabled(false);
        jPanel3.add(crimeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 370, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Crime location");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Crime Occurence Date");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Complainant Comment");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        complainantNIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        complainantNIN.setEnabled(false);
        jPanel3.add(complainantNIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 370, 26));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Crime Name");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        complainantComment.setColumns(24);
        complainantComment.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        complainantComment.setLineWrap(true);
        complainantComment.setRows(2);
        complainantComment.setTabSize(5);
        complainantComment.setEnabled(false);
        jScrollPane3.setViewportView(complainantComment);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 370, 70));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 0));
        jLabel19.setText("Compainant NIN");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Crime Report Date");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        crimeLocation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        crimeLocation.setEnabled(false);
        jPanel3.add(crimeLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 370, -1));

        occDate.setEnabled(false);
        jPanel3.add(occDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 220, 25));

        reportDate.setEnabled(false);
        jPanel3.add(reportDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 220, 25));

        crimeStatus.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        crimeStatus.setEnabled(false);
        jPanel3.add(crimeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 370, -1));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 80, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Evidences Information");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("DPO's Comment");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        evidence_info.setColumns(24);
        evidence_info.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        evidence_info.setLineWrap(true);
        evidence_info.setRows(2);
        evidence_info.setTabSize(5);
        evidence_info.setEnabled(false);
        jScrollPane2.setViewportView(evidence_info);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 370, 70));

        DPO_comment.setColumns(24);
        DPO_comment.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        DPO_comment.setLineWrap(true);
        DPO_comment.setRows(2);
        DPO_comment.setTabSize(5);
        DPO_comment.setEnabled(false);
        jScrollPane4.setViewportView(DPO_comment);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 370, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_court_judgementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_court_judgementActionPerformed
        if(main != null){
            ViewCourtInformation c= new ViewCourtInformation(main.main, true, NIN.getText().trim(), crime_id);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
        }else if(main2 != null){
            ViewCourtInformation c= new ViewCourtInformation(main2.main, true, NIN.getText().trim(), crime_id);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
        }else if(main3 != null){
            ViewCourtInformation c= new ViewCourtInformation(main3.main, true, NIN.getText().trim(), crime_id);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
        }
    }//GEN-LAST:event_view_court_judgementActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.hide();
        this.dispose();
        if(main != null){
            if(main.main != null){
                main.main.unblur();
            }else if(main.main2 != null){
                main.main2.unblur();
            }
        }else if(main2 != null){
            if(main2.main != null){
                main2.main.unblur();
            }else if(main2.main2 != null){
                main2.main2.unblur();
            }
        }else if(main3 != null){
            if(main3.main != null){
                main3.main.unblur();
            }else if(main3.main2 != null){
                main3.main2.unblur();
            }
        }
    }//GEN-LAST:event_closeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea DPO_comment;
    private javax.swing.JTextField NIN;
    public static javax.swing.JTextArea address;
    private javax.swing.JButton close;
    public static javax.swing.JTextArea complainantComment;
    private javax.swing.JTextField complainantNIN;
    private javax.swing.JTextField crimeLocation;
    private javax.swing.JTextField crimeName;
    private javax.swing.JTextField crimeStatus;
    private com.toedter.calendar.JDateChooser dob;
    public static javax.swing.JTextArea evidence_info;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel me;
    private javax.swing.JLabel me1;
    private com.toedter.calendar.JDateChooser occDate;
    private com.toedter.calendar.JDateChooser reportDate;
    private javax.swing.JPanel us;
    private javax.swing.JButton view_court_judgement;
    // End of variables declaration//GEN-END:variables
}
