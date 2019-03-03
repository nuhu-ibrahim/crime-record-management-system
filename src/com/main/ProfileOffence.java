package com.main;


import com.dataStructures.DBConnection;
import static com.main.PoliceMenuPage.contentPanel;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class ProfileOffence extends javax.swing.JPanel {

    PoliceMenuPage main;
    public ProfileOffence(PoliceMenuPage main) {
        this.main = main;
        DBConnection.connect();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        insert = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NIN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        validate = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        crimeLocation = new javax.swing.JTextField();
        occDate = new com.toedter.calendar.JDateChooser();
        reportDate = new com.toedter.calendar.JDateChooser();
        case_status = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        evidence_info = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DPO_comment = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(709, 649));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROFILE CITIZEN CRIME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        fullName.setEditable(false);
        fullName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 370, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Citizen full name ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Case status");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        crimeName.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(crimeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 370, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Crime location");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Crime Occurence Date");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Complainant Comment");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        complainantNIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(complainantNIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 370, 26));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Crime Name");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        complainantComment.setColumns(24);
        complainantComment.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        complainantComment.setLineWrap(true);
        complainantComment.setRows(2);
        complainantComment.setTabSize(5);
        jScrollPane1.setViewportView(complainantComment);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 370, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Compainant NIN");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Insert the Crime Information");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        insert.setEnabled(false);
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 250, 35));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 80, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("NIN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        refresh.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 30));

        validate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        validate.setText("Validate NIN");
        validate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel2.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 370, 80));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Crime Report Date");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        crimeLocation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(crimeLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 370, -1));
        add(occDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 220, 25));
        add(reportDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 25));

        case_status.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        case_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Status", "Granted Bail", "Sent to Court" }));
        add(case_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Evidences Information");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        evidence_info.setColumns(24);
        evidence_info.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        evidence_info.setLineWrap(true);
        evidence_info.setRows(2);
        evidence_info.setTabSize(5);
        jScrollPane2.setViewportView(evidence_info);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 370, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("DPO's Comment");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        DPO_comment.setColumns(24);
        DPO_comment.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        DPO_comment.setLineWrap(true);
        DPO_comment.setRows(2);
        DPO_comment.setTabSize(5);
        jScrollPane3.setViewportView(DPO_comment);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 370, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if(fullName.getText().trim().equals("") || crimeName.getText().trim().equals("")||
            reportDate.getDate() == null || evidence_info.getText().trim().equals("")||
            case_status.getSelectedIndex() == 0 || complainantNIN.getText().trim().equals("")||
            complainantComment.getText().trim().equals("") || DPO_comment.getText().trim().equals("")||
            occDate.getDate() == null || crimeLocation.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to save crime?", "Confirmation!", JOptionPane.YES_NO_OPTION);
                if(confirm == 0){
                    main.blur();
                    ValidateCitizenBiometricProfileCrime c= new ValidateCitizenBiometricProfileCrime(main, true, NIN.getText().trim(), ProfileOffence.this);
                    c.setLocationRelativeTo(null);
                    c.setVisible(true); 
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertActionPerformed

    public void insert(){
        try{
            PreparedStatement st;

            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String rdate = ft.format(reportDate.getDate());
            String odate = ft.format(occDate.getDate());
            String sql1="insert into crimetbl (NIN, crime_name, crime_status, report_date, occurence_date, crime_locatiom, complainant_ID, complainant_comment, evidence_info, DPO_comment) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            st = DBConnection.con.prepareStatement(sql1);
            st.setString(1, NIN.getText().trim());
            st.setString(2, crimeName.getText().trim());
            st.setString(3, case_status.getSelectedItem()+"");
            st.setString(4, rdate);
            st.setString(5, odate);
            st.setString(6, crimeLocation.getText());
            st.setString(7, complainantNIN.getText());
            st.setString(8, complainantComment.getText().trim());
            st.setString(9, evidence_info.getText().trim());
            st.setString(10, DPO_comment.getText().trim());

            st.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Citizen Crime Information succesfully Uploaded","Offender registered",JOptionPane.INFORMATION_MESSAGE);
            refresh();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        contentPanel.removeAll();
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    public void refresh(){
        ProfileOffence reg = new ProfileOffence(main);
        contentPanel.removeAll();
        JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }
    
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        refresh();
    }//GEN-LAST:event_refreshActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(NIN.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                String sql="select * from citizeninfo where NIN='"+NIN.getText().trim()+"'";
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    //Update all fields and passport
                    validate.setEnabled(false);
                    insert.setEnabled(true);
                    NIN.setEnabled(false);
                    
                    fullName.setText(DBConnection.rs.getString("fname") + (DBConnection.rs.getString("mname") == "" ? " ": " "+DBConnection.rs.getString("mname")+" ") + DBConnection.rs.getString("lname"));
                }else{
                    JOptionPane.showMessageDialog(this,"Citizen ID does not exist", "Citizen not found", JOptionPane.OK_OPTION);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_validateActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea DPO_comment;
    private javax.swing.JTextField NIN;
    private javax.swing.JComboBox case_status;
    private javax.swing.JButton close;
    public static javax.swing.JTextArea complainantComment;
    private javax.swing.JTextField complainantNIN;
    private javax.swing.JTextField crimeLocation;
    private javax.swing.JTextField crimeName;
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
    private javax.swing.JButton refresh;
    private com.toedter.calendar.JDateChooser reportDate;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
