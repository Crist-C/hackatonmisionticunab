package com.ejemplo.tiendaalamano.models.Usuario;

import java.io.Serializable;

public class UsuarioDto implements Serializable{
    
        
    private static final long serialVersionUID =1l;

    private long id;
    private String username;
    private String password;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getUserName() {
        return username;
    }
    public void setUserName(String userName) {
        this.username = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


}
