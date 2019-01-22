/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NeedRoleInterface;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.SupervisorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryStatus;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.management.StringValueExp;
import userinterface.AdministrativeRole.ManageEmployeeJPanel;
import userinterface.Email.Email;

/**
 *
 * @author arjun
 */
public class SupervisorRoleWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form supervisorInterface
     */
    private JPanel userProcessContainer;
    private SupervisorOrganization supervisorOrganization;
    private ManagerOrganization managerOrganization;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization outorganization;
    private Network network;
    Ecosystem ecosystem;
    private TableRowSorter<DefaultTableModel> sorter;
    Session mailSession;
    MimeMessage emailMessage;
    private ArrayList<WorkRequest> workRequestList;
    int quantity = 0;

    public SupervisorRoleWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization,
            Ecosystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        supervisorOrganization = (SupervisorOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        DefaultTableModel model2 = (DefaultTableModel) workRequestJTable.getModel();

        quantity = populateSupervisorWorkTable1(model2);
        jLabelTotalQuantity.setText(String.valueOf(quantity));
        this.organization = organization;
        populateSearchByTypeComboBox();
        populateSearchByQuantityComboBox();
        workRequestList = organization.getWorkQueue().getWorkRequestList();
        DefaultTableModel model = (DefaultTableModel) jTableFoodRequest.getModel();
        jLabelEnterpriseName.setText(enterprise.getEnterpriseName());

        populateRequestWorkTable(model);
    }

    private void populateSearchByTypeComboBox() {
        searchByTypeJComboBox.removeAllItems();
        Set<String> hset = new HashSet<String>();
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                        
                        String ar = request.getFoodType().toLowerCase();
                       hset.add(ar);

            }
        }

        }
        }
        for (String s : hset) {
    searchByTypeJComboBox.addItem(s);
}
        
    }

    private void populateSearchByQuantityComboBox() {
        
        ArrayList<String> array = new ArrayList<>();
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                        
                    }
                }
            }
        }
    }
    


    public int populateSupervisorWorkTable1(DefaultTableModel model2) {
        int x = 0;
        model2.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                        if(request.getReceiver()==null){
                                Object[] row = new Object[4];
                        row[0] = request;
                        row[1] = request.getFoodQuantityInKg();
                        row[2] = request.getCurrentStatus();
                        String result = ((DeliveryStatus) request).getStatus();
                        row[3] = request.getFoodType();
                        model2.addRow(row);
                    }
                    }
                }
            }
        }
        return x;
    }

    public void populateRequestWorkTable(DefaultTableModel model) {

        model.setRowCount(0);
//        for (Network  network: ecosystem.getNetworkList()){
//        for (Enterprise enterprise :network.getEnterpriseDirectory().getEnterpriseList()){
//       for (SupervisorOrganization organization:(SupervisorOrganization) enterprise.getOrganizationDirectory().getOrganizationList())
        for (WorkRequest request : supervisorOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[2];
            row[0] = request;
            row[1] = request.getFoodQuantityInKg();
            
          
            model.addRow(row);
        }

    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEnterpriseName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchByTypeJComboBox = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButtonEmail = new javax.swing.JButton();
        jButtonRequestFood = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFoodRequest = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabelTotalQuantity = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("___________________________________________________________________________________________________");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Administrator_Male_48px.png"))); // NOI18N
        jLabel11.setText("Supervisor's Work Space");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("___________________________________________________________________________________________________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel11)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(2, 2, 2)
                .addComponent(jLabel12)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Company_21px_3.png"))); // NOI18N
        jLabel1.setText("Enterprise Name");

        jLabelEnterpriseName.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabelEnterpriseName.setText("<enterprise name>");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel2.setText("Pickup Food");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel3.setText("Search ByType");

        searchByTypeJComboBox.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N

        Search.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Search_21px_1.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Finger_Up_21px.png"))); // NOI18N
        jLabel4.setText("Select Food Provider");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Provider", "Quantity", "Status", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jButtonEmail.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jButtonEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Email_21px.png"))); // NOI18N
        jButtonEmail.setText("Email");
        jButtonEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmailActionPerformed(evt);
            }
        });

        jButtonRequestFood.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jButtonRequestFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Vegetarian_Food_21px.png"))); // NOI18N
        jButtonRequestFood.setText("Request Food");
        jButtonRequestFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequestFoodActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Finger_Up_21px.png"))); // NOI18N
        jButton1.setText("Show All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRequestFood, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jButtonEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEnterpriseName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchByTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Search)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(searchByTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search)
                            .addComponent(jButton1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabelEnterpriseName)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonRequestFood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEmail))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Finger_Up_21px.png"))); // NOI18N
        jLabel5.setText("Selected Providers");

        jTableFoodRequest.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jTableFoodRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Provider", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableFoodRequest);

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jLabel16.setText("TOTAL QUANTITY");

        jLabelTotalQuantity.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N

        jButton2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Delete_21px.png"))); // NOI18N
        jButton2.setText("Delete Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Show Status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        jLabel7.setText("Beginning");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Requested");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("On The Way");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("              Delivered");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRequestFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequestFoodActionPerformed
        // TODO add your handling code here:

        // int selectedRow=0;
      try{
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0) {
             JOptionPane.showMessageDialog(null, "Please select a row");

        } 
          WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            try {
                ((DefaultTableModel) workRequestJTable.getModel()).removeRow(selectedRow);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Can't Proceed");
            
            }
            workRequestJTable.setCellSelectionEnabled(false);
           
            
            //Sending request block
            request.setReceiver(userAccount);
        request.setDeliveryOption("pickup");
        //End of send block...
        
           
            request.setCurrentStatus("Pending");
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof SupervisorOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            DefaultTableModel model = (DefaultTableModel) jTableFoodRequest.getModel();

            populateRequestWorkTable(model);
            JOptionPane.showMessageDialog(null, "Request Send");
            jProgressBar1.setValue(0);
            
            request.setRecieverAddress(enterprise.getEnterpriseAddress());
            
        }
        catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Invalid Opration");

        }
       
        
    }//GEN-LAST:event_jButtonRequestFoodActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTableFoodRequest.getSelectedRow();
    try{
        if (selectedRow < 0) {
                            JOptionPane.showMessageDialog(null, "Can't Delete");

        }
        else
        {
        WorkRequest request = (WorkRequest) jTableFoodRequest.getValueAt(selectedRow, 0);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof SupervisorOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().remove(request);
            userAccount.getWorkQueue().getWorkRequestList().remove(request);
        }
          DefaultTableModel model = (DefaultTableModel) jTableFoodRequest.getModel();

        populateRequestWorkTable(model);
                                    JOptionPane.showMessageDialog(null, "Delete Successfull");

        }
}
catch(Exception e){
          JOptionPane.showMessageDialog(null,"Invalid Opration");

}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) jTableFoodRequest.getModel();
//int rowCount = workRequestJTable.getRowCount();
try{
        int rowCount = workRequestJTable.getRowCount();

        DefaultTableModel model3 = (DefaultTableModel) workRequestJTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model3.removeRow(i);
        }
            String foodtype = String.valueOf(searchByTypeJComboBox.getSelectedItem());
            
    for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                          if(request.getFoodType().equalsIgnoreCase(foodtype)){
                    
                        Object[] row = new Object[5];
                        row[0] = request;
                        row[1] = request.getFoodQuantityInKg();
                        row[2] = request.getCurrentStatus();
                        String result = ((DeliveryStatus) request).getStatus();
                        row[3] = request.getFoodType();
                        model3.addRow(row);
                          }
                    }}}}
