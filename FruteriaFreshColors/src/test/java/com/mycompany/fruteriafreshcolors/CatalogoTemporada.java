package com.mycompany.fruteriafreshcolors;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class CatalogoTemporada extends javax.swing.JFrame {

    List<Temporada> listaTemporadas = new LinkedList<Temporada>();

    public CatalogoTemporada() {
        initComponents(); 
        setTitle("Catalogo Temporadas");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void agregar() {
        listaTemporadas.add(new Temporada(jTextField1.getText(), jTextField2.getText(), jTextField3.getText() ));
        JOptionPane.showMessageDialog(null, "Temporada agregado con exito :)");
         try
        {
            Temporada temp = new Temporada();

            temp.setNombre(jTextField1.getText());

            DataOutputStream salida = new DataOutputStream(new FileOutputStream("temporadas.dat", true));
            
            salida.writeUTF(temp.getNombre());
            limpiar();
            salida.close();

        } catch (IOException ex01)
        {
            JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminar() {

        for (Temporada temporada : listaTemporadas)
        {
            if (jTextField1.getText().equals(temporada.getNombre()))
            {
                listaTemporadas.remove(temporada);
                JOptionPane.showMessageDialog(null, "Temporada Eliminado con exito :)");
            } 
        }
        
    }

    public void modificar() {
        
        for (Temporada temporada : listaTemporadas)
        {
            if (jTextField1.getText().equals(temporada.getNombre()))
            {
                jTextField1.setText(temporada.getNombre());
                jTextField2.setText(temporada.getDescripcion());
                jTextField3.setText(temporada.getMesdeCosecha());
                eliminar();
            }else{
            JOptionPane.showMessageDialog(null, "Temporada no encontrado");
            }
        }

    }

    public void iniciarClientes() {
        listaTemporadas.add(new Temporada("Siembra y Cosecha Marzo", "Albahaca, Calabazas, Cilantro, Girasol, Maiz Dulce", "Marzo-Junio" ));
        listaTemporadas.add(new Temporada("Siembra y Cosecha Julio", "Fresas, Valeriana, Nabos", "Julio-Setiembre" ));
        listaTemporadas.add(new Temporada("Siembra y Cosecha Setiembre", "Apio, Guisantes, Setas, Tomillo", "Setiembre-Enero"));
         try
        {
            Proveedores proveedor = new Proveedores();
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("temporadas.dat", true));
            salida.writeUTF("Siembra y Cosecha Marzo ");
            salida.writeUTF("Siembra y Cosecha Julio ");
            salida.writeUTF("Siembra y Cosecha Setiembre ");
            limpiar();
            salida.close();

        } catch (IOException ex01)
        {
            JOptionPane.showMessageDialog(null, "¡Ocurrió un error al guardar!",
                    "Error al guardar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ver() {
        String lista = "";
        for (Temporada temporada : listaTemporadas)
        {
            lista = lista + "Nombre: " +temporada.getNombre() + "\nDescripcion: " + temporada.getDescripcion() + "\nMes de cosecha: " + temporada.getMesdeCosecha() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, "╔═.✰.══════════════════════════════════════════════════════════════════════════════════════════.✰.═╗\n"
                + "                                                                               Lista de Temporadas\n\n" + lista
                + "\n╚═.✰.══════════════════════════════════════════════════════════════════════════════════════════.✰.═╝\n");
    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\home.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 60, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\logominus.png")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 60));

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Catalogo Temporadas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mes de Cosecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 120, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 440, 80));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 170, -1));

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

        jButton5.setText("Lista Temporada");
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

        jButton7.setText("Iniciar Temporada");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 150, 70));

        jLabel10.setBackground(new java.awt.Color(153, 255, 153));
        jLabel10.setForeground(new java.awt.Color(204, 102, 255));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Briceño\\Documents\\ProyectoClienteServidor\\FruteriaFreshColors\\src\\test\\java\\com\\mycompany\\images\\Backgroundtemp.jpg")); // NOI18N
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogoTemporada().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
