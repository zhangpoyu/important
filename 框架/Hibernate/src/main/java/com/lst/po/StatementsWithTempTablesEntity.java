package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "statements_with_temp_tables", schema = "sys", catalog = "")
public class StatementsWithTempTablesEntity {
    private String query;
    private String db;
    private long execCount;
    private String totalLatency;
    private long memoryTmpTables;
    private long diskTmpTables;
    private int avgTmpTablesPerQuery;
    private int tmpTablesToDiskPct;
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
    @Column(name = "memory_tmp_tables", nullable = false)
    public long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    public void setMemoryTmpTables(long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    @Basic
    @Column(name = "disk_tmp_tables", nullable = false)
    public long getDiskTmpTables() {
        return diskTmpTables;
    }

    public void setDiskTmpTables(long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    @Basic
    @Column(name = "avg_tmp_tables_per_query", nullable = false, precision = 0)
    public int getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    public void setAvgTmpTablesPerQuery(int avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    @Basic
    @Column(name = "tmp_tables_to_disk_pct", nullable = false, precision = 0)
    public int getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    public void setTmpTablesToDiskPct(int tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
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

        StatementsWithTempTablesEntity that = (StatementsWithTempTablesEntity) o;

        if (execCount != that.execCount) return false;
        if (memoryTmpTables != that.memoryTmpTables) return false;
        if (diskTmpTables != that.diskTmpTables) return false;
        if (avgTmpTablesPerQuery != that.avgTmpTablesPerQuery) return false;
        if (tmpTablesToDiskPct != that.tmpTablesToDiskPct) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (db != null ? !db.equals(that.db) : that.db != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
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
        result = 31 * result + (int) (memoryTmpTables ^ (memoryTmpTables >>> 32));
        result = 31 * result + (int) (diskTmpTables ^ (diskTmpTables >>> 32));
        result = 31 * result + avgTmpTablesPerQuery;
        result = 31 * result + tmpTablesToDiskPct;
        result = 31 * result + (firstSeen != null ? firstSeen.hashCode() : 0);
        result = 31 * result + (lastSeen != null ? lastSeen.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        return result;
    }
}
