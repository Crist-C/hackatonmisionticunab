package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="administrador")
public class Administrador implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 25, nullable=false)
	private String nombre;

    @Column(length = 25, nullable=false)
	private String password;

    @Column(length = 25, nullable=false)
	private String correo;

    public Administrador() {
    }

    public Administrador(Long id, String nombre, String password, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
