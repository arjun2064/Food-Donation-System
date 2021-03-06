/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagerRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SupervisorOrganization;
import Business.Organization.Organization;
import Business.Organization.ManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryStatus;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ManagerJPanel1 extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public ManagerJPanel1(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        publishFoodBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        foodTypeTxtField = new javax.swing.JTextField();
        foodQuantityTxtField = new javax.swing.JTextField();
        foodAvailabilityDateTxtField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publishFoodBtn.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        publishFoodBtn.setText("Publish");
        publishFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishFoodBtnActionPerformed(evt);
            }
        });
        add(publishFoodBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        messageJTextField.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 10)); // NOI18N
        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 140, 20));

        backJButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Back_Arrow_27px.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Food Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel3.setText("Food Quantity");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel4.setText("Availability Date(mm/dd/yyyy)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        foodTypeTxtField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        foodTypeTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodTypeTxtFieldActionPerformed(evt);
            }
        });
        add(foodTypeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 140, 20));

        foodQuantityTxtField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        add(foodQuantityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, 20));

        foodAvailabilityDateTxtField.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        add(foodAvailabilityDateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, 20));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Vegetarian_Food_25px.png"))); // NOI18N
        jLabel6.setText("Food Publishing Space");
        jPanel2.add(jLabel6);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 690, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        enterpriseLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        jPanel3.add(enterpriseLabel1);

        valueLabel.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        jPanel3.add(valueLabel);

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 690, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 780, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void publishFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishFoodBtnActionPerformed
        
       // String message = messageJTextField.getText();
       try{ 
       if(!foodQuantityTxtField.getText().isEmpty() && !foodAvailabilityDateTxtField.getText().isEmpty() &&
                   !foodAvailabilityDateTxtField.getText().isEmpty() && !foodTypeTxtField.getText().isEmpty())  
           {
         int quantity = Integer.parseInt(foodQuantityTxtField.getText());
          String availabilityDate = foodAvailabilityDateTxtField.getText();
          
            WorkRequest request;
            request = new DeliveryStatus();
        try {
             // conversion of string to date
            Date date =new SimpleDateFormat("dd/MM/yyyy").parse(availabilityDate);
            request.setPublishDate(date);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid date");
            Logger.getLogger(ManagerJPanel1.class.getName()).log(Level.SEVERE, null, ex);
            }  
        
           request.setFoodType(foodTypeTxtField.getText());
           request.setFoodQuantityInKg(quantity);         
            request.setProvider(userAccount);
        request.setCurrentStatus("Posted");
        
         Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ManagerOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
           }
           
           else
           {
               JOptionPane.showMessageDialog(null,"Please enter valid input to continuee...!!");
           }
       JOptionPane.showMessageDialog(null,"Published Succefully");
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Please enter numeric value in Quantity");
       }
             
        
    }//GEN-LAST:event_publishFoodBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
try{        

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerWorkAreaJPanel dwjp = (ManagerWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
}
catch(Exception e){

}
    }//GEN-LAST:event_backJButtonActionPerformed

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed

    private void foodTypeTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodTypeTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodTypeTxtFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JTextField foodAvailabilityDateTxtField;
    private javax.swing.JTextField foodQuantityTxtField;
    private javax.swing.JTextField foodTypeTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton publishFoodBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
