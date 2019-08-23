/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator;

import java.sql.SQLException;
import parkingsimulator.Arduino.ArduinoController;
import parkingsimulator.Views.MainFrame;

/**
 *
 * @author 1
 */
public class ParkingSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        ArduinoController ac=new ArduinoController();
        ac.initialize();
        Thread t=new Thread(){
            public void run(){
                try{
                    Thread.sleep(1000000);
                }catch(InterruptedException ex){
                    System.out.println("Thread was interupted"+ex);
                }
            }
        };
        t.start();
        MainFrame mf=new MainFrame();
        mf.setVisible(true);
    }
    
}
