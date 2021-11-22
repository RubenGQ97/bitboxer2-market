package com.bitboxer2.Bitboxer2market.domain.DTO;

import java.util.Set;

public class UsuarioDTO {

    private Integer userId;
    private String name;
    private String passwd;

    private Set<ArticuloDTO> createdItem;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Set<ArticuloDTO> getCreatedItem() {
        return createdItem;
    }

    public void setCreatedItem(Set<ArticuloDTO> createdItem) {
        this.createdItem = createdItem;
    }
}
