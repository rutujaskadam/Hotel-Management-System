/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading = new javax.swing.JLabel();
        Customerid = new javax.swing.JLabel();
        customerid1 = new javax.swing.JTextField();
        fname = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        lname = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        phno = new javax.swing.JLabel();
        phno1 = new javax.swing.JTextField();
        city = new javax.swing.JLabel();
        city1 = new javax.swing.JTextField();
        state = new javax.swing.JLabel();
        state1 = new javax.swing.JTextField();
        SUBMIT = new javax.swing.JToggleButton();
        reset = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Heading.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        Heading.setText("Customer Details");

        Customerid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Customerid.setText("Customer ID");

        customerid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerid1ActionPerformed(evt);
            }
        });

        fname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        fname.setText("First name");

        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });

        lname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lname.setText("Last name");

        phno.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        phno.setText("Contact Details");

        phno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phno1ActionPerformed(evt);
            }
        });

        city.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        city.setText("City");

        state.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        state.setText("State");

        SUBMIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SUBMIT.setText("Submit");

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fname)
                            .addComponent(Customerid)
                            .addComponent(lname)
                            .addComponent(phno)
                            .addComponent(city))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(phno1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lname1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerid1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(state)
                                .addGap(65, 65, 65)
                                .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(SUBMIT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reset))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Customerid)
                            .addComponent(customerid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(state)
                            .addComponent(state1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname)
                            .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lname)
                            .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(phno))
                    .addComponent(phno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUBMIT)
                    .addComponent(reset))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerid1ActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_customerid1ActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_fname1ActionPerformed

    private void phno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phno1ActionPerformed

    private void city1ActionPerformed(java.awt.event.ActionEvent evt) { 
        
    }
    
    private void state1ActionPerformed(java.awt.event.ActionEvent evt) { 
        
    }
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
             // TODO add your handling code here:
              customerid1.setText("");
              fname1.setText("");
              lname1.setText("");
              phno1.setText("");
              city1.setText("");
              state1.setText("");
              
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customerid;
    private javax.swing.JLabel Heading;
    private javax.swing.JToggleButton SUBMIT;
    private javax.swing.JLabel city;
    private javax.swing.JTextField city1;
    private javax.swing.JTextField customerid1;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField lname1;
    private javax.swing.JLabel phno;
    private javax.swing.JTextField phno1;
    private javax.swing.JToggleButton reset;
    private javax.swing.JLabel state;
    private javax.swing.JTextField state1;
    // End of variables declaration//GEN-END:variables
}
