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
public class DBUpdate {
    
    Statement stmt;
    
    public void updatePatient(String pid,String pName, String gender , String hTown, int age, int cNumber, String allergies){
    
        try {
            
             
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
           
           stmt.executeUpdate("UPDATE `patient` SET `pName`='"+pName+"', `gender`='"+gender+"' ,`hTown`='"+hTown+"' ,`age`='"+age+"',`cNumber`='"+cNumber+"', `allergies`='"+allergies+"' WHERE `p_id`='"+pid+"' ");
           
            
        } catch (Exception e) {
        }
    
    
    }
    
    
     public void updatedoctors(String did,String dName, String dgender , String hTown, int age, int cNumber, String Speciation){
    
        try {
            
             
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
           
           stmt.executeUpdate("UPDATE `doctors` SET `dName`='"+dName+"', `dgender`='"+dgender+"' ,`hTown`='"+hTown+"' ,`age`='"+age+"',`cNumber`='"+cNumber+"', `Speciation`='"+Speciation+"' WHERE `d_id`='"+did+"' ");
           
            
        } catch (Exception e) {
        }
     } 
     
      public void updatetestlab(String tid,String tName,  int t_cost){
    
        try {
            
             
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
           
           stmt.executeUpdate("UPDATE `testlab` SET `tName`='"+tName+"',`cost`='"+t_cost+"'");
           
       
        } catch (Exception e) {
        }
      }

      public void updateprescriptions(int pid,String med,  int docid ,int  pId, int labId,int cost){
    
        try {
            
             
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           stmt = DBConnection.getStatementConnection();
           
           stmt.executeUpdate("UPDATE `prescriptions` SET  `med`='"+med+"' ,`d_id`='"+docid+"' ,'p_id'='"+pId+"',`l_id`='"+labId+"',`cost`='"+cost+"' WHERE `pr_id`='"+pid+"' ");
           
            
        } catch (Exception e) {
        }
}
}