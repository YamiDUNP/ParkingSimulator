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
    private String JMBG;

    public Upravnik(String username, String JMBG) {
        this.username = username;
        this.JMBG = JMBG;
    }

    public String getUsername() {
        return username;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }
    
}

