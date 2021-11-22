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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idarticulo")
    private Integer idArticulo;
    /*
    propiedades basicas
    */
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private BigDecimal precio;
    @Column(name = "estado")
    private boolean estado;
    @Column(name = "fechaDeCreacion")
    private LocalDateTime fechaDeCreacion;

    @ManyToOne
    @JoinColumn(name = "idusuario", insertable = false, updatable = false)
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
