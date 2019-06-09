package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "io_global_by_file_by_bytes", schema = "sys", catalog = "")
public class IoGlobalByFileByBytesEntity {
    private String file;
    private long countRead;
    private String totalRead;
    private String avgRead;
    private long countWrite;
    private String totalWritten;
    private String avgWrite;
    private String total;
    private BigDecimal writePct;

    @Basic
    @Column(name = "file", nullable = true, length = 512)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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
    @Column(name = "avg_write", nullable = true, length = -1)
    public String getAvgWrite() {
        return avgWrite;
    }

    public void setAvgWrite(String avgWrite) {
        this.avgWrite = avgWrite;
    }

    @Basic
    @Column(name = "total", nullable = true, length = -1)
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Basic
    @Column(name = "write_pct", nullable = false, precision = 2)
    public BigDecimal getWritePct() {
        return writePct;
    }

    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IoGlobalByFileByBytesEntity that = (IoGlobalByFileByBytesEntity) o;

        if (countRead != that.countRead) return false;
        if (countWrite != that.countWrite) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (totalRead != null ? !totalRead.equals(that.totalRead) : that.totalRead != null) return false;
        if (avgRead != null ? !avgRead.equals(that.avgRead) : that.avgRead != null) return false;
        if (totalWritten != null ? !totalWritten.equals(that.totalWritten) : that.totalWritten != null) return false;
        if (avgWrite != null ? !avgWrite.equals(that.avgWrite) : that.avgWrite != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (writePct != null ? !writePct.equals(that.writePct) : that.writePct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (int) (countRead ^ (countRead >>> 32));
        result = 31 * result + (totalRead != null ? totalRead.hashCode() : 0);
        result = 31 * result + (avgRead != null ? avgRead.hashCode() : 0);
        result = 31 * result + (int) (countWrite ^ (countWrite >>> 32));
        result = 31 * result + (totalWritten != null ? totalWritten.hashCode() : 0);
        result = 31 * result + (avgWrite != null ? avgWrite.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (writePct != null ? writePct.hashCode() : 0);
        return result;
    }
}
