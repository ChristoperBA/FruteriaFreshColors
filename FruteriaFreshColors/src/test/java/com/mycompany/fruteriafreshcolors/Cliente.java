
package com.mycompany.fruteriafreshcolors;


public class Cliente extends Usuario {
    private String categoria;

    public Cliente( int IdUsuario, String Nombre, String Apellidos, String Nickname, String Password, String Estado,String categoria) {
        super(IdUsuario, Nombre, Apellidos, Nickname, Password, Estado);
        this.categoria = categoria;
    }

    public Cliente() {
        this.categoria="";
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
