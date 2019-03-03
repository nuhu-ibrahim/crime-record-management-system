package com.main;


import com.dataStructures.DBConnection;
import com.dataStructures.MyTable;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ViewOffences extends javax.swing.JPanel {
    
    PoliceMenuPage main;
    public ViewOffences(PoliceMenuPage main) {
        this.main = main;
        DBConnection.connect();        
        initComponents();
    }
    
    CourtMenuPage main2;
    public ViewOffences(CourtMenuPage main) {
        this.main2 = main;
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
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        fromDate = new com.toedter.calendar.JDateChooser();
        contentPan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(730, 468));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW OFFENDER PAGE");
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
        add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 80, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        search.setText("Search Offences");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 180, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("To Date:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("From Date:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 140, 30));
        jPanel2.add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 140, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 90));

        contentPan.setBackground(new java.awt.Color(255, 255, 255));
        contentPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        contentPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        add(contentPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 690, 220));

        jPanel3.setBackground(new java.awt.Color(0, 12, 92));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CITIZENS OFFENCES RESULTS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 540, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 590, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if(main != null){
            main.contentPanel.removeAll();
            main.contentPanel.setVisible(false);
            main.contentPanel.setVisible(true);
        }else if(main2 != null){
            main2.contentPanel.removeAll();
            main2.contentPanel.setVisible(false);
            main2.contentPanel.setVisible(true);
        }
        
    }//GEN-LAST:event_cancelActionPerformed
    public static  String DEFAULT_QUERY;
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(fromDate.getDate()== null || toDate.getDate()==null){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
            contentPan.removeAll();
            contentPan.setVisible(false);
            contentPan.setVisible(true);
        }else{
            try{
                String fromD = new SimpleDateFormat("yyyy-MM-dd").format(fromDate.getDate());
                String toD = new SimpleDateFormat("yyyy-MM-dd").format(toDate.getDate());
                String sql="select * from crimetbl where "
                        + "report_date BETWEEN '"+fromD+"' AND '"+toD+"'";
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    createTable();
                }else{
                    JOptionPane.showMessageDialog(this, "No crime was profiled between the specified date.","Issue!",JOptionPane.OK_OPTION);
                    contentPan.removeAll();
                    contentPan.setVisible(false);
                    contentPan.setVisible(true);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_searchActionPerformed
    
    public void unblur(){
        if(main != null){
            main.unblur();
        }else if (main2 != null){
            main2.unblur();
        }
    }
    
    public void createTable(){
        final JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String fromD = new SimpleDateFormat("yyyy-MM-dd").format(fromDate.getDate());
        String toD = new SimpleDateFormat("yyyy-MM-dd").format(toDate.getDate());
        String meta[]={"NIN", "Crime Name", "Crime Status", "Report Date", "Occurence Date"};
        String sql = "select crimetbl.NIN, crime_name, crime_status, report_date, occurence_date from crimetbl, citizeninfo where report_date BETWEEN '"+fromD+"' AND '"+toD+"' AND crimetbl.NIN = citizeninfo.NIN ORDER BY report_date ASC";
        table= MyTable.createTable(sql, meta);
        table.setToolTipText("Click to view more information about the crime");
        table.setPreferredScrollableViewportSize(new Dimension(663, 180));
        scrollPane = new JScrollPane(table);
       
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try{
                    int row= table.getSelectedRow();
                    
                    String NIN=table.getModel().getValueAt(row, 0).toString(); 
                    String crimeName=table.getModel().getValueAt(row, 1).toString();
                    String crimeStatus=table.getModel().getValueAt(row, 2).toString();
                    String reportDate=table.getModel().getValueAt(row, 3).toString();
                    String occDate=table.getModel().getValueAt(row, 4).toString();
                    
                    if(main != null){
                        main.blur();
                        CrimeDeepInfo c= new CrimeDeepInfo(main, true, NIN, ViewOffences.this, crimeName, crimeStatus, reportDate, occDate);
                        c.setLocationRelativeTo(null);
                        c.setVisible(true);
                    }else if(main2 != null){
                        main2.blur();
                        CrimeDeepInfo c= new CrimeDeepInfo(main2, true, NIN, ViewOffences.this, crimeName, crimeStatus, reportDate, occDate);
                        c.setLocationRelativeTo(null);
                        c.setVisible(true);
                    }
                    
                    
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
    private javax.swing.JButton cancel;
    public static javax.swing.JPanel contentPan;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton search;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
