/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class StudentDataEdit extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static int row;
    static int row2;
    static int row3;
    static String getid;
    static int mouseclickchoice = 0;
    static String id;
    static String deleteString;
    static boolean add,edit;

    public StudentDataEdit() {
        initComponents();
        seticon();
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        update_table();
    }
      //show data from database into gui table
    public void update_table() {

        try {
            pst = conn.prepareStatement("select * from INFOTABLE");
            rs = pst.executeQuery();
            StudentInfoTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentInfoTable = new javax.swing.JTable();
        AddData = new javax.swing.JButton();
        RemoveData = new javax.swing.JButton();
        EditData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        DataForm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RefreshTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        StudentInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentInfoTable.getTableHeader().setReorderingAllowed(false);
        StudentInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentInfoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentInfoTable);
        if (StudentInfoTable.getColumnModel().getColumnCount() > 0) {
            StudentInfoTable.getColumnModel().getColumn(0).setResizable(false);
            StudentInfoTable.getColumnModel().getColumn(1).setResizable(false);
            StudentInfoTable.getColumnModel().getColumn(2).setResizable(false);
            StudentInfoTable.getColumnModel().getColumn(3).setResizable(false);
        }

        AddData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddData.setText("Add New Data");
        AddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDataActionPerformed(evt);
            }
        });

        RemoveData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RemoveData.setText("Remove Data");
        RemoveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDataActionPerformed(evt);
            }
        });

        EditData.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EditData.setText("Edit Data");
        EditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH");

        search_field.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagement/Search.png"))); // NOI18N
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        DataForm.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DataForm.setText("See Data In Form ");
        DataForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataFormActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Click see data in form button then select row form table");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Click edit data button then select the row from table");

        RefreshTable.setBackground(new java.awt.Color(0, 204, 204));
        RefreshTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RefreshTable.setText("Refresh Table");
        RefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1245, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddData, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(RemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EditData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(Back)
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(search_field, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                        .addGap(27, 27, 27)
                                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DataForm)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RefreshTable)
                                .addGap(318, 318, 318)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EditData, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddData, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataForm)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(RefreshTable)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed

    }//GEN-LAST:event_search_fieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        AdminInfo frame1 = new AdminInfo();
        frame1.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    //add button, this allow to go addnewdata jframe
    private void AddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataActionPerformed
        AddNewData ob = new AddNewData();
        ob.setVisible(true);
        dispose();
        add=true;
        edit=false;
    }//GEN-LAST:event_AddDataActionPerformed
     // for edit button, allow to data edit
    private void EditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDataActionPerformed
        mouseclickchoice = 1;
        edit=true;
        add=false;
        
    }//GEN-LAST:event_EditDataActionPerformed
           // this will work when mouseclicked in the row of table
    private void StudentInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentInfoTableMouseClicked
        if (mouseclickchoice == 1) {// show data for selected row for editing
            AddNewData ob = new AddNewData();
            ob.setVisible(true);
            dispose();

            try {

                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");
                row = StudentInfoTable.getSelectedRow();
                String value = (StudentInfoTable.getModel().getValueAt(row, 1).toString());
                String sql = "select * from INFOTABLE where ID='" + value + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String add1 = rs.getString("NAME");
                    getid = rs.getString("ID");
                    ob.getname().setText(add1);
                    String add2 = rs.getString("ID");
                    ob.getID().setText(add2);
                    String add3 = rs.getString("SECTION");
                    ob.getSection().setText(add3);
                    String add4 = rs.getString("DEPARTMENT");
                    ob.getDepartment().setText(add4);
                    String add5 = rs.getString("EMAIL");
                    ob.getEmail().setText(add5);
                    String add6 = rs.getString("PHONENUMBER");
                    ob.getPhoneNUM().setText(add6);
                    String add7 = rs.getString("FATHERNAME");
                    ob.getFatherNam().setText(add7);
                    String add8 = rs.getString("MOTHERNAME");
                    ob.getMotherNam().setText(add8);
                    String add9 = rs.getString("ADDRESS");
                    ob.getAddress().setText(add9);
                    String add10 = rs.getString("PERMANENTADDRESS");
                    ob.getPermanentAddrs().setText(add10);
                    String add11 = rs.getString("BLOODGROUP");
                    ob.getBloodGrp().setText(add11);
                }

                conn.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }

            mouseclickchoice = 0;
        } else if (mouseclickchoice == 2) {
                // show data from database for selected row in info form
            InfoForm ob = new InfoForm();
            ob.setVisible(true);
            dispose();
            try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");
                row2 = StudentInfoTable.getSelectedRow();
                String value = (StudentInfoTable.getModel().getValueAt(row2, 1).toString());
                String sql = "select * from INFOTABLE where ID='" + value + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String add1 = rs.getString("NAME");
                    getid = rs.getString("ID");
                    ob.getname().setText(add1);
                    String add2 = rs.getString("ID");
                    ob.getID().setText(add2);
                    String add3 = rs.getString("SECTION");
                    ob.getSection().setText(add3);
                    String add4 = rs.getString("DEPARTMENT");
                    ob.getDepartment().setText(add4);
                    String add5 = rs.getString("EMAIL");
                    ob.getEmail().setText(add5);
                    String add6 = rs.getString("PHONENUMBER");
                    ob.getPhoneNUM().setText(add6);
                    String add7 = rs.getString("FATHERNAME");
                    ob.getFatherNam().setText(add7);
                    String add8 = rs.getString("MOTHERNAME");
                    ob.getMotherNam().setText(add8);
                    String add9 = rs.getString("ADDRESS");
                    ob.getAddress().setText(add9);
                    String add10 = rs.getString("PERMANENTADDRESS");
                    ob.getPermanentAddrs().setText(add10);
                    String add11 = rs.getString("BLOODGROUP");
                    ob.getBloodGrp().setText(add11);
                }

                conn.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }
            mouseclickchoice = 0;

        }

        row2 = StudentInfoTable.getSelectedRow();
        deleteString = (StudentInfoTable.getModel().getValueAt(row2, 1).toString());


    }//GEN-LAST:event_StudentInfoTableMouseClicked
       //search data in database
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");
            PreparedStatement pst = conn.prepareStatement("select * from INFOTABLE WHERE ID=?");
            pst.setString(1, search_field.getText());
            ResultSet rs = pst.executeQuery();
            StudentInfoTable.setModel(DbUtils.resultSetToTableModel(rs));

            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed
      //to see data in form
    private void DataFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataFormActionPerformed
        mouseclickchoice = 2;

    }//GEN-LAST:event_DataFormActionPerformed
         //refresh table from database
    private void RefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshTableActionPerformed
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        update_table();


    }//GEN-LAST:event_RefreshTableActionPerformed
        //remove data from database
    private void RemoveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDataActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");
            PreparedStatement pst = conn.prepareStatement("delete from INFOTABLE WHERE ID=?");
            pst.setString(1, deleteString);
            pst.execute();

            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/StudentAllData", "info", "info");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        update_table();


    }//GEN-LAST:event_RemoveDataActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDataEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDataEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDataEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDataEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDataEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddData;
    private javax.swing.JButton Back;
    private javax.swing.JButton DataForm;
    private javax.swing.JButton EditData;
    private javax.swing.JButton RefreshTable;
    private javax.swing.JButton RemoveData;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTable StudentInfoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
