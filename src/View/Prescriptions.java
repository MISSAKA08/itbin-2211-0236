/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.InsertController;
import Controller.UpdateController;
import Model.DBConnection;
import Model.DBSearch;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Prescriptions extends javax.swing.JFrame {

    /**
     * Creates new form Prescriptions
     */
    public Prescriptions() {
        initComponents();
        doctorId();
        PatientsId();
        testlabid();
         tableLoad();
        
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
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PiTb = new javax.swing.JTextField();
        mTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        plTF = new javax.swing.JTable();
        doidTF = new javax.swing.JComboBox<>();
        pidTf = new javax.swing.JComboBox<>();
        labTf = new javax.swing.JComboBox<>();
        cTf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        AddBtn1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JPanel();
        UpdateBtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JPanel();
        DeleteBtn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spidTF = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clinic Management system ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 0, 1370, -1));

        PiTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel3.add(PiTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 264, 40));

        mTF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTFActionPerformed(evt);
            }
        });
        jPanel3.add(mTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 230, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 0));
        jLabel11.setText("Mange Prescriptions");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 158, 26));

        jLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 0));
        jLabel12.setText(" Prescriptions Recorded");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, -1));

        plTF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prescriptions Id", "Medicines", "Doctor id", "Patient id", "Lab Test id", "Cost"
            }
        ));
        plTF.setGridColor(new java.awt.Color(51, 51, 255));
        plTF.setRowHeight(25);
        plTF.setRowSelectionAllowed(false);
        plTF.setSelectionBackground(new java.awt.Color(0, 255, 0));
        jScrollPane1.setViewportView(plTF);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 346, 1299, -1));

        doidTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doidTFActionPerformed(evt);
            }
        });
        jPanel3.add(doidTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 160, 40));

        pidTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidTfActionPerformed(evt);
            }
        });
        jPanel3.add(pidTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 150, 40));

        jPanel3.add(labTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 140, 40));

        cTf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel3.add(cTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 190, 230, 40));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\7777.jpeg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\5555 (1).jpeg")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 110));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\66666 (2).jpeg")); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, 70));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\trsxg6bv (1).png")); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 70, 60));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\333.jpeg")); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 70, 80));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\11111.jpeg")); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel29MousePressed(evt);
            }
        });
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 80, 80));

        jLabel30.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Log out");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 730, 70, -1));

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Doctors");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Lab test");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 393, -1, 30));

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Prescrptions");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Patients");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 792));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));

        AddBtn1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        AddBtn1.setText("Add Prescriptions");
        AddBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtn1MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\addd.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 240, 60));

        updateBtn.setBackground(new java.awt.Color(0, 204, 51));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updateBtnMousePressed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        UpdateBtn.setText("update Prescriptions");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\6n8fypqp (1).png")); // NOI18N

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(updateBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 250, 60));

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteBtnMousePressed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete Prescriptions");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\wn0bam05 (1).png")); // NOI18N

        javax.swing.GroupLayout deleteBtnLayout = new javax.swing.GroupLayout(deleteBtn);
        deleteBtn.setLayout(deleteBtnLayout);
        deleteBtnLayout.setHorizontalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteBtnLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteBtnLayout.setVerticalGroup(
            deleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(deleteBtnLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(DeleteBtn)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, -1, 60));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel2.setText(" Prescri id");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel7.setText("Lab test id");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel9.setText("Prescriptions id");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel13.setText("Medicines");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel14.setText("Cost");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 50, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel15.setText("Doctors id");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Enter Prescri ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 153, 33));

        spidTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spidTFActionPerformed(evt);
            }
        });
        jPanel3.add(spidTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 170, 30));

        searchBtn.setBackground(new java.awt.Color(102, 255, 102));
        searchBtn.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search presciption id");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel3.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, 33));

        clear.setBackground(new java.awt.Color(255, 0, 0));
        clear.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear Fields");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 120, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTFActionPerformed

    private void doidTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doidTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doidTFActionPerformed

    private void AddBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtn1MouseClicked

       
        
           if(evt.getSource() == AddBtn1){
          
        String med = mTF.getText();
   String docid = doidTF.getSelectedItem().toString();
   int docID = Integer.parseInt(docid);
   
    String pid = pidTf.getSelectedItem().toString();
       int pId = Integer.parseInt(pid);
   
       String labid = labTf.getSelectedItem().toString();
          int labId = Integer.parseInt(labid);
   
        String cost = cTf.getText();
           int Cost= Integer.parseInt(cost);
   
        
     
            
             InsertController.insertPrescriptions(med,docID,pId, labId, Cost);
    tableLoad();
clearTF();
           }
        
        
        
    }//GEN-LAST:event_AddBtn1MouseClicked

    Statement stmt;
    ResultSet rs;
    
    public void doctorId(){
        
        
        try {
            
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("SELECT d_id FROM doctors");
            
            
            while(rs.next()){
                
               String dID = rs.getString("d_id");
                doidTF.addItem(dID);
                
            }
            
            
            
            
        } catch (Exception e) {
        }
        
        
    }
    public void PatientsId(){
        
        
        try {
            
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("SELECT p_id FROM patient");
            
            
            while(rs.next()){
                
               String pID = rs.getString("p_id");
                pidTf.addItem(pID);
                
            }
            
            
            
            
        } catch (Exception e) {
        }
    }
        public void testlabid(){
        
        
        try {
            
            stmt = DBConnection.getStatementConnection();
            
            rs = stmt.executeQuery("SELECT t_id FROM testlab");
            
            
            while(rs.next()){
                
               String lID = rs.getString("t_id");
                labTf.addItem(lID);
                
            }
            
            
            
            
        } catch (Exception e) {
        } 
        tableLoad();
clearTF();
    }
    
    
    
    
    
    
    private void updateBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMousePressed

