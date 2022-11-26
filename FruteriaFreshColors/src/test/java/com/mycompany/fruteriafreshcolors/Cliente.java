
package com.mycompany.fruteriafreshcolors;


public class Cliente extends Usuario {
    private String categoria;

    public Cliente() {
        this.categoria="";
    }

    public Cliente(String Nombre, String Apellidos, String Nickname, String Password, String Estado) {
        super(Nombre, Apellidos, Nickname, Password, Estado);
        this.categoria=categoria;
    }

 
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
