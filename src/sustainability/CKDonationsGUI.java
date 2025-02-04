/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sustainability;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author adamk
 */
public class CKDonationsGUI extends javax.swing.JFrame {
private ArrayList <CKGlobalWarming> elist;
 private ArrayList <CKDonate> eList;
    private String name;
    private int Cardnum, Pin, Amount;
    private int count;

    /**
     * Creates new form DonationsGUI
     */
    public CKDonationsGUI() {
        initComponents();
        eList = new ArrayList<>();
        name = new String();
        Pin = 0;
        Cardnum =0;
        Amount = 0;
        count = 0;
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
        nameLBL = new javax.swing.JLabel();
        cardNumLBL = new javax.swing.JLabel();
        pinLBL = new javax.swing.JLabel();
        amountLBL = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        cardNumTF = new javax.swing.JTextField();
        amountTF = new javax.swing.JTextField();
        pinTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        affectsBTN = new javax.swing.JButton();
        reasonBTN = new javax.swing.JButton();
        overfishingBTN = new javax.swing.JButton();
        seaLifeAffectedBTN = new javax.swing.JButton();
        industrializationBTN = new javax.swing.JButton();
        iconLBL = new javax.swing.JLabel();
        goBackBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Donations for the Future | Cian");
        setResizable(false);

        backgroundPNL.setBackground(new java.awt.Color(0, 124, 186));

        titleLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLBL.setForeground(new java.awt.Color(210, 231, 241));
        titleLBL.setText("Donate for the Future!");

        nameLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLBL.setForeground(new java.awt.Color(210, 231, 241));
        nameLBL.setText("NAME");

        cardNumLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardNumLBL.setForeground(new java.awt.Color(210, 231, 241));
        cardNumLBL.setText("CARDNUM");

        pinLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pinLBL.setForeground(new java.awt.Color(210, 231, 241));
        pinLBL.setText("PIN");

        amountLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amountLBL.setForeground(new java.awt.Color(210, 231, 241));
        amountLBL.setText("AMOUNT");

        cardNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumTFActionPerformed(evt);
            }
        });

        amountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTFActionPerformed(evt);
            }
        });

        pinTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinTFActionPerformed(evt);
            }
        });

        addBTN.setBackground(new java.awt.Color(210, 231, 241));
        addBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBTN.setForeground(new java.awt.Color(148, 196, 228));
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        displayBTN.setBackground(new java.awt.Color(210, 231, 241));
        displayBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayBTN.setForeground(new java.awt.Color(148, 196, 228));
        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        affectsBTN.setBackground(new java.awt.Color(210, 231, 241));
        affectsBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        affectsBTN.setForeground(new java.awt.Color(148, 196, 228));
        affectsBTN.setText("Affects");
        affectsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affectsBTNActionPerformed(evt);
            }
        });

        reasonBTN.setBackground(new java.awt.Color(210, 231, 241));
        reasonBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reasonBTN.setForeground(new java.awt.Color(148, 196, 228));
        reasonBTN.setText("Reason");
        reasonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonBTNActionPerformed(evt);
            }
        });

        overfishingBTN.setBackground(new java.awt.Color(210, 231, 241));
        overfishingBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        overfishingBTN.setForeground(new java.awt.Color(148, 196, 228));
        overfishingBTN.setText("Overfishing");
        overfishingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overfishingBTNActionPerformed(evt);
            }
        });

        seaLifeAffectedBTN.setBackground(new java.awt.Color(210, 231, 241));
        seaLifeAffectedBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        seaLifeAffectedBTN.setForeground(new java.awt.Color(148, 196, 228));
        seaLifeAffectedBTN.setText("Sea Life Affected");
        seaLifeAffectedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaLifeAffectedBTNActionPerformed(evt);
            }
        });

        industrializationBTN.setBackground(new java.awt.Color(210, 231, 241));
        industrializationBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        industrializationBTN.setForeground(new java.awt.Color(148, 196, 228));
        industrializationBTN.setText("Industrialization");
        industrializationBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                industrializationBTNActionPerformed(evt);
            }
        });

        iconLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sustainability/Warming.png"))); // NOI18N

        goBackBTN.setBackground(new java.awt.Color(210, 231, 241));
        goBackBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        goBackBTN.setForeground(new java.awt.Color(148, 196, 228));
        goBackBTN.setText("Go Back");
        goBackBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBTNActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(210, 231, 241));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(210, 231, 241));
        jLabel1.setText("For some fun facts, Click on the buttons here!");

        javax.swing.GroupLayout backgroundPNLLayout = new javax.swing.GroupLayout(backgroundPNL);
        backgroundPNL.setLayout(backgroundPNLLayout);
        backgroundPNLLayout.setHorizontalGroup(
            backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPNLLayout.createSequentialGroup()
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goBackBTN)
                            .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cardNumLBL)
                                .addComponent(nameLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pinLBL, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(amountLBL))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cardNumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(nameTF)
                                .addComponent(pinTF))
                            .addComponent(titleLBL)
                            .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(displayBTN)
                                .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(addBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addComponent(seaLifeAffectedBTN)
                        .addGap(18, 18, 18)
                        .addComponent(industrializationBTN))
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addComponent(overfishingBTN)
                        .addGap(18, 18, 18)
                        .addComponent(reasonBTN)
                        .addGap(18, 18, 18)
                        .addComponent(affectsBTN))
                    .addComponent(jLabel1)
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(iconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        backgroundPNLLayout.setVerticalGroup(
            backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPNLLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackBTN)
                    .addComponent(titleLBL))
                .addGap(28, 28, 28)
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLBL)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seaLifeAffectedBTN)
                    .addComponent(industrializationBTN))
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNumLBL)))
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinLBL))
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLBL)))
                    .addGroup(backgroundPNLLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(overfishingBTN)
                            .addComponent(affectsBTN)
                            .addComponent(reasonBTN))))
                .addGap(40, 40, 40)
                .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBTN)
                        .addComponent(displayBTN))
                    .addComponent(iconLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTFActionPerformed

    private void pinTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinTFActionPerformed

    private void cardNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumTFActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
       
        name = nameTF.getText();
        Pin = Integer.parseInt(pinTF.getText());
        Amount = Integer.parseInt(amountTF.getText());
        Cardnum = Integer.parseInt(cardNumTF.getText());

        CKDonate e = new CKDonate();
        e.setName(name);
        e.setPin(Pin);
        e.setAmount(Amount);
        e.setCardNum(Cardnum);
        //add display to arraylist
        eList.add(e);

        count++;
    }//GEN-LAST:event_addBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < eList.size(); i++){
            JOptionPane.showMessageDialog(null, "Name: " + eList.get(i).getName() +
               
     "\nPin: " + eList.get(i).getPin() +
                "\nCardnum: " + eList.get(i).getCardNum() +
                "\nAmount: " + eList.get(i).getAmount());   
    }                                          
      
    }//GEN-LAST:event_displayBTNActionPerformed

    private void affectsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affectsBTNActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "More frequent and intense drought, storms, heat waves, rising sea levels, " + "\n"
                + "melting glaciers and warming oceans can directly harm animals, destroy the places they live, and wreak havoc " + "\n"
                + "on people's livelihoods and communities..", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_affectsBTNActionPerformed

    private void reasonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonBTNActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Burning fossil fuels, cutting down forests and farming livestock " + "\n"
                + "are increasingly influencing the climate and the earth's temperature. This adds enormous " + "\n"
                + "amounts of greenhouse gases to those naturally occurring in the atmosphere, increasing the greenhouse effect and " + "\n"
                + "global warming..", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_reasonBTNActionPerformed

    private void overfishingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overfishingBTNActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(null, "Overfishing can affect biodiversity, habitats and ecosystems " + "\n"
                    + "that make vital contributions to the climate, clean air, water and food. Biodiversity " + "\n"
                    + "impacts can take place not only through overfishing of fish stocks targeted for food, but " + "\n"
                    + "also through overfishing of species caught unintentionally..", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_overfishingBTNActionPerformed

    private void seaLifeAffectedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaLifeAffectedBTNActionPerformed
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(null, "So, as the planet warms, it's the ocean that gets most of the extra energy. " + "\n"
                   + "More than 90% of the global warming is going into the ocean. But if the ocean gets too warm, then the plants " + "\n"
                   + "and animals that live there can get sick or even die..", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_seaLifeAffectedBTNActionPerformed

    private void industrializationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industrializationBTNActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Open ocean aquaculture, wave power, wind power, robot fishing – all these " + "\n"
                + "industrial uses of the sea are ramping up around the world. These ventures place the oceans, in the " + "\n"
                + "next 100 years, in the same place as the land in the past 100 years – centers of habitat destruction, " + "\n"
                + "range loss and species loss.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_industrializationBTNActionPerformed

    private void goBackBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBTNActionPerformed
        // TODO add your handling code here:
        new LandingPageGUI().setVisible(true);  
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_goBackBTNActionPerformed
    
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
            java.util.logging.Logger.getLogger(CKDonationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CKDonationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CKDonationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CKDonationsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CKDonationsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton affectsBTN;
    private javax.swing.JLabel amountLBL;
    private javax.swing.JTextField amountTF;
    private javax.swing.JPanel backgroundPNL;
    private javax.swing.JLabel cardNumLBL;
    private javax.swing.JTextField cardNumTF;
    private javax.swing.JButton displayBTN;
    private javax.swing.JButton goBackBTN;
    private javax.swing.JLabel iconLBL;
    private javax.swing.JButton industrializationBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton overfishingBTN;
    private javax.swing.JLabel pinLBL;
    private javax.swing.JTextField pinTF;
    private javax.swing.JButton reasonBTN;
    private javax.swing.JButton seaLifeAffectedBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
