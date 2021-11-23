package com.bitboxer2.Bitboxer2market.Persistence.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.math.BigDecimal;



@Entity
@Table(name = "reduccion")
public class Reduccion{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idreduccion")
    private Integer idReduccion;
	@Column(name = "precio")
    private BigDecimal precio;
	@Column(name = "fechainicio")
    private Date fechaInicio;
	@Column(name = "fechafin")
    private Date fechaFin;

	@ManyToOne
	@JoinColumn(name = "idarticulo", insertable = false, updatable = false)
	@JsonBackReference
    private Articulo articulo;


	public Integer getIdReduccion() {
		return this.idReduccion;
	}

	public void setIdReduccion(Integer idReduccion) {
		this.idReduccion = idReduccion;
	}



	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}



	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}



	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


    
}