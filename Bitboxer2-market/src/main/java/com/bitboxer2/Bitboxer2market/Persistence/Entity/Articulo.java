package com.bitboxer2.Bitboxer2market.Persistence.Entity;


import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idarticulo")
    private Integer idArticulo;
    /*
    propiedades basicas
    */
    @Column(name = "codigo", unique = true)
    private Integer codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "estado")
    private boolean estado;
    @Column(name = "fechadecreacion")
    private Date fechaDeCreacion;

    @ManyToOne
    @JoinColumn(name = "idusuario", insertable = false, updatable = false)
    @JsonManagedReference(value="JSR_USUARIO")
    private Usuario creador;

    @ManyToMany(mappedBy = "articulo")
    @JsonManagedReference(value="JSR_PROVEEDOR")
    private Set<Proveedor> proveedor;

    @OneToMany(mappedBy = "articulo")
    @JsonManagedReference(value="JSR_REDUCCION")
    private Set<Reduccion> reduccion;



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



    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
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


    public Usuario getCreador() {
        return creador;
    }

    public void setCreador(Usuario creador) {
        this.creador = creador;
    }



    public Set<Proveedor> getProveedor(){
        return proveedor;
    }

    public void setProveedor(Set<Proveedor> proveedor){
        this.proveedor = proveedor;
    }



    public Set<Reduccion> getReduccion(){
        return this.reduccion;
    }

    public void setReduccion(Set<Reduccion> reduccion){
        this.reduccion = reduccion;
    }
}
