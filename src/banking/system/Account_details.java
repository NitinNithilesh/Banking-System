/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Navaneeth
 */
public class Account_details extends javax.swing.JFrame {
Connection conn=null;
ResultSet RS=null;
PreparedStatement PST=null;
Statement stmt = null;
    /**
     * Creates new form Account_details
     */
    public Account_details(String para) {
        initComponents();
        conn=MysqlConnect.ConnecrDb();
        disp.setText(para);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        details = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        disp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        detail = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        account = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        update = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        withdraw = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        deposit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        transaction = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        history = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        logout = new javax.swing.JButton();

        details.setText("View Details");
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Acc.Holder :");

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel1.setText("BANKING SYSTEM");

        detail.setText("View Details");
        detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "City", "Mobile", "Username", "Password", "Balance"
            }
        ));
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable1MouseMoved(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jToolBar1.setRollover(true);

        account.setText("Account Details");
        account.setFocusable(false);
        account.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        account.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });
        jToolBar1.add(account);
        jToolBar1.add(jSeparator1);

        update.setText("Update Password");
        update.setFocusable(false);
        update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        update.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jToolBar1.add(update);
        jToolBar1.add(jSeparator3);

        withdraw.setText("Withdraw");
        withdraw.setFocusable(false);
        withdraw.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        withdraw.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        jToolBar1.add(withdraw);
        jToolBar1.add(jSeparator4);

        deposit.setText("Deposit");
        deposit.setFocusable(false);
        deposit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deposit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        jToolBar1.add(deposit);
        jToolBar1.add(jSeparator2);

        transaction.setText("Transaction");
        transaction.setFocusable(false);
        transaction.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        transaction.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionActionPerformed(evt);
            }
        });
        jToolBar1.add(transaction);
        jToolBar1.add(jSeparator5);

        history.setText("Transaction History");
        history.setFocusable(false);
        history.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        history.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        jToolBar1.add(history);
        jToolBar1.add(jSeparator6);

        logout.setText("Log Out");
        logout.setFocusable(false);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jToolBar1.add(logout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(detail)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(detail)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_detailsActionPerformed

    private void detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailActionPerformed
        // TODO add your handling code here:
        try{

            Statement st = conn.createStatement();
            String user=disp.getText();
            String sql="SELECT * FROM user WHERE username='"+user+"'";
            PST=conn.prepareStatement(sql);
            
            RS=PST.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
            tm.setRowCount(0);
            while(RS.next()){
                Object o[]={RS.getString("name"),RS.getString("email"),RS.getString("city"),RS.getString("mobile"),RS.getString("username"),RS.getString("password"),RS.getInt("balance")};
                tm.addRow(o);
            }
        } 
        catch (Exception e)
    {
      System.err.println(e.getMessage());
    }
    }//GEN-LAST:event_detailActionPerformed

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Account_details(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_accountActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Update(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Withdraw(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_withdrawActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Deposit(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_depositActionPerformed

    private void transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Transfer(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_transactionActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        String msg = disp.getText();
        new Transaction_history(msg).setVisible(true);
        Index i=new Index();
        i.setVisible(false);
        dispose();
    }//GEN-LAST:event_historyActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:

        Index i=new Index();
        i.setVisible(false);
        dispose();
        Login l=new Login();
        l.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTable1MouseMoved

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
            java.util.logging.Logger.getLogger(Account_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_details(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JButton deposit;
    private javax.swing.JButton detail;
    private javax.swing.JButton details;
    private javax.swing.JLabel disp;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton logout;
    private javax.swing.JButton transaction;
    private javax.swing.JButton update;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

   
}
