package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "host_summary_by_statement_type", schema = "sys", catalog = "")
public class HostSummaryByStatementTypeEntity {
    private String host;
    private String statement;
    private long total;
    private String totalLatency;
    private String maxLatency;
    private String lockLatency;
    private long rowsSent;
    private long rowsExamined;
    private long rowsAffected;
    private long fullScans;

    @Basic
    @Column(name = "host", nullable = true, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "statement", nullable = true, length = 128)
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
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
    @Column(name = "rows_sent", nullable = false)
    public long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Basic
    @Column(name = "rows_examined", nullable = false)
    public long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Basic
    @Column(name = "rows_affected", nullable = false)
    public long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Basic
    @Column(name = "full_scans", nullable = false)
    public long getFullScans() {
        return fullScans;
    }

    public void setFullScans(long fullScans) {
        this.fullScans = fullScans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HostSummaryByStatementTypeEntity that = (HostSummaryByStatementTypeEntity) o;

        if (total != that.total) return false;
        if (rowsSent != that.rowsSent) return false;
        if (rowsExamined != that.rowsExamined) return false;
        if (rowsAffected != that.rowsAffected) return false;
        if (fullScans != that.fullScans) return false;
        if (host != null ? !host.equals(that.host) : that.host != null) return false;
        if (statement != null ? !statement.equals(that.statement) : that.statement != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (maxLatency != null ? !maxLatency.equals(that.maxLatency) : that.maxLatency != null) return false;
        if (lockLatency != null ? !lockLatency.equals(that.lockLatency) : that.lockLatency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = host != null ? host.hashCode() : 0;
        result = 31 * result + (statement != null ? statement.hashCode() : 0);
        result = 31 * result + (int) (total ^ (total >>> 32));
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (maxLatency != null ? maxLatency.hashCode() : 0);
        result = 31 * result + (lockLatency != null ? lockLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsSent ^ (rowsSent >>> 32));
        result = 31 * result + (int) (rowsExamined ^ (rowsExamined >>> 32));
        result = 31 * result + (int) (rowsAffected ^ (rowsAffected >>> 32));
        result = 31 * result + (int) (fullScans ^ (fullScans >>> 32));
        return result;
    }
}
