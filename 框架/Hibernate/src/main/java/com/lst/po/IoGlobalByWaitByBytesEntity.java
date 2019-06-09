package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "io_global_by_wait_by_bytes", schema = "sys", catalog = "")
public class IoGlobalByWaitByBytesEntity {
    private String eventName;
    private long total;
    private String totalLatency;
    private String minLatency;
    private String avgLatency;
    private String maxLatency;
    private long countRead;
    private String totalRead;
    private String avgRead;
    private long countWrite;
    private String totalWritten;
    private String avgWritten;
    private String totalRequested;

    @Basic
    @Column(name = "event_name", nullable = true, length = 128)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Basic
    @Column(name = "total", nullable = false)
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Basic
    @Column(name = "total_latency", nullable = true, length = -1)
    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Basic
    @Column(name = "min_latency", nullable = true, length = -1)
    public String getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency;
    }

    @Basic
    @Column(name = "avg_latency", nullable = true, length = -1)
    public String getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Basic
    @Column(name = "max_latency", nullable = true, length = -1)
    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Basic
    @Column(name = "count_read", nullable = false)
    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    @Basic
    @Column(name = "total_read", nullable = true, length = -1)
    public String getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    @Basic
    @Column(name = "avg_read", nullable = true, length = -1)
    public String getAvgRead() {
        return avgRead;
    }

    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead;
    }

    @Basic
    @Column(name = "count_write", nullable = false)
    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    @Basic
    @Column(name = "total_written", nullable = true, length = -1)
    public String getTotalWritten() {
        return totalWritten;
    }

    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten;
    }

    @Basic
    @Column(name = "avg_written", nullable = true, length = -1)
    public String getAvgWritten() {
        return avgWritten;
    }

    public void setAvgWritten(String avgWritten) {
        this.avgWritten = avgWritten;
    }

    @Basic
    @Column(name = "total_requested", nullable = true, length = -1)
    public String getTotalRequested() {
        return totalRequested;
    }

    public void setTotalRequested(String totalRequested) {
        this.totalRequested = totalRequested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IoGlobalByWaitByBytesEntity that = (IoGlobalByWaitByBytesEntity) o;

        if (total != that.total) return false;
        if (countRead != that.countRead) return false;
        if (countWrite != that.countWrite) return false;
        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (minLatency != null ? !minLatency.equals(that.minLatency) : that.minLatency != null) return false;
        if (avgLatency != null ? !avgLatency.equals(that.avgLatency) : that.avgLatency != null) return false;
        if (maxLatency != null ? !maxLatency.equals(that.maxLatency) : that.maxLatency != null) return false;
        if (totalRead != null ? !totalRead.equals(that.totalRead) : that.totalRead != null) return false;
        if (avgRead != null ? !avgRead.equals(that.avgRead) : that.avgRead != null) return false;
        if (totalWritten != null ? !totalWritten.equals(that.totalWritten) : that.totalWritten != null) return false;
        if (avgWritten != null ? !avgWritten.equals(that.avgWritten) : that.avgWritten != null) return false;
        if (totalRequested != null ? !totalRequested.equals(that.totalRequested) : that.totalRequested != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventName != null ? eventName.hashCode() : 0;
        result = 31 * result + (int) (total ^ (total >>> 32));
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (minLatency != null ? minLatency.hashCode() : 0);
        result = 31 * result + (avgLatency != null ? avgLatency.hashCode() : 0);
        result = 31 * result + (maxLatency != null ? maxLatency.hashCode() : 0);
        result = 31 * result + (int) (countRead ^ (countRead >>> 32));
        result = 31 * result + (totalRead != null ? totalRead.hashCode() : 0);
        result = 31 * result + (avgRead != null ? avgRead.hashCode() : 0);
        result = 31 * result + (int) (countWrite ^ (countWrite >>> 32));
        result = 31 * result + (totalWritten != null ? totalWritten.hashCode() : 0);
        result = 31 * result + (avgWritten != null ? avgWritten.hashCode() : 0);
        result = 31 * result + (totalRequested != null ? totalRequested.hashCode() : 0);
        return result;
    }
}
