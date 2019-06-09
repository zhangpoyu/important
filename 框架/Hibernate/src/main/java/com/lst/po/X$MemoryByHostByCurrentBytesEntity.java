package com.lst.po;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class X$MemoryByHostByCurrentBytesEntity {
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    private Long currentCountUsed;

    public Long getCurrentCountUsed() {
        return currentCountUsed;
    }

    public void setCurrentCountUsed(Long currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    private Long currentAllocated;

    public Long getCurrentAllocated() {
        return currentAllocated;
    }

    public void setCurrentAllocated(Long currentAllocated) {
        this.currentAllocated = currentAllocated;
    }

    private BigDecimal currentAvgAlloc;

    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    private Long currentMaxAlloc;

    public Long getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    public void setCurrentMaxAlloc(Long currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }

    private Long totalAllocated;

    public Long getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(Long totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
}
