/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import Cashier.DatabaseConfiguration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tuyeibill
 */
public class NewStock extends javax.swing.JDialog {  
DatabaseConfiguration mydb=new DatabaseConfiguration();
private Connection conn;
       
       
    public NewStock(JFrame mystock) {  
        super(mystock,true);        
        initComponents();
        setLocationRelativeTo(null);
        conn=mydb.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mydrinkcategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        drinkname = new javax.swing.JTextField();
        cartons = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        saveArrival = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        wholesaleunitprice = new javax.swing.JTextField();
        units = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NEW DRINK REGISTRATION");

        jLabel1.setText("Select Category");

        mydrinkcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Beer", "Soft Drinks", "Energy Drinks", "Spirits", "Wines" }));

        jLabel3.setText("DRINK NAME");

        jLabel4.setText("NO OF CARTONS/CRATES");

        jLabel5.setText("UNITS PER CRATE/CARTON");

        drinkname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinknameActionPerformed(evt);
            }
        });

        cartons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartonsActionPerformed(evt);
            }
        });

        jToggleButton1.setText("CANCEL");

        saveArrival.setText("SAVE");
        saveArrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveArrivalActionPerformed(evt);
            }
        });

        jLabel6.setText("WholeSale Carton Price");

        wholesaleunitprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholesaleunitpriceActionPerformed(evt);
            }
        });

        units.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mydrinkcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drinkname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(cartons, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wholesaleunitprice, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(units, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(saveArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mydrinkcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drinkname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cartons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wholesaleunitprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(saveArrival))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveArrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveArrivalActionPerformed
        //let us test the connection here
        //first select the database and see if the record exists.
        int drinkindex=mydrinkcategory.getSelectedIndex();
        if(drinkindex != 0){
                String selectdrink="SELECT drink_name,no_of_cartons FROM store_drinks WHERE drink_name='"+drinkname.getText()+"' ";
                try{

                    PreparedStatement selectdata=conn.prepareStatement(selectdrink);
                    ResultSet rs=selectdata.executeQuery();
                    if(rs.next()){
                        
                        JOptionPane.showConfirmDialog(null, "The Drink has available Stock.Update Stock", "GRILL BAR AND RESTAURANT",JOptionPane.DEFAULT_OPTION);
                         float mycartons=rs.getFloat("no_of_cartons");
                         float newcartoncount=mycartons+(Float.parseFloat(cartons.getText()));
                         //run an update now.
                         try{
                         PreparedStatement runupdate=conn.prepareStatement("UPDATE store_drinks SET no_of_cartons='"+newcartoncount+"' WHERE drink_name='"+drinkname.getText()+"'");
                         runupdate.execute();
                         JOptionPane.showMessageDialog(null, "Store Drinks Has Been Updated", "GRILL PRIME JUNCTION RESTAURANT", JOptionPane.INFORMATION_MESSAGE);
                         }
                         catch(SQLException ex){
                             ex.getMessage();
                         }
                    }
                    else{
                            String newarrival="INSERT INTO `store_drinks` VALUES(?,?,?,?,?)";
                            try {
                                PreparedStatement insertdrink=conn.prepareStatement(newarrival);

                                insertdrink.setString(1, drinkname.getText());
                                insertdrink.setFloat(2, Float.parseFloat(cartons.getText()));
                                insertdrink.setFloat(3, Integer.parseInt(units.getText()));
                                insertdrink.setFloat(4,Float.parseFloat(wholesaleunitprice.getText()));
                                insertdrink.setString(5, mydrinkcategory.getSelectedItem().toString());

                                insertdrink.execute();
                                JOptionPane.showMessageDialog(null, "Stock Updated Successfully", "GRILL BAR & RESTAURANT", JOptionPane.INFORMATION_MESSAGE);
                              //Resest the textfields to allow more addition
                              mydrinkcategory.setSelectedIndex(0);              
                              drinkname.setText("");
                              cartons.setText("");
                              units.setText("");
                              wholesaleunitprice.setText("");

                            } catch (SQLException ex) {
                                //Logger.getLogger(NewStock.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(null,"System Failure Detected!","GRILL-PRIME JUNCTION RESTAURANT",JOptionPane.ERROR_MESSAGE);
                            }
                          }
                }
                catch(SQLException ex){

                }
                }
        else{
            JOptionPane.showMessageDialog(null,"You have Not Selected Drink Category","GRILL-PRIME JUNCTION RESTAURANT",JOptionPane.ERROR_MESSAGE);
             }
//insertion event.
        
        
    }//GEN-LAST:event_saveArrivalActionPerformed

    private void drinknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinknameActionPerformed
       cartons.requestFocusInWindow();
    }//GEN-LAST:event_drinknameActionPerformed

    private void cartonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartonsActionPerformed
     units.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_cartonsActionPerformed

    private void unitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsActionPerformed
      wholesaleunitprice.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_unitsActionPerformed

    private void wholesaleunitpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wholesaleunitpriceActionPerformed
       saveArrival.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_wholesaleunitpriceActionPerformed

    /**
     * @param args the command line arguments
     */    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cartons;
    private javax.swing.JTextField drinkname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> mydrinkcategory;
    private javax.swing.JToggleButton saveArrival;
    private javax.swing.JTextField units;
    private javax.swing.JTextField wholesaleunitprice;
    // End of variables declaration//GEN-END:variables

    
}
