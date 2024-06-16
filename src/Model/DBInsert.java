/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class DBInsert {
    
    Statement stmt;
    
  public void insertpatient(String pName, String gender ,String hTown,int age,int cNumber,String allergies){
  
      try {
          
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
          
          stmt.executeUpdate("INSERT INTO patient(pName,gender,hTown,age,cNumber,allergies) VALUES( '"+pName+"','"+gender+"','"+hTown+"','"+age+"','"+cNumber+"','"+allergies+"') ");

          
      } catch (Exception e) {
      }
  
  }  
    
     public void insertDoctors(String dName, String dgender ,String hTown,int age,int cNumber,String speciation){
  
      try {
          
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
          
           stmt.executeUpdate("INSERT INTO doctors(dName,dgender,hTown,age,cNumber,speciation) VALUES('"+dName+"','"+dgender+"','"+hTown+"','"+age+"','"+cNumber+"','"+speciation+"') ");
           
           
      } catch (Exception e) {
      }
      
     }
  public void inserttestlab(String tName,int t_cost){
      try {
          
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
          
           stmt.executeUpdate("INSERT INTO testlab(tName, t_cost) VALUES('"+tName+"','"+t_cost+"') ");
           
           
      } catch (Exception e) {
      }
    
     }
public void insertPrescriptions(String medi, int docid ,int pid, int ltest,int cost){
      try {
          
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
          
           stmt.executeUpdate("INSERT INTO Prescriptions( med,d_id,p_id, l_id,cost) VALUES('"+medi+"','"+docid+"','"+pid+"','"+ltest+"','"+cost+"') ");
           
           
      } catch (Exception e) {
      }
      }
}


