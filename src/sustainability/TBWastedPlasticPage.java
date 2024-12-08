/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sustainability;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author tombr
 */
public class TBWastedPlasticPage extends javax.swing.JFrame {
    ArrayList <TBWastedPlastic> plist = new ArrayList<>();
    /**
     * Creates new form WastedPlasticPage
     */
    public TBWastedPlasticPage() {
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

        jPanel1 = new javax.swing.JPanel();
        wastedPlasticPageLBL = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dolphinsAffectedLBL = new javax.swing.JLabel();
        dolphinsAffectedTF = new javax.swing.JTextField();
        damageCostsLBL = new javax.swing.JLabel();
        damageCostsTF = new javax.swing.JTextField();
        turtlesAffectedLBL = new javax.swing.JLabel();
        locationLBL = new javax.swing.JLabel();
        turtlesAffectedTF = new javax.swing.JTextField();
        locationTF = new javax.swing.JTextField();
        amountDumpedLBL = new javax.swing.JLabel();
        amountDumpedTF = new javax.swing.JTextField();
        typeOfDebrisLBL = new javax.swing.JLabel();
        typeOfDebrisTF = new javax.swing.JTextField();
        cleanUpPartnerLBL = new javax.swing.JLabel();
        cleanUpPartnerTF = new javax.swing.JTextField();
        pollutionActivitiesBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        viewBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        wastedPlasticTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        wastedPlasticPageLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        wastedPlasticPageLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wastedPlasticPageLBL.setText("Wasted Plastic Page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(wastedPlasticPageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(wastedPlasticPageLBL)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        dolphinsAffectedLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        dolphinsAffectedLBL.setText("Dolphins Affected");

        damageCostsLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        damageCostsLBL.setText("Damage Costs");

        turtlesAffectedLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        turtlesAffectedLBL.setText("Turtles Affected");

        locationLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        locationLBL.setText("Location");

        amountDumpedLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        amountDumpedLBL.setText("Amount Dumped");

        typeOfDebrisLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        typeOfDebrisLBL.setText("Type Of Debris");

        cleanUpPartnerLBL.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        cleanUpPartnerLBL.setText("Clean Up Partner");

        pollutionActivitiesBTN.setText("Pollution Activities");
        pollutionActivitiesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollutionActivitiesBTNActionPerformed(evt);
            }
        });

        addBTN.setText("ADD");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        viewBTN.setText("VIEW");
        viewBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        wastedPlasticTA.setColumns(20);
        wastedPlasticTA.setRows(5);
        jScrollPane1.setViewportView(wastedPlasticTA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(pollutionActivitiesBTN))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addBTN)
                                .addGap(52, 52, 52)
                                .addComponent(viewBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBTN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(typeOfDebrisLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typeOfDebrisTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(turtlesAffectedLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(turtlesAffectedTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dolphinsAffectedLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(damageCostsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(locationLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dolphinsAffectedTF, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(damageCostsTF)
                                    .addComponent(locationTF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(amountDumpedLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(amountDumpedTF))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cleanUpPartnerLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(cleanUpPartnerTF))
                            .addComponent(jScrollPane1))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(turtlesAffectedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turtlesAffectedLBL))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dolphinsAffectedLBL)
                    .addComponent(dolphinsAffectedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(damageCostsLBL)
                    .addComponent(damageCostsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locationLBL)
                    .addComponent(locationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountDumpedLBL)
                    .addComponent(amountDumpedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfDebrisLBL)
                    .addComponent(typeOfDebrisTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanUpPartnerLBL)
                    .addComponent(cleanUpPartnerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(viewBTN)
                    .addComponent(deleteBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(pollutionActivitiesBTN)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pollutionActivitiesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollutionActivitiesBTNActionPerformed
        // TODO add your handling code here:
        new TBPollutionActivitiesGUI().setVisible(true);
        this.setVisible(false);
        System.out.println("closed");
        this.dispose();
    }//GEN-LAST:event_pollutionActivitiesBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        if(plist.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nothing in system");
        } else {
            String searchTerm = JOptionPane.showInputDialog(null, "Enter name");
            for(int i = 0; i < plist.size(); i++) {
                TBWastedPlastic temp = plist.get(i);
                if(temp.getCleanUpPartner().equalsIgnoreCase(searchTerm)){
                    plist.remove(i);
                    JOptionPane.showMessageDialog(null, "It's gone now");
                }
            }
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:  
        int turtlesAffected = Integer.parseInt(turtlesAffectedTF.getText());
        int dolphinsAffected = Integer.parseInt(dolphinsAffectedTF.getText());
        int damageCosts = Integer.parseInt(damageCostsTF.getText());
        String location = locationTF.getText();
        int amountDumped = Integer.parseInt(amountDumpedTF.getText());
        String typeOfDebris = typeOfDebrisTF.getText();
        String cleanUpPartner = cleanUpPartnerTF.getText();

        // Create a new TBWastedPlastic object
        //WastedPlastic wastedPlastic = new TBWastedPlastic(turtlesAffected, dolphinsAffected, damageCosts, location, amountDumped, typeOfDebris, cleanUpPartner);
        TBWastedPlastic wastedPlastic = new TBWastedPlastic(amountDumped, typeOfDebris, cleanUpPartner, turtlesAffected, dolphinsAffected, damageCosts, location);

        // Add the object to the list
        plist.add(wastedPlastic);
            
            
        wastedPlasticTA.append(wastedPlastic.toString() + "\n");
        
    }//GEN-LAST:event_addBTNActionPerformed

    private void viewBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTNActionPerformed
        // TODO add your handling code here:
        wastedPlasticTA.setText(""); // Clear the text area before appending new content
        if (plist.isEmpty()) {
            wastedPlasticTA.append("No data to display.\n");
        } else {
            for (TBWastedPlastic wastedPlastic : plist) {
                wastedPlasticTA.append(wastedPlastic.toString() + "\n\n"); // Assuming TBWastedPlastic class has a toString() method
            }
        }
    }//GEN-LAST:event_viewBTNActionPerformed

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
            java.util.logging.Logger.getLogger(TBWastedPlasticPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TBWastedPlasticPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TBWastedPlasticPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TBWastedPlasticPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TBWastedPlasticPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel amountDumpedLBL;
    private javax.swing.JTextField amountDumpedTF;
    private javax.swing.JLabel cleanUpPartnerLBL;
    private javax.swing.JTextField cleanUpPartnerTF;
    private javax.swing.JLabel damageCostsLBL;
    private javax.swing.JTextField damageCostsTF;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel dolphinsAffectedLBL;
    private javax.swing.JTextField dolphinsAffectedTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel locationLBL;
    private javax.swing.JTextField locationTF;
    private javax.swing.JButton pollutionActivitiesBTN;
    private javax.swing.JLabel turtlesAffectedLBL;
    private javax.swing.JTextField turtlesAffectedTF;
    private javax.swing.JLabel typeOfDebrisLBL;
    private javax.swing.JTextField typeOfDebrisTF;
    private javax.swing.JButton viewBTN;
    private javax.swing.JLabel wastedPlasticPageLBL;
    private javax.swing.JTextArea wastedPlasticTA;
    // End of variables declaration//GEN-END:variables
}
