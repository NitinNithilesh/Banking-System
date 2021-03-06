/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Base64;  
/**
 *
 * @author Navaneeth
 */
public class Update extends javax.swing.JFrame {
Connection conn=null;
ResultSet RS=null;
PreparedStatement PST=null;
Statement stmt = null;
    /**
     * Creates new form Update
     */

    
    public Update(String para){
        initComponents();
        disp.setText(para);
        conn=MysqlConnect.ConnecrDb();
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
        jLabel2 = new javax.swing.JLabel();
        updates = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        disp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        jToolBar3 = new javax.swing.JToolBar();
        account2 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        update2 = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        withdraw2 = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        deposit2 = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        transaction2 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        history2 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        logout2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("OLD PASSWORD");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NEW PASSWORD");

        updates.setText("Update");
        updates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesActionPerformed(evt);
            }
        });

        jLabel4.setText("Acc.Holder : ");

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel3.setText("BANKING SYSTEM");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        jLabel5.setText("CHANGE PASSWORD");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText(":");

        jToolBar3.setRollover(true);

        account2.setText("Account Details");
        account2.setFocusable(false);
        account2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        account2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        account2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account2ActionPerformed(evt);
            }
        });
        jToolBar3.add(account2);
        jToolBar3.add(jSeparator13);

        update2.setText("Update Password");
        update2.setFocusable(false);
        update2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        update2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });
        jToolBar3.add(update2);
        jToolBar3.add(jSeparator14);

        withdraw2.setText("Withdraw");
        withdraw2.setFocusable(false);
        withdraw2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        withdraw2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        withdraw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw2ActionPerformed(evt);
            }
        });
        jToolBar3.add(withdraw2);
        jToolBar3.add(jSeparator15);

        deposit2.setText("Deposit");
        deposit2.setFocusable(false);
        deposit2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deposit2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deposit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit2ActionPerformed(evt);
            }
        });
        jToolBar3.add(deposit2);
        jToolBar3.add(jSeparator16);

        transaction2.setText("Transaction");
        transaction2.setFocusable(false);
        transaction2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transaction2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        transaction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaction2ActionPerformed(evt);
            }
        });
        jToolBar3.add(transaction2);
        jToolBar3.add(jSeparator17);

        history2.setText("Transaction History");
        history2.setFocusable(false);
        history2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        history2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        history2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history2ActionPerformed(evt);
            }
        });
        jToolBar3.add(history2);
        jToolBar3.add(jSeparator18);

        logout2.setText("Log Out");
        logout2.setFocusable(false);
        logout2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout2ActionPerformed(evt);
            }
        });
        jToolBar3.add(logout2);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12))
                            .addComponent(updates))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(newpass)))
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updates)
                    .addComponent(jButton1))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesActionPerformed
        // TODO add your handling code here:
        try{
            
            Statement st = conn.createStatement();
            String user=disp.getText();
            String opass=oldpass.getText();
            String npass=newpass.getText();
            Base64.Encoder encoder = Base64.getEncoder();  
            String str = encoder.encodeToString(opass.getBytes());  
            String str1 = encoder.encodeToString(npass.getBytes());  
            String sql="SELECT * FROM user WHERE username='"+user+"' and encrypt='"+str+"'";
            
            PST=conn.prepareStatement(sql);
            RS=PST.executeQuery();
            
            if(RS.next()){
                if(str.equals(str1)){
                    JOptionPane.showMessageDialog(null,"Old Password and New Password should no be same");
                }
                else{
                st.executeUpdate("UPDATE user SET encrypt='"+str1+"' WHERE username='"+user+"'");
                JOptionPane.showMessageDialog(null,"Password Changed");
                String msg = disp.getText();
                new Index(msg).setVisible(true);
                Update u=new Update(null);
                u.setVisible(false);
                dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Old Password does not Match");
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_updatesActionPerformed

    private void account2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account2ActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Account_details(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_account2ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Update(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_update2ActionPerformed

    private void withdraw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw2ActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Withdraw(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_withdraw2ActionPerformed

    private void deposit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit2ActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Deposit(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_deposit2ActionPerformed

    private void transaction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaction2ActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Transfer(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_transaction2ActionPerformed

    private void history2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history2ActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Transaction_history(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_history2ActionPerformed

    private void logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout2ActionPerformed
        // TODO add your handling code here:

        Index i=new Index();
        i.setVisible(false);
        dispose();
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_logout2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        oldpass.setText("");
        newpass.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account2;
    private javax.swing.JButton deposit2;
    private javax.swing.JLabel disp;
    private javax.swing.JButton history2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton logout2;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JButton transaction2;
    private javax.swing.JButton update2;
    private javax.swing.JButton updates;
    private javax.swing.JButton withdraw2;
    // End of variables declaration//GEN-END:variables

    private String setString(String para) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
