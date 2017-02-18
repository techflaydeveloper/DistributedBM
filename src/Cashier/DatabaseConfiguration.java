/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuyeibill
 */
public class DatabaseConfiguration {
    Connection conn=null;
    private static final String SERVER="jdbc:mysql://localhost";        
    private static final String USER = "root"; 
    private static final String PASSWORD = "Hornbill";
    
    public static void main(String [] args){
        new DatabaseConfiguration().getConnection();
        
    }
    public Connection getConnection() {        ;
       // if( dbUser==USER && dbPassword==PASSWORD){
            try {                
                conn=DriverManager.getConnection(SERVER,USER,PASSWORD);                
                //JOptionPane.showMessageDialog(null,"The connection is Successfull","Business Management",JOptionPane.PLAIN_MESSAGE);
                Statement state=conn.createStatement();
                state.execute("USE hornbill ");
            }            
            catch (SQLException ex) {
                Logger.getLogger(DatabaseConfiguration.class.getName()).log(Level.SEVERE, null, ex);
            }/*}
    else{
            JOptionPane.showMessageDialog(null, "Error In Connection.Check your Server Connection Details", "BM", 2);
    
}*/
        return conn;
        
        
    }
        
    
}
