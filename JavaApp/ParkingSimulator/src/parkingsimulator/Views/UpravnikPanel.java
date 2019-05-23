/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import parkingsimulator.Arduino.ArduinoController;

/**
 *
 * @author Senchi
 */
public class UpravnikPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpravnikPanel
     */
    ArrayList<String> poruke;
    ArrayList<String> prethodne_poruke=new ArrayList();
    public UpravnikPanel() {
        prethodne_poruke.add("0NE");
        prethodne_poruke.add("1NE");
        prethodne_poruke.add("2NE");
        prethodne_poruke.add("3NE");
        initComponents();
        Thread t=new Thread(){  
            public void run(){
                while(true){
                    poruke=ArduinoController.getMessages();
                    poruke.forEach(e->{
                        System.out.println(e);
                    switch(e.charAt(0)){
                    case '0':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            if(prethodne_poruke.get(0).charAt(1)=='N' && prethodne_poruke.get(0).charAt(2)=='E'){
                                System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }
                            ParkingMesto1.setBackground(Color.yellow);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            if(prethodne_poruke.get(0).charAt(1)=='D' && prethodne_poruke.get(0).charAt(2)=='A'){
                                System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }    
                            ParkingMesto1.setBackground(Color.green);
                        }
                        break;
                    case '1':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            if(prethodne_poruke.get(1).charAt(1)=='N' && prethodne_poruke.get(1).charAt(2)=='E'){
                                System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }
                            ParkingMesto2.setBackground(Color.yellow);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            if(prethodne_poruke.get(1).charAt(1)=='D' && prethodne_poruke.get(1).charAt(2)=='A'){
                                System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }    
                            ParkingMesto2.setBackground(Color.green);
                        }
                        break;
                    case '2':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            if(prethodne_poruke.get(2).charAt(1)=='N' && prethodne_poruke.get(2).charAt(2)=='E'){
                                System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }
                            ParkingMesto3.setBackground(Color.yellow);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            if(prethodne_poruke.get(2).charAt(1)=='D' && prethodne_poruke.get(2).charAt(2)=='A'){
                                System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }    
                            ParkingMesto3.setBackground(Color.green);
                        }
                        break;
                    case '3':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            if(prethodne_poruke.get(3).charAt(1)=='N' && prethodne_poruke.get(3).charAt(2)=='E'){
                                System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }
                            ParkingMesto4.setBackground(Color.yellow);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            if(prethodne_poruke.get(3).charAt(1)=='D' && prethodne_poruke.get(3).charAt(2)=='A'){
                                System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                                System.out.println("Ne radi nista");
                            }    
                            ParkingMesto4.setBackground(Color.green);
                        }
                        break;
                }
                    
                    });
                    prethodne_poruke=poruke;
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        
        t.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        HeaderText = new javax.swing.JLabel();
        jpanComponent = new javax.swing.JPanel();
        ParkingMesto1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ParkingVreme1 = new javax.swing.JLabel();
        btnPlati1 = new javax.swing.JButton();
        ParkingMesto2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ParkingVreme2 = new javax.swing.JLabel();
        btnPlati2 = new javax.swing.JButton();
        ParkingMesto4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ParkingVreme4 = new javax.swing.JLabel();
        btnPlati3 = new javax.swing.JButton();
        ParkingMesto3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ParkingVreme3 = new javax.swing.JLabel();
        btnPlati4 = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnDnevniIzvestaj = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnOdjava = new javax.swing.JButton();
        btnIzmenaCene = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblGetName = new javax.swing.JLabel();

        pnlBackground.setBackground(new java.awt.Color(107, 107, 162));

        pnlHeader.setBackground(new java.awt.Color(102, 102, 255));

        HeaderText.setBackground(new java.awt.Color(255, 255, 255));
        HeaderText.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        HeaderText.setForeground(new java.awt.Color(255, 255, 255));
        HeaderText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderText.setText("ParkingSimulator");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(HeaderText, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(HeaderText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanComponent.setBackground(new java.awt.Color(107, 107, 162));
        jpanComponent.setLayout(new java.awt.GridLayout(2, 2, 25, 100));

        ParkingMesto1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));

        ParkingVreme1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ParkingVreme1.setForeground(new java.awt.Color(255, 255, 255));
        ParkingVreme1.setText("Vreme 1");

        btnPlati1.setBackground(new java.awt.Color(255, 255, 255));
        btnPlati1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPlati1.setText("Plati");
        btnPlati1.setFocusPainted(false);
        btnPlati1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlati1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ParkingMesto1Layout = new javax.swing.GroupLayout(ParkingMesto1);
        ParkingMesto1.setLayout(ParkingMesto1Layout);
        ParkingMesto1Layout.setHorizontalGroup(
            ParkingMesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto1Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlati1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto1Layout.setVerticalGroup(
            ParkingMesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto1Layout.createSequentialGroup()
                .addComponent(ParkingVreme1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlati1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto1);

        ParkingMesto2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));

        ParkingVreme2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ParkingVreme2.setForeground(new java.awt.Color(255, 255, 255));
        ParkingVreme2.setText("Vreme 2");

        btnPlati2.setBackground(new java.awt.Color(255, 255, 255));
        btnPlati2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPlati2.setText("Plati");
        btnPlati2.setFocusPainted(false);

        javax.swing.GroupLayout ParkingMesto2Layout = new javax.swing.GroupLayout(ParkingMesto2);
        ParkingMesto2.setLayout(ParkingMesto2Layout);
        ParkingMesto2Layout.setHorizontalGroup(
            ParkingMesto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto2Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlati2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto2Layout.setVerticalGroup(
            ParkingMesto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto2Layout.createSequentialGroup()
                .addComponent(ParkingVreme2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlati2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto2);

        ParkingMesto4.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("4");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        ParkingVreme4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ParkingVreme4.setForeground(new java.awt.Color(255, 255, 255));
        ParkingVreme4.setText("Vreme 4");

        btnPlati3.setBackground(new java.awt.Color(255, 255, 255));
        btnPlati3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPlati3.setText("Plati");
        btnPlati3.setFocusPainted(false);

        javax.swing.GroupLayout ParkingMesto4Layout = new javax.swing.GroupLayout(ParkingMesto4);
        ParkingMesto4.setLayout(ParkingMesto4Layout);
        ParkingMesto4Layout.setHorizontalGroup(
            ParkingMesto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto4Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlati3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto4Layout.setVerticalGroup(
            ParkingMesto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto4Layout.createSequentialGroup()
                .addComponent(ParkingVreme4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlati3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto4);

        ParkingMesto3.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));

        ParkingVreme3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ParkingVreme3.setForeground(new java.awt.Color(255, 255, 255));
        ParkingVreme3.setText("Vreme 3");

        btnPlati4.setBackground(new java.awt.Color(255, 255, 255));
        btnPlati4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPlati4.setText("Plati");
        btnPlati4.setFocusPainted(false);

        javax.swing.GroupLayout ParkingMesto3Layout = new javax.swing.GroupLayout(ParkingMesto3);
        ParkingMesto3.setLayout(ParkingMesto3Layout);
        ParkingMesto3Layout.setHorizontalGroup(
            ParkingMesto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto3Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlati4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto3Layout.setVerticalGroup(
            ParkingMesto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto3Layout.createSequentialGroup()
                .addComponent(ParkingVreme3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlati4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto3);

        pnlTabla.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tabla");

        btnDnevniIzvestaj.setBackground(new java.awt.Color(0, 102, 102));
        btnDnevniIzvestaj.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnDnevniIzvestaj.setForeground(new java.awt.Color(255, 255, 255));
        btnDnevniIzvestaj.setText("Dnevni izveštaj");
        btnDnevniIzvestaj.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnDnevniIzvestaj.setFocusPainted(false);
        btnDnevniIzvestaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDnevniIzvestajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDnevniIzvestajMouseExited(evt);
            }
        });
        btnDnevniIzvestaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDnevniIzvestajActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Radno vreme:");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Broj slobodnih mesta:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("get Radnog ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Get br mesta");

        btnOdjava.setBackground(new java.awt.Color(0, 102, 102));
        btnOdjava.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnOdjava.setForeground(new java.awt.Color(255, 255, 255));
        btnOdjava.setText("Odjava");
        btnOdjava.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnOdjava.setFocusPainted(false);
        btnOdjava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOdjavaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOdjavaMouseExited(evt);
            }
        });
        btnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjavaActionPerformed(evt);
            }
        });

        btnIzmenaCene.setBackground(new java.awt.Color(0, 102, 102));
        btnIzmenaCene.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnIzmenaCene.setForeground(new java.awt.Color(255, 255, 255));
        btnIzmenaCene.setText("Izmena cene");
        btnIzmenaCene.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        btnIzmenaCene.setFocusPainted(false);
        btnIzmenaCene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIzmenaCeneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIzmenaCeneMouseExited(evt);
            }
        });
        btnIzmenaCene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmenaCeneActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dobrodosli");

        lblGetName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGetName.setForeground(new java.awt.Color(255, 255, 255));
        lblGetName.setText("ime i prezime");

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(pnlTablaLayout.createSequentialGroup()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lblGetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(btnIzmenaCene, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnOdjava, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTablaLayout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTablaLayout.createSequentialGroup()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(btnDnevniIzvestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(lblGetName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(btnDnevniIzvestaj, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnIzmenaCene, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOdjava, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpanComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlati1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlati1ActionPerformed

    }//GEN-LAST:event_btnPlati1ActionPerformed

    private void btnDnevniIzvestajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDnevniIzvestajActionPerformed
        
    }//GEN-LAST:event_btnDnevniIzvestajActionPerformed

    private void btnDnevniIzvestajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDnevniIzvestajMouseExited
        this.btnDnevniIzvestaj.setBackground(Color.decode("#006666"));
        this.btnDnevniIzvestaj.setForeground(Color.white);
    }//GEN-LAST:event_btnDnevniIzvestajMouseExited

    private void btnDnevniIzvestajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDnevniIzvestajMouseEntered
        this.btnDnevniIzvestaj.setBackground(Color.white);
        this.btnDnevniIzvestaj.setForeground(Color.decode("#006666"));
    }//GEN-LAST:event_btnDnevniIzvestajMouseEntered

    private void btnOdjavaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdjavaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOdjavaMouseEntered

    private void btnOdjavaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdjavaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOdjavaMouseExited

    private void btnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjavaActionPerformed
        // TODO add your handling code here:
        this.pnlBackground.setVisible(false);
        Prijava i=new Prijava();
        i.setVisible(true);        
    }//GEN-LAST:event_btnOdjavaActionPerformed

    private void btnIzmenaCeneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzmenaCeneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzmenaCeneMouseEntered

    private void btnIzmenaCeneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIzmenaCeneMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzmenaCeneMouseExited

    private void btnIzmenaCeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmenaCeneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIzmenaCeneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderText;
    private javax.swing.JPanel ParkingMesto1;
    private javax.swing.JPanel ParkingMesto2;
    private javax.swing.JPanel ParkingMesto3;
    private javax.swing.JPanel ParkingMesto4;
    private javax.swing.JLabel ParkingVreme1;
    private javax.swing.JLabel ParkingVreme2;
    private javax.swing.JLabel ParkingVreme3;
    private javax.swing.JLabel ParkingVreme4;
    private javax.swing.JButton btnDnevniIzvestaj;
    private javax.swing.JButton btnIzmenaCene;
    private javax.swing.JButton btnOdjava;
    private javax.swing.JButton btnPlati1;
    private javax.swing.JButton btnPlati2;
    private javax.swing.JButton btnPlati3;
    private javax.swing.JButton btnPlati4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpanComponent;
    private javax.swing.JLabel lblGetName;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlTabla;
    // End of variables declaration//GEN-END:variables
}
