package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "io_global_by_wait_by_latency", schema = "sys", catalog = "")
public class IoGlobalByWaitByLatencyEntity {
    private String eventName;
    private long total;
    private String totalLatency;
    private String avgLatency;
    private String maxLatency;
    private String readLatency;
    private String writeLatency;
    private String miscLatency;
    private long countRead;
    private String totalRead;
    private String avgRead;
    private long countWrite;
    private String totalWritten;
    private String avgWritten;

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
    @Column(name = "read_latency", nullable = true, length = -1)
    public String getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency;
    }

    @Basic
    @Column(name = "write_latency", nullable = true, length = -1)
    public String getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency;
    }

    @Basic
    @Column(name = "misc_latency", nullable = true, length = -1)
    public String getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IoGlobalByWaitByLatencyEntity that = (IoGlobalByWaitByLatencyEntity) o;

        if (total != that.total) return false;
        if (countRead != that.countRead) return false;
        if (countWrite != that.countWrite) return false;
        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (avgLatency != null ? !avgLatency.equals(that.avgLatency) : that.avgLatency != null) return false;
        if (maxLatency != null ? !maxLatency.equals(that.maxLatency) : that.maxLatency != null) return false;
        if (readLatency != null ? !readLatency.equals(that.readLatency) : that.readLatency != null) return false;
        if (writeLatency != null ? !writeLatency.equals(that.writeLatency) : that.writeLatency != null) return false;
        if (miscLatency != null ? !miscLatency.equals(that.miscLatency) : that.miscLatency != null) return false;
        if (totalRead != null ? !totalRead.equals(that.totalRead) : that.totalRead != null) return false;
        if (avgRead != null ? !avgRead.equals(that.avgRead) : that.avgRead != null) return false;
        if (totalWritten != null ? !totalWritten.equals(that.totalWritten) : that.totalWritten != null) return false;
        if (avgWritten != null ? !avgWritten.equals(that.avgWritten) : that.avgWritten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventName != null ? eventName.hashCode() : 0;
        result = 31 * result + (int) (total ^ (total >>> 32));
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (avgLatency != null ? avgLatency.hashCode() : 0);
        result = 31 * result + (maxLatency != null ? maxLatency.hashCode() : 0);
        result = 31 * result + (readLatency != null ? readLatency.hashCode() : 0);
        result = 31 * result + (writeLatency != null ? writeLatency.hashCode() : 0);
        result = 31 * result + (miscLatency != null ? miscLatency.hashCode() : 0);
        result = 31 * result + (int) (countRead ^ (countRead >>> 32));
        result = 31 * result + (totalRead != null ? totalRead.hashCode() : 0);
        result = 31 * result + (avgRead != null ? avgRead.hashCode() : 0);
        result = 31 * result + (int) (countWrite ^ (countWrite >>> 32));
        result = 31 * result + (totalWritten != null ? totalWritten.hashCode() : 0);
        result = 31 * result + (avgWritten != null ? avgWritten.hashCode() : 0);
        return result;
    }
}
