package com.bitboxer2.Bitboxer2market.domain.DTO;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Reduccion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticuloDTO {

    private Integer itemId;
    private Integer code;
    private String description;
    private BigDecimal price;
    private boolean active;
    private Date dateOfCreation;
    private UsuarioDTO creator;
    private Set<ProveedorDTO> suplier;
    private Set<ReduccionDTO> reduction;


    public Integer getidArticulo() {
        return itemId;
    }

    public void setidArticulo(Integer articuloId) {
        this.itemId = articuloId;
    }

    public Integer getCodigo() {
        return code;
    }

    public void setCodigo(Integer code) {
        this.code = code;
    }

    public String getDescripcion() {
        return description;
    }

    public void setDescripcion(String description) {
        this.description = description;
    }

    public BigDecimal getPrecio() {
        return price;
    }

    public void setPrecio(BigDecimal price) {
        this.price = price;
    }

    public boolean isEstado() {
        return active;
    }

    public void setEstado(boolean active) {
        this.active = active;
    }

    public Date getFechaDeCreacion() {
        return dateOfCreation;
    }

    public void setFechaDeCreacion(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public UsuarioDTO getCreador() {
        return creator;
    }

    public void setCreador(UsuarioDTO creator) {
        this.creator = creator;
    }

    public Set<ProveedorDTO> getProveedor() {
        return suplier;
    }

    public void setProveedor(Set<ProveedorDTO> suplier) {
        this.suplier = suplier;
    }

    public Set<ReduccionDTO> getReduccion() {
        return reduction;
    }

    public void setReduccion(Set<ReduccionDTO> reduccion) {
        this.reduction = reduccion;
    }



}
