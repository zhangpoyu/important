package com.lst.po;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class X$StatementsWithTempTablesEntity {
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    private String db;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    private long execCount;

    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    private long totalLatency;

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }

    private long memoryTmpTables;

    public long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    public void setMemoryTmpTables(long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    private long diskTmpTables;

    public long getDiskTmpTables() {
        return diskTmpTables;
    }

    public void setDiskTmpTables(long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    private int avgTmpTablesPerQuery;

    public int getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    public void setAvgTmpTablesPerQuery(int avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    private int tmpTablesToDiskPct;

    public int getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    public void setTmpTablesToDiskPct(int tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
    }

    private Timestamp firstSeen;

    public Timestamp getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Timestamp firstSeen) {
        this.firstSeen = firstSeen;
    }

    private Timestamp lastSeen;

    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
    }

    private String digest;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
