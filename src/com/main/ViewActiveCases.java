package com.main;


import com.dataStructures.DBConnection;
import com.dataStructures.MyTable;
import static com.main.CourtMenuPage.contentPanel;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ViewActiveCases extends javax.swing.JPanel {

    CourtMenuPage main;
    public ViewActiveCases(CourtMenuPage main) {
        this.main = main;
        DBConnection.connect();        
        initComponents();
        createTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        contentPan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(689, 388));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VIEW ACTIVE CASES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        cancel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        cancel.setText("Close");
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 80, 35));

        contentPan.setBackground(new java.awt.Color(255, 255, 255));
        contentPan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        contentPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        add(contentPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 670, 290));
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        contentPanel.removeAll();
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed
    public static  String DEFAULT_QUERY;    
    public void unblur(){
        main.unblur();
    }
    
    public void createTable(){
        final JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;

        String meta[]={"NIN", "Crime Name", "Crime Status", "Report Date", "Occurence Date"};
        String sql = "select crimetbl.NIN, crime_name, crime_status, report_date, occurence_date from crimetbl where crime_status = 'Sent to Court' ORDER BY report_date ASC";
        table= MyTable.createTable(sql, meta);
        table.setToolTipText("Click to view more information about the crime");
        table.setPreferredScrollableViewportSize(new Dimension(670, 290));
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
                    
                    main.blur();
                    CourtCrimeDeepInfo c= new CourtCrimeDeepInfo(main, true, NIN, ViewActiveCases.this, crimeName, crimeStatus, reportDate, occDate);
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
        contentPan.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 290));
        contentPan.setVisible(false);
        contentPan.setVisible(true);
    }
    
    public void refresh(){
        Thread runner = new Thread() {

            public void run() {
                ViewActiveCases reg = new ViewActiveCases(main);
                contentPanel.removeAll();
                JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
            try {
                contentPanel.setVisible(false);
                contentPanel.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            }
        };
        runner.start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    public static javax.swing.JPanel contentPan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
