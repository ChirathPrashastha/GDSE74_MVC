/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Chirath
 */
public class DBConnection {
    private static DBConnection dBConnection;
    
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection"jdbc:mysql://localhost:3306/supermarket", "root", "Chirath@35");
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
         if(dBConnection == null){
             dBConnection = new DBConnection();
         }
         return dBConnection;
     }
    
    public Connection getConnection(){
         return this.connection;
     }
}
