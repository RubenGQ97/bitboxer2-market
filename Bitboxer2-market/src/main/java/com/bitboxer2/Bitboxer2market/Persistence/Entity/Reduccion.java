package com.bitboxer2.Bitboxer2market.Persistence.Entity;

import java.util.Date;
import java.math.BigDecimal;



/**
 * @hibernate.class
 *  table="REDUCCION"
 *  mutable="true"
 *  dynamic-update="true"
 */
public class Reduccion{
    private Integer idReduccion;
    private BigDecimal precio;
    private Date fechaInicio;
    private Date fechaFin;
    private Articulo articulo;

    /**
     * @hibernate.id unsaved-value="null" column="idReduccion"
     * @hibernate.generator class="sequence"
     * @hibernate.param name="sequence" value="reduccion_id_seq"
     */
	public Integer getIdReduccion() {
		return this.idReduccion;
	}

	public void setIdReduccion(Integer idReduccion) {
		this.idReduccion = idReduccion;
	}


    /** 
    * @hibernate.property column="precio" type="big_decimal" not-null="true" unique="false"
    */
	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


    /**
     * hibernate.property column="fechaInicio" type="date" not-null="true" unique="false"
     */
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

    /**
     * hibernate.property column="fechaFin" type="date" not-null="true" unique="false"
     */
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


    /**
     * @hibernate.many-to-one column="idReduccion" class="com.bitboxer2.Bitboxer2market.Persistence.Entity.Articulo" not-null="true" lazy="true"
     */
	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


    
}