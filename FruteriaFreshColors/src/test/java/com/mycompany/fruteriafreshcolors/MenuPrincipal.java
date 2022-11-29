
package com.mycompany.fruteriafreshcolors;

import java.awt.Color;



public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        setTitle("Menu Principal");
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
       
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ayuda");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\help.png")); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 80, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\LogoMax.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 350, 250));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\User.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 80, 80));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(51, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\Salir.png")); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 52, 47));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\BackgroundMenu.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -100, 1080, 710));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ControlUsuarios().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       dispose();
       new Acceso().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
