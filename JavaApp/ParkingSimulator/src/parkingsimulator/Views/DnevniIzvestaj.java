/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.paint.Color.color;
import javafx.scene.control.DatePicker;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import parkingsimulator.Models.DBController;
import parkingsimulator.Models.Parkirani;
import java.text.*;
import java.awt.print.*;
import java.util.Comparator;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
/**
 *
 * @author Amar
 */
public class DnevniIzvestaj extends javax.swing.JFrame {

    /**
     * Creates new form DnevniIzvestaj
     */
    ArrayList<Parkirani> listaParkiranih;
    TableModel myModel;
    TableRowSorter trs;
    String buffer;
        
    public DnevniIzvestaj() throws SQLException, ParseException {
        this.setTitle("Izveštaj");
        listaParkiranih=DBController.require().getKorisnike();    
        initComponents();
        buffer="";
        myModel = this.TableDnevni.getModel();
        trs = new TableRowSorter(myModel);
            
        //ZA PRVI PUT DA DISPLAYA PLACEHOLDER
        String pamtiOznaceni = "Trazite po "+CBSearch.getSelectedItem().toString();
        System.out.println(pamtiOznaceni);
        TFSearch.setText(pamtiOznaceni);
        TFSearch.setForeground(Color.getHSBColor(200, 200, 200));
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
//        String d = sdf.format(jDateChooser1.getDate());
        
        

        class FloatComparator implements Comparator{

            @Override
            public int compare(Object o1, Object o2) {
                  Float float1 = (Float)o1;
                Float float2 = (Float)o2;
                return float1.compareTo(float2);
            }
            public boolean equals(Object o2) {
                return this.equals(o2);
            }
        }

        trs.setComparator(3, new FloatComparator());

        TableDnevni.setRowSorter(trs);
       // TableDnevni.setAutoCreateRowSorter(true);
        //IZMENJENA TABELA , DA BUDU BOJE NA CIK CAK 
        TableDnevni.setDefaultRenderer(Object.class, new TableCellRenderer(){
            private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                JTableHeader header=table.getTableHeader();
                header.setBackground(Color.decode("#dfa907"));
                header.setForeground(Color.decode("#00282b"));
                header.setFont(new Font("Comic Sans M S",Font.PLAIN,16));
               
                
                if (row%2 == 0){

                  //  c.setBackground(Color.decode("#00282b
                    c.setBackground(Color.decode("#fdf1ce"));
                    c.setForeground(Color.decode("#00282b"));
                }

                else {

                   // c.setBackground(Color.decode("#f8c11e"));
                    c.setBackground(Color.decode("#fbdd83"));
                    c.setForeground(Color.decode("#00282b"));

                }                       

                return c;

            }
            

        });
        
        
        float ukupnazarada=0;
        int DBV=0;
        
        //ISPIS DNEVNE ZARADE I BROJA PARKIRANIH VOZILA U TOKU DANA
            for(int i=0;i<listaParkiranih.size();i++){
                String j="";
                String a="";
                LocalDate date = LocalDate.now();    
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    a=date.format(formatter);
                    j=listaParkiranih.get(i).getVreme_odlaska().substring(0, 10);
                    if(a.equals(j)){
                        DBV++;
                        ukupnazarada=ukupnazarada+listaParkiranih.get(i).getPlaceno();
                    }
            }
        this.lblBrojVozilaDanas.setText(Integer.toString(DBV));
        this.lblUkupnaZarada.setText(Float.toString(ukupnazarada)+" din");
        
        for(int i=0; i<listaParkiranih.size(); i++){
                String datum=listaParkiranih.get(i).getVreme_dolaska().substring(0, 19);
                SimpleDateFormat dt = new SimpleDateFormat("yyyyy-MM-dd hh:mm:ss");
                Date date = dt.parse(datum);
                SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
         Object[] row = {listaParkiranih.get(i).getID_vozila(), dt1.format(date).substring(0, 19),listaParkiranih.get(i).getVreme_odlaska().substring(0, 19),new Float(listaParkiranih.get(i).getPlaceno())};
               ((DefaultTableModel) TableDnevni.getModel()).insertRow(i, row);  
        }
           
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

