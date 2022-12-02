
package com.mycompany.fruteriafreshcolors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    String bd="Poner nombre de la base de datos";
    String url="jdbc:mysql://localhost.:3306/";
    String user="root";
    String password="Poner contraseña de la base de datos";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    String mensaje;

    public Conexion() {
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd, user, password);
             //JOptionPane.showMessageDialog(null, "Se logro la conexion con la base "+bd);
        } catch (SQLException |ClassNotFoundException ex) {
            //JOptionPane.showMessageDialog(null, "No se logro la conexion con la base  "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    } 
    
    
}
