/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Views;

import com.sun.glass.events.KeyEvent;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static net.ucanaccess.converters.Functions.string;
import parkingsimulator.Models.DBController;


/**
 *
 * @author Amar
 */
public class CenaPoSatu extends javax.swing.JFrame {

    /**
     * Creates new form CenaPoSatu
     */
        
    public CenaPoSatu() throws SQLException {
        
        initComponents();
         
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
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
        btnSacuvaj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 40, 43));

        btnSacuvaj.setBackground(new java.awt.Color(0, 40, 43));
        btnSacuvaj.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSacuvaj.setForeground(new java.awt.Color(248, 193, 30));
        btnSacuvaj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/Sacuvaj.png"))); // NOI18N
        btnSacuvaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnSacuvaj.setFocusable(false);
        btnSacuvaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSacuvajMouseEntered(evt);
            }
        });
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 193, 30));
        jLabel1.setText("Cena po satu:");

        txtCena.setBackground(new java.awt.Color(0, 40, 43));
        txtCena.setForeground(new java.awt.Color(248, 193, 30));
        txtCena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCenaMouseEntered(evt);
            }
        });
        txtCena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCenaKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(txtCena, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnSacuvaj)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCena))
                .addGap(62, 62, 62)
                .addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        if(!this.txtCena.getText().equals("")){
            float vrednost=Float.parseFloat(txtCena.getText());

            try{
                DBController.require().setCena(vrednost);
                JOptionPane.showMessageDialog(null, "Uspešno ste promenili cenu po satu.");
                this.dispose();
            }catch(Exception ex){
                 System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void txtCenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCenaKeyTyped
        char c= evt.getKeyChar();
        if( (!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) || c==KeyEvent.VK_DELETE || c==KeyEvent.VK_PERIOD)))
//        this.txtCena.setText("");
            evt.consume();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCenaKeyTyped

    private void btnSacuvajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSacuvajMouseEntered
        ((JButton)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
// TODO add your handling code here:
    }//GEN-LAST:event_btnSacuvajMouseEntered

    private void txtCenaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCenaMouseEntered
      
    }//GEN-LAST:event_txtCenaMouseEntered

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
            java.util.logging.Logger.getLogger(CenaPoSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CenaPoSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CenaPoSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CenaPoSatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CenaPoSatu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CenaPoSatu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCena;
    // End of variables declaration//GEN-END:variables

}
