package com.main;

import com.dataStructures.DBConnection;
import com.dataStructures.MyTable;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class SearchCitizenPage extends javax.swing.JPanel {

    public SearchCitizenPage() {
        DBConnection.connect();
        initComponents();
    }
    
    private void createTable(String sql){
        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"NIN", "Firstname", "Lastname", "Gender", "DOB", "Marital Status", "State of Origin"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(763, 180));
        scrollPane = new JScrollPane(table);
     
        for (int i = 0; i < 7; i++) {
                column = table.getColumnModel().getColumn(i);
                if (i == 0) //MemberID
                        column.setPreferredWidth(80);
                if (i == 1) //ID
                        column.setPreferredWidth(110);
                if (i == 2) //MemberID
                        column.setPreferredWidth(150);
                if (i == 3) //ID
                        column.setPreferredWidth(80);
                if (i == 4) //ID
                        column.setPreferredWidth(80);
                if (i == 5) //ID
                        column.setPreferredWidth(80);
                if (i == 6) //ID
                        column.setPreferredWidth(80);
        }
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 665, 240));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        searchKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        searchPersonell = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        searchIndex = new javax.swing.JComboBox();
        contentPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(730, 418));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        cancel.setText("Close");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 80, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchKey.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(searchKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Search Key");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        searchPersonell.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        searchPersonell.setText("Search Citizen");
        searchPersonell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 2));
        searchPersonell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPersonellActionPerformed(evt);
            }
        });
        jPanel2.add(searchPersonell, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 7, 180, 35));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Search Index");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        searchIndex.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        searchIndex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Index", "By Name", "By Address" }));
        jPanel2.add(searchIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 220, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 680, 80));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 680, 210));

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH OFFENDER PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jPanel3.setBackground(new java.awt.Color(0, 12, 92));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OFFENDER SEARCH RESULTS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 440, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 680, 40));
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if(PoliceMenuPage.contentPanel != null){
            PoliceMenuPage.contentPanel.removeAll();
            PoliceMenuPage.contentPanel.setVisible(false);
            PoliceMenuPage.contentPanel.setVisible(true);
        }else if(CourtMenuPage.contentPanel != null){
            CourtMenuPage.contentPanel.removeAll();
            CourtMenuPage.contentPanel.setVisible(false);
            CourtMenuPage.contentPanel.setVisible(true);
        }
    }//GEN-LAST:event_cancelActionPerformed
    public static  String DEFAULT_QUERY;
    private void searchPersonellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPersonellActionPerformed
        String choice=""+searchIndex.getSelectedItem();      
        if(choice.equals("Select Index") || searchKey.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Empty Fields","Error!",JOptionPane.OK_OPTION);
        }else{
            String searchKey= this.searchKey.getText().trim();
            
            String PatName="^[a-zA-Z]{2,20}$";
            String PatAddress= "^[a-zA-Z0-9].{4,250}$";
 
            /*String temSql="select * "
                         + "from personneltbl "
                         + "where firstname='' AND lastname='' AND middlename=''";*/
            //"NIN", "Firstname", "Lastname", "Gender", "DOB", "Marital Status", "State of Origin"
            String temSql="select NIN, fname, lname, sex, dob, mstatus, stateOfOrigin "
                    + "from citizeninfo "
                    + "where fname='' AND lname='' AND mname='' "; 
            if(choice.equals("By Name")){
                if(!Pattern.matches(PatName, searchKey)){
                    JOptionPane.showMessageDialog(null, "Invalid Name" , "Issue", JOptionPane.OK_OPTION);
                    String temp=this.searchKey.getText().trim();
                        this.searchKey.setText("");
                        createTable(temSql);//NoTiCe
                        this.searchKey.setText(temp);
                }else{
                    try{
                        String sql="select NIN, fname, lname, sex, dob, mstatus, stateOfOrigin "
                                 + "from citizeninfo "
                                 + "where fname='"+searchKey+"' OR lname='"+searchKey+"' OR mname='"+searchKey+"' ";
                        DBConnection.rs=DBConnection.st.executeQuery(sql);
                        if(DBConnection.rs.next()){
                            createTable(sql);
                        }else{
                            JOptionPane.showMessageDialog(null, "No Citizen with matching record", "Report!", JOptionPane.OK_OPTION);
                            String temp=this.searchKey.getText().trim();
                            this.searchKey.setText("");
                            createTable(temSql);//NoTiCe
                            this.searchKey.setText(temp);
                        }
                    }catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Issues excecuting query","Issues!", JOptionPane.OK_OPTION);
                        String temp=this.searchKey.getText().trim();
                        this.searchKey.setText("");
                        createTable(temSql);//NoTiCe
                        this.searchKey.setText(temp);
                    }
                }
            }else if(choice.equals("By Address")){
                if(!Pattern.matches(PatAddress, searchKey)){
                    JOptionPane.showMessageDialog(null, "Invalid Address" , "Issue", JOptionPane.OK_OPTION);
                    String temp=this.searchKey.getText().trim();
                        this.searchKey.setText("");
                        createTable(temSql);//NoTiCe
                        this.searchKey.setText(temp);
                }else{
                    try{
                      
                        String sql="select NIN, fname, lname, sex, dob, mstatus, stateOfOrigin "
                                 + "from citizeninfo "
                                 + "where address like '%"+searchKey+"%' ";
                        DBConnection.rs=DBConnection.st.executeQuery(sql);
                        if(DBConnection.rs.next()){
                            createTable(sql);
                        }else{
                            JOptionPane.showMessageDialog(null, "No Citizen with matching record", "Report!", JOptionPane.OK_OPTION);
                            String temp=this.searchKey.getText().trim();
                            this.searchKey.setText("");
                            createTable(temSql);//NoTiCe
                            this.searchKey.setText(temp);
                        }
                    }catch(SQLException ex){
                        System.out.println(ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Issues excecuting query","Issues!", JOptionPane.OK_OPTION);
                        String temp=this.searchKey.getText().trim();
                        this.searchKey.setText("");
                        createTable(temSql);//NoTiCe
                        this.searchKey.setText(temp);
                    }
                }
            }
        }
    }//GEN-LAST:event_searchPersonellActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox searchIndex;
    private javax.swing.JTextField searchKey;
    private javax.swing.JButton searchPersonell;
    // End of variables declaration//GEN-END:variables
    public static String getMsg(){
        return "PERSONNEL SEARCH PAGE";
    }
}
