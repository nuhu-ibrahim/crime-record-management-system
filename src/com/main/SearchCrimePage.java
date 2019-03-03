package com.main;


import com.dataStructures.DBConnection;
import com.dataStructures.MyTable;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class SearchCrimePage extends javax.swing.JPanel {

    PoliceMenuPage main;
    public SearchCrimePage(PoliceMenuPage main) {
        this.main=main;
        DBConnection.connect(); 
        initComponents();  
    }
    
    CourtMenuPage main2;
    public SearchCrimePage(CourtMenuPage main) {
        this.main2=main;
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
        name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        contentPan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(730, 418));
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

        name.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("    Crime Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        search.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        search.setText("Search Offenders");
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

        add(contentPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 730, 220));

        jPanel3.setBackground(new java.awt.Color(0, 12, 92));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OFFENDER SEARCH RESULTS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 440, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 590, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    public void unblur(){
        if(main != null){
            main.unblur();
        }else if(main2 != null){
            main2.unblur();
        }
        
    }
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if(main!=null){
            main.contentPanel.removeAll();
            main.contentPanel.setVisible(false);
            main.contentPanel.setVisible(true);
        }else if(main2!=null){
            main2.contentPanel.removeAll();
            main2.contentPanel.setVisible(false);
            main2.contentPanel.setVisible(true);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(name.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
            contentPan.removeAll();
            contentPan.setVisible(false);
            contentPan.setVisible(true);
        }else{
            try{
                String sql="select * from crimetbl where "
                        + "crime_name like '%"+name.getText().trim()+"%'";
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                        createTable();
                }else{
                    JOptionPane.showMessageDialog(this, "No crime was commited with similar name","Issue!",JOptionPane.OK_OPTION);
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
        String meta[]={"NIN", "Crime Name", "Crime Status", "Report Date", "Occurence Date"};
        String sql = "select crimetbl.NIN, crime_name, crime_status, report_date, occurence_date from crimetbl, citizeninfo where crime_name like '%"+name.getText().trim()+"%' AND crimetbl.NIN = citizeninfo.NIN";
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
                        CrimeDeepInfo c= new CrimeDeepInfo(main, true, NIN, SearchCrimePage.this, crimeName, crimeStatus, reportDate, occDate);
                        c.setLocationRelativeTo(null);
                        c.setVisible(true);
                    }else if(main2 != null){
                        main2.blur();
                        CrimeDeepInfo c= new CrimeDeepInfo(main2, true, NIN, SearchCrimePage.this, crimeName, crimeStatus, reportDate, occDate);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
