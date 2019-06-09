package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$UserSummaryByFileIoEntity {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private Long ios;

    public Long getIos() {
        return ios;
    }

    public void setIos(Long ios) {
        this.ios = ios;
    }

    private Long ioLatency;

    public Long getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(Long ioLatency) {
        this.ioLatency = ioLatency;
    }
}
