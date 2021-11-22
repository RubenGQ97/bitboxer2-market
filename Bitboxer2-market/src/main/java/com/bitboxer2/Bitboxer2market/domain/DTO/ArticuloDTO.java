package com.bitboxer2.Bitboxer2market.domain.DTO;

import com.bitboxer2.Bitboxer2market.Persistence.Entity.Proveedor;
import com.bitboxer2.Bitboxer2market.Persistence.Entity.Reduccion;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

public class ArticuloDTO {

    private Integer itemId;
    private Integer code;
    private String description;
    private BigDecimal price;
    private boolean active;
    private LocalDateTime dateOfCreation;
    private UsuarioDTO creator;
    private Set<ProveedorDTO> suplier;
    private Set<ReduccionDTO> reduction;


    public Integer getitemId() {
        return itemId;
    }

    public void setitemId(Integer articuloId) {
        this.itemId = articuloId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public UsuarioDTO getCreator() {
        return creator;
    }

    public void setCreator(UsuarioDTO creator) {
        this.creator = creator;
    }

    public Set<ProveedorDTO> getSuplier() {
        return suplier;
    }

    public void setSuplier(Set<ProveedorDTO> suplier) {
        this.suplier = suplier;
    }

    public Set<ReduccionDTO> getReduction() {
        return reduction;
    }

    public void setReduction(Set<ReduccionDTO> reduccion) {
        this.reduction = reduccion;
    }



}
