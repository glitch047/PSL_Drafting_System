/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pslms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author jawad
 */
public class Gold extends javax.swing.JFrame {

    /**
     * Creates new form Gold
     */
    public Gold() {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        }
    
        catch(Exception ee){
            System.out.println(ee);
}
        initComponents();
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
        Emerging = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Emerging.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GOLD");
        Emerging.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(2, 33, 27));
        jButton1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        Emerging.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        jButton2.setBackground(new java.awt.Color(2, 33, 27));
        jButton2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        Emerging.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Emerging.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 150, 150));
        Emerging.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 150, -1));
        Emerging.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 150, -1));
        Emerging.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 150, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Emerging.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 150, 150));
        Emerging.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 150, -1));
        Emerging.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, -1));
        Emerging.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 150, -1));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Emerging.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, 150));
        Emerging.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 150, -1));
        Emerging.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, -1));
        Emerging.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 150, -1));
        Emerging.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, -1));
        Emerging.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));
        Emerging.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 150, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Emerging.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 150));
        Emerging.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, -1));
        Emerging.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 150, -1));
        Emerging.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 150, -1));
        Emerging.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 150, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Emerging.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, 150));
        Emerging.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 150, -1));
        Emerging.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 150, -1));
        Emerging.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 150, -1));
        Emerging.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 150, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pslms/Asif Ali (1).png"))); // NOI18N
        Emerging.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -10, -1, 710));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pslms/PSL-NORMAL-PAGE.png"))); // NOI18N
        Emerging.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 700));

        jScrollPane1.setViewportView(Emerging);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gold().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Emerging;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
