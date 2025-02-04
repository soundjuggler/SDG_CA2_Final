/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sustainability;

/**
 *
 * @author HARRY
 */
public class LandingPageGUI extends javax.swing.JFrame {

    /**
     * Creates new form LandingPageGUI
     */
    public LandingPageGUI() {
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

        backgroundPNL = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        cianBTN = new javax.swing.JButton();
        harryBTN = new javax.swing.JButton();
        tomBTN = new javax.swing.JButton();
        iconLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Landing Page");
        setResizable(false);

        backgroundPNL.setBackground(new java.awt.Color(0, 124, 186));

        titleLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(210, 231, 241));
        titleLBL.setText("Sustainabilty");

        cianBTN.setBackground(new java.awt.Color(210, 231, 241));
        cianBTN.setForeground(new java.awt.Color(148, 196, 228));
        cianBTN.setText("Marine Challenges");
        cianBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cianBTNActionPerformed(evt);
            }
        });

        harryBTN.setBackground(new java.awt.Color(210, 231, 241));
        harryBTN.setForeground(new java.awt.Color(148, 196, 228));
        harryBTN.setText("Ocean Cleanup Info");
        harryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harryBTNActionPerformed(evt);
            }
        });

        tomBTN.setBackground(new java.awt.Color(210, 231, 241));
        tomBTN.setForeground(new java.awt.Color(148, 196, 228));
        tomBTN.setText("Wasted Plastic Page");
        tomBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomBTNActionPerformed(evt);
            }
        });

        iconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustainability/sdg14.png"))); // NOI18N

        exitBTN.setBackground(new java.awt.Color(210, 231, 241));
        exitBTN.setForeground(new java.awt.Color(148, 196, 228));
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPNLLayout = new javax.swing.GroupLayout(backgroundPNL);
        backgroundPNL.setLayout(backgroundPNLLayout);
        backgroundPNLLayout.setHorizontalGroup(
            backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPNLLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(exitBTN)))
                .addGap(62, 62, 62))
            .addGroup(backgroundPNLLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tomBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(harryBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cianBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLBL)
                .addGap(68, 68, 68))
        );
        backgroundPNLLayout.setVerticalGroup(
            backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPNLLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLBL)
                .addGap(27, 27, 27)
                .addComponent(cianBTN)
                .addGap(43, 43, 43)
                .addComponent(harryBTN)
                .addGap(49, 49, 49)
                .addComponent(tomBTN)
                .addGap(41, 41, 41)
                .addComponent(iconLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBTN)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cianBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cianBTNActionPerformed
        // TODO add your handling code here:
        new CKDonationsGUI().setVisible(true);  //this line declares, creates and show in one line
        this.setVisible(false); //hide this
        this.dispose(); //closes this frame as opposed to setVisible(false);
  
    }//GEN-LAST:event_cianBTNActionPerformed

    private void harryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harryBTNActionPerformed
        // TODO add your handling code here:
        new HROceanCleanupGUI().setVisible(true);  //this line declares, creates and show in one line
        this.setVisible(false); //hide this
        this.dispose(); //closes this frame as opposed to setVisible(false);
  
    }//GEN-LAST:event_harryBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void tomBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomBTNActionPerformed
        // TODO add your handling code here:
        new TBPollutionActivitiesGUI().setVisible(true);  //this line declares, creates and show in one line
        this.setVisible(false); //hide this
        this.dispose(); //closes this frame as opposed to setVisible(false);
  
    }//GEN-LAST:event_tomBTNActionPerformed

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
            java.util.logging.Logger.getLogger(LandingPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPageGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPNL;
    private javax.swing.JButton cianBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton harryBTN;
    private javax.swing.JLabel iconLBL;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JButton tomBTN;
    // End of variables declaration//GEN-END:variables
}
