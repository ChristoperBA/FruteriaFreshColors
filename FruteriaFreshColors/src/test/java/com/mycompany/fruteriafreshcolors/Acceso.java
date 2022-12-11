package com.mycompany.fruteriafreshcolors;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JFrame {

    private int salir;
    public Acceso() {
        setTitle("Acceso Sistema");
        initComponents();
        setResizable(false);
    }
    public static String Nombre = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\LogoMin.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Forgot Password?");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\User2.png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\Padlock.png")); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Sign in");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 380, 260));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\Exit.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 40, 40));

        jButton1.setText("Log in");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 130, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\Background.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       try {
            /*String Usuario = "admin";
            
            String Pass = new String(jPasswordField1.getPassword());
            if (jTextField1.getText().equals(Usuario))
            {
            String Contrasena = "123";
            if (Pass.equals(Contrasena))
            {
            MenuPrincipal On = new MenuPrincipal();
            On.setVisible(true);
            } else
            {
            
            JOptionPane.showMessageDialog(null, "La contraseña es incorrecta,\nIntentalo nuevamente:(", "La contraseña es incorrecta,\nIntentalo nuevamente:(", JOptionPane.ERROR_MESSAGE);
            }
            } else
            {
            JOptionPane.showMessageDialog(null, "El usuario: " + jTextField1.getText() + ", no esta registrado como un administrador\n:(", "El usuario: " + jTextField1.getText() + ", no esta registrado como un administrador\n:(", JOptionPane.ERROR_MESSAGE);
            
            }*/
            
            Conexion conexion = new Conexion();
            
            String sql = "SELECT * FROM usuarios;";
            String a[] = new String[4];
            Statement st;
            
            st = conexion.conectar().createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             while (rs.next()) {
                 a[0] = rs.getString(2);
                 a[1] = rs.getString(4);
                 a[2] = rs.getString(5);
                 a[3] = rs.getString(7);
                 
                 
             }
             if(this.jTextField1.getText().equals(a[0]) && this.jPasswordField1.getText().equals(a[2]) && a[3].toLowerCase().equals("cliente")){
                 Nombre = a[0];
                 System.out.println(a[0]);
                 new ComprarProductos().setVisible(true);
                 this.setVisible(false);
             }else if((this.jTextField1.getText().equals(a[0]) && this.jPasswordField1.getText().equals(a[2]) && a[3].toLowerCase().equals("empleado"))){
                 Nombre = a[0];
                 new MenuPrincipal().setVisible(true);
                 this.setVisible(false);
             }else{
                 JOptionPane.showMessageDialog(null, "La contraseña o usuario son incorrectos,\nIntentalo nuevamente:(", "La contraseña o usuario son incorrecto,\nIntentalo nuevamente:(", JOptionPane.ERROR_MESSAGE);
             }
        } catch (SQLException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        salir=JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?",
            "Salir del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); 
       if(salir==0){
          System.exit(0);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