        jButton1 = new javax.swing.JButton();
        DnevniizvestajPNL = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDnevni = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblBrojVozilaDanas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUkupnaZarada = new javax.swing.JLabel();
        CBSearch = new javax.swing.JComboBox<>();
        TFSearch = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        LBrojVozilaIzabranogDatuma = new javax.swing.JLabel();
        LZaradaIzabranogDatuma = new javax.swing.JLabel();
        LBrojVozilaIzabranogDatuma2 = new javax.swing.JLabel();
        LZaradaIzabranogDatuma2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DnevniizvestajPNL.setBackground(new java.awt.Color(0, 40, 43));
        DnevniizvestajPNL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrint.setBackground(new java.awt.Color(0, 40, 43));
        btnPrint.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(248, 193, 30));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/btnStampaj.png"))); // NOI18N
        btnPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPrintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPrintMouseReleased(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        DnevniizvestajPNL.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, -1, 42));

        jScrollPane2.setBackground(new java.awt.Color(0, 40, 43));
        jScrollPane2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane2.setOpaque(false);

        TableDnevni.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        TableDnevni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID vozila", "Vreme dolaska", "Vreme odlaska", "Uplata"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDnevni.setGridColor(new java.awt.Color(255, 255, 255));
        TableDnevni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TableDnevniMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(TableDnevni);

        DnevniizvestajPNL.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 990, 228));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 193, 30));
        jLabel1.setText("Broj parkiranih vozila u toku dana:");
        DnevniizvestajPNL.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, 30));

        lblBrojVozilaDanas.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblBrojVozilaDanas.setForeground(new java.awt.Color(248, 193, 30));
        lblBrojVozilaDanas.setText("0");
        DnevniizvestajPNL.add(lblBrojVozilaDanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 80, 36));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 193, 30));
        jLabel3.setText("Ukupna dnevna zarada:");
        DnevniizvestajPNL.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, 32));

        lblUkupnaZarada.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lblUkupnaZarada.setForeground(new java.awt.Color(248, 193, 30));
        lblUkupnaZarada.setText("0.0 din");
        DnevniizvestajPNL.add(lblUkupnaZarada, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 80, 32));

        CBSearch.setBackground(new java.awt.Color(0, 40, 43));
        CBSearch.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        CBSearch.setForeground(new java.awt.Color(248, 193, 30));
        CBSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID vozila", "Vreme dolaska", "Vreme odlaska", "Uplata" }));
        CBSearch.setAlignmentX(0.0F);
        CBSearch.setAlignmentY(0.0F);
        CBSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        CBSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBSearchItemStateChanged(evt);
            }
        });
        CBSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CBSearchMouseEntered(evt);
            }
        });
        CBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBSearchActionPerformed(evt);
            }
        });
        DnevniizvestajPNL.add(CBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 162, 39));

        TFSearch.setBackground(new java.awt.Color(0, 40, 43));
        TFSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TFSearch.setForeground(new java.awt.Color(248, 193, 30));
        TFSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        TFSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TFSearchFocusLost(evt);
            }
        });
        TFSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TFSearchMouseEntered(evt);
            }
        });
        TFSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSearchActionPerformed(evt);
            }
        });
        TFSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFSearchKeyReleased(evt);
            }
        });
        DnevniizvestajPNL.add(TFSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 11, 200, 39));

        jDateChooser1.setDateFormatString("dd.MM.yyyy.");
        jDateChooser1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jDateChooser1ComponentAdded(evt);
            }
        });
        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusGained(evt);
            }
        });
        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseEntered(evt);
            }
        });
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        DnevniizvestajPNL.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 157, 36));

        LBrojVozilaIzabranogDatuma.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        LBrojVozilaIzabranogDatuma.setForeground(new java.awt.Color(248, 193, 30));
        LBrojVozilaIzabranogDatuma.setText("Broj parkiranih vozila izabranog datuma:");
        DnevniizvestajPNL.add(LBrojVozilaIzabranogDatuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 310, 30));

        LZaradaIzabranogDatuma.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        LZaradaIzabranogDatuma.setForeground(new java.awt.Color(248, 193, 30));
        LZaradaIzabranogDatuma.setText("Dnevna zarada izabranog datuma:");
        DnevniizvestajPNL.add(LZaradaIzabranogDatuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 30));

        LBrojVozilaIzabranogDatuma2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        LBrojVozilaIzabranogDatuma2.setForeground(new java.awt.Color(248, 193, 30));
        LBrojVozilaIzabranogDatuma2.setText("0");
        DnevniizvestajPNL.add(LBrojVozilaIzabranogDatuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 43, 31));

        LZaradaIzabranogDatuma2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        LZaradaIzabranogDatuma2.setForeground(new java.awt.Color(248, 193, 30));
        LZaradaIzabranogDatuma2.setText("0.0 din");
        DnevniizvestajPNL.add(LZaradaIzabranogDatuma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 80, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 193, 30));
        jLabel2.setText("Izaberite dan za izveštaj:");
        DnevniizvestajPNL.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 210, 30));

        btnClear.setBackground(new java.awt.Color(0, 40, 43));
        btnClear.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(248, 193, 30));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parkingsimulator/Views/Slike/btnClear.png"))); // NOI18N
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 193, 30)));
        btnClear.setFocusable(false);
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClearMouseReleased(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        DnevniizvestajPNL.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 11, -1, 37));

        jSeparator4.setBackground(new java.awt.Color(248, 193, 30));
        jSeparator4.setForeground(new java.awt.Color(248, 193, 30));
        DnevniizvestajPNL.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 380, 10));

        jSeparator5.setBackground(new java.awt.Color(248, 193, 30));
        jSeparator5.setForeground(new java.awt.Color(248, 193, 30));
        DnevniizvestajPNL.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 340, 10));

        jSeparator6.setForeground(new java.awt.Color(248, 193, 30));
        DnevniizvestajPNL.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1000, 10));

        jSeparator7.setBackground(new java.awt.Color(248, 193, 30));
        jSeparator7.setForeground(new java.awt.Color(248, 193, 30));
        DnevniizvestajPNL.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 190, 10));

        jSeparator9.setBackground(new java.awt.Color(248, 193, 30));
        jSeparator9.setForeground(new java.awt.Color(248, 193, 30));
        DnevniizvestajPNL.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 380, 10));

        jSeparator8.setBackground(new java.awt.Color(248, 193, 30));
        jSeparator8.setForeground(new java.awt.Color(248, 193, 30));
        DnevniizvestajPNL.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 340, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(DnevniizvestajPNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DnevniizvestajPNL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        
        MessageFormat header = new MessageFormat("Report Print");
        MessageFormat footer = new MessageFormat("Page{0,number,ingnr}");
        
        try{
            TableDnevni.print();
        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot priint %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

     
    private void CBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBSearchActionPerformed

        String pamtiOznaceni = "Trazite po "+CBSearch.getSelectedItem().toString();
        TFSearch.setText(pamtiOznaceni);
        TFSearch.setForeground(Color.getHSBColor(200, 200, 200));
    }//GEN-LAST:event_CBSearchActionPerformed

    private void izaberiKolonu(int brojKolone){
        //DefaultTableModel table = (DefaultTableModel)TableDnevni.getModel();
        String search = TFSearch.getText().toUpperCase();
        //TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        //TableDnevni.setRowSorter(tr);
        trs.setRowFilter(RowFilter.regexFilter(search, brojKolone));
    }
    
    private void TFSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFSearchKeyReleased
        TFSearch.setForeground(Color.decode("#f9c939"));
   
            if(CBSearch.getSelectedIndex() == 0){
                izaberiKolonu(0);
            }
            else if(CBSearch.getSelectedIndex() == 1){
                izaberiKolonu(1);
            }
            else if(CBSearch.getSelectedIndex() == 2){
                izaberiKolonu(2);
            }
            else if(CBSearch.getSelectedIndex() == 3){
                izaberiKolonu(3);
            }

    }//GEN-LAST:event_TFSearchKeyReleased

    private void TFSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFSearchMouseClicked
        
        if(TFSearch.getText().equals("Trazite po "+CBSearch.getSelectedItem().toString()))
            TFSearch.setText("");
    }//GEN-LAST:event_TFSearchMouseClicked

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        
        if(this.jDateChooser1.getDate()!=null){
            Date oDate = this.jDateChooser1.getDate();
            DateFormat oDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String szDate = oDateFormat.format(oDate);
            
            
                    //ZA SORTIRANJE TABELE PO IZABRANOM DATUMU IZ KALENDARA
                    DefaultTableModel table = (DefaultTableModel)TableDnevni.getModel();
                    String search = szDate;
                   // TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
                   // TableDnevni.setRowSorter(tr);
                    trs.setRowFilter(RowFilter.regexFilter(search, 1));
                   
                this.LBrojVozilaIzabranogDatuma2.setText(Integer.toString(this.TableDnevni.getRowCount()));
                
                Object CellValue=null;
                float UkupnaZarada=0;
                for(int i=0;i<table.getRowCount();i++){
                    CellValue=table.getValueAt(i, 3);
                    float a=Float.valueOf(CellValue.toString());
                    if(table.getValueAt(i, 1).toString().substring(0, 10).equals(szDate))
                    UkupnaZarada=UkupnaZarada+a;
                    }
             
                this.LZaradaIzabranogDatuma2.setText(String.valueOf(UkupnaZarada)+" din");
        
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void TFSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFSearchFocusLost
            if(this.TFSearch.getText().equals("")){
                String pamtiOznaceni = "Trazite po "+CBSearch.getSelectedItem().toString();
                TFSearch.setText(pamtiOznaceni);
                TFSearch.setForeground(Color.getHSBColor(200, 200, 200));
    
            }
    }//GEN-LAST:event_TFSearchFocusLost

    private void CBSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBSearchItemStateChanged
              this.TFSearch.setText(""); 
            if(CBSearch.getSelectedIndex() == 0){
                izaberiKolonu(0);
            }
            else if(CBSearch.getSelectedIndex() == 1){
                izaberiKolonu(1);
            }
            else if(CBSearch.getSelectedIndex() == 2){
                izaberiKolonu(2);
            }
            else if(CBSearch.getSelectedIndex() == 3){
                izaberiKolonu(3);
            }
            
    }//GEN-LAST:event_CBSearchItemStateChanged

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.TFSearch.setText("");
            if(CBSearch.getSelectedIndex() == 0){
                izaberiKolonu(0);
            }
            else if(CBSearch.getSelectedIndex() == 1){
                izaberiKolonu(1);
            }
            else if(CBSearch.getSelectedIndex() == 2){
                izaberiKolonu(2);
            }
            else if(CBSearch.getSelectedIndex() == 3){
                izaberiKolonu(3);
            }
            
                String pamtiOznaceni = "Trazite po "+CBSearch.getSelectedItem().toString();
                TFSearch.setText(pamtiOznaceni);
                TFSearch.setForeground(Color.getHSBColor(200, 200, 200));
                this.jDateChooser1.setDate(null);
                this.LBrojVozilaIzabranogDatuma2.setText("0");
                this.LZaradaIzabranogDatuma2.setText("0.0 din");
                buffer="";
    }//GEN-LAST:event_btnClearActionPerformed

    private void TFSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFSearchKeyPressed
        if(buffer=="")
            ((JTextField)(evt.getSource())).setText("");
        TFSearch.setForeground(Color.decode("#f9c939"));
        this.jDateChooser1.setDate(null);
        this.LBrojVozilaIzabranogDatuma2.setText("0");
        this.LZaradaIzabranogDatuma2.setText("0.0 din");
        if(evt.getKeyCode()==8){
            if(buffer.length()==0)
                buffer="";
            else{
                String s=buffer.substring(0, buffer.length()-1);
                buffer = s;
            }
        }else
            buffer+=evt.getKeyChar();
        
    
    }//GEN-LAST:event_TFSearchKeyPressed

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        btnClear.setBackground(Color.decode("#f9c939"));
        btnClear.setForeground(Color.decode("#00282b"));
    }//GEN-LAST:event_btnClearMousePressed

    private void btnClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseReleased
        btnClear.setBackground(Color.decode("#00282b"));
     btnClear.setForeground(Color.decode("#f9c939"));
    }//GEN-LAST:event_btnClearMouseReleased

    private void btnPrintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMousePressed
    btnPrint.setBackground(Color.decode("#f9c939"));
    btnPrint.setForeground(Color.decode("#00282b"));  

    }//GEN-LAST:event_btnPrintMousePressed

    private void btnPrintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseReleased
      btnPrint.setBackground(Color.decode("#00282b"));
    btnPrint .setForeground(Color.decode("#f9c939"));
    }//GEN-LAST:event_btnPrintMouseReleased

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        ((JButton)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
// TODO add your handling code here:
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        // TODO add your handling code here:
        ((JButton)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnPrintMouseEntered

    private void jDateChooser1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseEntered
        // TODO add your handling code here:
        ((JButton)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jDateChooser1MouseEntered

    private void CBSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBSearchMouseEntered
      ((JComboBox)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_CBSearchMouseEntered

    private void TFSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFSearchMouseEntered
      
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSearchMouseEntered

    private void TableDnevniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDnevniMouseEntered
        ((JTable)evt.getSource()).setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // TODO add your handling code here:
    }//GEN-LAST:event_TableDnevniMouseEntered

    private void TFSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSearchActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
System.out.println("kljiknu me ti kljiknu");
        
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void jDateChooser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusGained
        buffer="";
        System.out.println("GAINEDF FOCUS");
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1FocusGained

    private void jDateChooser1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jDateChooser1ComponentAdded
        buffer="";
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1ComponentAdded

    private void TFSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFSearchFocusGained
        if(!TFSearch.getText().equals("") && !buffer.equals(TFSearch.getText())){
            System.out.println("ocistcen");
            buffer="";
        }
    }//GEN-LAST:event_TFSearchFocusGained

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
            java.util.logging.Logger.getLogger(DnevniIzvestaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DnevniIzvestaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DnevniIzvestaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DnevniIzvestaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    try {
                        new DnevniIzvestaj().setVisible(true);
                    } catch (ParseException ex) {
                        Logger.getLogger(DnevniIzvestaj.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DnevniIzvestaj.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBSearch;
    private javax.swing.JPanel DnevniizvestajPNL;
    private javax.swing.JLabel LBrojVozilaIzabranogDatuma;
    private javax.swing.JLabel LBrojVozilaIzabranogDatuma2;
    private javax.swing.JLabel LZaradaIzabranogDatuma;
    private javax.swing.JLabel LZaradaIzabranogDatuma2;
    private javax.swing.JTextField TFSearch;
    private javax.swing.JTable TableDnevni;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBrojVozilaDanas;
    private javax.swing.JLabel lblUkupnaZarada;
    // End of variables declaration//GEN-END:variables
}
