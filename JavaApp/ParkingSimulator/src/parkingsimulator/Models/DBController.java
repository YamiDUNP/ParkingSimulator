/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsimulator.Models;

import java.io.File;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.security.*;
import java.util.ArrayList;

/**
 *
 * @author 1
 */
public class DBController {
    private static DBController instance=null; 
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    DBController() throws SQLException{
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String msAccDB = new File("").getAbsolutePath()+"/ParkingSimulator.accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccDB; 
            connection = DriverManager.getConnection(dbURL); 
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
    }
    
    public static DBController require() throws SQLException{
        if(instance==null){
            instance=new DBController();
        }
        return instance;
    }
    
    public ResultSet submitQuery(String query){
         try {
            statement = (Statement) connection.createStatement();  
            resultSet = statement.executeQuery(query);
        }
        catch(Exception E){
            System.out.println(E);
        }
        finally {
            try {
                if(null != connection) {
                    statement.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
        return resultSet;
    }
    public Upravnik loginValid(String username,String password){
      
        resultSet = submitQuery("SELECT username,JMBG from Upravnik where username='"+username+"' and password='"+getMD5(password)+"';");

        try {
            if(resultSet.next())
                return new Upravnik(resultSet.getString("username"),resultSet.getInt("JMBG"));                  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return null;
        }
    
    public ArrayList<Parkirani> getKorisnike(){
        ArrayList<Parkirani> lista=new ArrayList();
        
        try {
            statement = (Statement) connection.createStatement();  
            resultSet = statement.executeQuery("select * from parkirani");
            while(resultSet.next()){
                lista.add(new Parkirani(
                    resultSet.getString("ID_VOZILA"),
                    resultSet.getString("vreme_dolaska"),
                    resultSet.getString("vreme_odlaska"),
                    resultSet.getBoolean("placeno")
                ));
            }
        }
        catch(Exception E){
            System.out.println(E);
        }
        finally {
            try {
                if(null != connection) {
                    statement.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
        //System.out.println(lista);
        return lista;
    }
    
private static String getMD5(String a){
    try{
        MessageDigest md=MessageDigest.getInstance("MD5");
        byte[] messageDigest=md.digest(a.getBytes());
        BigInteger no=new BigInteger(1, messageDigest);
        String hashtext=no.toString(16);
        while(hashtext.length()<32){
            hashtext="0"+hashtext;
        }
    return hashtext;
    }
    catch(NoSuchAlgorithmException e){
        throw new RuntimeException(e);
    }
}
}

