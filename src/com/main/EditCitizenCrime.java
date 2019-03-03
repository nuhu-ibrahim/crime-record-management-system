package com.main;


import com.dataStructures.DBConnection;
import com.dataStructures.MyTable;
import static com.main.PoliceMenuPage.contentPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class EditCitizenCrime extends javax.swing.JPanel {

    public void unblur(){
        main.unblur();
    }
    
    PoliceMenuPage main;
    public EditCitizenCrime(PoliceMenuPage main) {
        this.main = main;
        DBConnection.connect();        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NIN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        contentPan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(730, 432));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH OFFENDER PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        cancel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        cancel.setText("Close");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 80, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("NIN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        search.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        search.setText("Search Offences");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 7, 180, 35));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 590, 50));

        contentPan.setBackground(new java.awt.Color(255, 255, 255));
        contentPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        contentPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        add(contentPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 690, 220));

        jPanel3.setBackground(new java.awt.Color(0, 12, 92));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CITIZEN OFFENCE RESULTS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 540, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 590, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        contentPanel.removeAll();
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed
    public static  String DEFAULT_QUERY;
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(NIN.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
            contentPan.removeAll();
            contentPan.setVisible(false);
            contentPan.setVisible(true);
        }else{
            try{
                String sql="select * from citizeninfo where "
                        + "NIN='"+NIN.getText().trim()+"'";
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    String sql2= "select * from crimetbl where "
                        + "NIN='"+NIN.getText().trim()+"'";
                    DBConnection.rs=DBConnection.st.executeQuery(sql2);
                    if(DBConnection.rs.next()){
                        createTable();
                    }else{
                        JOptionPane.showMessageDialog(this,"Citizen does not have any crime history", "Issue!", JOptionPane.OK_OPTION);
                        contentPan.removeAll();
                        contentPan.setVisible(false);
                        contentPan.setVisible(true);
                    }  
                }else{
                    JOptionPane.showMessageDialog(this, "Citizen not found","Issue!",JOptionPane.OK_OPTION);
                    contentPan.removeAll();
                    contentPan.setVisible(false);
                    contentPan.setVisible(true);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_searchActionPerformed
    
    public void createTable(){
        final JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Crime Name", "Crime Status", "Report Date", "Occurence Date"};
        String sql = "select crime_name, crime_status, report_date, occurence_date from crimetbl where NIN='"+NIN.getText().trim()+"'";
        table= MyTable.createTable(sql, meta);
        table.setToolTipText("Click to edit citizen crime");
        table.setPreferredScrollableViewportSize(new Dimension(663, 180));
        scrollPane = new JScrollPane(table);
       
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try{
                    int row= table.getSelectedRow();
                    String crimeName=table.getModel().getValueAt(row, 0).toString(); 
                    String crimeStatus=table.getModel().getValueAt(row, 1).toString();
                    String reportDate=table.getModel().getValueAt(row, 2).toString();
                    String occDate=table.getModel().getValueAt(row, 3).toString();
                    
                    main.blur();
                    EditCrimeInfo c= new EditCrimeInfo(main, main, true, NIN.getText().trim(), EditCitizenCrime.this, crimeName, crimeStatus, reportDate, occDate);
                    c.setLocationRelativeTo(null);
                    c.setVisible(true);
                    
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        });
        for (int i = 0; i < 4; i++) {
                column = table.getColumnModel().getColumn(i);
                if (i == 0) //MemberID
                        column.setPreferredWidth(80);
                if (i == 1) //ID
                        column.setPreferredWidth(110);
                if (i == 2) //MemberID
                        column.setPreferredWidth(150);
                if (i == 3) //ID
                        column.setPreferredWidth(80);
        }
        contentPan.removeAll();
        scrollPane.setViewportView(table);
        contentPan.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 210));
        contentPan.setVisible(false);
        contentPan.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIN;
    private javax.swing.JButton cancel;
    public static javax.swing.JPanel contentPan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
