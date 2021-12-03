package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Index;
import javax.persistence.OneToMany;


@Entity(name ="clienteEntity")
@Table(indexes = {
    @Index(columnList = "usuarioId", name = "index_usuarioid", unique = true),
    @Index(columnList = "username", name = "index_username", unique = true),
    @Index(columnList = "nombre", name = "index_nombre", unique = true),
    @Index(columnList = "direccion", name = "index_correo", unique = true),
    @Index(columnList = "celular", name = "index_correo", unique = true),
    @Index(columnList = "correo", name = "index_correo", unique = true),
    @Index(columnList = "puntos", name = "index_correo", unique = true),
    @Index(columnList = "deuda", name = "index_correo", unique = true),
    @Index(columnList = "estado_de_cuenta", name = "index_correo", unique = true),
    @Index(columnList = "password", name = "index_correo", unique = true),
})
public class Cliente implements Serializable {
	private static final long serialVersionUID = -5773962493781143007L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 25, nullable=false)
	private String username;

    @Column(length = 25, nullable=false)
	private String nombre;

    @Column(length = 25, nullable=false)
	private String direccion;

    @Column(length = 25, nullable=false)
	private String celular;

    @Column(length = 25, nullable=false)
	private String correo;

    @Column(length = 25, nullable=false)
	private int puntos;

    @Column(length = 25, nullable=false)
	private int deuda;

    @Column(length = 25, nullable=false)
	private boolean estado_de_cuenta;

    @Column(length = 25, nullable=false)
	private String password;

    /* 
    @OneToMany(cascade = CascadeType.ALL, mappedBy ="clienteEntity") */

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteEntity")

    public Cliente(Long id, String username, String nombre, String direccion, String celular, String correo, int puntos,
            int deuda, boolean estado_de_cuenta, String password) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
        this.puntos = puntos;
        this.deuda = deuda;
        this.estado_de_cuenta = estado_de_cuenta;
        this.password = password;
    }

    public Cliente() {
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public boolean isEstado_de_cuenta() {
        return estado_de_cuenta;
    }

    public void setEstado_de_cuenta(boolean estado_de_cuenta) {
        this.estado_de_cuenta = estado_de_cuenta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
