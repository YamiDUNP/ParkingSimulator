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
 * @author 1
 */
public class MainFrame extends javax.swing.JFrame {

    
    ArrayList<String> poruke;
    ArrayList<String> prethodne_poruke=new ArrayList();
    public MainFrame() {
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
        jButton3 = new javax.swing.JButton();
        ParkingMesto2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ParkingVreme2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ParkingMesto3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ParkingVreme3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        ParkingMesto4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ParkingVreme4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addGap(0, 0, Short.MAX_VALUE))
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

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setText("Plati");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto1Layout.setVerticalGroup(
            ParkingMesto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto1Layout.createSequentialGroup()
                .addComponent(ParkingVreme1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Plati");
        jButton2.setFocusPainted(false);

        javax.swing.GroupLayout ParkingMesto2Layout = new javax.swing.GroupLayout(ParkingMesto2);
        ParkingMesto2.setLayout(ParkingMesto2Layout);
        ParkingMesto2Layout.setHorizontalGroup(
            ParkingMesto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto2Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto2Layout.setVerticalGroup(
            ParkingMesto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto2Layout.createSequentialGroup()
                .addComponent(ParkingVreme2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto2);

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

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton5.setText("Plati");
        jButton5.setFocusPainted(false);

        javax.swing.GroupLayout ParkingMesto3Layout = new javax.swing.GroupLayout(ParkingMesto3);
        ParkingMesto3.setLayout(ParkingMesto3Layout);
        ParkingMesto3Layout.setHorizontalGroup(
            ParkingMesto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto3Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto3Layout.setVerticalGroup(
            ParkingMesto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto3Layout.createSequentialGroup()
                .addComponent(ParkingVreme3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto3);

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

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton4.setText("Plati");
        jButton4.setFocusPainted(false);

        javax.swing.GroupLayout ParkingMesto4Layout = new javax.swing.GroupLayout(ParkingMesto4);
        ParkingMesto4.setLayout(ParkingMesto4Layout);
        ParkingMesto4Layout.setHorizontalGroup(
            ParkingMesto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingMesto4Layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(ParkingMesto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingVreme4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ParkingMesto4Layout.setVerticalGroup(
            ParkingMesto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParkingMesto4Layout.createSequentialGroup()
                .addComponent(ParkingVreme4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanComponent.add(ParkingMesto4);

        pnlTabla.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tabla");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Upravnik");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTablaLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTablaLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanComponent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpanComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Prijava i=new Prijava();
        i.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
    this.jButton1.setBackground(Color.white);
    this.jButton1.setForeground(Color.decode("#006666"));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       this.jButton1.setBackground(Color.decode("#006666"));
    this.jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpanComponent;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlTabla;
    // End of variables declaration//GEN-END:variables
}
