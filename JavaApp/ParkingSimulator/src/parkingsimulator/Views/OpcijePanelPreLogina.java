/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Views;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author a
 */
public class OpcijePanelPreLogina extends javax.swing.JPanel {

    /**
     * Creates new form OpcijePanelPreLogina
     */
    JPanel main;
    public OpcijePanelPreLogina(JPanel j) {
        main=j;
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
        btnPrijava = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 40, 43));

        btnPrijava.setBackground(new java.awt.Color(0, 40, 43));
        btnPrijava.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        btnPrijava.setForeground(new java.awt.Color(248, 193, 30));
        btnPrijava.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/btnPrijava.png"))); // NOI18N
        btnPrijava.setAlignmentY(0.0F);
        btnPrijava.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(248, 193, 30), 1, true));
        btnPrijava.setFocusPainted(false);
        btnPrijava.setPreferredSize(new java.awt.Dimension(67, 23));
        btnPrijava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrijavaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrijavaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrijavaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrijavaMouseReleased(evt);
            }
        });
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });
        btnPrijava.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPrijavaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnPrijavaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(btnPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(btnPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        Prijava i=new Prijava(main);
        i.setVisible(true);
    }//GEN-LAST:event_btnPrijavaActionPerformed

    private void btnPrijavaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPrijavaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPrijavaKeyPressed

    private void btnPrijavaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPrijavaKeyReleased
        // TODO add your handling code here:
           

    }//GEN-LAST:event_btnPrijavaKeyReleased

    private void btnPrijavaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrijavaMousePressed
        // TODO add your handling code here:       
        this.btnPrijava.setForeground(Color.decode("#00282b"));
        this.btnPrijava.setBackground(Color.decode("#f8c11e"));

    }//GEN-LAST:event_btnPrijavaMousePressed

    private void btnPrijavaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrijavaMouseReleased
        // TODO add your handling code here:
                this.btnPrijava.setForeground(Color.decode("#f8c11e"));
                this.btnPrijava.setBackground(Color.decode("#00282b"));

    }//GEN-LAST:event_btnPrijavaMouseReleased

    private void btnPrijavaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrijavaMouseClicked
        // TODO add your handling code here:
               

    }//GEN-LAST:event_btnPrijavaMouseClicked

    private void btnPrijavaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrijavaMouseEntered
((JButton)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
// TODO add your handling code here:
    }//GEN-LAST:event_btnPrijavaMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrijava;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
