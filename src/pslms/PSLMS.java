/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pslms;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author jawad
 */
public class PSLMS {

    public static Connection connect(){
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }
    
        catch(Exception ee){
            System.out.println(ee);
}
        Connection con=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psl_ms?","root","");
            JOptionPane.showMessageDialog(null, "connected");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Database Not Connected");    
            
        }
        return con;
    
}
}
