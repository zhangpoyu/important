package com.lst.po;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class X$MemoryGlobalByCurrentBytesEntity {
    private String eventName;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    private long currentCount;

    public long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(long currentCount) {
        this.currentCount = currentCount;
    }

    private long currentAlloc;

    public long getCurrentAlloc() {
        return currentAlloc;
    }

    public void setCurrentAlloc(long currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    private BigDecimal currentAvgAlloc;

    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    private long highCount;

    public long getHighCount() {
        return highCount;
    }

    public void setHighCount(long highCount) {
        this.highCount = highCount;
    }

    private long highAlloc;

    public long getHighAlloc() {
        return highAlloc;
    }

    public void setHighAlloc(long highAlloc) {
        this.highAlloc = highAlloc;
    }

    private BigDecimal highAvgAlloc;

    public BigDecimal getHighAvgAlloc() {
        return highAvgAlloc;
    }

    public void setHighAvgAlloc(BigDecimal highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }
}
