package com.lst.po;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class X$PsDigest95ThPercentileByAvgUsEntity {
    private Integer avgUs;

    public Integer getAvgUs() {
        return avgUs;
    }

    public void setAvgUs(Integer avgUs) {
        this.avgUs = avgUs;
    }

    private BigDecimal percentile;

    public BigDecimal getPercentile() {
        return percentile;
    }

    public void setPercentile(BigDecimal percentile) {
        this.percentile = percentile;
    }
}
