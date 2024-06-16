/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.Login;
import View.Patients;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class LoginController {
    
    
  public static void login(String usName, String pW){
        
        try{
                       
       String userName = null;
       String password = null;
       
     ResultSet rs = new DBSearch().searchLogin(usName);
            
       while(rs.next()) {
           
           userName = rs.getString("userName");
           password  = rs.getString("password");
       }    
       
       if(userName != null && password != null ){
           
   
           if(userName.equals(usName) && password.equals(pW)){
               
               System.out.println("Login Successfull");
               
               Login.getFrames()[0].dispose();
              
             // new Home().setVisible(true);
              new Patients().setVisible(true);
          
           }
           else{
    
JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
}
           
       }
       else {
JOptionPane.showMessageDialog(null, "Please Enter valid UserName or Password", "Error", JOptionPane.ERROR_MESSAGE);
}
       
       DBConnection.closeCon();
        }
        catch(SQLException ex){
            
           Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
    }
    
    
    
}
