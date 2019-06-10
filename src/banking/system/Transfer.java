package banking.system;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.Random;

public class Transfer extends javax.swing.JFrame {
Connection conn=null;
ResultSet RS=null;
ResultSet R=null;
ResultSet RSS=null;
PreparedStatement PST=null;
PreparedStatement PSTT=null;
Statement stmt = null;
int aa;

    public Transfer(String para) {
        initComponents();
        conn=MysqlConnect.ConnecrDb();
        disp.setText(para);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accno = new javax.swing.JTextField();
        transfer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        disp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        otp = new javax.swing.JPasswordField();
        reset = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Amount to be Transfered");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Account Holder");

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        jLabel4.setText("Acc.Holder : ");

        jLabel5.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel5.setText("BANKING SYSTEM");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        jLabel6.setText("TRANSFER MONEY");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(":");

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("OTP Number");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText(":");

        otp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                otpFocusGained(evt);
            }
        });
        otp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otpMouseClicked(evt);
            }
        });
        otp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(accno, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(otp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(transfer)
                        .addGap(18, 18, 18)
                        .addComponent(reset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(disp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(accno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transfer)
                    .addComponent(reset))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                
    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        
        try{
           
            Statement st = conn.createStatement();
            int a = Integer.parseInt(amount.getText());
            String acc=accno.getText();
            String user=disp.getText();
            int otpg=Integer.parseInt(otp.getText());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime now = LocalDateTime.now();  
            String sql="SELECT balance FROM user where username='"+acc+"'";
            PST=conn.prepareStatement(sql);
            RS=PST.executeQuery();
            if(RS.next()){
                int aaa=Integer.compare(otpg, aa);
                if(aa != otpg){
                JOptionPane.showMessageDialog(null,"Please Check the OTP");
                }else{
                String sqld="SELECT balance FROM user where username='"+acc+"' and balance>'"+a+"'";
                PST=conn.prepareStatement(sqld);
                RSS=PST.executeQuery();
                if(RSS.next()){
                
                int bal=Integer.parseInt(RSS.getString("balance"));
                int bala=bal+a;
                st.executeUpdate("UPDATE user SET balance='"+bala+"' WHERE username='"+acc+"'");
                String sqle="SELECT balance FROM user where username='"+user+"'";
                PST=conn.prepareStatement(sqle);
                R=PST.executeQuery();
            while(R.next()){
                R.first();
                int balq=Integer.parseInt(R.getString("balance"));
                int balan=balq-a;
                st.executeUpdate("UPDATE user SET balance='"+balan+"' WHERE username='"+user+"'");
                st.executeUpdate("INSERT INTO transaction(name,to_name,amount,time)" +"VALUES ('"+user+"','"+acc+"','"+a+"','"+dtf.format(now)+"')");
                JOptionPane.showMessageDialog(null,"Amount Transfered");
                }
                }else{
                    JOptionPane.showMessageDialog(null,"Insuffiecient Balance");
                    }}}else{
                JOptionPane.showMessageDialog(null,"Account does not Exist");
            }
            
                
                
            

        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_transferActionPerformed

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

    private void otpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_otpActionPerformed

    private void otpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otpMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_otpMouseClicked

    private void otpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_otpFocusGained
        // TODO add your handling code here:
        try{
            Statement st = conn.createStatement();
            String user=disp.getText();
        int len = 4;
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++)
        {
            otp[i]=numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        aa= Integer.parseInt(String.valueOf(otp));
        st.executeUpdate("UPDATE user SET otp='"+aa+"' WHERE username='"+user+"'");
        System.out.println(aa);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
    }//GEN-LAST:event_otpFocusGained

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        accno.setText("");
        amount.setText("");
        otp.setText("");
    }//GEN-LAST:event_resetActionPerformed
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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accno;
    private javax.swing.JButton account2;
    private javax.swing.JTextField amount;
    private javax.swing.JButton deposit2;
    private javax.swing.JLabel disp;
    private javax.swing.JButton history2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton logout2;
    private javax.swing.JPasswordField otp;
    private javax.swing.JButton reset;
    private javax.swing.JButton transaction2;
    private javax.swing.JButton transfer;
    private javax.swing.JButton update2;
    private javax.swing.JButton withdraw2;
    // End of variables declaration//GEN-END:variables
}
