package com.bitboxer2.Bitboxer2market.domain.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioDTO {

    private Integer userId;
    private String name;
    //private String passwd;

    //private Set<ArticuloDTO> createdItem;

    public Integer getIdUsuario() {
        return userId;
    }

    public void setIdUsuario(Integer userId) {
        this.userId = userId;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    /*public String getContrasenia() {
        return passwd;
    }

    public void setContrasenia(String passwd) {
        this.passwd = passwd;
    }

    /*public Set<ArticuloDTO> getArticulosCreados() {
        return createdItem;
    }

    public void setArticulosCreados(Set<ArticuloDTO> createdItem) {
        this.createdItem = createdItem;
    }*/
}
