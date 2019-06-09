package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "host_summary_by_statement_latency", schema = "sys", catalog = "")
public class HostSummaryByStatementLatencyEntity {
    private String host;
    private Long total;
    private String totalLatency;
    private String maxLatency;
    private String lockLatency;
    private Long rowsSent;
    private Long rowsExamined;
    private Long rowsAffected;
    private Long fullScans;

    @Basic
    @Column(name = "host", nullable = true, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "total", nullable = true, precision = 0)
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
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
    @Column(name = "max_latency", nullable = true, length = -1)
    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Basic
    @Column(name = "lock_latency", nullable = true, length = -1)
    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    @Basic
    @Column(name = "rows_sent", nullable = true, precision = 0)
    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Basic
    @Column(name = "rows_examined", nullable = true, precision = 0)
    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Basic
    @Column(name = "rows_affected", nullable = true, precision = 0)
    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Basic
    @Column(name = "full_scans", nullable = true, precision = 0)
    public Long getFullScans() {
        return fullScans;
    }

    public void setFullScans(Long fullScans) {
        this.fullScans = fullScans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HostSummaryByStatementLatencyEntity that = (HostSummaryByStatementLatencyEntity) o;

        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (maxLatency != null ? !maxLatency.equals(that.maxLatency) : that.maxLatency != null) return false;
        if (lockLatency != null ? !lockLatency.equals(that.lockLatency) : that.lockLatency != null) return false;
        if (rowsSent != null ? !rowsSent.equals(that.rowsSent) : that.rowsSent != null) return false;
        if (rowsExamined != null ? !rowsExamined.equals(that.rowsExamined) : that.rowsExamined != null) return false;
        if (rowsAffected != null ? !rowsAffected.equals(that.rowsAffected) : that.rowsAffected != null) return false;
        if (fullScans != null ? !fullScans.equals(that.fullScans) : that.fullScans != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (maxLatency != null ? maxLatency.hashCode() : 0);
        result = 31 * result + (lockLatency != null ? lockLatency.hashCode() : 0);
        result = 31 * result + (rowsSent != null ? rowsSent.hashCode() : 0);
        result = 31 * result + (rowsExamined != null ? rowsExamined.hashCode() : 0);
        result = 31 * result + (rowsAffected != null ? rowsAffected.hashCode() : 0);
        result = 31 * result + (fullScans != null ? fullScans.hashCode() : 0);
        return result;
    }
}
