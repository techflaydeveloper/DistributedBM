/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Cashier.DatabaseConfiguration;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuyeibill
 */
public class Calaculation {
    DatabaseConfiguration mydb=new DatabaseConfiguration();
    private static Connection myconn;
    public Calaculation(){
        myconn=mydb.getConnection();
    }
    
    public static void main(String [] args){        
        
        int i=0;
        
        int myid=32160778;
       for(i=0;i<500;i++){
            try {
                PreparedStatement stateme=myconn.prepareStatement("INSERT INTO employee_details VALUES(?,?,?)");
                stateme.setString(1,"Chris "+Integer.toString(i));
                stateme.setString(2, "Eric "+Integer.toString(i));
                stateme.setInt(3, myid+i);
                stateme.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Calaculation.class.getName()).log(Level.SEVERE, null, ex);
            }            
           
           
    
       }
       System.out.println("Finished loading 500 records");
        
    }
    
}
