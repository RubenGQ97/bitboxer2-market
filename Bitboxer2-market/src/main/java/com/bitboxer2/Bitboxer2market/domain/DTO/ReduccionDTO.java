package com.bitboxer2.Bitboxer2market.domain.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class ReduccionDTO {

    private Integer reductionId;
    private BigDecimal price;
    private Date startDate;
    private Date endDate;

    private ArticuloDTO item;

    public Integer getReductionId() {
        return reductionId;
    }

    public void setReductionId(Integer reductionId) {
        this.reductionId = reductionId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArticuloDTO getItem() {
        return item;
    }

    public void setItem(ArticuloDTO item) {
        this.item = item;
    }
}
