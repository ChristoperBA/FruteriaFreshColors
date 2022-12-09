
package com.mycompany.fruteriafreshcolors;


import javax.swing.JOptionPane;


public class Proveedores  extends Catalogos{
    private String identificacion;
    private String nombreProvedor;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;
    private String estado;

    public Proveedores() {
         this.identificacion = "";
        this.nombreProvedor = "";
        this.apellidos = "";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        this.estado = "";
    }
    
    public Proveedores(String identificacion, String nombreProvedor, String apellidos, String ciudad, String direccion, String telefono, String correo, String estado) {
        this.identificacion = identificacion;
        this.nombreProvedor = nombreProvedor;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreProvedor() {
        return nombreProvedor;
    }

    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    @Override
    public void registrar() {
        JOptionPane.showMessageDialog(null,"Registrar producto");
        
    }
       
    @Override
    public void modificar() {
    
         JOptionPane.showMessageDialog(null,"Modificar producto");
    }

    @Override
    public void eliminar() {
       JOptionPane.showMessageDialog(null,"Eliminar producto");
    }

   
   
       
    
    
}
