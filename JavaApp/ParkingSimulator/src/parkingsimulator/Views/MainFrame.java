/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import parkingsimulator.Arduino.ArduinoController;
import parkingsimulator.Models.DBController;

/**
 *
 * @author 1
 */
public class MainFrame extends javax.swing.JFrame {
    
             
    ArrayList<String> poruke;
    ArrayList<String> prethodne_poruke=new ArrayList();
    ArrayList<StringBuffer> boje=new ArrayList();
    ArrayList<StringBuffer> ids=new ArrayList();
    String path = new File("").getAbsolutePath()+"\\src\\parkingsimulator\\Views\\Slike";
    int br_mesta=4;
    public MainFrame() {
        ids.add(new StringBuffer(""));
        ids.add(new StringBuffer(""));
        ids.add(new StringBuffer(""));
        ids.add(new StringBuffer(""));
        prethodne_poruke.add("0NE");
        prethodne_poruke.add("1NE");
        prethodne_poruke.add("2NE");
        prethodne_poruke.add("3NE");
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        boje.add(new StringBuffer("y"));
        boje.add(new StringBuffer("y"));
        boje.add(new StringBuffer("y"));
        boje.add(new StringBuffer("y"));
        initComponents();
        Random r=new Random();
         //---------------------------------------------------------
        OpcijePanelPreLogina newPnl = new OpcijePanelPreLogina(this.pnlOpcijeGlavni);
        this.pnlOpcijeGlavni.removeAll();
        this.pnlOpcijeGlavni.revalidate();
        this.pnlOpcijeGlavni.setLayout(new BorderLayout());
        this.pnlOpcijeGlavni.add(newPnl);
        //---------------------------------------------------------
        this.setSize(d.width, d.height-60);
        Thread t=new Thread(){  
            public void run(){
                while(true){
                    //lblRadnoVreme.setText(DBController.require());
                    br_mesta=4;
                    poruke=ArduinoController.getMessages();
                    poruke.forEach(e->{
                        //System.out.println(e);
                    switch(e.charAt(0)){
                    case '0':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            Random randomSlovo = new Random();
                            char prvoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            char drugoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            if(ids.get(0).toString().equals(""))
                                ids.set(0,new StringBuffer(String.valueOf("NP-"+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+"-"+prvoSlovo+drugoSlovo)) );
                            if(prethodne_poruke.get(0).charAt(1)=='N' && prethodne_poruke.get(0).charAt(2)=='E'){
                          //      System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                            }
                            if(boje.get(0).charAt(0)=='y')
                               //KOM ParkingMesto1.setBackground(Color.yellow);
                                 try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\WoziloJeStiglo.png"));
                              pkLabel0.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                                        
                            else{
                               //KOM ParkingMesto1.setBackground(Color.red); 
                                try{
                                    BufferedImage myPicture = ImageIO.read(new File(path+"\\MestoZauzeto.png"));
                                    pkLabel0.setIcon(new ImageIcon(myPicture));
                                }catch(Exception ect){
                                ect.printStackTrace();
                            }
                            }
                            br_mesta--;
                            btnPlati1.setEnabled(true);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            ids.set(0,new StringBuffer(""));
                            if(prethodne_poruke.get(0).charAt(1)=='D' && prethodne_poruke.get(0).charAt(2)=='A'){
                            //    System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                            
                            }
                            
                            boje.get(0).replace(0, boje.get(0).length(), "y");
                            btnPlati1.setEnabled(false);
                            System.out.println(path);
                            try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\mestoSlobodno.png"));
                              pkLabel0.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ec){
                                ec.printStackTrace();
                            } 
                           //KOM ParkingMesto1.setBackground(Color.green);
                        }
                        break;
                    case '1':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            Random randomSlovo = new Random();
                            char prvoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            char drugoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            if(ids.get(1).toString().equals(""))
                                ids.set(1,new StringBuffer(String.valueOf("NP-"+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+"-"+prvoSlovo+drugoSlovo)) );
                            
                            if(prethodne_poruke.get(1).charAt(1)=='N' && prethodne_poruke.get(1).charAt(2)=='E'){
                              //  System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                            }
                            if(boje.get(1).charAt(0)=='y')
                                try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\WoziloJeStiglo.png"));
                              pkLabel1.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                                //ParkingMesto2.setBackground(Color.yellow);
                            else{
                                try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\MestoZauzeto.png"));
                              pkLabel1.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                                //ParkingMesto2.setBackground(Color.red);    
                            }
                                br_mesta--;
                                btnPlati2.setEnabled(true);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            ids.set(1,new StringBuffer(""));
                            if(prethodne_poruke.get(1).charAt(1)=='D' && prethodne_poruke.get(1).charAt(2)=='A'){
                             //   System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                            }
                            boje.get(1).replace(0, boje.get(1).length(), "y");
                            try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\mestoSlobodno.png"));
                              pkLabel1.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                            //ParkingMesto2.setBackground(Color.green);
                            btnPlati2.setEnabled(false);
                        }
                        break;
                    case '2':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            Random randomSlovo = new Random();
                            char prvoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            char drugoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            if(ids.get(2).toString().equals(""))
                                ids.set(2,new StringBuffer(String.valueOf("NP-"+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+"-"+prvoSlovo+drugoSlovo)) );
                            
                            if(prethodne_poruke.get(2).charAt(1)=='N' && prethodne_poruke.get(2).charAt(2)=='E'){
                            //    System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                            }
                            if(boje.get(2).charAt(0)=='y')
                           try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\WoziloJeStiglo.png"));
                              pkLabel2.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }   
                            //  ParkingMesto3.setBackground(Color.yellow);
                            else{
                                try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\MestoZauzeto.png"));
                              pkLabel2.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                               // ParkingMesto3.setBackground(Color.red);    
                            }
                            br_mesta--;
                            btnPlati3.setEnabled(true);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            ids.set(2,new StringBuffer(""));
                            if(prethodne_poruke.get(2).charAt(1)=='D' && prethodne_poruke.get(2).charAt(2)=='A'){
                             //   System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                            }
                            boje.get(2).replace(0, boje.get(2).length(), "y");
                           try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\mestoSlobodno.png"));
                              pkLabel2.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                            // ParkingMesto3.setBackground(Color.green);
                            btnPlati3.setEnabled(false);
                        }
                        break;
                    case '3':
                        if(e.charAt(1)=='D' && e.charAt(2)=='A'){
                            //ISPROBAVAAAAAAAAAAAAAM
                            Random randomSlovo = new Random();
                            char prvoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            char drugoSlovo = (char)(randomSlovo.nextInt(26) + 'A');
                            if(ids.get(3).toString().equals(""))
                                ids.set(3,new StringBuffer(String.valueOf("NP-"+r.nextInt(9)+r.nextInt(9)+r.nextInt(9)+"-"+prvoSlovo+drugoSlovo)) );
                            
                            if(prethodne_poruke.get(3).charAt(1)=='N' && prethodne_poruke.get(3).charAt(2)=='E'){
                            //    System.out.println("Upisi u bazu za nulto mesto+vreme zauzimanja");
                            }
                            else{
                            }
                            if(boje.get(3).charAt(0)=='y')
                                try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\WoziloJeStiglo.png"));
                              pkLabel3.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                                //ParkingMesto4.setBackground(Color.yellow);
                            else{
                                try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\MestoZauzeto.png"));
                              pkLabel3.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                                ParkingMesto4.setBackground(Color.red);    
                            }
                            br_mesta--;
                            btnPlati4.setEnabled(true);
                        }
                        else if(e.charAt(1)=='N' && e.charAt(2)=='E'){
                            ids.set(3,new StringBuffer(""));
                            if(prethodne_poruke.get(3).charAt(1)=='D' && prethodne_poruke.get(3).charAt(2)=='A'){
                             //   System.out.println("Upisi u bazu za nulto mest+VREME ODLASKA");
                            }
                            else{
                            }
                            boje.get(3).replace(0, boje.get(3).length(), "y");
                            try{
                             BufferedImage myPicture = ImageIO.read(new File(path+"\\mestoSlobodno.png"));
                              pkLabel3.setIcon(new ImageIcon(myPicture));
                            }catch(Exception ecc){
                                ecc.printStackTrace();
                            }
                            //ParkingMesto4.setBackground(Color.green);
                            btnPlati4.setEnabled(false);
                        }
                        break;
                }
                    
                    });
                    prethodne_poruke=poruke;
                    lblBrMesta.setText(String.valueOf(br_mesta));
                    try {
                        Thread.sleep(1000);
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
        jpanComponent = new javax.swing.JPanel();
        ParkingMesto1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblVreme1 = new javax.swing.JLabel();
        btnPlati1 = new javax.swing.JButton();
        pkLabel0 = new javax.swing.JLabel();
        ParkingMesto2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPlati2 = new javax.swing.JButton();
        lblVreme2 = new javax.swing.JLabel();
        pkLabel1 = new javax.swing.JLabel();
        ParkingMesto3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblVreme3 = new javax.swing.JLabel();
        btnPlati3 = new javax.swing.JButton();
        pkLabel2 = new javax.swing.JLabel();
        ParkingMesto4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblVreme4 = new javax.swing.JLabel();
        btnPlati4 = new javax.swing.JButton();
        pkLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblRadnoVreme = new javax.swing.JLabel();
        lblBrMesta = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pnlOpcijeGlavni = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        pnlBackground.setBackground(new java.awt.Color(0, 40, 43));
        pnlBackground.setMaximumSize(new java.awt.Dimension(881, 541));
        pnlBackground.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlBackground.setPreferredSize(new java.awt.Dimension(0, 0));

        jpanComponent.setBackground(new java.awt.Color(248, 193, 30));
        jpanComponent.setPreferredSize(new java.awt.Dimension(630, 470));

        ParkingMesto1.setBackground(new java.awt.Color(0, 40, 43));
        ParkingMesto1.setMaximumSize(new java.awt.Dimension(200, 150));
        ParkingMesto1.setMinimumSize(new java.awt.Dimension(200, 150));
        ParkingMesto1.setPreferredSize(new java.awt.Dimension(200, 150));
        ParkingMesto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 193, 30));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
        ParkingMesto1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 30, 40));

        lblVreme1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVreme1.setForeground(new java.awt.Color(248, 193, 30));
        lblVreme1.setText("Vreme 1");
        ParkingMesto1.add(lblVreme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 80, 30));

