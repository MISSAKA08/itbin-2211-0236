/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBConnection {
    
   static Connection conn;
    static java.sql.Statement stat = null;
    
   public static java.sql.Statement getStatementConnection(){
       // public static void main(String[] args) {
        
    
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinic","root","");
           // System.out.println(conn);
            
            stat = conn.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return stat;
    }
    

   
    public static void closeCon() throws SQLException{
        conn.close();
    }
    
    
    
}
