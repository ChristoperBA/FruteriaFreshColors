
package com.mycompany.fruteriafreshcolors;

import javax.swing.JTextField;


public class Usuarios {
    //Inicializa el Array
    private Usuarios[] usuario  = new Usuarios[10];
    
    //Atributos
    private String Nombre;
    private String Apellidos;
    private String Nickname;
    private String Password;
    private String Estado;
    
    //Constructores
    public Usuarios()
    {
        Nombre="";
        Apellidos="";
        Nickname="";
        Password= "";
        Estado = "";
        
    }
    
    public Usuarios(String Nombre, String Apellidos, String Nickname, String Password, String Estado) {
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
            usuario[i]= new Usuarios();     
        }
    }

    public Usuarios[] getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios[] usuario) {
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
