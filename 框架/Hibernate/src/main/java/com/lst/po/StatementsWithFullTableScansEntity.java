package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "statements_with_full_table_scans", schema = "sys", catalog = "")
public class StatementsWithFullTableScansEntity {
    private String query;
    private String db;
    private long execCount;
    private String totalLatency;
    private long noIndexUsedCount;
    private long noGoodIndexUsedCount;
    private int noIndexUsedPct;
    private long rowsSent;
    private long rowsExamined;
    private Integer rowsSentAvg;
    private Integer rowsExaminedAvg;
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
    @Column(name = "exec_count", nullable = false)
    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
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
    @Column(name = "no_index_used_count", nullable = false)
    public long getNoIndexUsedCount() {
        return noIndexUsedCount;
    }

    public void setNoIndexUsedCount(long noIndexUsedCount) {
        this.noIndexUsedCount = noIndexUsedCount;
    }

    @Basic
    @Column(name = "no_good_index_used_count", nullable = false)
    public long getNoGoodIndexUsedCount() {
        return noGoodIndexUsedCount;
    }

    public void setNoGoodIndexUsedCount(long noGoodIndexUsedCount) {
        this.noGoodIndexUsedCount = noGoodIndexUsedCount;
    }

    @Basic
    @Column(name = "no_index_used_pct", nullable = false, precision = 0)
    public int getNoIndexUsedPct() {
        return noIndexUsedPct;
    }

    public void setNoIndexUsedPct(int noIndexUsedPct) {
        this.noIndexUsedPct = noIndexUsedPct;
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
    @Column(name = "rows_sent_avg", nullable = true, precision = 0)
    public Integer getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(Integer rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    @Basic
    @Column(name = "rows_examined_avg", nullable = true, precision = 0)
    public Integer getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    public void setRowsExaminedAvg(Integer rowsExaminedAvg) {
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

        StatementsWithFullTableScansEntity that = (StatementsWithFullTableScansEntity) o;

        if (execCount != that.execCount) return false;
        if (noIndexUsedCount != that.noIndexUsedCount) return false;
        if (noGoodIndexUsedCount != that.noGoodIndexUsedCount) return false;
        if (noIndexUsedPct != that.noIndexUsedPct) return false;
        if (rowsSent != that.rowsSent) return false;
        if (rowsExamined != that.rowsExamined) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (db != null ? !db.equals(that.db) : that.db != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (rowsSentAvg != null ? !rowsSentAvg.equals(that.rowsSentAvg) : that.rowsSentAvg != null) return false;
        if (rowsExaminedAvg != null ? !rowsExaminedAvg.equals(that.rowsExaminedAvg) : that.rowsExaminedAvg != null)
            return false;
        if (firstSeen != null ? !firstSeen.equals(that.firstSeen) : that.firstSeen != null) return false;
        if (lastSeen != null ? !lastSeen.equals(that.lastSeen) : that.lastSeen != null) return false;
        if (digest != null ? !digest.equals(that.digest) : that.digest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = query != null ? query.hashCode() : 0;
        result = 31 * result + (db != null ? db.hashCode() : 0);
        result = 31 * result + (int) (execCount ^ (execCount >>> 32));
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (int) (noIndexUsedCount ^ (noIndexUsedCount >>> 32));
        result = 31 * result + (int) (noGoodIndexUsedCount ^ (noGoodIndexUsedCount >>> 32));
        result = 31 * result + noIndexUsedPct;
        result = 31 * result + (int) (rowsSent ^ (rowsSent >>> 32));
        result = 31 * result + (int) (rowsExamined ^ (rowsExamined >>> 32));
        result = 31 * result + (rowsSentAvg != null ? rowsSentAvg.hashCode() : 0);
        result = 31 * result + (rowsExaminedAvg != null ? rowsExaminedAvg.hashCode() : 0);
        result = 31 * result + (firstSeen != null ? firstSeen.hashCode() : 0);
        result = 31 * result + (lastSeen != null ? lastSeen.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        return result;
    }
}
