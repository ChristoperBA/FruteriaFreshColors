
package com.mycompany.fruteriafreshcolors;


public class Empleado extends Usuario {
     private String Puesto;

    public Empleado() {
        this.Puesto ="";
    }


    public Empleado(String Puesto, String Nombre, String Apellidos, String Nickname, String Password, String Estado) {
        super(Nombre, Apellidos, Nickname, Password, Estado);
        this.Puesto = Puesto;
    }

     
    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

   
}
