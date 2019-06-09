package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "io_global_by_file_by_latency", schema = "sys", catalog = "")
public class IoGlobalByFileByLatencyEntity {
    private String file;
    private long total;
    private String totalLatency;
    private long countRead;
    private String readLatency;
    private long countWrite;
    private String writeLatency;
    private long countMisc;
    private String miscLatency;

    @Basic
    @Column(name = "file", nullable = true, length = 512)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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
    @Column(name = "count_read", nullable = false)
    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
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
    @Column(name = "count_write", nullable = false)
    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
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
    @Column(name = "count_misc", nullable = false)
    public long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(long countMisc) {
        this.countMisc = countMisc;
    }

    @Basic
    @Column(name = "misc_latency", nullable = true, length = -1)
    public String getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IoGlobalByFileByLatencyEntity that = (IoGlobalByFileByLatencyEntity) o;

        if (total != that.total) return false;
        if (countRead != that.countRead) return false;
        if (countWrite != that.countWrite) return false;
        if (countMisc != that.countMisc) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (readLatency != null ? !readLatency.equals(that.readLatency) : that.readLatency != null) return false;
        if (writeLatency != null ? !writeLatency.equals(that.writeLatency) : that.writeLatency != null) return false;
        if (miscLatency != null ? !miscLatency.equals(that.miscLatency) : that.miscLatency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (int) (total ^ (total >>> 32));
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (int) (countRead ^ (countRead >>> 32));
        result = 31 * result + (readLatency != null ? readLatency.hashCode() : 0);
        result = 31 * result + (int) (countWrite ^ (countWrite >>> 32));
        result = 31 * result + (writeLatency != null ? writeLatency.hashCode() : 0);
        result = 31 * result + (int) (countMisc ^ (countMisc >>> 32));
        result = 31 * result + (miscLatency != null ? miscLatency.hashCode() : 0);
        return result;
    }
}
