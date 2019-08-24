
package parkingsimulator.Models;

/**
 *
 * @author Amar
 */
public class Parkirani {
    private String ID_vozila;
    private String Vreme_dolaska;
    private String Vreme_odlaska;
    private float Placeno;
    private String id_mesta;

    public String getId_mesta() {
        return id_mesta;
    }
    public void setId_mesta(String s){
        this.id_mesta=s;
    }

    public Parkirani(String ID_vozila, String Vreme_dolaska, String Vreme_odlaska, float Placeno, String id_mesta) {
        this.ID_vozila = ID_vozila;
        this.Vreme_dolaska = Vreme_dolaska;
        this.Vreme_odlaska = Vreme_odlaska;
        this.Placeno = Placeno;
        this.id_mesta = id_mesta;
    }
    public Parkirani(){
        ID_vozila="";
        Vreme_dolaska="";
        Vreme_odlaska="";
        Placeno=0;
        id_mesta="";
    }
    

    public String getID_vozila() {
        return ID_vozila;
    }

    public String getVreme_dolaska() {
        return Vreme_dolaska;
    }

    public String getVreme_odlaska() {
        return Vreme_odlaska;
    }

    public float getPlaceno() {
        return Placeno;
    }

    public void setID_vozila(String ID_vozila) {
        this.ID_vozila = ID_vozila;
    }

    public void setVreme_dolaska(String Vreme_dolaska) {
        this.Vreme_dolaska = Vreme_dolaska;
    }

    public void setVreme_odlaska(String Vreme_odlaska) {
        this.Vreme_odlaska = Vreme_odlaska;
    }

    public void setPlaceno(float Placeno) {
        this.Placeno = Placeno;
    }
    
    @Override
    public String toString(){
        return this.ID_vozila+" "+this.Vreme_dolaska+" "+this.Vreme_odlaska;
    }
}