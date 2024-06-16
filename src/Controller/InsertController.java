/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.DBInsert;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class InsertController {
    
    
    public static void insertPatient(String pName, String gender ,String hTown,int age,int cNumber,String allergies){
    
    if(pName != null){
    
    new DBInsert().insertpatient(pName, gender, hTown, age, cNumber, allergies);
    
    JOptionPane.showMessageDialog(null, "Record has successfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    }
    
    public static void insertDoctors(String dName, String dgender ,String hTown,int age,int cNumber,String speciation){
    
    if(dName != null){
    
    new DBInsert().insertDoctors(dName, dgender, hTown, age, cNumber, speciation);
    
    JOptionPane.showMessageDialog(null, "Record has successfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
}
    
     public static void inserttestlab(String tName,int t_cost){
    
    if(tName != null){
    
    new DBInsert().inserttestlab(tName, t_cost);
    
    JOptionPane.showMessageDialog(null, "Record has successfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
}
     }

  public static void insertPrescriptions(String medi, int docid ,int  pid, int ltest,int cost){
    
    if(medi != null){
    
    new DBInsert().insertPrescriptions( medi, docid, pid, ltest, cost);
    
    JOptionPane.showMessageDialog(null, "Record has successfully","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
  }
}

