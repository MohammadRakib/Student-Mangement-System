
package StudentManagement;


import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JFrame;

public class CGPACALCULATOR extends javax.swing.JFrame {
 ArrayList<Double> credit=new ArrayList<>();
 ArrayList<Double> cgpa=new ArrayList<>();
   double fcredit,fcgpa, finalresult,mainresult,creditSum,cgpaSum;
   
   String getcredit,getcgpa;
   
    public CGPACALCULATOR() {
        initComponents();
        seticon();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CREDITLABEL = new javax.swing.JLabel();
        CREDITTEXTFIELD = new javax.swing.JTextField();
        GPALABEL = new javax.swing.JLabel();
        GPATEXTFIELD = new javax.swing.JTextField();
        NEXTBUTTON = new javax.swing.JButton();
        RESETBUTTTON = new javax.swing.JButton();
        CGPABUTTON = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CGPA CALCULATOR");

        CREDITLABEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CREDITLABEL.setText("CREDIT :");

        CREDITTEXTFIELD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CREDITTEXTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREDITTEXTFIELDActionPerformed(evt);
            }
        });

        GPALABEL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GPALABEL.setText("GPA :");

        GPATEXTFIELD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        GPATEXTFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPATEXTFIELDActionPerformed(evt);
            }
        });

        NEXTBUTTON.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        NEXTBUTTON.setText("NEXT");
        NEXTBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTBUTTONActionPerformed(evt);
            }
        });

        RESETBUTTTON.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RESETBUTTTON.setText("RESET");
        RESETBUTTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETBUTTTONActionPerformed(evt);
            }
        });

        CGPABUTTON.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CGPABUTTON.setText("CGPA");
        CGPABUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGPABUTTONActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(CREDITLABEL)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CREDITTEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CGPABUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NEXTBUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GPALABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GPATEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RESETBUTTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(back))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CREDITLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CREDITTEXTFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GPALABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GPATEXTFIELD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NEXTBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RESETBUTTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CGPABUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RESETBUTTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETBUTTTONActionPerformed
       CREDITTEXTFIELD.setText(null);
       GPATEXTFIELD.setText(null);
       jTextField3.setText(null);
    }//GEN-LAST:event_RESETBUTTTONActionPerformed
    //this function is for cgpa button, this calculates the total cgpa 
    private void CGPABUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGPABUTTONActionPerformed
        creditSum=0;
        cgpaSum=0;
        for(int j=0;j<credit.size();j++)
        {
            creditSum=creditSum+credit.get(j);
        }
       
          for(int l=0;l<credit.size();l++)
        {
        for(int k=l;k<=l;k++)
        {
            cgpaSum=cgpaSum+(credit.get(l)*cgpa.get(k));
        }
        }
        
           mainresult=cgpaSum/creditSum;
          System.out.println(mainresult);  
         jTextField3.setText(""+mainresult);
         System.out.println(cgpa);
         System.out.println(credit);
         cgpa.clear();
         credit.clear();
       
        
         System.out.println(mainresult);
    }//GEN-LAST:event_CGPABUTTONActionPerformed
       //this function is for next button, this function takes current cgpa and credit to arraylist
       // and then reset so that user can give new cgpa and credit
    private void NEXTBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTBUTTONActionPerformed
      
         getcredit=CREDITTEXTFIELD.getText();  
         fcredit= Float.parseFloat(getcredit); 
         getcgpa=GPATEXTFIELD.getText();  
         fcgpa=Float.parseFloat(getcgpa); 
      
 
         credit.add(fcredit);
         cgpa.add(fcgpa);
       
         CREDITTEXTFIELD.setText(null);
         GPATEXTFIELD.setText(null);
        
       
    }//GEN-LAST:event_NEXTBUTTONActionPerformed

    private void CREDITTEXTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREDITTEXTFIELDActionPerformed
        
         
    }//GEN-LAST:event_CREDITTEXTFIELDActionPerformed

    private void GPATEXTFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPATEXTFIELDActionPerformed
      
         
    }//GEN-LAST:event_GPATEXTFIELDActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
      
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      dispose();
      AdminInfo admin=new AdminInfo();
       admin.setVisible(true);
       admin.setResizable(false);
       
    }//GEN-LAST:event_backActionPerformed

    
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
            java.util.logging.Logger.getLogger(CGPACALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CGPACALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CGPACALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CGPACALCULATOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CGPACALCULATOR obj = new CGPACALCULATOR();
                obj.setVisible(true);
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CGPABUTTON;
    private javax.swing.JLabel CREDITLABEL;
    private javax.swing.JTextField CREDITTEXTFIELD;
    private javax.swing.JLabel GPALABEL;
    private javax.swing.JTextField GPATEXTFIELD;
    private javax.swing.JButton NEXTBUTTON;
    private javax.swing.JButton RESETBUTTTON;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.jpg")));

    }
}
