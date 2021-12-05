package com.ejemplo.tiendaalamano.models.Usuario.Dtos;

import java.io.Serializable;

public class UsuarioCrearDto implements Serializable{
 
    private static final long serialVersionUID =1L;

    private String nombre;
    private String correo;
    private String username;
    private String password;
    
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
    public String getUserName() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
