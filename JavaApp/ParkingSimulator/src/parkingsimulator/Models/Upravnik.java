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
public class Upravnik {
    private String username;
    private int JMBG;

    public Upravnik(String username, int JMBG) {
        this.username = username;
        this.JMBG = JMBG;
    }

    public String getUsername() {
        return username;
    }

    public int getJMBG() {
        return JMBG;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setJMBG(int JMBG) {
        this.JMBG = JMBG;
    }
    
}

