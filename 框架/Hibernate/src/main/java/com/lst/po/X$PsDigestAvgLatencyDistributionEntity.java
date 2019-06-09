package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$PsDigestAvgLatencyDistributionEntity {
    private long cnt;

    public long getCnt() {
        return cnt;
    }

    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    private Integer avgUs;

    public Integer getAvgUs() {
        return avgUs;
    }

    public void setAvgUs(Integer avgUs) {
        this.avgUs = avgUs;
    }
}
