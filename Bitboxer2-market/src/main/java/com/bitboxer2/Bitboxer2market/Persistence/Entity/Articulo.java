package com.bitboxer2.Bitboxer2market.Persistence.Entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

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
    private float precio;
    private boolean estado;
    private Date    fechaDeCreacion;
    private Usuario idUsuario;
    private Reduccion   idReduccion;


    
    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Reduccion getIdReduccion() {
        return idReduccion;
    }

    public void setIdReduccion(Reduccion idReduccion) {
        this.idReduccion = idReduccion;
    }
}
