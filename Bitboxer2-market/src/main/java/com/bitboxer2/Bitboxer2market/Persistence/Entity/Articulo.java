package com.bitboxer2.Bitboxer2market.Persistence.Entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idArticulo;
    /*
    propiedades basicas
    */
    private Integer codigo;
    private String descripcion;
    private BigDecimal precio;
    private boolean estado;
    private LocalDateTime fechaDeCreacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    private Usuario creador;

    @ManyToMany(mappedBy = "articulo")
    private Set<Proveedor> proveedor;

    @OneToMany(mappedBy = "articulo")
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



    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
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
