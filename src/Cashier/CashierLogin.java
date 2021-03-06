/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cashier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class CashierLogin extends javax.swing.JDialog implements ActionListener {

    /**
     * Creates new form CashierLogin
     */
    public CashierLogin(JFrame frame) {
        super(frame,true);
        initComponents();
        setLocationRelativeTo(null);
        initializeData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cashierPassword = new javax.swing.JPasswordField();
        one = new javax.swing.JToggleButton();
        two = new javax.swing.JToggleButton();
        three = new javax.swing.JToggleButton();
        four = new javax.swing.JToggleButton();
        five = new javax.swing.JToggleButton();
        six = new javax.swing.JToggleButton();
        seven = new javax.swing.JToggleButton();
        eight = new javax.swing.JToggleButton();
        star = new javax.swing.JToggleButton();
        nine = new javax.swing.JToggleButton();
        zero = new javax.swing.JToggleButton();
        ash = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setText("PASSWORD");

        cashierPassword.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cashierPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashierPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        one.setForeground(new java.awt.Color(0, 102, 102));
        one.setText("1");
        one.setPreferredSize(new java.awt.Dimension(100, 100));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        two.setForeground(new java.awt.Color(0, 102, 102));
        two.setText("2");
        two.setPreferredSize(new java.awt.Dimension(100, 100));

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        three.setForeground(new java.awt.Color(0, 102, 102));
        three.setText("3");
        three.setPreferredSize(new java.awt.Dimension(100, 100));

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        four.setForeground(new java.awt.Color(0, 102, 102));
        four.setText("4");
        four.setPreferredSize(new java.awt.Dimension(100, 100));

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        five.setForeground(new java.awt.Color(0, 102, 102));
        five.setText("5");
        five.setPreferredSize(new java.awt.Dimension(100, 100));

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        six.setForeground(new java.awt.Color(0, 102, 102));
        six.setText("6");
        six.setPreferredSize(new java.awt.Dimension(100, 100));

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 102, 102));
        seven.setText("7");
        seven.setPreferredSize(new java.awt.Dimension(100, 100));

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 102, 102));
        eight.setText("8");
        eight.setPreferredSize(new java.awt.Dimension(100, 100));

        star.setBackground(new java.awt.Color(255, 255, 255));
        star.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        star.setForeground(new java.awt.Color(0, 102, 102));
        star.setText("*");
        star.setPreferredSize(new java.awt.Dimension(100, 100));

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 102, 102));
        nine.setText("9");
        nine.setPreferredSize(new java.awt.Dimension(100, 100));

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 102, 102));
        zero.setText("0");
        zero.setPreferredSize(new java.awt.Dimension(100, 100));

        ash.setBackground(new java.awt.Color(255, 255, 255));
        ash.setFont(new java.awt.Font("DejaVu Sans", 3, 18)); // NOI18N
        ash.setForeground(new java.awt.Color(0, 102, 102));
        ash.setText("#");
        ash.setPreferredSize(new java.awt.Dimension(100, 100));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("DejaVu Sans", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Note:First Time Login with '0000'");

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                    .addComponent(ash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(star, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            cashierPassword.getText();
        try {
            PreparedStatement allowaccess=new DatabaseConfiguration().getConnection().prepareStatement("SELECT password FROM cashier_details WHERE password='"+cashierPassword.getText()+"'");
            ResultSet access=allowaccess.executeQuery();
            if(access.next()){
                JOptionPane.showMessageDialog(null,"SuccessFull Login.","Hornbill Distributed System",JOptionPane.INFORMATION_MESSAGE);
                cashierPassword.setText("");                
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong Password.Try again","Hornbill Distributed System",JOptionPane.ERROR_MESSAGE);
                cashierPassword.setText("");
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(CashierLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       String cashpassword=cashierPassword.getText();
      
       if(cashpassword.length() > 0){
           StringBuilder sb = new StringBuilder();
           sb.append(cashpassword);
           sb.deleteCharAt(cashpassword.length() -1);
       String newpassword= sb.toString();
       cashierPassword.setText(newpassword);
       }
       
               
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ash;
    private javax.swing.JPasswordField cashierPassword;
    private javax.swing.JToggleButton delete;
    private javax.swing.JToggleButton eight;
    private javax.swing.JToggleButton five;
    private javax.swing.JToggleButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton nine;
    private javax.swing.JToggleButton one;
    private javax.swing.JToggleButton seven;
    private javax.swing.JToggleButton six;
    private javax.swing.JToggleButton star;
    private javax.swing.JToggleButton three;
    private javax.swing.JToggleButton two;
    private javax.swing.JToggleButton zero;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String mypassword=e.getActionCommand();
        cashierPassword.setText(cashierPassword.getText()+mypassword);
        //JOptionPane.showMessageDialog(null,e.getActionCommand());
      
    }

    private void initializeData() {
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        star.addActionListener(this);
        zero.addActionListener(this);
        ash.addActionListener(this);
        
    }
}
