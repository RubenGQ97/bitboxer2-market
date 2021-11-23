package com.bitboxer2.Bitboxer2market.domain.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProveedorDTO  {
    private Integer suplierid;
    private String name;
    private String country;

    //private Set<ArticuloDTO> item;


    public Integer geIdProveedor() {
        return suplierid;
    }

    public void setIdProveedor(Integer suplierid) {
        this.suplierid = suplierid;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getPais() {
        return country;
    }

    public void setPais(String country) {
        this.country = country;
    }

    /*public Set<ArticuloDTO> getArticulo() {
        return item;
    }

    public void setArticulo(Set<ArticuloDTO> item) {
        this.item = item;
    }*/
}