        btnPlati1.setBackground(new java.awt.Color(0, 40, 43));
        btnPlati1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnPlati1.setForeground(new java.awt.Color(248, 193, 30));
        btnPlati1.setText("Plati");
        btnPlati1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnPlati1.setFocusPainted(false);
        btnPlati1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPlati1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPlati1MouseReleased(evt);
            }
        });
        btnPlati1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlati1ActionPerformed(evt);
            }
        });
        ParkingMesto1.add(btnPlati1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        pkLabel0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pkLabel0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pkLabel0.setPreferredSize(new java.awt.Dimension(330, 270));
        ParkingMesto1.add(pkLabel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 270));

        ParkingMesto2.setBackground(new java.awt.Color(0, 40, 43));
        ParkingMesto2.setMaximumSize(new java.awt.Dimension(200, 150));
        ParkingMesto2.setMinimumSize(new java.awt.Dimension(200, 150));
        ParkingMesto2.setPreferredSize(new java.awt.Dimension(200, 150));
        ParkingMesto2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 193, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));
        ParkingMesto2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 30, 40));

        btnPlati2.setBackground(new java.awt.Color(0, 40, 43));
        btnPlati2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnPlati2.setForeground(new java.awt.Color(248, 193, 30));
        btnPlati2.setText("Plati");
        btnPlati2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnPlati2.setFocusPainted(false);
        btnPlati2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlati2ActionPerformed(evt);
            }
        });
        ParkingMesto2.add(btnPlati2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        lblVreme2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVreme2.setForeground(new java.awt.Color(248, 193, 30));
        lblVreme2.setText("Vreme 2");
        ParkingMesto2.add(lblVreme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 80, 27));
        ParkingMesto2.add(pkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 270));

        ParkingMesto3.setBackground(new java.awt.Color(0, 40, 43));
        ParkingMesto3.setMaximumSize(new java.awt.Dimension(200, 150));
        ParkingMesto3.setMinimumSize(new java.awt.Dimension(200, 150));
        ParkingMesto3.setPreferredSize(new java.awt.Dimension(200, 150));
        ParkingMesto3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 193, 30));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("3");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));
        ParkingMesto3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 30, 40));

        lblVreme3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVreme3.setForeground(new java.awt.Color(248, 193, 30));
        lblVreme3.setText("Vreme 3");
        ParkingMesto3.add(lblVreme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 80, 27));

        btnPlati3.setBackground(new java.awt.Color(0, 40, 43));
        btnPlati3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnPlati3.setForeground(new java.awt.Color(248, 193, 30));
        btnPlati3.setText("Plati");
        btnPlati3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnPlati3.setFocusPainted(false);
        btnPlati3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlati3ActionPerformed(evt);
            }
        });
        ParkingMesto3.add(btnPlati3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));
        ParkingMesto3.add(pkLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 270));

        ParkingMesto4.setBackground(new java.awt.Color(0, 40, 43));
        ParkingMesto4.setMaximumSize(new java.awt.Dimension(200, 150));
        ParkingMesto4.setMinimumSize(new java.awt.Dimension(200, 150));
        ParkingMesto4.setPreferredSize(new java.awt.Dimension(200, 150));
        ParkingMesto4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 193, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("4");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));
        ParkingMesto4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 30, 50));

        lblVreme4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVreme4.setForeground(new java.awt.Color(248, 193, 30));
        lblVreme4.setText("Vreme 4");
        ParkingMesto4.add(lblVreme4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 80, 27));

        btnPlati4.setBackground(new java.awt.Color(0, 40, 43));
        btnPlati4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnPlati4.setForeground(new java.awt.Color(248, 193, 30));
        btnPlati4.setText("Plati");
        btnPlati4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnPlati4.setFocusPainted(false);
        btnPlati4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlati4ActionPerformed(evt);
            }
        });
        ParkingMesto4.add(btnPlati4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));
        ParkingMesto4.add(pkLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 270));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/PUTTTTT-01.png"))); // NOI18N

        javax.swing.GroupLayout jpanComponentLayout = new javax.swing.GroupLayout(jpanComponent);
        jpanComponent.setLayout(jpanComponentLayout);
        jpanComponentLayout.setHorizontalGroup(
            jpanComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanComponentLayout.createSequentialGroup()
                .addComponent(ParkingMesto1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(ParkingMesto2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
            .addGroup(jpanComponentLayout.createSequentialGroup()
                .addComponent(ParkingMesto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(ParkingMesto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jpanComponentLayout.setVerticalGroup(
            jpanComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanComponentLayout.createSequentialGroup()
                .addGroup(jpanComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParkingMesto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ParkingMesto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jpanComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParkingMesto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ParkingMesto4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlTabla.setBackground(new java.awt.Color(0, 40, 43));
        pnlTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(248, 193, 30));
        jLabel8.setText("Radno vreme:");
        pnlTabla.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 20));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(248, 193, 30));
        jLabel9.setText("Broj slobodnih mesta:");
        pnlTabla.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 20));

        lblRadnoVreme.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblRadnoVreme.setForeground(new java.awt.Color(248, 193, 30));
        lblRadnoVreme.setText("get Radnog ");
        pnlTabla.add(lblRadnoVreme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 90, 20));

        lblBrMesta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblBrMesta.setForeground(new java.awt.Color(248, 193, 30));
        pnlTabla.add(lblBrMesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 90, 20));

        jSeparator2.setForeground(new java.awt.Color(248, 193, 30));
        pnlTabla.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, 20));

        jSeparator3.setForeground(new java.awt.Color(248, 193, 30));
        pnlTabla.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 10));

        pnlOpcijeGlavni.setBackground(new java.awt.Color(0, 40, 43));

        javax.swing.GroupLayout pnlOpcijeGlavniLayout = new javax.swing.GroupLayout(pnlOpcijeGlavni);
        pnlOpcijeGlavni.setLayout(pnlOpcijeGlavniLayout);
        pnlOpcijeGlavniLayout.setHorizontalGroup(
            pnlOpcijeGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        pnlOpcijeGlavniLayout.setVerticalGroup(
            pnlOpcijeGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pnlTabla.add(pnlOpcijeGlavni, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 450));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/Untitled-1.png"))); // NOI18N
        pnlTabla.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 233, 60));

        jSeparator4.setForeground(new java.awt.Color(248, 193, 30));
        pnlTabla.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 340, -1));

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanComponent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1059, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlati1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlati1ActionPerformed

 /*       if(poruke.get(0).charAt(1)=='D' && poruke.get(0).charAt(2)=='A'){
            this.boje.get(0).replace(0, boje.get(0).length(), "r");
            System.out.println("KLIKNUT BUTTON : "+boje.get(0));
            ParkingMesto1.setBackground(Color.red);
        }*/
        PlatiFrame p=new PlatiFrame(this.poruke,this.boje,this.ParkingMesto1,0,this.ids);
        p.setVisible(true);
    }//GEN-LAST:event_btnPlati1ActionPerformed

    private void btnPlati2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlati2ActionPerformed
