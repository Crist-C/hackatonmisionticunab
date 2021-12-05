package com.ejemplo.tiendaalamano.models.Administrador.Rest;


public class AdministradorRest {
    
    private String administradorId;
    private String nombreId;
    private String correo;
    private String userName;
 
    public String getAdministradorId() {
        return administradorId;
    }
    public void setAdministradorId(String administradorId) {
        this.administradorId = administradorId;
    }
    public String getNombreId() {
        return nombreId;
    }
    public void setNombreId(String nombreId) {
        this.nombreId = nombreId;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
