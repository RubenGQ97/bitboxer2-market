package com.bitboxer2.Bitboxer2market.domain.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReduccionDTO {

    private Integer reductionId;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;

   // private ArticuloDTO item;

    public Integer getIdReduccion() {
        return reductionId;
    }

    public void setIdReduccion(Integer reductionId) {
        this.reductionId = reductionId;
    }

    public BigDecimal getPrecio() {
        return price;
    }

    public void setPrecio(BigDecimal price) {
        this.price = price;
    }

    public Date getFechaInicio() {
        return startDate;
    }

    public void setFechaInicio(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFechaFin() {
        return endDate;
    }

    public void setFechaFin(Date endDate) {
        this.endDate = endDate;
    }

    /*public ArticuloDTO getArticulo() {
        return item;
    }

    public void setArticulo(ArticuloDTO item) {
        this.item = item;
    }*/
}
