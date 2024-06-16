/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.DBUpdate;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class UpdateController {
    
    
    public static void updatepatient(String pid,String pName, String gender , String hTown, int age, int cNumber, String allergies){
    
   
    
    if(pid != null){
    
     new DBUpdate().updatePatient(pid, pName, gender, hTown, age, cNumber, allergies);
     JOptionPane.showMessageDialog(null, "record Updated Successfully","successfull",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    else{
    
        
    }
    }
    

    
    
    public static void updatedoctors(String did,String dName, String dgender , String hTown, int age, int cNumber, String Speciation){
    
   
    
    if(did != null){
    
     new DBUpdate().updatedoctors(did, dName, dgender, hTown, age, cNumber, Speciation);
     JOptionPane.showMessageDialog(null, "record Updated Successfully","successfull",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    else{
    
        
    }
    }
    
     public static void updatetestlab(String tid,String tName, int t_cost){
    
   
    
    if(tid != null){
    
     new DBUpdate().updatetestlab(tid, tName, t_cost);
     JOptionPane.showMessageDialog(null, "record Updated Successfully","successfull",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    else{
    
    }
}
    
  /*  public static void updatePrescriptions((int pr_id, String med ,  int d_id,int  p_id, int l_id,int cost){
    
   
    
    if(  pr_id != null){
    
     new DBUpdate().updatePrescriptions( pr_id, med, d_id,  p_id, l_id, cost);
     JOptionPane.showMessageDialog(null, "record Updated Successfully","successfull",JOptionPane.INFORMATION_MESSAGE);
    
    
}
    else{
    }
}*/
}
