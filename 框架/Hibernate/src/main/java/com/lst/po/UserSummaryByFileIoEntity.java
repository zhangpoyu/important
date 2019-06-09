package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_summary_by_file_io", schema = "sys", catalog = "")
public class UserSummaryByFileIoEntity {
    private String user;
    private Long ios;
    private String ioLatency;

    @Basic
    @Column(name = "user", nullable = true, length = 32)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "ios", nullable = true, precision = 0)
    public Long getIos() {
        return ios;
    }

    public void setIos(Long ios) {
        this.ios = ios;
    }

    @Basic
    @Column(name = "io_latency", nullable = true, length = -1)
    public String getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSummaryByFileIoEntity that = (UserSummaryByFileIoEntity) o;

        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (ios != null ? !ios.equals(that.ios) : that.ios != null) return false;
        if (ioLatency != null ? !ioLatency.equals(that.ioLatency) : that.ioLatency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (ios != null ? ios.hashCode() : 0);
        result = 31 * result + (ioLatency != null ? ioLatency.hashCode() : 0);
        return result;
    }
}
