package com.main;

import com.digitalpersona.onetouch.DPFPCaptureFeedback;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPImageQualityAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPImageQualityEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.awt.Image;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ValidateCitizenBiometricUpdateCrime extends javax.swing.JDialog {

    private DPFPCapture capturer = DPFPGlobal.getCaptureFactory().createCapture();
    private DPFPEnrollment enroller = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification verificator = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    private DPFPFeatureSet features;
    private EditCrimeInfo main;
    private String NIN;
    public ValidateCitizenBiometricUpdateCrime(java.awt.Frame parent, boolean modal, String NIN, EditCrimeInfo main) {
        super(parent, modal);
        this.main = main;
        this.NIN = NIN;
        initComponents();
        
        onLoad(NIN.replaceAll("/", "")+".fpt");
        
        init();
        start();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        validate = new javax.swing.JButton();
        insert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setPreferredSize(new java.awt.Dimension(709, 555));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 12, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VALIDATE CITIZEN BIOMETRIC ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("UPLOAD BIOMETRIC");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        jPanel3.add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 240, 280));

        validate.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        validate.setText("Validate");
        validate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        validate.setEnabled(false);
        validate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateActionPerformed(evt);
            }
        });
        jPanel3.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 230, 30));

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Quit");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel3.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 90, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onLoad(String string) {
        try{
            String address = "citizen_files/";
            
            FileInputStream stream = new FileInputStream(address+string);
            byte[] data = new byte[stream.available()];
            stream.read(data);
            stream.close();
            DPFPTemplate t = DPFPGlobal.getTemplateFactory().createTemplate();
            t.deserialize(data);
            setTemplate(t);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getLocalizedMessage(), "Fingerprint loading", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    protected void init(){
        capturer.addDataListener(new DPFPDataAdapter() {
            @Override public void dataAcquired(final DPFPDataEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint sample was captured.");
                    setPrompt("Scan the same fingerprint again.");
                    process(e.getSample());
                }});
            }
        });
        capturer.addReaderStatusListener(new DPFPReaderStatusAdapter() {
            @Override public void readerConnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was connected.");
                }});
            }
            @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was disconnected.");
                }});
            }
        });
        capturer.addSensorListener(new DPFPSensorAdapter() {
            @Override public void fingerTouched(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The fingerprint reader was touched.");
                }});
            }
            @Override public void fingerGone(final DPFPSensorEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    makeReport("The finger was removed from the fingerprint reader.");
                }});
            }
        });
        capturer.addImageQualityListener(new DPFPImageQualityAdapter() {
            @Override public void onImageQuality(final DPFPImageQualityEvent e) {
                SwingUtilities.invokeLater(new Runnable() {	public void run() {
                    if (e.getFeedback().equals(DPFPCaptureFeedback.CAPTURE_FEEDBACK_GOOD))
                        makeReport("The quality of the fingerprint sample is good.");
                    else
                        makeReport("The quality of the fingerprint sample is poor.");
                }});
            }
        });
    }

    protected void process(DPFPSample sample)
    {
        // Draw fingerprint sample image.
        drawPicture(convertSampleToBitmap(sample));
        
        // Process the sample and create a feature set for the enrollment purpose.
        features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

        validate.setEnabled(true);
    }

    public DPFPTemplate getTemplate() {
        return template;
    }
    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
    }
    
    protected void start()
    {
        capturer.startCapture();
        setPrompt("Using the fingerprint reader, scan the staff's fingerprint.");
        JOptionPane.showMessageDialog(this, "Using the fingerprint reader, scan your fingerprint.");
    }

    protected void stop()
    {
        capturer.stopCapture();
    }

    public void setStatus(String string) {
        //status.setText(string);
        System.out.println(string);
    }
    public void setPrompt(String string) {
        //prompt.setText(string);
        System.out.println(string);
    }
    public void makeReport(String string) {
        //log.append(string + "\n");
        System.out.println(string);
    }

    public void drawPicture(Image image) {
        picture.setIcon(new ImageIcon(
        image.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_DEFAULT)));
    }

    protected Image convertSampleToBitmap(DPFPSample sample) {
        return DPFPGlobal.getSampleConversionFactory().createImage(sample);
    }

    protected DPFPFeatureSet extractFeatures(DPFPSample sample, DPFPDataPurpose purpose)
    {
        DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
        try {
                return extractor.createFeatureSet(sample, purpose);
        } catch (DPFPImageQualityException e) {
                return null;
        }
    }
    
    private void updateStatus()
	{
            int count = enroller.getFeaturesNeeded();
            
            if(count > 0){
                JOptionPane.showMessageDialog(this, "Using the fingerprint reader, scan your fingerprint again","Information", JOptionPane.INFORMATION_MESSAGE);
            } 
            setStatus(String.format("Fingerprint samples needed: %1$s", enroller.getFeaturesNeeded()));
	}
    
    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        //main.main.main.unblur();
        stop();
        this.dispose();
        this.hide();
    }//GEN-LAST:event_insertActionPerformed

    private void validateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateActionPerformed
        // Check quality of the sample and start verification if it's good
        if (features != null)
        {
            try{
                // Compare the feature set with our template
                DPFPVerificationResult result = 
                    verificator.verify(features, template);
                //updateStatus(result.getFalseAcceptRate());
                if (result.isVerified()){
                    makeReport("The fingerprint was VERIFIED.");
                    this.dispose();
                    this.hide();

                    this.main.update();

                    stop();
                    this.dispose();
                    this.hide();
                }else{
                    makeReport("The fingerprint was NOT VERIFIED.");
                    JOptionPane.showMessageDialog(this, "Citizen fingerprint does not match, please try again","Information", JOptionPane.OK_OPTION);
                }   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Issue","Error executing query", JOptionPane.OK_OPTION);
                System.err.println(ex.getMessage());
            }
        }  
    }//GEN-LAST:event_validateActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        stop();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel picture;
    private javax.swing.JButton validate;
    // End of variables declaration//GEN-END:variables
}
