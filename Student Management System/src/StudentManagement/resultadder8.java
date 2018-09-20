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

public class resultadder8 extends javax.swing.JFrame {
 Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static int row;
    static int row2;
    static int row3;
    static String getid;
    static int mouseclickedchoice = 0;
    static String id;
    static String deleteString;
    static boolean add,edit;
   
    public resultadder8() {
        initComponents();
        seticon();
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        update_table();
    }
     //show data from database into gui table
    public void update_table() {

        try {
            pst = conn.prepareStatement("select * from FOURTH_YEAR_SECOND_SEMESTER");
            rs = pst.executeQuery();
           result_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        result_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

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

        result_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        result_table.getTableHeader().setReorderingAllowed(false);
        result_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(result_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EditData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Back)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search_field)
                                .addGap(27, 27, 27)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DataForm)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RefreshTable)
                        .addGap(318, 318, 318))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
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
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(RefreshTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //add button, this allow to go addresult4thyear2ndsemester jframe
    private void AddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDataActionPerformed
        addresult4thyear2ndsemester ob = new addresult4thyear2ndsemester();
        ob.setVisible(true);
        dispose();
        add=true;
        edit=false;
    }//GEN-LAST:event_AddDataActionPerformed
     //for remove button, remove selected data from database
    private void RemoveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDataActionPerformed
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
            PreparedStatement pst = conn.prepareStatement("delete from FOURTH_YEAR_SECOND_SEMESTER WHERE ID=?");
            pst.setString(1, deleteString);
            pst.execute();

            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        update_table();
    }//GEN-LAST:event_RemoveDataActionPerformed
       // for edit button, allow to data edit
    private void EditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDataActionPerformed
        mouseclickedchoice = 1;
        edit=true;
        add=false;
    }//GEN-LAST:event_EditDataActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed

    }//GEN-LAST:event_search_fieldActionPerformed
       //for search button, search data from database
    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
            PreparedStatement pst = conn.prepareStatement("select * from FOURTH_YEAR_SECOND_SEMESTER WHERE ID=?");
            pst.setString(1, search_field.getText());
            ResultSet rs = pst.executeQuery();
            result_table.setModel(DbUtils.resultSetToTableModel(rs));

            conn.close();

        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed
       //back to studentresult frame
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        studentresult frame1 = new studentresult();
        frame1.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed
     //for dataform button to see data in form
    private void DataFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataFormActionPerformed
        mouseclickedchoice = 2;
    }//GEN-LAST:event_DataFormActionPerformed
      // this is for refresh button, refresh table from database
    private void RefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshTableActionPerformed
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");

        } catch (SQLException ex) {
            System.err.println(ex);
        }
        update_table();
    }//GEN-LAST:event_RefreshTableActionPerformed
       // this will work when mouseclicked in the row of table
    private void result_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_result_tableMouseClicked

        if (mouseclickedchoice == 1) {  // show data for selected row for editing
            addresult4thyear2ndsemester ob = new addresult4thyear2ndsemester();
            ob.setVisible(true);
            dispose();

            try {

                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                row = result_table.getSelectedRow();
                String value = (result_table.getModel().getValueAt(row, 0).toString());
                String sql = "select * from FOURTH_YEAR_SECOND_SEMESTER where ID='" + value + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String add1 = rs.getString("ID");
                    getid = rs.getString("ID");
                    ob.getID().setText(add1);
                    String add2 = rs.getString("COURSE_1");
                    ob.getCourse1().setText(add2);
                    String add3 = rs.getString("COURSE_2");
                    ob.getCourse2().setText(add3);
                    String add4 = rs.getString("COURSE_3");
                    ob.getCourse3().setText(add4);
                    String add5 = rs.getString("COURSE_4");
                    ob.getCourse4().setText(add5);
                    String add6 = rs.getString("COURSE_5");
                    ob.getCourse5().setText(add6);
                    String add7 = rs.getString("COURSE_6");
                    ob.getCourse6().setText(add7);
                    String add8 = rs.getString("COURSE_7");
                    ob.getCourse7().setText(add8);
                    String add9 = rs.getString("COURSE_8");
                    ob.getCourse8().setText(add9);
                    String add10 = rs.getString("COURSE_9");
                    ob.getCourse9().setText(add10);
                    String add11 = rs.getString("TOTALCGPA");
                    ob.getTotalcgpa().setText(add11);

                }

                conn.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }

            mouseclickedchoice = 0;
        } else if (mouseclickedchoice == 2) { // show data from database for selected row in info form

            resultshowfourtwo ob = new resultshowfourtwo();
            ob.setVisible(true);
            dispose();
            try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                row2 = result_table.getSelectedRow();
                String value = (result_table.getModel().getValueAt(row2, 0).toString());
                String sql = "select * from FOURTH_YEAR_SECOND_SEMESTER where ID='" + value + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String add1 = rs.getString("ID");
                    getid = rs.getString("ID");
                    ob.getID().setText(add1);
                    String add2 = rs.getString("COURSE_1");
                    ob.getCourse1().setText(add2);
                    String add3 = rs.getString("COURSE_2");
                    ob.getCourse2().setText(add3);
                    String add4 = rs.getString("COURSE_3");
                    ob.getCourse3().setText(add4);
                    String add5 = rs.getString("COURSE_4");
                    ob.getCourse4().setText(add5);
                    String add6 = rs.getString("COURSE_5");
                    ob.getCourse5().setText(add6);
                    String add7 = rs.getString("COURSE_6");
                    ob.getCourse6().setText(add7);
                    String add8 = rs.getString("COURSE_7");
                    ob.getCourse7().setText(add8);
                    String add9 = rs.getString("COURSE_8");
                    ob.getCourse8().setText(add9);
                    String add10 = rs.getString("COURSE_9");
                    ob.getCourse9().setText(add10);
                    String add11 = rs.getString("TOTALCGPA");
                    ob.getTotalcgpa().setText(add11);

                }

                conn.close();

            } catch (SQLException ex) {
                System.err.println(ex);
            }
            mouseclickedchoice = 0;

        }

        row2 = result_table.getSelectedRow();
        deleteString = (result_table.getModel().getValueAt(row2, 0).toString());
    }//GEN-LAST:event_result_tableMouseClicked

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
            java.util.logging.Logger.getLogger(resultadder8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultadder8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultadder8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultadder8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultadder8().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable result_table;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
