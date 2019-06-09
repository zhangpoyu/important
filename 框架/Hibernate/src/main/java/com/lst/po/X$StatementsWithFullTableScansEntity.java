package com.lst.po;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class X$StatementsWithFullTableScansEntity {
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

    private long noIndexUsedCount;

    public long getNoIndexUsedCount() {
        return noIndexUsedCount;
    }

    public void setNoIndexUsedCount(long noIndexUsedCount) {
        this.noIndexUsedCount = noIndexUsedCount;
    }

    private long noGoodIndexUsedCount;

    public long getNoGoodIndexUsedCount() {
        return noGoodIndexUsedCount;
    }

    public void setNoGoodIndexUsedCount(long noGoodIndexUsedCount) {
        this.noGoodIndexUsedCount = noGoodIndexUsedCount;
    }

    private int noIndexUsedPct;

    public int getNoIndexUsedPct() {
        return noIndexUsedPct;
    }

    public void setNoIndexUsedPct(int noIndexUsedPct) {
        this.noIndexUsedPct = noIndexUsedPct;
    }

    private long rowsSent;

    public long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(long rowsSent) {
        this.rowsSent = rowsSent;
    }

    private long rowsExamined;

    public long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    private Integer rowsSentAvg;

    public Integer getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(Integer rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    private Integer rowsExaminedAvg;

    public Integer getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    public void setRowsExaminedAvg(Integer rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
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
