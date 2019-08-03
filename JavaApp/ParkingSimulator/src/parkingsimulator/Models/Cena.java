/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Models;

/**
 *
 * @author Amar
 */
public class Cena {
    private String ID_cene;
    private String Datum;
    private int Vrednost;
    
    public Cena(String ID_cene,String Datum,int Vrednost){
        this.ID_cene=ID_cene;
        this.Datum=Datum;
        this.Vrednost=Vrednost;
    }

    Cena(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getID_cene(){
        return ID_cene;
    }
    
    public String getDatum(){
        return Datum;
    }
    
    public int getVrednost(){
        return Vrednost;
    }
    
    public void setID_cene(String ID_Cene) {
        this.ID_cene=ID_Cene;
    }
    
    public void setDatum(String Datum) {
        this.Datum=Datum;
    }
    
    public void setVrednost(int Vrednost) {
        this.Vrednost=Vrednost;
    }
    
}
