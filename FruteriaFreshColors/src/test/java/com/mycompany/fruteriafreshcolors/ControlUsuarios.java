package com.mycompany.fruteriafreshcolors;


import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlUsuarios extends javax.swing.JFrame {

    int inicioArchivo = 0;

    DefaultTableModel dtm = new DefaultTableModel();

    public ControlUsuarios() {
        initComponents();
        setTitle("Registrar Usuario");
        setLocationRelativeTo(null);//centrar
//        Image cliente=new ImageIcon(getClass().getResource("iconos\\clientes.png")).getImage();
//        setIconImage(cliente);
        setResizable(false);//Desacctivar bototn de ajustar
        String[] titulo = new String[]
        {
            "Identicador", "Nombre", "Apellido", "Nickname", "Tipo de Usuario","Estado"
        };
        dtm.setColumnIdentifiers(titulo);
        jTable1.setModel(dtm);

    }
    Cliente[] clientes = new Cliente[10];
    Empleado[] empleados = new Empleado[10];
    Empleado empleado = new Empleado();
    Cliente cliente = new Cliente();


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\home.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 60, 60));

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Usuarios");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\logominus.png")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 60));

        jLabel16.setBackground(new java.awt.Color(255, 102, 51));
        jLabel16.setForeground(new java.awt.Color(255, 204, 102));
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Activar/Inactivar Usuarios");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, -1));

        jLabel12.setText("Identificador");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 99, -1, -1));

        jLabel6.setText("Tipo de Usuario: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel7.setText("Identificador");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 60, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Cliente" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jButton6.setText("Activar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 90, -1));

        jButton7.setText("Inactivar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 100, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 182, -1, -1));

        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 99, -1, -1));

        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 99, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 122, 87, -1));

        jLabel4.setText("Nickname:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 99, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 122, 87, -1));

        jLabel5.setText("Password:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 99, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 122, 87, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 122, 77, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tipo");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 720, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 720, 191));

        jButton4.setText("Refrescar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 122, 73, -1));

        jButton5.setText("Limpiar Tabla");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, -1, -1));

        jButton3.setText("IniciarUsuarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Cliente" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Todos", "Ver Empleados", "Ver Clientes", " " }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 124, -1));

        jLabel9.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualizar Datos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 142, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\BackgroundUser.jpg")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 810, 710));

        jLabel13.setText("Tipo de Usuario: ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registroUsuario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        iniciarUsuarios();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Clear_Table1();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        refrescar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Inactivo();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Activar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
    //Metodo Llenado Vacio 
    public void LlenadoVacio() {
        for (int i = 0; i < 10; i++)
        {
            clientes[i] = new Cliente();
            empleados[i] = new Empleado();
        }
    }

    //Metodo de Registro
    public void registroUsuario() {
        
        boolean registro = true;
        for (int i = 0; i < 10; i++)
        {

            if (clientes[i].getNickname().equals(jTextField1.getText()))
            {
                JOptionPane.showMessageDialog(null, "¡Datos ya existen!",
                        "Datos ya existen", JOptionPane.ERROR_MESSAGE);
                registro = false;
            }
        }
        if (registro)
        {
            if (jComboBox1.getSelectedItem().toString().equals("Cliente"))
            {

                cliente.setIdUsuario(Integer.parseInt(jTextField6.getText()));
                cliente.setNombre(jTextField2.getText());
                cliente.setApellidos(jTextField3.getText());
                cliente.setNickname(jTextField1.getText());
                cliente.setPassword(jTextField4.getText());
                cliente.setEstado("Activo");
                cliente.setCategoria("Cliente");
                //Ingreso de informacion del usuario
                clientes[Integer.parseInt(jTextField6.getText()) - 1] = new Cliente(Integer.parseInt(jTextField6.getText()), jTextField2.getText(),
                        jTextField3.getText(), jTextField1.getText(), jTextField4.getText(), "Activo", "Cliente"
                );
                
                String sql = "INSERT INTO usuarios (Nombre, Apellidos, Nickname, Password, Estado, Categoria) VALUES(?,?,?,?,?,?)";
            
            Conexion conexion = new Conexion();
        try {
            CallableStatement cs = conexion.conectar().prepareCall(sql);
            
            cs.setString(1, jTextField2.getText());
            cs.setString(2, jTextField3.getText());
           cs.setString(3, jTextField1.getText());
            cs.setString(4, jTextField4.getText());
            cs.setString(5, "Activo");
            cs.setString(6, "Cliente");

            cs.execute();
            JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!", "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
                limpiar();

            } else if (jComboBox1.getSelectedItem().toString().equals("Empleado"))
            {
                //Ingreso de informacion del usuario
                empleado.setIdUsuario(Integer.parseInt(jTextField6.getText()));
                empleado.setNombre(jTextField2.getText());
                empleado.setApellidos(jTextField3.getText());
                empleado.setNickname(jTextField1.getText());
                empleado.setPassword(jTextField4.getText());
                empleado.setEstado("Activo");
                empleado.setPuesto("Empleado");

                empleados[Integer.parseInt(jTextField6.getText()) - 1] = new Empleado(Integer.parseInt(jTextField6.getText()), jTextField2.getText(),
                        jTextField3.getText(), jTextField1.getText(), jTextField4.getText(), "Activo", "Empleado"
                );
                JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!", "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
                limpiar();

            }
        }

    }

    void iniciarUsuarios() {
        if (inicioArchivo == 0)
        {
            LlenadoVacio();
            inicioArchivo = 1;
            JOptionPane.showMessageDialog(null, "vacio");

        }
        empleados[2] = new Empleado(3, "Christopher", "Briceño", "ChristopherBA", "CafeconPan", "Activo", "Empleado");
        empleados[3] = new Empleado(4, "Shakira", "Mebarak", "Waka Waka", "Lalalala", "Activo", "Empleado");
        empleados[4] = new Empleado(5, "Michael", "Jackson", "Rey del Pop", "Billie Jean", "Activo", "Empleado");
        
        clientes[2] = new Cliente(3, "Elvis", "Presley", "Rey Rock and Roll", "Jailhouse Rock", "Activo", "Cliente");
        clientes[3] = new Cliente(4, "Bad", "Bunny", "Conejo Malo", "Titi me pregunto", "Activo", "Cliente");
        clientes[4] = new Cliente(5, "Luis ", "Miguel", "Sol de Mexico", "LaBikina", "Activo", "Cliente");
      
        

    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");       
        jTextField6.setText("");
    }

    void Clear_Table1() {
        for (int i = 0; i < jTable1.getRowCount(); i++)
        {
            dtm.removeRow(i);
            i -= 1;
        }
    }

    void refrescar() {
        if (jComboBox2.getSelectedItem().toString().equals("Ver Clientes"))
        {
            Clear_Table1();
            jLabel8.setText("Clientes");
            for (int i = 0; i < 10; i++)
            {
                if (clientes[i].getIdUsuario() != 0)
                {
                    
                    dtm.addRow(new Object[]
                    {
                        clientes[i].getIdUsuario(), clientes[i].getNombre(), clientes[i].getApellidos(), clientes[i].getNickname(), clientes[i].getCategoria(),clientes[i].getEstado()
                    });
                }
            }
        } else if (jComboBox2.getSelectedItem().toString().equals("Ver Empleados"))
        {
            jLabel8.setText("Empleados");
            Clear_Table1();
            for (int i = 0; i < 10; i++)
            {
                if (empleados[i].getIdUsuario() != 0)
                {

                    dtm.addRow(new Object[]
                    {
                        empleados[i].getIdUsuario(), empleados[i].getNombre(), empleados[i].getApellidos(), empleados[i].getNickname(), empleados[i].getPuesto(),empleados[i].getEstado()
                    });
                }
            }

        } else
        {
            jLabel8.setText("Lista Completa");
            Clear_Table1();
            for (int i = 0; i < empleados.length; i++)
            {
                if (clientes[i].getIdUsuario() != 0)
                {
                    dtm.addRow(new Object[]
                    {
                        empleados[i].getIdUsuario(), empleados[i].getNombre(), empleados[i].getApellidos(), empleados[i].getNickname(), empleados[i].getPuesto(),empleados[i].getEstado()
                    });
                } 
               
                
            }
            for (int i = 0; i < clientes.length; i++)
            {
                 if(clientes[i].getIdUsuario() != 0){ 
                    dtm.addRow(new Object[]
                    {
                        clientes[i].getIdUsuario(), clientes[i].getNombre(), clientes[i].getApellidos(), clientes[i].getNickname(), clientes[i].getCategoria(),clientes[i].getEstado()
                    });
                }
            }
            
            
           

        }
    }

    public void Activar(){
        if (jComboBox3.getSelectedItem().toString().equals("Cliente")){
            
            
            for (int i = 0; i < 10; i++)
            {
                if (clientes[i].getIdUsuario() == Integer.parseInt(jTextField5.getText()))
                {
                    clientes[i].setEstado("Activar");
                }
            }
        
        }else if (jComboBox3.getSelectedItem().toString().equals("Empleado")){
            for (int i = 0; i < 10; i++)
                {
                    if (empleados[i].getIdUsuario() == Integer.parseInt(jTextField5.getText()))
                    {
                        empleados[i].setEstado("Activar");
                    }
                }
        }
    }
     public void Inactivo(){
        if (jComboBox3.getSelectedItem().toString().equals("Cliente")){
            
            
            for (int i = 0; i < 10; i++)
            {
                if (clientes[i].getIdUsuario() == Integer.parseInt(jTextField5.getText()))
                {
                    clientes[i].setEstado("Inactivo");
                }
            }
        
        }
        if (jComboBox3.getSelectedItem().toString().equals("Empleado")){
            
            
            for (int i = 0; i < 10; i++)
                {
                    if (empleados[i].getIdUsuario() == Integer.parseInt(jTextField5.getText()))
                    {
                        empleados[i].setEstado("Inactivo");
                    }
                }
        
        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
