
package parkingsimulator.Models;

/**
 *
 * @author Amar
 */
public class Parkirani {
    private int ID_vozila;
    private String Vreme_dolaska;
    private String Vreme_odlaska;
    private boolean Placeno;

    public Parkirani(int ID_vozila, String Vreme_dolaska, String Vreme_odlaska, boolean Placeno) {
        this.ID_vozila = ID_vozila;
        this.Vreme_dolaska = Vreme_dolaska;
        this.Vreme_odlaska = Vreme_odlaska;
        this.Placeno = Placeno;
    }

    public int getID_vozila() {
        return ID_vozila;
    }

    public String getVreme_dolaska() {
        return Vreme_dolaska;
    }

    public String getVreme_odlaska() {
        return Vreme_odlaska;
    }

    public boolean isPlaceno() {
        return Placeno;
    }

    public void setID_vozila(int ID_vozila) {
        this.ID_vozila = ID_vozila;
    }

    public void setVreme_dolaska(String Vreme_dolaska) {
        this.Vreme_dolaska = Vreme_dolaska;
    }

    public void setVreme_odlaska(String Vreme_odlaska) {
        this.Vreme_odlaska = Vreme_odlaska;
    }

    public void setPlaceno(boolean Placeno) {
        this.Placeno = Placeno;
    }
    
}