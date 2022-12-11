package com.mycompany.fruteriafreshcolors;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CatalogoFrutas extends javax.swing.JFrame {

    List<Frutas> listaFrutas = new LinkedList<Frutas>();

    public CatalogoFrutas() {
        initComponents(); 
        setTitle("Catalogo Temporadas");
        setLocationRelativeTo(null);
        setResizable(false);
        cargarTemporadas();
        cargarProveedores();
    }

    public void agregar() {
        try {
            //       (String nombre, String descripcion, int cantidadExistente, int precio, int proveedor, int temporada)
            listaFrutas.add(new Frutas(jTextField1.getText(), jTextField2.getText(),Integer.parseInt(jTextField3.getText()),Integer.parseInt(jTextField4.getText()),jComboBox1.getSelectedItem().toString(),jComboBox3.getSelectedItem().toString()));
          
            
            String sql = "INSERT INTO catalogoFrutas (Nombre, Descripcion, Cantidad, Precio, Provedor, Temporada) VALUES(?,?,?,?,?,?)";
            
            Conexion conexion = new Conexion();
            CallableStatement cs = conexion.conectar().prepareCall(sql);
            
            cs.setString(1, jTextField1.getText());
            cs.setString(2, jTextField2.getText());
            cs.setInt(3, Integer.parseInt(jTextField3.getText()));
            cs.setInt(4, Integer.parseInt(jTextField4.getText()));
            cs.setString(5, jComboBox1.getSelectedItem().toString());
            cs.setString(6, jComboBox3.getSelectedItem().toString());
            
            cs.execute();
              JOptionPane.showMessageDialog(null, "Frutas agregado con exito :)");
        } catch (SQLException ex) {
            Logger.getLogger(CatalogoFrutas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void eliminar() {

        for (Frutas fruta : listaFrutas)
        {
            if (jTextField1.getText().equals(fruta.getNombre()))
            {
                listaFrutas.remove(fruta);
                JOptionPane.showMessageDialog(null, "Frutas Eliminado con exito :)");
            } 
        }
        
    }

    public void modificar() {
        
        for (Frutas fruta : listaFrutas)
        {
            if (jTextField1.getText().equals(fruta.getNombre()))
            {
                jTextField1.setText(fruta.getNombre());
                jTextField2.setText(fruta.getDescripcion());
                jTextField3.setText(String.valueOf(fruta.getCantidadExistente()));
                jTextField4.setText(String.valueOf(fruta.getPrecio()));
                jComboBox1.getSelectedItem().toString();
                jComboBox3.getSelectedItem().toString();
                
                eliminar();
            }else{
            JOptionPane.showMessageDialog(null, "Fruta no encontrado");
            }
        }

    }

    public void iniciarClientes() {
        listaFrutas.add(new Frutas("Peras","Verdes",200,250,"Peras El Verdoso","Julio-Agosto"));
        listaFrutas.add(new Frutas("Manzanas","Rojas",150,300,"Manzanas Encantadas Inc.","Diciembre-Junio"));
        listaFrutas.add(new Frutas("Bananos","Criollo",100,20,"Corbana","Marzo-Setiembre"));
    }

    public void ver() {
        String lista = "";
        for (Frutas frutas : listaFrutas)
        {
            lista = lista + "Nombre: " +frutas.getNombre() + "\nDescripcion: " + frutas.getDescripcion() + "\nPrecio: " + frutas.getPrecio()+ "\nCantidad Existente: "+frutas.getCantidadExistente()+"\nTemporada: "+frutas.getTemporada()+"\nProveedor: "+frutas.getProveedor()+"\n\n";
        }
        JOptionPane.showMessageDialog(null, "╔═.✰.══════════════════════════════════════════════════════════════════════════════════════════.✰.═╗\n"
                + "                                                                               Lista de Frutas\n\n" + lista
                + "\n╚═.✰.══════════════════════════════════════════════════════════════════════════════════════════.✰.═╝\n");
    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 170, -1));

        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 170, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 50, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Temporada");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 60, 60));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 60));

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catalogo Frutas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad Existente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 290, 100));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 80, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, 30));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 30));

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, 30));

        jButton5.setText("Lista Frutas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 140, 70));

        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 30));

        jButton7.setText("Iniciar Frutas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 150, 70));

        jLabel10.setBackground(new java.awt.Color(153, 204, 255));
        jLabel10.setForeground(new java.awt.Color(204, 102, 255));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 80));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 770, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ver();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        iniciarClientes();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void cargarTemporadas(){
       try{
          Temporada temporada=new Temporada(); 
          DataInputStream entrada=new DataInputStream(new FileInputStream("temporadas.dat"));
          try{
             while(true){
                temporada.setNombre(entrada.readUTF());
                jComboBox3.addItem(temporada.getNombre());
             }
          }catch (EOFException eofe) {
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void cargarProveedores(){
       try{
          Proveedores proveedor=new Proveedores(); 
          DataInputStream entrada=new DataInputStream(new FileInputStream("proveedores.dat"));
          try{
             while(true){
                proveedor.setNombreProvedor(entrada.readUTF());
                jComboBox1.addItem(proveedor.getNombreProvedor());
             }
          }catch (EOFException eofe) {
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡Archivo no encontrado, revise!",
                    "Archivo no encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "¡Error desconocido, revise!",
                    "Error desconocido", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoFrutas().setVisible(true); 
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
