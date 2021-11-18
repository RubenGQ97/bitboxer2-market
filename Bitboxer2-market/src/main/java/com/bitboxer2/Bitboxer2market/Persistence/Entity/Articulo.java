package com.bitboxer2.Bitboxer2market.Persistence.Entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.math.BigDecimal;


/**
 * @hibernate.class
 *  table="ARTICULO"
 *  mutable="true"
 *  dynamic-update="true"
 */
public class Articulo {

    private Integer idArticulo;
    private Integer codigo;
    private String descripcion;
    private BigDecimal precio;
    private boolean estado;
    private Date    fechaDeCreacion;
    private Usuario creador;
    private Set<Proovedor> proveedor;
    private Set<Reduccion> reduccion;


    /**
     * @hibernate.id unsaved-value="null" column="idArticulo"
     * @hibernate.generator class="sequence"
     * @hibernate.param name="sequence" value="articulo_id_seq"
     */
    public Integer getIdArticulo() {
        return idArticulo;
    }


    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    /** 
    * @hibernate.property column="codigo" type="int" not-null="true" unique="true"
    */
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    /** 
    * @hibernate.property column="descripcion" type="string" unique="false"
    */
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    /** 
    * @hibernate.property column="precio" type="big_decimal" not-null="true" unique="false"
    */
    public BigDecimal getPrecio() {
        return precio;
    }

    public BigDecimal setPrecio(float precio) {
        this.precio = precio;
    }


    
    /** 
    * @hibernate.property column="estado" type="boolean" unique="false"
    */
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    /** 
    * @hibernate.property column="fechaDeCreacion" type="date" unique="false"
    */
    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    /**
     * @hibernate.many-to-one column="idUsuario" class="com.bitboxer2.Bitboxer2market.Persistence.Entity.Usuario" not-null="true" lazy="true"
     */
    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }


    /**
     * @hibernate.set table="proveedor_articulo" cascade="none" lazy="true"
     * @hibernate.key column="idArticulo"
     * @hibernate.many-to-many class="com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor" column="idProveedor"
     */
    public Set<Proovedor> getProveedor(){
        return proveedor;
    }

    public void setProveedor(Set<Proovedor> proveedor){
        this.proveedor = proveedor;
    }


    /*
     * @hibernate.set cascade="all.delete-orphan" lazy="true" inverse="false"
     * @hibernate.key column="idArticulo"
     * @hibernate.one-to-many class="com.bitboxer2.Bitboxer2market.Persistence.Entity.Reduccion"
     */
    public Set<Reduccion> getReducion(){
        return this.reduccion;
    }

    public void setReduccion(Set<Reduccion> reduccion){
        this.reduccion = reduccion;
    }
}
