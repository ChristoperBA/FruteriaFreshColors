
package com.mycompany.fruteriafreshcolors;

import java.awt.Color;
import javax.swing.JOptionPane;



public class MenuPrincipal extends javax.swing.JFrame {

    int salir;
    public MenuPrincipal() {
        initComponents();
        setTitle("Menu Principal");
        this.getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        //setExtendedState(MAXIMIZED_BOTH);
       
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Comprar ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 80, 80));

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Catalogo Clientes");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 80, 80));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Catalogo Proveedores");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 80, 80));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cajas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 80, 80));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setForeground(new java.awt.Color(51, 255, 255));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 52, 47));

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Catalogo Temporadas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 80, 80));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 350, 250));

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 80, 80));

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Control Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -60, 960, 640));

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 80, 80));

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catalogo Frutas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        jButton10.setBackground(new java.awt.Color(153, 204, 255));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 80, 80));

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Facturacion");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new ControlUsuarios().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       salir=JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?",
            "Salir del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
       if(salir==1){
          System.exit(0);
          
       }
       this.dispose();
       new Acceso().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Cajas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new CatalogoProveedores().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new  CatalogoClientes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new CatalogoFrutas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CatalogoTemporada().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new ComprarProductos().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new Facturacion().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
