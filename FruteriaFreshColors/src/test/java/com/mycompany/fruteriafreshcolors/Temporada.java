package com.mycompany.fruteriafreshcolors;

public class Temporada extends Catalogos{

    private String nombre;
    private String descripcion;
    private String mesdeCosecha;

    public Temporada() {
        this.nombre = "";
        this.descripcion = "";
        this.mesdeCosecha = "";
    }

    
    public Temporada(String nombre, String descripcion, String mesdeCosecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mesdeCosecha = mesdeCosecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMesdeCosecha() {
        return mesdeCosecha;
    }

    public void setMesdeCosecha(String mesdeCosecha) {
        this.mesdeCosecha = mesdeCosecha;
    }
    

    @Override
    public void registrar() {
       
    }

    @Override
    public void modificar() {
      
    }

    @Override
    public void eliminar() {
        
    }

}
