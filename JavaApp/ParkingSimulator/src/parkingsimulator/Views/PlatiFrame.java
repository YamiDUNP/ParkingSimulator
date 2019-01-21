/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Amar
 */
public class PlatiFrame extends javax.swing.JFrame {

    /**
     * Creates new form Plati
     */
    private ArrayList<String> poruke;
    private ArrayList<StringBuffer> boje;
    private JPanel panelKojiMenjam;
    private int redniBroj;
    public PlatiFrame(){initComponents();}
    public PlatiFrame(ArrayList<String> poruke1,ArrayList<StringBuffer> boje1,JPanel panelKojiMenjam1,int redniBroj) {
        initComponents();
        Random r=new Random();  
        this.lblIDVozila2.setText(String.valueOf("NP-"+r.nextInt(9)+r.nextInt(9)+r.nextInt(9))); // Saljemo kad se zauzme mesto
        this.slldCena.setValue(1);
        this.lblCena2.setText("100din");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.poruke=poruke1;
        this.boje=boje1;
        this.panelKojiMenjam=panelKojiMenjam1;
        this.redniBroj=redniBroj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPlati = new javax.swing.JPanel();
        slldCena = new javax.swing.JSlider();
        lblIDVozila = new javax.swing.JLabel();
        lblIDVozila2 = new javax.swing.JLabel();
        btnUplati = new javax.swing.JButton();
        lblCena = new javax.swing.JLabel();
        lblCena2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        slldCena.setMajorTickSpacing(1);
        slldCena.setMaximum(14);
        slldCena.setMinimum(1);
        slldCena.setPaintLabels(true);
        slldCena.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slldCenaStateChanged(evt);
            }
        });

        lblIDVozila.setText("ID vozila:");

        btnUplati.setText("Uplati");
        btnUplati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUplatiActionPerformed(evt);
            }
        });

        lblCena.setText("Vreme zadrzavanja:");

        javax.swing.GroupLayout pnlPlatiLayout = new javax.swing.GroupLayout(pnlPlati);
        pnlPlati.setLayout(pnlPlatiLayout);
        pnlPlatiLayout.setHorizontalGroup(
            pnlPlatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlatiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlatiLayout.createSequentialGroup()
                        .addComponent(lblIDVozila, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPlatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPlatiLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblIDVozila2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPlatiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUplati, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlPlatiLayout.createSequentialGroup()
                        .addComponent(slldCena, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCena2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCena))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlPlatiLayout.setVerticalGroup(
            pnlPlatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlatiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDVozila, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDVozila2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblCena, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlPlatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCena2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slldCena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnUplati, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPlati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPlati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        evt.getWindow().setVisible(false);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void slldCenaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slldCenaStateChanged
        // TODO add your handling code here:
        lblCena2.setText(String.valueOf(this.slldCena.getValue()*100+"din"));
    }//GEN-LAST:event_slldCenaStateChanged

    private void btnUplatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUplatiActionPerformed
        if(poruke.get(redniBroj).charAt(1)=='D' && poruke.get(redniBroj).charAt(2)=='A'){
            System.out.println(redniBroj);
            this.boje.get(redniBroj).replace(0, boje.get(redniBroj).length(), "r");
            panelKojiMenjam.setBackground(Color.red);
    }//GEN-LAST:event_btnUplatiActionPerformed

    }
        

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
            java.util.logging.Logger.getLogger(PlatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlatiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlatiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUplati;
    private javax.swing.JLabel lblCena;
    private javax.swing.JLabel lblCena2;
    private javax.swing.JLabel lblIDVozila;
    private javax.swing.JLabel lblIDVozila2;
    private javax.swing.JPanel pnlPlati;
    private javax.swing.JSlider slldCena;
    // End of variables declaration//GEN-END:variables
}