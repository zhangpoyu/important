package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$MemoryGlobalTotalEntity {
    private Long totalAllocated;

    public Long getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(Long totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
}
