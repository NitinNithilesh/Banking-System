/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;
import java.sql.DriverManager;

/**
 *
 * @author Navaneeth
 */
import java.sql.*;
import javax.swing.*;
public class MysqlConnect {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Contact the Bank");
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}

