package com.ejemplo.tiendaalamano.models.Cliente;

import java.io.Serializable;

public class ClienteDto implements Serializable{

    private static final Long serialVersionUID = 1L; 

    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion1;
    private String direccion2;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion1() {
        return direccion1;
    }
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }
    public String getDireccion2() {
        return direccion2;
    }
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    } 
    

    
}
