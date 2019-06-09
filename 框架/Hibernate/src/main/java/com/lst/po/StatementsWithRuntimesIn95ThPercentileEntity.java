package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "statements_with_runtimes_in_95th_percentile", schema = "sys", catalog = "")
public class StatementsWithRuntimesIn95ThPercentileEntity {
    private String query;
    private String db;
    private String fullScan;
    private long execCount;
    private long errCount;
    private long warnCount;
    private String totalLatency;
    private String maxLatency;
    private String avgLatency;
    private long rowsSent;
    private int rowsSentAvg;
    private long rowsExamined;
    private int rowsExaminedAvg;
    private Timestamp firstSeen;
    private Timestamp lastSeen;
    private String digest;

    @Basic
    @Column(name = "query", nullable = true, length = -1)
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Basic
    @Column(name = "db", nullable = true, length = 64)
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Basic
    @Column(name = "full_scan", nullable = false, length = 1)
    public String getFullScan() {
        return fullScan;
    }

    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    @Basic
    @Column(name = "exec_count", nullable = false)
    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    @Basic
    @Column(name = "err_count", nullable = false)
    public long getErrCount() {
        return errCount;
    }

    public void setErrCount(long errCount) {
        this.errCount = errCount;
    }

    @Basic
    @Column(name = "warn_count", nullable = false)
    public long getWarnCount() {
        return warnCount;
    }

    public void setWarnCount(long warnCount) {
        this.warnCount = warnCount;
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
    @Column(name = "avg_latency", nullable = true, length = -1)
    public String getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
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
    @Column(name = "rows_sent_avg", nullable = false, precision = 0)
    public int getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(int rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
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
    @Column(name = "rows_examined_avg", nullable = false, precision = 0)
    public int getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    public void setRowsExaminedAvg(int rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    @Basic
    @Column(name = "first_seen", nullable = false)
    public Timestamp getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Timestamp firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Basic
    @Column(name = "last_seen", nullable = false)
    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Basic
    @Column(name = "digest", nullable = true, length = 32)
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatementsWithRuntimesIn95ThPercentileEntity that = (StatementsWithRuntimesIn95ThPercentileEntity) o;

        if (execCount != that.execCount) return false;
        if (errCount != that.errCount) return false;
        if (warnCount != that.warnCount) return false;
        if (rowsSent != that.rowsSent) return false;
        if (rowsSentAvg != that.rowsSentAvg) return false;
        if (rowsExamined != that.rowsExamined) return false;
        if (rowsExaminedAvg != that.rowsExaminedAvg) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (db != null ? !db.equals(that.db) : that.db != null) return false;
        if (fullScan != null ? !fullScan.equals(that.fullScan) : that.fullScan != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (maxLatency != null ? !maxLatency.equals(that.maxLatency) : that.maxLatency != null) return false;
        if (avgLatency != null ? !avgLatency.equals(that.avgLatency) : that.avgLatency != null) return false;
        if (firstSeen != null ? !firstSeen.equals(that.firstSeen) : that.firstSeen != null) return false;
        if (lastSeen != null ? !lastSeen.equals(that.lastSeen) : that.lastSeen != null) return false;
        if (digest != null ? !digest.equals(that.digest) : that.digest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = query != null ? query.hashCode() : 0;
        result = 31 * result + (db != null ? db.hashCode() : 0);
        result = 31 * result + (fullScan != null ? fullScan.hashCode() : 0);
        result = 31 * result + (int) (execCount ^ (execCount >>> 32));
        result = 31 * result + (int) (errCount ^ (errCount >>> 32));
        result = 31 * result + (int) (warnCount ^ (warnCount >>> 32));
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (maxLatency != null ? maxLatency.hashCode() : 0);
        result = 31 * result + (avgLatency != null ? avgLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsSent ^ (rowsSent >>> 32));
        result = 31 * result + rowsSentAvg;
        result = 31 * result + (int) (rowsExamined ^ (rowsExamined >>> 32));
        result = 31 * result + rowsExaminedAvg;
        result = 31 * result + (firstSeen != null ? firstSeen.hashCode() : 0);
        result = 31 * result + (lastSeen != null ? lastSeen.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        return result;
    }
}