//        if(poruke.get(1).charAt(1)=='D' && poruke.get(1).charAt(2)=='A'){
//            this.boje.get(1).replace(0, boje.get(1).length(), "r");
//            ParkingMesto2.setBackground(Color.red);
//        }
        PlatiFrame p=new PlatiFrame(this.poruke,this.boje,this.ParkingMesto2,1,this.ids);
        p.setVisible(true);
         
    }//GEN-LAST:event_btnPlati2ActionPerformed
    private void btnPlati4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlati4ActionPerformed
//        if(poruke.get(3).charAt(1)=='D' && poruke.get(3).charAt(2)=='A'){
//            this.boje.get(3).replace(0, boje.get(3).length(), "r");
//            ParkingMesto4.setBackground(Color.red);
//        }
        PlatiFrame p=new PlatiFrame(this.poruke,this.boje,this.ParkingMesto4,3,this.ids);
        p.setVisible(true);
    }//GEN-LAST:event_btnPlati4ActionPerformed

    private void btnPlati3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlati3ActionPerformed
//        if(poruke.get(2).charAt(1)=='D' && poruke.get(2).charAt(2)=='A'){
//            this.boje.get(2).replace(0, boje.get(2).length(), "r");
//            ParkingMesto3.setBackground(Color.red);
//        }
//        
        PlatiFrame p=new PlatiFrame(this.poruke,this.boje,this.ParkingMesto3,2,this.ids);
        p.setVisible(true);
    }//GEN-LAST:event_btnPlati3ActionPerformed

    private void btnPlati1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlati1MousePressed
      this.btnPlati1.setForeground(Color.decode("#00282b"));
      this.btnPlati1.setBackground(Color.decode("#f8c11e"));// TODO add your handling code here:
    }//GEN-LAST:event_btnPlati1MousePressed

    private void btnPlati1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlati1MouseReleased
        this.btnPlati1.setForeground(Color.decode("#f8c11e"));
      this.btnPlati1.setBackground(Color.decode("#00282b")); // TODO add your handling code here:
    }//GEN-LAST:event_btnPlati1MouseReleased

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
    private javax.swing.JPanel ParkingMesto1;
    private javax.swing.JPanel ParkingMesto2;
    private javax.swing.JPanel ParkingMesto3;
    private javax.swing.JPanel ParkingMesto4;
    private javax.swing.JButton btnPlati1;
    private javax.swing.JButton btnPlati2;
    private javax.swing.JButton btnPlati3;
    private javax.swing.JButton btnPlati4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpanComponent;
    private javax.swing.JLabel lblBrMesta;
    private javax.swing.JLabel lblRadnoVreme;
    private javax.swing.JLabel lblVreme1;
    private javax.swing.JLabel lblVreme2;
    private javax.swing.JLabel lblVreme3;
    private javax.swing.JLabel lblVreme4;
    private javax.swing.JLabel pkLabel0;
    private javax.swing.JLabel pkLabel1;
    private javax.swing.JLabel pkLabel2;
    private javax.swing.JLabel pkLabel3;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlOpcijeGlavni;
    private javax.swing.JPanel pnlTabla;
    // End of variables declaration//GEN-END:variables
}
