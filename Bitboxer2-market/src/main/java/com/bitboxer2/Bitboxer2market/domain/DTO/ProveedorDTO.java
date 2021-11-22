package com.bitboxer2.Bitboxer2market.domain.DTO;

import java.util.Set;

public class ProveedorDTO {
    private Integer suplierid;
    private String name;
    private String country;

    private Set<ArticuloDTO> item;


    public Integer getSuplierid() {
        return suplierid;
    }

    public void setSuplierid(Integer suplierid) {
        this.suplierid = suplierid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<ArticuloDTO> getItem() {
        return item;
    }

    public void setItem(Set<ArticuloDTO> item) {
        this.item = item;
    }
}