if(evt.getSource()== updateBtn){
  String med = mTF.getText();
   String docid = doidTF.getSelectedItem().toString();
   int docID = Integer.parseInt(docid);
   
    String pid = pidTf.getSelectedItem().toString();
       int pId = Integer.parseInt(pid);
   
       String labid = labTf.getSelectedItem().toString();
          int labId = Integer.parseInt(labid);
   
        String cost = cTf.getText();
           int Cost= Integer.parseInt(cost);
   


//UpdateController.updatePrescriptions(med, docID, pId, labId,cost);



tableLoad();
clearTF();
}

        

        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnMousePressed

    private void spidTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spidTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spidTFActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
    try {
            
            String pr_id = spidTF.getText();
            
            ResultSet rs = new DBSearch().searchprescriptions(pr_id);
            
            while(rs.next()){
            
            String pid = rs.getString("pr_id");
            String med = rs.getString("med");
            String docid = rs.getString("d_id");
            String pId = rs.getString("p_id");
         
            String lid = rs.getString("l_id");
            String cost = rs.getString("cost");
           
            
            
              PiTb.setText(pid);
            mTF.setText(med); 
             //doidTF.setText(docid);
            //pidTf.setText(pId);
            //labTf.setText(lid);
              cTf.setText(cost);
           
            
            
}
            
            
            
        } catch (Exception e) {
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
 clearTF();
      

        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void pidTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pidTfActionPerformed

    private void jLabel29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MousePressed


System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Doctors d = new Doctors();
        d.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        testLab t= new testLab();
        t.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Prescriptions p = new Prescriptions();
        p.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Patients p = new Patients();
        p.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

      public void clearTF(){
    
    PiTb.setText("");
    mTF.setText("");
    cTf.setText("");
    spidTF.setText("");
    }
    
      public void tableLoad(){
    
    ResultSet rs = new DBSearch().searchAllprescriptions();
    
        try {
            DefaultTableModel tb1Model = ( DefaultTableModel)plTF.getModel();
            tb1Model.setRowCount(0);
            
            while(rs.next()){
            String pid =rs.getString("pr_id");
                   
            String med =rs.getString("med");
            String did = rs.getString("d_id");
            String pId =rs.getString("p_id");
            String lid = rs.getString("l_id");
            String cost =rs.getString("cost");
         
            
            String tbData[] = {pid,med,did,pId,lid,cost};
           
            
            tb1Model.addRow(tbData);
            
            }
        } catch (Exception e) {
        }
      }
      
    private void deleteBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMousePressed

String pid = PiTb.getText();

        try {
            
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM prescriptions WHERE pr_id= '"+pid+"' ");
            
            if(pid.equals("")){
                
                 
            }
            else{
                 JOptionPane.showMessageDialog(null, "Record Deleted successfully");
                
            }
            
          
            
        } catch (Exception e) {
        }

tableLoad();
clearTF();
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescriptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prescriptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBtn1;
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JTextField PiTb;
    private javax.swing.JLabel UpdateBtn;
    private javax.swing.JTextField cTf;
    private javax.swing.JButton clear;
    private javax.swing.JPanel deleteBtn;
    private javax.swing.JComboBox<String> doidTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> labTf;
    private javax.swing.JTextField mTF;
    private javax.swing.JComboBox<String> pidTf;
    private javax.swing.JTable plTF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField spidTF;
    private javax.swing.JPanel updateBtn;
    // End of variables declaration//GEN-END:variables
}