package com.main;


import com.dataStructures.DBConnection;
import static com.main.PoliceMenuPage.contentPanel;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class EditReg extends javax.swing.JPanel {

    ButtonGroup bG= new ButtonGroup();
    PoliceMenuPage main;
    public EditReg(PoliceMenuPage main) {
        this.main = main;
        DBConnection.connect();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NIN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        validate = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        we2 = new javax.swing.JLabel();
        we3 = new javax.swing.JLabel();
        us = new javax.swing.JPanel();
        me = new javax.swing.JLabel();
        me1 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mstatus = new javax.swing.JComboBox();
        sOOrigin = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LGA = new javax.swing.JComboBox();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(709, 526));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT OFFENDER INFORMATION PAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 480, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 80, 35));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NIN.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel2.add(NIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("NIN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        refresh.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 30));

        validate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        validate.setText("Validate Offender");
        validate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel2.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 340, 90));

        update.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        update.setText("Update the Information");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 260, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Firstname");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        fname.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 220, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("  Middlename");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        mname.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("     Lastname");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lname.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 220, 26));

        we2.setText("* Image must be .jpg");
        add(we2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, 20));

        we3.setText("* Image must not be larger than 150px X 150px");
        add(we3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, 20));

        us.setBackground(new java.awt.Color(255, 255, 255));
        us.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        us.setMaximumSize(new java.awt.Dimension(150, 150));
        us.setMinimumSize(new java.awt.Dimension(150, 150));
        us.setPreferredSize(new java.awt.Dimension(150, 150));
        us.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        us.add(me, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        me1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                me1PropertyChange(evt);
            }
        });
        us.add(me1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        sex.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 220, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Sex");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText(" Marital Status");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        mstatus.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        mstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Status", "Single", "Married", "Divorced" }));
        add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 220, 26));

        sOOrigin.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        sOOrigin.setForeground(java.awt.Color.darkGray);
        sOOrigin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select State", "Federal Capital City", "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo ", "Ekiti", "Enugu", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Kastina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nassarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara" }));
        sOOrigin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sOOriginItemStateChanged(evt);
            }
        });
        add(sOOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 220, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("State Of Origin");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("LGA");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 30, -1));

        LGA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        LGA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select LGA" }));
        add(LGA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 220, -1));
        add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 220, 25));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Date of birth");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        select.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        select.setText("Select Passport");
        select.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 150, 35));

        address.setColumns(24);
        address.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        address.setLineWrap(true);
        address.setRows(2);
        address.setTabSize(5);
        jScrollPane1.setViewportView(address);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 420, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Address");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        refresh();
    }//GEN-LAST:event_refreshActionPerformed
    public void refresh(){
        EditReg reg = new EditReg(main);
        contentPanel.removeAll();
        JScrollPane scrollPane= new JScrollPane(reg, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        contentPanel.removeAll();
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fname.getText().trim().equals("") || lname.getText().trim().equals("")|| 
                address.getText().trim().equals("") || dob.getDate()==null || sex.getSelectedIndex()==0 ||
                mstatus.getSelectedIndex()==0 || LGA.getSelectedIndex()==0 ||
                sOOrigin.getSelectedIndex()==0 || me1.getIcon()==null){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                //Update the Information
                main.blur();
                    
                ValidateCitizenBiometric c= new ValidateCitizenBiometric(main, true, NIN.getText().trim(), EditReg.this);
                c.setLocationRelativeTo(null);
                c.setVisible(true); 
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    public void update(){
        try{
            //Create directory if it doesnt exist
            String address = "citizen_files";
            File f = new File(address);

            if(!f.exists()){
                f.mkdir();
            }

            String passport=""+me1.getIcon();

            ImageIcon icon=new ImageIcon(passport);     
            Image image =icon.getImage();
            BufferedImage buffer=new BufferedImage(image.getWidth(null),image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D bGr=buffer.createGraphics();
            bGr.drawImage(image, 0, 0,null);
            bGr.dispose();
            String imageName="";
            try{
                int index=passport.lastIndexOf('\\');
                imageName=""+(new Random()).nextLong()+".png";
                File out=new File("citizen_files\\"+imageName);
                ImageIO.write(buffer, "png", out);
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            passport="citizen_files\\"+imageName;
            
            //Update the Information
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            String date = ft.format(dob.getDate());

            PreparedStatement st;
            String sql= "update citizeninfo set "
                    + "fname=?, "
                    + "mname=?, "
                    + "lname=?, "
                    + "sex=?, "
                    + "mstatus=?, "
                    + "stateOfOrigin=?, "
                    + "LGA=?, "
                    + "dob=?, "
                    + "address=?, "
                    + "Passport=? "
                    + "where NIN=?";
            st = DBConnection.con.prepareStatement(sql);

            st.setString(1, fname.getText().trim());
            st.setString(2, mname.getText().trim());
            st.setString(3, lname.getText().trim());
            st.setString(4, ""+sex.getSelectedItem());
            st.setString(5, ""+mstatus.getSelectedItem());
            st.setString(6, ""+sOOrigin.getSelectedItem());
            st.setString(7, ""+LGA.getSelectedItem());
            st.setString(8, date);
            st.setString(9, this.address.getText().trim());
            st.setString(10, passport);
            st.setString(11, NIN.getText().trim());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Information succesfully updated","Update Success",JOptionPane.INFORMATION_MESSAGE);
            refresh();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    private void me1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_me1PropertyChange

    }//GEN-LAST:event_me1PropertyChange

    private void sOOriginItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sOOriginItemStateChanged
        String stateChoice= ""+sOOrigin.getSelectedItem();

        if(stateChoice.equals("Select State")){
            String[] lgas={"Select Item", "Abaji", "Abuja Municipal", "Bwari",
                "Gwagwalada", "Kuje", "Kwali","Aba North", "Aba South", "Arochukwu",
                "Bende", "Isiala Ngwa South", "Ikwuano", "Isiala", "Ngwa North",
                "Isukwuato", "Ukwa West", "Ukwa East", "Umuahia", "Umuahia South",
                "Demsa", "Fufore", "Ganye", "Girei", "Gombi", "Jada", "Yola North",
                "Lamurde", "Madagali", "Maiha", "Mayo-Belwa", "Michika", "Mubi South",
                "Numna", "Shelleng", "Song","Toungo", "Jimeta", "Yola South", "Hung",
                "Abak", "eastern Obolo", "Eket", "Essien Udim", "Etimekpo", "Etinan",
                "Ibeno", "Ibesikpo Asutan", "Ibiono Ibom", "Ika", "Ikono","Ikot Abasi",
                "Ikot Ekpene", "Ini", "Itu", "Mbo", "Mkpat Enin", "Nsit Ibom", "Nsit Ubium",
                "Obot Akara", "Okobo", "Onna", "Orukanam", "Oron", "Udung Uko","Ukanafun",
                "Esit Eket", "Uruan", "Urue Offoung", "Oruko Ete", "Uyo", "Aguata","Anambra",
                "Anambra West", "Anaocha", "Awka South", "Awka North", "Ogbaru", "Onitsha South",
                "Onitsha North", "Orumba North", "Orumba South", "Oyi", "Alkaleri", "Bauchi", "Bogoro",
                "Darazo", "Dass", "Gamawa", "Ganjuwa", "Giade", "Jama`are", "Katagum", "Kirfi", "Misau",
                "Ningi", "hira", "Tafawa Balewa", "Itas gadau", "Toro","Warji", "Zaki", "Dambam", "Brass",
                "Ekeremor", "Kolok/Opokuma", "Nembe", "Ogbia", "Sagbama","Southern Ijaw", "Yenagoa", "Membe",
                "Ador", "Agatu", "Apa", "Buruku", "Gboko", "Guma", "Gwer east", "Gwer west", "Kastina","-ala",
                "Konshisha", "Kwande", "Logo", "Makurdii", "Obi", "Ogbadibo", "Ohimini", "Oju", "Okpokwu",
                "Oturkpo", "Tarka", "Ukum", "Vandekya", "Abadan", "Askira/Uba", "Bama","Bayo", "Biu", "Chibok",
                "Damboa", "Dikwagubio", "Guzamala", "Gwoza", "Hawul", "Jere", "Kaga", "Kalka/Balge", "Konduga",
                "Kukawa", "Kwaya-ku", "Mafa", "Magumeri", "Maiduguri", "Marte", "Mobbar", "Monguno", "Ngala",
                "Nganzai", "Shani", "Abia", "Akampa", "Akpabuyo", "Bakassi", "Bekwara",
                "Biase", "Boki", "Calabar south", "Etung", "Ikom", "Obanliku", "Obubra",
                "Obudu", "Odukpani", "Ogoja", "Ugep north", "Yala", "Yarkur", "Aniocha south",
                "Anioha", "Bomadi", "Burutu", "Ethiope west", "Ethiope east", "Ika south",
                "Ika north east", "Isoko south","Isoko north", "Ndokwa east", "Ndokwa west",
                "Okpe","Oshimili north", "Oshimili south", "Patani", "Sapele", "Udu",
                "Ughelli south", "Ughelli north", "Ukwuani", "Uviwie", "Warri central",
                "Warri north", "Warri south", "Abakaliki", "Afikpo south", "Afikpo north",
                "Ebonyi","Ezza", "Ezza south", "Ikwo", "Ishielu", "Ivo"," Ohaozara",
                "Ohaukwu", "Onicha", "Izzi", "Akoko-Edo", "Egor","Essann east",
                "Esan south east", "Esan central","Esan west", "Etsako central",
                "Etsako east", "Etsako", "Orhionwon","Ivia north","Ovia south west",
                "Owan west", "Owan south", "Uhunwonde", "Ado Ekiti", "Effon Alaiye",
                "Ekiti south west", "Ekiti west", "Ekiti east", "Emure/ise", "Oru",
                "Ido","Osi", "Ijero", "Ikere", "Ikole", "Ilejemeje","Irepodun",
                "Ise/Orun","Moba", "Oye", "Aiyekire", "Awgu, Aninri", "Enugu east",
                "Enugu south", "Enugu north", "Ezeagu", "Igbo Eze north", "Igbi etiti",
                "Nsukka","Oji river", "Undenu","Uzo Uwani", "Udi", "Akko", "Balanga",
                "Billiri", "Dukku", "Dunakaye", "Gombe", "Kaltungo", "Kwami",
                "Nafada/Bajoga", "Shomgom", "Yamaltu/Deba", "Aboh-mbaise", "Ahiazu-Mbaise",
                "Ehime-Mbaino", "Ezinhite", "Ideato North", "Ideato south", "Ihitte/Uboma",
                "Ikeduru", "Isiala", "Isu", "Mbaitoli", "Ngor Okpala", "Njaba", "Nwangele",
                "Nkwere", "Obowo", "Aguta", "Ohaji Egbema", "Okigwe", "Onuimo", "Orlu",
                "Orsu", "Oru west", "Oru", "Owerri", "Owerri North", "Owerri south",
                "Auyo", "Babura", "Birnin- Kudu", "Birniwa", "Buji", "Dute", "Garki",
                "Gagarawa", "Gumel" , "Guri", "Gwaram", "Gwiwa", "Hadeji", "Jahun",
                "Kafin-Hausa", "kaugama", "Kazaure", "Kirikisamma", "Birnin-magaji",
                "Maigatari", "Malamaduri", "Miga", "Ringim", "Roni", "Sule Tankarka",
                "Taura", "Yankwasi", "Brnin Gwari", "Chukun", "Giwa", "Kajuru",
                "Igabi", "Ikara", "Jaba", "Jema`a", "Kachia", "Kaduna North",
                "Kaduna south", "Kagarok", "Kauru", "Kabau", "Kudan", "Kere",
                "Makarfi", "Sabongari", "Sanga", "Soba", "Zangon-Kataf", "Zaria", "Ajigi",
                "Albasu", "Bagwai", "Bebeji", "Bichi", "Bunkure", "Dala", "Dambatta",
                "Dawakin kudu", "Dawakin tofa", "doguwa", "Fagge", "Gabasawa", "Garko",
                "Garun mallam", "Gaya", "Gezawa", "Gwale", "Gwarzo", "Kano", "Karay",
                "Kibiya", "Kiru", "Kumbtso", "Kunch", "Kura", "Maidobi", "Makoda",
                "MInjibir Nassarawa", "Rano", "Rimin gado", "Rogo", "Shanono", "Sumaila",
                "Takai", "Tarauni", "Tofa", "Tsanyawa", "Tudunwada", "Ungogo", "Warawa",
                "Wudil", "Bakori", "Batagarawa", "Batsari", "Baure", "Bindawa",
                "Charanchi", "Dan- Musa", "Dandume","Danja", "Daura", "Dutsi",
                "Dutsin `ma", "Faskar", "Funtua", "Ingawa", "Jibiya", "Kafur",
                "Kaita", "Kankara", "Kankiya", "Katsina", "Furfi", "Kusada.Mai aduwa",
                "Malumfashi", "Mani", "Mash", "Matazu", "Musawa", "Rimi", "Sabuwa",
                "Safana", "Sandamu","Zango", "Aliero", "Arewa Dandi", "Argungu",
                "Augie", "Bagudo", "Birnin Kebbi", "Bunza", "Dandi", "Danko",
                "Fakai", "Gwandu", "Jeda", "Kalgo", "Koko-besse", "Maiyaama",
                "Ngaski", "Sakaba", "Shanga", "Suru", "Wasugu", "Yauri", "Zuru",
                "Adavi", "Ajaokuta", "Ankpa", "Bassa", "Dekina", "Yagba east",
                "Ibaji", "Idah", "Igalamela", "Ijumu", "Kabba bunu", "Kogi",
                "Mopa muro", "Ofu", "Ogori magongo", "Okehi", "Okene", "Olamaboro",
                "Omala", "Yagba west", "Asa", "Baruten", "Ede", "Ekiti",
                "Ifelodun", "Ilorin south", "Ilorin west", "Ilorin east",
                "Irepodun", "Isin", "Kaiama", "Moro", "Offa", "Oke ero",
                "Oyun", "Pategi", "Agege", "Alimosho Ifelodun", "Alimosho",
                "Amuwo-Odofin", "Apapa", "Badagry", "Epe", "Eti-Osa", "Ibeju- Lekki",
                "Ifako/Ijaye", "Ikeja", "Ikorodu", "Kosofe", "Lagos Island", "Lagos Mainland",
                "Mushin", "Ojo", "Oshodi -Isolo", "Shomolu","Surulere", "Akwanga",
                "Awe", "Doma", "Karu", "Keana", "Keffi", "Kokona", "Lafia",
                "Nassarawa", "Nassarawa/Eggon", "Obi", "Toto", "Wamba", "Agaie",
                "Agwara", "Bida", "Borgu", "Bosso", "Chanchanga", "Edati", "Gbako",
                "Gurara", "Kitcha", "Kontagora","Lapai", "Lavun", "Magama", "Mariga",
                "Mokwa", "Moshegu", "Muya", "Paiko","Rafi", "Shiroro", "Suleija",
                "Tawa-Wushishi", "Abeokuta south","Abeokuta north", "Ado-odo/otta",
                "Agbado south", "Agbado north", "Ewekoro", "Idarapo", "Ifo",
                "Ijebu east", "Ijebu north", "Ikenne", "Ilugun Alaro", "Imeko afon",
                "Ipokia", "Obafemi/owode", "Odeda", "Odogbolu", "Ogun waterside",
                "Sagamu", "Akoko north", "Akoko north east", "Akoko south east",
                "Akoko south", "Akure north", "Akure", "Idanre", "Ifedore",
                "Ese odo", "Ilaje", "Ilaje oke-igbo", "Irele", "Odigbo",
                "Okitipupa", "Ondo", "Ondo east", "Ose", "Owo", "Atakumosa west",
                "Atakumosa east", "Ayeda-ade", "Ayedire", "Bolawaduro", "Boripe",
                "Ede", "Ede north", "Egbedore", "Ejigbo", "Ife north", "Ife central",
                "Ife south", "Ife east", "Ifedayo", "Ifelodun", "Ilesha west",
                "Ila- orangun", "Ilesah east", "Irepodun", "Irewole", "Isokan",
                "Iwo", "Obokun", "Odo-otin", "ola oluwa", "olorunda", "Oriade",
                "Orolu", "Osogbo", "Afijio", "Akinyele", "Attba", "Atigbo", "Egbeda",
                "Ibadan", "north east", "Ibadan central", "Ibadan south east",
                "Ibadan west south", "Ibarapa east", "Ibarapa north", "Ido",
                "Ifedapo", "Ifeloju", "Irepo","Iseyin", "Itesiwaju", "Iwajowa",
                "Iwajowa olorunshogo", "Kajola", "Lagelu", "Ogbomosho north",
                "Ogbomosho south", "Ogo oluwa", "Oluyole","Ona ara", "Ore lope",
                "Orire","Oyo east", "Oyo west", "Saki east", "Saki west", "Surulere",
                "Barkin/ladi", "Bassa", "Bokkos", "Jos","north", "Jos east",
                "Jos south", "Kanam", "kiyom", "Langtang north Langtang south",
                "Mangu", "Mikang", "Pankshin", "Qua`an pan","Shendam", "Wase", "Abua/Odial",
                "Ahoada west", "Akuku toru", "Andoni", "Asari toru", "Bonny", "Degema",
                "Eleme", "Emohua", "Etche", "Gokana", "Ikwerre", "Oyigbo", "Khana",
                "Obio/Akpor", "Ogba east /Edoni", "Ogu/bolo", "Okrika", "Omumma",
                "Opobo/Nkoro", "Portharcourt","Tai", "Binji", "Bodinga",
                "Dange/shuni", "Gada", "Goronyo", "Gudu", "Gwadabawa",
                "Illella", "Kebbe", "Kware", "Rabah", "Sabon -Birni",
                "Shagari", "Silame", "Sokoto south", "Sokoto north", "Tambuwal",
                "Tangaza", "Tureta", "Wamakko","Wurno", "Yabo", "Akdo -kola",
                "Bali", "Donga", "Gashaka", "Gassol", "Ibi", "Jalingo",
                "K/Lamido", "Kurmi", "lan", "Sardauna", "Tarum", "Ussa",
                "Wukari", "Yorro", "Zing", "Borsari", "Damaturu", "Fika",
                "Fune", "Geidam", "Gogaram", "Gujba", "Gulani", "Jakusko",
                "Karasuwa", "Machina", "Nagere", "Nguru", "Potiskum",
                "Tarmua", "Yunusari", "Yusufari","G ashua", "Anka",
                "bukkuyum","Dungudu", "Chafe", "Gummi", "Gusau",
                "Isa", "Kaura/Namoda", "Mradun", "Maru", "Shinkafi",
                "Talata/Mafara", "Zumi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Federal Capital City")){
            String[] lgas={"Select Item" , "Abaji", "Abuja Municipal", "Bwari", "Gwagwalada", "Kuje", "Kwali"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Abia")){
            String[] lgas={"Select Item", "Aba North", "Aba South", "Arochukwu", "Bende", "Isiala Ngwa South", "Ikwuano", "Isiala", "Ngwa North", "Isukwuato", "Ukwa West", "Ukwa East", "Umuahia", "Umuahia South"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Adamawa")){
            String[] lgas={"Select Item", "Demsa", "Fufore", "Ganye", "Girei", "Gombi", "Jada", "Yola North", "Lamurde", "Madagali", "Maiha", "Mayo-Belwa", "Michika", "Mubi South", "Numna", "Shelleng", "Song","Toungo", "Jimeta", "Yola South", "Hung"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Akwa Ibom")){
            String[] lgas={"Select Item","Abak", "eastern Obolo", "Eket", "Essien Udim", "Etimekpo", "Etinan", "Ibeno", "Ibesikpo Asutan", "Ibiono Ibom", "Ika", "Ikono","Ikot Abasi", "Ikot Ekpene", "Ini", "Itu", "Mbo", "Mkpat Enin", "Nsit Ibom", "Nsit Ubium", "Obot Akara", "Okobo", "Onna", "Orukanam", "Oron", "Udung Uko","Ukanafun","Esit Eket", "Uruan", "Urue Offoung", "Oruko Ete", "Uyo"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Anambra")){
            String[] lgas={"Select Item", "Aguata","Anambra", "Anambra West", "Anaocha", "Awka South", "Awka North", "Ogbaru", "Onitsha South", "Onitsha North", "Orumba North", "Orumba South", "Oyi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Bauchi")){
            String[] lgas={"Select Item", "Alkaleri", "Bauchi", "Bogoro", "Darazo", "Dass", "Gamawa", "Ganjuwa", "Giade", "Jama`are", "Katagum", "Kirfi", "Misau", "Ningi", "hira", "Tafawa Balewa", "Itas gadau", "Toro","Warji", "Zaki", "Dambam"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Bayelsa")){
            String[] lgas={"Select Item", "Brass", "Ekeremor", "Kolok/Opokuma", "Nembe", "Ogbia", "Sagbama","Southern Ijaw", "Yenagoa", "Membe"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Benue")){
            String[] lgas={"Select Item", "Ador", "Agatu", "Apa", "Buruku", "Gboko", "Guma", "Gwer east", "Gwer west", "Kastina","-ala", "Konshisha", "Kwande", "Logo", "Makurdii", "Obi", "Ogbadibo", "Ohimini", "Oju", "Okpokwu", "Oturkpo", "Tarka", "Ukum", "Vandekya"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Borno")){
            String[] lgas={"Select Item", "Abadan", "Askira/Uba", "Bama","Bayo", "Biu", "Chibok", "Damboa", "Dikwagubio", "Guzamala", "Gwoza", "Hawul", "Jere", "Kaga", "Kalka/Balge", "Konduga", "Kukawa", "Kwaya-ku", "Mafa", "Magumeri", "Maiduguri", "Marte", "Mobbar", "Monguno", "Ngala", "Nganzai", "Shani"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Cross River")){
            String[] lgas={"Select Item", "Abia", "Akampa", "Akpabuyo", "Bakassi", "Bekwara", "Biase", "Boki", "Calabar south", "Etung", "Ikom", "Obanliku", "Obubra", "Obudu", "Odukpani", "Ogoja", "Ugep north", "Yala", "Yarkur"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Delta")){
            String[] lgas={"Select Item", "Aniocha south", "Anioha", "Bomadi", "Burutu", "Ethiope west", "Ethiope east", "Ika south", "Ika north east", "Isoko south","Isoko north", "Ndokwa east", "Ndokwa west", "Okpe","Oshimili north", "Oshimili south", "Patani", "Sapele", "Udu", "Ughelli south", "Ughelli north", "Ukwuani", "Uviwie", "Warri central", "Warri north", "Warri south"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Ebonyi")){
            String[] lgas={"Select Item", "Abakaliki", "Afikpo south", "Afikpo north", "Ebonyi","Ezza", "Ezza south", "Ikwo", "Ishielu", "Ivo"," Ohaozara", "Ohaukwu", "Onicha", "Izzi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Edo")){
            String[] lgas={"Select Item", "Akoko-Edo", "Egor","Essann east", "Esan south east", "Esan central","Esan west", "Etsako central", "Etsako east", "Etsako", "Orhionwon","Ivia north","Ovia south west", "Owan west", "Owan south", "Uhunwonde"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Ekiti")){
            String[] lgas={"Select Item", "Ado Ekiti", "Effon Alaiye", "Ekiti south west", "Ekiti west", "Ekiti east", "Emure/ise", "Oru", "Ido","Osi", "Ijero", "Ikere", "Ikole", "Ilejemeje","Irepodun", "Ise/Orun","Moba", "Oye", "Aiyekire"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Enugu")){
            String[] lgas={"Select Item", "Awgu, Aninri", "Enugu east", "Enugu south", "Enugu north", "Ezeagu", "Igbo Eze north", "Igbi etiti", "Nsukka","Oji river", "Undenu","Uzo Uwani", "Udi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Gombe")){
            String[] lgas={"Select Item", "Akko", "Balanga", "Billiri", "Dukku", "Dunakaye", "Gombe", "Kaltungo", "Kwami", "Nafada/Bajoga", "Shomgom", "Yamaltu/Deba"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Imo")){
            String[] lgas={"Select Item", "Aboh-mbaise", "Ahiazu-Mbaise", "Ehime-Mbaino", "Ezinhite", "Ideato North", "Ideato south", "Ihitte/Uboma", "Ikeduru", "Isiala", "Isu", "Mbaitoli", "Ngor Okpala", "Njaba", "Nwangele", "Nkwere", "Obowo", "Aguta", "Ohaji Egbema", "Okigwe", "Onuimo", "Orlu", "Orsu", "Oru west", "Oru", "Owerri", "Owerri North", "Owerri south"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Jigawa")){
            String[] lgas={"Select Item", "Auyo", "Babura", "Birnin- Kudu", "Birniwa", "Buji", "Dute", "Garki", "Gagarawa", "Gumel" , "Guri", "Gwaram", "Gwiwa", "Hadeji", "Jahun", "Kafin-Hausa", "kaugama", "Kazaure", "Kirikisamma", "Birnin-magaji", "Maigatari", "Malamaduri", "Miga", "Ringim", "Roni", "Sule Tankarka", "Taura", "Yankwasi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Kaduna")){
            String[] lgas={"Select Item", "Brnin Gwari", "Chukun", "Giwa", "Kajuru", "Igabi", "Ikara", "Jaba", "Jema`a", "Kachia", "Kaduna North", "Kaduna south", "Kagarok", "Kauru", "Kabau", "Kudan", "Kere", "Makarfi", "Sabongari", "Sanga", "Soba", "Zangon-Kataf", "Zaria"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Kano")){
            String[] lgas={"Select Item", "Ajigi", "Albasu", "Bagwai", "Bebeji", "Bichi", "Bunkure", "Dala", "Dambatta", "Dawakin kudu", "Dawakin tofa", "doguwa", "Fagge", "Gabasawa", "Garko", "Garun mallam", "Gaya", "Gezawa", "Gwale", "Gwarzo", "Kano", "Karay", "Kibiya", "Kiru", "Kumbtso", "Kunch", "Kura", "Maidobi", "Makoda", "MInjibir Nassarawa", "Rano", "Rimin gado", "Rogo", "Shanono", "Sumaila", "Takai", "Tarauni", "Tofa", "Tsanyawa", "Tudunwada", "Ungogo", "Warawa", "Wudil"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Kastina")){
            String[] lgas={"Select Item", "Bakori", "Batagarawa", "Batsari", "Baure", "Bindawa", "Charanchi", "Dan- Musa", "Dandume","Danja", "Daura", "Dutsi", "Dutsin `ma", "Faskar", "Funtua", "Ingawa", "Jibiya", "Kafur", "Kaita", "Kankara", "Kankiya", "Katsina", "Furfi", "Kusada.Mai aduwa", "Malumfashi", "Mani", "Mash", "Matazu", "Musawa", "Rimi", "Sabuwa", "Safana", "Sandamu","Zango"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Kebbi")){
            String[] lgas={"Select Item", "Aliero", "Arewa Dandi", "Argungu", "Augie", "Bagudo", "Birnin Kebbi", "Bunza", "Dandi", "Danko", "Fakai", "Gwandu", "Jeda", "Kalgo", "Koko-besse", "Maiyaama", "Ngaski", "Sakaba", "Shanga", "Suru", "Wasugu", "Yauri", "Zuru"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Kogi")){
            String[] lgas={"Select Item", "Adavi", "Ajaokuta", "Ankpa", "Bassa", "Dekina", "Yagba east", "Ibaji", "Idah", "Igalamela", "Ijumu", "Kabba bunu", "Kogi", "Mopa muro", "Ofu", "Ogori magongo", "Okehi", "Okene", "Olamaboro", "Omala", "Yagba west"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Kwara")){
            String[] lgas={"Select Item", "Asa", "Baruten", "Ede", "Ekiti", "Ifelodun", "Ilorin south", "Ilorin west", "Ilorin east", "Irepodun", "Isin", "Kaiama", "Moro", "Offa", "Oke ero", "Oyun", "Pategi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Lagos")){
            String[] lgas={"Select Item", "Agege", "Alimosho Ifelodun", "Alimosho", "Amuwo-Odofin", "Apapa", "Badagry", "Epe", "Eti-Osa", "Ibeju- Lekki","Ifako/Ijaye", "Ikeja", "Ikorodu", "Kosofe", "Lagos Island", "Lagos Mainland", "Mushin", "Ojo", "Oshodi -Isolo", "Shomolu","Surulere"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Nassarawa")){
            String[] lgas={"Select Item", "Akwanga", "Awe", "Doma", "Karu", "Keana", "Keffi", "Kokona", "Lafia", "Nassarawa", "Nassarawa/Eggon", "Obi", "Toto", "Wamba"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Niger")){
            String[] lgas={"Select Item", "Agaie", "Agwara", "Bida", "Borgu", "Bosso", "Chanchanga", "Edati", "Gbako", "Gurara", "Kitcha", "Kontagora","Lapai", "Lavun", "Magama", "Mariga", "Mokwa", "Moshegu", "Muya", "Paiko","Rafi", "Shiroro", "Suleija", "Tawa-Wushishi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Ogun")){
            String[] lgas={"Select Item", "Abeokuta south","Abeokuta north", "Ado-odo/otta", "Agbado south", "Agbado north", "Ewekoro", "Idarapo", "Ifo", "Ijebu east", "Ijebu north", "Ikenne", "Ilugun Alaro", "Imeko afon", "Ipokia", "Obafemi/owode", "Odeda", "Odogbolu", "Ogun waterside", "Sagamu"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Ondo")){
            String[] lgas={"Select Item", "Akoko north", "Akoko north east", "Akoko south east", "Akoko south", "Akure north", "Akure", "Idanre", "Ifedore", "Ese odo", "Ilaje", "Ilaje oke-igbo", "Irele", "Odigbo", "Okitipupa", "Ondo", "Ondo east", "Ose", "Owo"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Osun")){
            String[] lgas={"Select Item", "Atakumosa west", "Atakumosa east", "Ayeda-ade", "Ayedire", "Bolawaduro", "Boripe", "Ede", "Ede north", "Egbedore", "Ejigbo", "Ife north", "Ife central", "Ife south", "Ife east", "Ifedayo", "Ifelodun", "Ilesha west", "Ila- orangun", "Ilesah east", "Irepodun", "Irewole", "Isokan", "Iwo", "Obokun", "Odo-otin", "ola oluwa", "olorunda", "Oriade", "Orolu", "Osogbo"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Oyo")){
            String[] lgas={"Select Item", "Afijio", "Akinyele", "Attba", "Atigbo", "Egbeda", "Ibadan", "north east", "Ibadan central", "Ibadan south east", "Ibadan west south", "Ibarapa east", "Ibarapa north", "Ido", "Ifedapo", "Ifeloju", "Irepo","Iseyin", "Itesiwaju", "Iwajowa", "Iwajowa olorunshogo", "Kajola", "Lagelu", "Ogbomosho north", "Ogbomosho south", "Ogo oluwa", "Oluyole","Ona ara", "Ore lope", "Orire","Oyo east", "Oyo west", "Saki east", "Saki west", "Surulere"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Plateau")){
            String[] lgas={"Select Item", "Barkin/ladi", "Bassa", "Bokkos", "Jos","north", "Jos east", "Jos south", "Kanam", "kiyom", "Langtang north Langtang south", "Mangu", "Mikang", "Pankshin", "Qua`an pan","Shendam", "Wase"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Rivers")){
            String[] lgas={"Select Item", "Abua/Odial", "Ahoada west", "Akuku toru", "Andoni", "Asari toru", "Bonny", "Degema", "Eleme", "Emohua", "Etche", "Gokana", "Ikwerre", "Oyigbo", "Khana", "Obio/Akpor", "Ogba east /Edoni", "Ogu/bolo", "Okrika", "Omumma", "Opobo/Nkoro", "Portharcourt","Tai"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Sokoto")){
            String[] lgas={"Select Item", "Binji", "Bodinga", "Dange/shuni", "Gada", "Goronyo", "Gudu", "Gwadabawa", "Illella", "Kebbe", "Kware", "Rabah", "Sabon -Birni", "Shagari", "Silame", "Sokoto south", "Sokoto north", "Tambuwal", "Tangaza", "Tureta", "Wamakko","Wurno", "Yabo"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Taraba")){
            String[] lgas={"Select Item", "Akdo -kola", "Bali", "Donga", "Gashaka", "Gassol", "Ibi", "Jalingo", "K/Lamido", "Kurmi", "lan", "Sardauna", "Tarum", "Ussa", "Wukari", "Yorro", "Zing"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Yobe")){
            String[] lgas={"Select Item", "Borsari", "Damaturu", "Fika", "Fune", "Geidam", "Gogaram", "Gujba", "Gulani", "Jakusko", "Karasuwa", "Machina", "Nagere", "Nguru", "Potiskum", "Tarmua", "Yunusari", "Yusufari","G ashua"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }else if(stateChoice.equals("Zamfara")){
            String[] lgas={"Select Item", "Anka", "bukkuyum","Dungudu", "Chafe", "Gummi", "Gusau", "Isa", "Kaura/Namoda", "Mradun", "Maru", "Shinkafi", "Talata/Mafara", "Zumi"};
            LGA.setModel(new javax.swing.DefaultComboBoxModel(lgas));
        }
    }//GEN-LAST:event_sOOriginItemStateChanged

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue;
        returnValue = fileChooser.showOpenDialog(this);
        if(returnValue== JFileChooser.APPROVE_OPTION){
            try{
                File file;
                file= fileChooser.getSelectedFile();
                String st= file.toString();
                int index=st.lastIndexOf('.');
                String test=st.substring(index+1);
                if(test.equals("jpg")){
                    Icon iicon= new ImageIcon(file.getPath());
                    int a= iicon.getIconHeight();
                    int b= iicon.getIconWidth();
                    if(a<=150 && b<=150){
                        me1.setIcon(iicon);
                    }else{
                        me1.setIcon(null);
                        JOptionPane.showMessageDialog(null, "Image must not be larger than 150px X 150px","Issue!", JOptionPane.OK_OPTION);
                    }
                }else{
                    me1.setIcon(null);
                    JOptionPane.showMessageDialog(null, "File is not .jpg format","Issue!", JOptionPane.OK_OPTION);
                }

            }catch(Exception ex){
                me1.setIcon(null);
            }

        }
    }//GEN-LAST:event_selectActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        if(NIN.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                String sql="select * from citizeninfo where NIN='"+NIN.getText().trim()+"'";
                DBConnection.rs=DBConnection.st.executeQuery(sql);
                if(DBConnection.rs.next()){
                    validate.setEnabled(false);
                    update.setEnabled(true);
                    NIN.setEnabled(false);
                    //Update all fields and passport
                    fname.setText(DBConnection.rs.getString("fname"));
                    mname.setText(DBConnection.rs.getString("mname"));
                    lname.setText(DBConnection.rs.getString("lname"));
                    sex.setSelectedItem(DBConnection.rs.getString("sex"));
                    mstatus.setSelectedItem(DBConnection.rs.getString("mstatus"));
                    sOOrigin.setSelectedItem(DBConnection.rs.getString("stateOfOrigin"));
                    LGA.setSelectedItem(DBConnection.rs.getString("LGA"));
                    
                    dob.setDate(new java.util.Date(DBConnection.rs.getString("dob").replaceAll("-", "/")));
                    
                    address.setText(DBConnection.rs.getString("address"));
                    Icon iicon= new ImageIcon(DBConnection.rs.getString("passport"));
                    me1.setIcon(iicon);
                }else{
                    JOptionPane.showMessageDialog(this,"Citizen does not exist", "Citizen not found", JOptionPane.OK_OPTION);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_validateActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox LGA;
    private javax.swing.JTextField NIN;
    public static javax.swing.JTextArea address;
    private javax.swing.JButton close;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel me;
    private javax.swing.JLabel me1;
    private javax.swing.JTextField mname;
    private javax.swing.JComboBox mstatus;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox sOOrigin;
    private javax.swing.JButton select;
    private javax.swing.JComboBox sex;
    private javax.swing.JButton update;
    private javax.swing.JPanel us;
    private javax.swing.JButton validate;
    private javax.swing.JLabel we2;
    private javax.swing.JLabel we3;
    // End of variables declaration//GEN-END:variables
}
