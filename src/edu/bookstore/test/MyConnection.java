/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bookstore.test;

import edu.bookstore.entites.Offre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Dridi
 */
public class MyConnection {

    
   public String url="jdbc:mysql://sql9.freesqldatabase.com:3306/sql9381563";
    public String login="sql9381563";
   public String pwd="iv6JLxjSFX";
    Connection cnx;
    private static MyConnection instance; 

private MyConnection() {
        
        try {
            cnx = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connexion établie!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());        }
        
    
    }
    
    public Connection getCnx(){
        return cnx;
    }
    
    public static MyConnection getInstance()
    {
        if(instance==null){
            instance = new MyConnection();
        }
        return instance; 
    }    
    
   
}
