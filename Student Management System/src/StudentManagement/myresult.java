/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import static StudentManagement.resultadder.row2;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author moham
 */
public class myresult extends javax.swing.JFrame {

    /**
     * Creates new form myresult
     */
    public myresult() {
        initComponents();
        seticon();
    }
      //get result for first  year first semester and show it into form 
    public void getoneoneresult(String myid){
        
        resultshowoneone ob=new resultshowoneone();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from FIRST_YEAR_FIRST_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }
           //get result for first  year second semester and show it into form 
    public void getonetworesult(String myid){
        resultshowonetwo ob=new resultshowonetwo();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from FIRST_YEAR_SECOND_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
        
    }
    //get result for 2nd  year first semester and show it into form 
    public void gettwooneresult(String myid){
        
        resultshowtwoone ob=new resultshowtwoone();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from SECOND_YEAR_FIRST_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }
       //get result for 2nd  year 2nd semester and show it into form 
    public void gettwotworesult(String myid){
        
        resultshowtwotwo ob=new resultshowtwotwo();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from SECOND_YEAR_SECOND_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }
      //get result for 3rd  year first semester and show it into form 
    public void getthreeoneresult(String myid){
        
        resultshowthreeone ob=new resultshowthreeone();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from THIRD_YEAR_FIRST_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }
       //get result for 3rd  year 2nd semester and show it into form 
    public void getthreetworesult(String myid){
        
        resultshowthreetwo ob=new resultshowthreetwo();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from THIRD_YEAR_SECOND_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }
       //get result for 4th  year first semester and show it into form 
    public void getfouroneresult(String myid){
        
        resultshowfourone ob=new resultshowfourone();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from FOURTH_YEAR_FIRST_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }
    //get result for 4th  year 2nd semester and show it into form 
    public void getfourtworesult(String myid){
        
        resultshowfourtwo ob=new resultshowfourtwo();
        ob.setVisible(true);
        dispose();
         try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/resultCGPA", "resultCGPA", "resultCGPA");
                String sql = "select * from FOURTH_YEAR_SECOND_SEMESTER where ID='" + myid + "' ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                String add1 = rs.getString("ID");
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
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TWOTWO = new javax.swing.JButton();
        ONEONE = new javax.swing.JButton();
        ONETWO = new javax.swing.JButton();
        FOURTWO = new javax.swing.JButton();
        TWOONE = new javax.swing.JButton();
        THREEONE = new javax.swing.JButton();
        THREETWO = new javax.swing.JButton();
        FOURONE = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RESULT DATA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        TWOTWO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TWOTWO.setText("2nd YEAR 2nd SEMESTER");
        TWOTWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TWOTWOActionPerformed(evt);
            }
        });

        ONEONE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ONEONE.setText("1st YEAR 1st SEMESTER");
        ONEONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONEONEActionPerformed(evt);
            }
        });

        ONETWO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ONETWO.setText("1st YEAR 2nd SEMESTER");
        ONETWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONETWOActionPerformed(evt);
            }
        });

        FOURTWO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FOURTWO.setText("4th YEAR 2nd SEMESTER");
        FOURTWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOURTWOActionPerformed(evt);
            }
        });

        TWOONE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TWOONE.setText("2nd YEAR 1st SEMESTER");
        TWOONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TWOONEActionPerformed(evt);
            }
        });

        THREEONE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        THREEONE.setText("3rd YEAR 1st SEMESTER");
        THREEONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THREEONEActionPerformed(evt);
            }
        });

        THREETWO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        THREETWO.setText("3rd YEAR 2nd SEMESTER");
        THREETWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THREETWOActionPerformed(evt);
            }
        });

        FOURONE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FOURONE.setText("4th YEAR 1st SEMESTER");
        FOURONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOURONEActionPerformed(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(0, 0, 255));
        BACK.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FOURTWO, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THREETWO, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(THREEONE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TWOONE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ONETWO, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ONEONE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TWOTWO, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FOURONE, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(BACK)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ONEONE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ONETWO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TWOONE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TWOTWO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(THREEONE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(THREETWO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FOURONE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FOURTWO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      //call gettwotworesult function
    private void TWOTWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TWOTWOActionPerformed
      STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
      gettwotworesult(ob.studentId);
    }//GEN-LAST:event_TWOTWOActionPerformed
     //call getoneoneresult function
    private void ONEONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONEONEActionPerformed
      STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
      getoneoneresult(ob.studentId);
    }//GEN-LAST:event_ONEONEActionPerformed
       //call getonetworesult function
    private void ONETWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONETWOActionPerformed
        STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
      getonetworesult(ob.studentId);
    }//GEN-LAST:event_ONETWOActionPerformed
        //call getfourtworesult function
    private void FOURTWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOURTWOActionPerformed
       STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
       getfourtworesult(ob.studentId);
    }//GEN-LAST:event_FOURTWOActionPerformed
       //call gettwooneresult function
    private void TWOONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TWOONEActionPerformed
        STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
      gettwooneresult(ob.studentId);

    }//GEN-LAST:event_TWOONEActionPerformed
      //call getthreeoneresult function
    private void THREEONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THREEONEActionPerformed
       STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
       getthreeoneresult(ob.studentId);
    }//GEN-LAST:event_THREEONEActionPerformed
       //call getthreetworesult function
    private void THREETWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THREETWOActionPerformed
       STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
       getthreetworesult(ob.studentId);
    }//GEN-LAST:event_THREETWOActionPerformed
       //call getfouroneresult function
    private void FOURONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOURONEActionPerformed
        STUDENTLOGICFORM ob=new STUDENTLOGICFORM();
        getfouroneresult(ob.studentId);
    }//GEN-LAST:event_FOURONEActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        dispose();
        STUDENTINFO ob=new STUDENTINFO();
        ob.setVisible(true);

    }//GEN-LAST:event_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(myresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton FOURONE;
    private javax.swing.JButton FOURTWO;
    private javax.swing.JButton ONEONE;
    private javax.swing.JButton ONETWO;
    private javax.swing.JButton THREEONE;
    private javax.swing.JButton THREETWO;
    private javax.swing.JButton TWOONE;
    private javax.swing.JButton TWOTWO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
