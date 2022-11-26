
package com.mycompany.fruteriafreshcolors;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;


public class guardarUsuario extends javax.swing.JFrame {

    int inicioArchivo=0;
    public guardarUsuario() {
        initComponents();
        setTitle("Registrar Usuario");
        setLocationRelativeTo(null);//centrar
//        Image cliente=new ImageIcon(getClass().getResource("iconos\\clientes.png")).getImage();
//        setIconImage(cliente);
        setResizable(false);//Desacctivar bototn de ajustar
        
    }
    Cliente[] clientes  = new Cliente[10];
    Empleado[] empleados  = new Empleado[10];
    Empleado empleado =new Empleado();
    Cliente cliente = new Cliente();
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Registrar Usuario");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Nickname:");

        jLabel5.setText("Password:");

        jLabel6.setText("Tipo de Usuario: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jTextField4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       registroUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    //Metodo Llenado Vacio 
    public void LlenadoVacio()
    {
        for (int i=0;i<10;i++)
        { 
            clientes[i]= new Cliente();
            empleados[i]= new Empleado();
        }
    }

    //Metodo de Registro
    public void registroUsuario() 
    {   
        if(inicioArchivo==0){
        LlenadoVacio();
        inicioArchivo=1;
        
        }
        
        try {
            boolean registro=true;
            for (int i = 0; i < 10; i++)
            {

                if (clientes[i].getNickname().equals(jTextField1.getText()))
                {
                    JOptionPane.showMessageDialog(null, "¡Datos ya existen!",
                        "Datos ya existen", JOptionPane.ERROR_MESSAGE);
                    registro=false;
                }
            }
            if(registro){
                if(jTextField5.getText().equals("Cliente")){
                    cliente.setNombre(jTextField1.getText());
                    cliente.setApellidos(jTextField2.getText());
                    cliente.setNickname(jTextField3.getText());
                    cliente.setPassword(jTextField4.getText());
                    cliente.setEstado("Activo");
                    cliente.setCategoria(jTextField5.getText());
                    DataOutputStream salida = new DataOutputStream(new FileOutputStream("usuarios.dat", true));
                    salida.writeUTF(cliente.getNombre());
                    salida.writeUTF(cliente.getApellidos());
                    salida.writeUTF(cliente.getPassword());
                    salida.writeUTF(cliente.getEstado());
                    salida.writeUTF("Cliente");
                    JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!","Datos agregados", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    salida.close();
                    
                }else if(jTextField5.getText().equals("Empleado")){
                    empleado.setNombre(jTextField1.getText());
                    empleado.setApellidos(jTextField2.getText());
                    empleado.setNickname(jTextField3.getText());
                    empleado.setPassword(jTextField4.getText());
                    empleado.setEstado("Activo");
                    empleado.setPuesto(jTextField5.getText());
                    DataOutputStream salida = new DataOutputStream(new FileOutputStream("usuarios.dat", true));
                    salida.writeUTF(empleado.getNombre());
                    salida.writeUTF(empleado.getApellidos());
                    salida.writeUTF(empleado.getPassword());
                    salida.writeUTF(empleado.getEstado());
                    salida.writeUTF("Empleado");
                    JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!","Datos agregados", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                    salida.close();
                
                }else{
                    JOptionPane.showMessageDialog(null, "No existe Usuario tipo: "+jTextField5.getText(),"No se puede guardar informacion" , JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }catch (IOException ex01) {
        JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
       
           
    }
   public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guardarUsuario().setVisible(true);
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
