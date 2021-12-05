package com.ejemplo.tiendaalamano.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/* import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.EntityListeners;  */


@Entity
@Table(name="carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carrito implements Serializable{
	private static final long serialVersionUID =-5773962493781143007L;
    
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(length = 25, nullable=false)
	private String pesoenkg;

    @Column(length = 25, nullable=false)
	private String costoTotal;

    @Column(length = 25, nullable=false)
	private boolean pagoContraEntrega;

    @Column(length = 25, nullable=false)
	private String calificacion;

    @Column(length = 25, nullable=false)
	private Date horarioEntrega;  //de java util

    @Column(length = 25, nullable=false)
	private int puntosTotales;

    @Column(length = 25, nullable=false)
	private boolean estado;

    @Column(length = 25, nullable=false)
	private boolean enviarDomicilio;

    
    @ManyToOne
    @JoinColumn(name ="cliente_id")
    private Cliente cliente;

}
