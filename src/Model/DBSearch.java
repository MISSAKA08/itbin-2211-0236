/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class DBSearch {
    
    
      
   Statement stmt; 
ResultSet rs; 
public ResultSet searchLogin(String usName) { 
    
try { 
    
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
    
String name = usName; 
//Execute the Query 
rs = stmt.executeQuery("SELECT * FROM login where userName='" + name + "'"); 


}
catch (Exception e){ 
e.printStackTrace(); 
} 
return rs; 
}
    
    
public ResultSet searchAllPatient(){

    try {
        
           
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  rs = stmt.executeQuery("SELECT * FROM patient");
  
  
        
    } catch (Exception e) {
    }

return rs;
}

public ResultSet searchPatient(String pID){


    try {
        
                  
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  String piD = pID;
  
  rs = stmt.executeQuery("SELECT * FROM patient Where p_id = '"+piD+"'");
        
        
    } catch (Exception e) {
    }
return rs;
}
    
     
public ResultSet searchAlldoctors(){

    try {
        
           
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  rs = stmt.executeQuery("SELECT * FROM doctors");
  
  
        
    } catch (Exception e) {
    }

return rs;
}  

public ResultSet searchdoctors(String dID){


    try {
        
                  
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  String diD = dID;
  
  rs = stmt.executeQuery("SELECT * FROM doctors Where d_id = '"+diD+"'");
        
        
    } catch (Exception e) {
    }
return rs;
}

public ResultSet searchAlltestlab(){

    try {
        
           
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  rs = stmt.executeQuery("SELECT * FROM testlab");
  
  
        
    } catch (Exception e) {
    }

return rs;
}  

public ResultSet searchtestlab(String tid){


    try {
        
                  
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  String tiD = tid;
  
  rs = stmt.executeQuery("SELECT * FROM testlab Where t_id = '"+tiD+"'");
        
        
    } catch (Exception e) {
    }
return rs;
}

public ResultSet searchAllprescriptions(){

    try {
        
           
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  rs = stmt.executeQuery("SELECT * FROM prescriptions");
  
  
        
    } catch (Exception e) {
    }

return rs;
}  

public ResultSet searchprescriptions(String pr_id){


    try {
        
                  
  Class.forName("com.mysql.cj.jdbc.Driver");
    
  stmt = DBConnection.getStatementConnection();
  
  String pid = pr_id;
  
  rs = stmt.executeQuery("SELECT * FROM prescriptions Where pr_id = '"+pid+"'");
        
        
    } catch (Exception e) {
    }
return rs;
}

}
