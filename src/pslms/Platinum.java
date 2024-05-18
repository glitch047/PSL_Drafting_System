/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pslms;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
public class Platinum extends javax.swing.JFrame {
   PreparedStatement pst;
    ResultSet rs;
        Connection conn = null;
        int countPalyers = 0;
    private ImageIcon format=null;
   String fname=null;
   int s=0;
   byte[] pimage=null;

    /**
     * Creates new form Platinum
     */
    public Platinum() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }
    
        catch(Exception ee){
            System.out.println(ee);
}
        initComponents();
                try{
           conn = PSLMS.connect();
         String sql="select *from player_details";
         pst=conn.prepareStatement(sql);
         rs= pst.executeQuery();
         while(rs.next()){
             ++countPalyers;
             if(countPalyers==1){
                 name.setText(rs.getString("name"));
                 Runs.setText(rs.getString("Runs"));
                 Strike_Rate.setText(rs.getString("Strike_Rate"));
                 
                 
                     byte[] imagedata=rs.getBytes("images");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(lblimage.getWidth(),        lblimage.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon images=new ImageIcon(img2);
               lblimage.setIcon(images);
                 
             }
             else if(countPalyers==2){
                   name1.setText(rs.getString("name"));
                 run1.setText(rs.getString("Runs"));
                 rate1.setText(rs.getString("Strike_Rate"));
                 
                 
                     byte[] imagedata=rs.getBytes("images");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(image1.getWidth(),        image1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon images=new ImageIcon(img2);
               image1.setIcon(images);
             }
             else if(countPalyers==3){
                   name2.setText(rs.getString("name"));
                 run3.setText(rs.getString("Runs"));
                 srate2.setText(rs.getString("Strike_Rate"));
                 
                 
                     byte[] imagedata=rs.getBytes("images");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(image2.getWidth(),        image2.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon images=new ImageIcon(img2);
               image2.setIcon(images);
             }
             else if(countPalyers==4){
                   name3.setText(rs.getString("name"));
                 runs4.setText(rs.getString("Runs"));
                 srate3.setText(rs.getString("Strike_Rate"));
                 
                 
                     byte[] imagedata=rs.getBytes("images");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(image3.getWidth(),        image3.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon images=new ImageIcon(img2);
               image3.setIcon(images);
             }
             else if(countPalyers==5){
                   name4.setText(rs.getString("name"));
                 runs5.setText(rs.getString("Runs"));
                 srate4.setText(rs.getString("Strike_Rate"));
                 
                 
                     byte[] imagedata=rs.getBytes("images");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(image4.getWidth(),        image4.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon images=new ImageIcon(img2);
               image4.setIcon(images);
             }
         }
         
     }catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Reord not saved");
        }
        
        
        
        
        Timer t =  new Timer(5000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                                   setVisible(false);
                   new Catagory_selection().setVisible(true);
//                   visible2();
            }
          
      });
     t.start();
     t.setRepeats(false);
     
     
     
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Platinum = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        run3 = new javax.swing.JTextField();
        srate2 = new javax.swing.JTextField();
        image4 = new javax.swing.JLabel();
        Runs = new javax.swing.JTextField();
        image1 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        run1 = new javax.swing.JTextField();
        rate1 = new javax.swing.JTextField();
        Strike_Rate = new javax.swing.JTextField();
        lblimage = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        runs4 = new javax.swing.JTextField();
        srate3 = new javax.swing.JTextField();
        image3 = new javax.swing.JLabel();
        name3 = new javax.swing.JTextField();
        name4 = new javax.swing.JTextField();
        runs5 = new javax.swing.JTextField();
        srate4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Platinum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLATINUM");
        Platinum.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 11, -1, -1));

        jButton1.setBackground(new java.awt.Color(2, 33, 27));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Randomizer");
        Platinum.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jButton2.setBackground(new java.awt.Color(2, 33, 27));
        jButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        Platinum.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 60, -1));

        image2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Platinum.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 150, 150));
        Platinum.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 150, -1));
        Platinum.add(run3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 150, -1));
        Platinum.add(srate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 150, -1));

        image4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Platinum.add(image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 150, 150));
        Platinum.add(Runs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, -1));

        image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Platinum.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 150));

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        Platinum.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 150, -1));
        Platinum.add(run1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, -1));
        Platinum.add(rate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, -1));
        Platinum.add(Strike_Rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, -1));

        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Platinum.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 150));
        Platinum.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, -1));
        Platinum.add(runs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 150, -1));
        Platinum.add(srate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 150, -1));

        image3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Platinum.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 150, 150));
        Platinum.add(name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 150, -1));
        Platinum.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 150, -1));
        Platinum.add(runs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 150, -1));
        Platinum.add(srate4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 150, -1));

        jButton3.setBackground(new java.awt.Color(2, 33, 27));
        jButton3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Platinum.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 150, -1));

        jButton4.setBackground(new java.awt.Color(2, 33, 27));
        jButton4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Select");
        Platinum.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));

        jButton5.setBackground(new java.awt.Color(2, 33, 27));
        jButton5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Select");
        Platinum.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 150, -1));

        Select.setBackground(new java.awt.Color(2, 33, 27));
        Select.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        Select.setForeground(new java.awt.Color(255, 255, 255));
        Select.setText("Select");
        Platinum.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 150, -1));

        jButton6.setBackground(new java.awt.Color(2, 33, 27));
        jButton6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Select");
        Platinum.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pslms/Roy.png"))); // NOI18N
        Platinum.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 860, 690));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pslms/PSL-NORMAL-PAGE.png"))); // NOI18N
        Platinum.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jScrollPane1.setViewportView(Platinum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Platinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Platinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Platinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Platinum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Platinum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Platinum;
    private javax.swing.JTextField Runs;
    private javax.swing.JButton Select;
    private javax.swing.JTextField Strike_Rate;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JTextField rate1;
    private javax.swing.JTextField run1;
    private javax.swing.JTextField run3;
    private javax.swing.JTextField runs4;
    private javax.swing.JTextField runs5;
    private javax.swing.JTextField srate2;
    private javax.swing.JTextField srate3;
    private javax.swing.JTextField srate4;
    // End of variables declaration//GEN-END:variables
}
