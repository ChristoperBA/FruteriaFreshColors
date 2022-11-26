
package com.mycompany.fruteriafreshcolors;

import javax.swing.JTextField;


public class Usuario {
    //Inicializa el Array
    private Usuario[] usuario  = new Usuario[10];
    
    //Atributos
    private String Nombre;
    private String Apellidos;
    private String Nickname;
    private String Password;
    private String Estado;
    
    //Constructores
    public Usuario()
    {
        Nombre="";
        Apellidos="";
        Nickname="";
        Password= "";
        Estado = "";
        
    }
    
    public Usuario(String Nombre, String Apellidos, String Nickname, String Password, String Estado) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Nickname = Nickname;
        this.Password = Password;
        this.Estado = Estado;
    }
    public void LlenadoVacio()
    {
        for (int i=0;i<100;i++)
        {
            usuario[i]= new Usuario();     
        }
    }

    public Usuario[] getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario[] usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    //
    

}