//        RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter(searchByTypeJComboBox.getSelectedItem().toString(), 0);
//        sorter.setRowFilter(rf);
//        sorter = new TableRowSorter<DefaultTableModel>(model);
//        workRequestJTable.setRowSorter(sorter);
}catch(Exception e){
          JOptionPane.showMessageDialog(null,"Invalid Opration");

}

    }//GEN-LAST:event_SearchActionPerformed

    private void jButtonEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmailActionPerformed
        // TODO add your handling code here:
        Email emailJpanel = new Email(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", emailJpanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model2 = (DefaultTableModel) workRequestJTable.getModel();

        quantity = populateSupervisorWorkTable1(model2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableFoodRequest.getModel();

        int selectedRow = jTableFoodRequest.getSelectedRow();

        try{
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Cant");

            }
            else
            {
                WorkRequest request = (WorkRequest) jTableFoodRequest.getValueAt(selectedRow, 0);
                String result = ((DeliveryStatus) request).getCurrentStatus();

                if (result == null) {
                    jProgressBar1.setValue(0);
                } else if(result.equalsIgnoreCase("pending")) {
                    jProgressBar1.setValue(25);
                }else if(result.equalsIgnoreCase("on the way")) {
                    jProgressBar1.setValue(75);
                }
                else if(result.equalsIgnoreCase("Delivered")) {
                    jProgressBar1.setValue(100);
                }
                else{
                     JOptionPane.showMessageDialog(null, "Pickup");
            }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Status Not Available");
                                jProgressBar1.setValue(0);

        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEmail;
    private javax.swing.JButton jButtonRequestFood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEnterpriseName;
    private javax.swing.JLabel jLabelTotalQuantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFoodRequest;
    private javax.swing.JComboBox<Object> searchByTypeJComboBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
