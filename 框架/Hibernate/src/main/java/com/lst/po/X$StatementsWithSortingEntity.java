package com.lst.po;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class X$StatementsWithSortingEntity {
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

    private long sortMergePasses;

    public long getSortMergePasses() {
        return sortMergePasses;
    }

    public void setSortMergePasses(long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    private int avgSortMerges;

    public int getAvgSortMerges() {
        return avgSortMerges;
    }

    public void setAvgSortMerges(int avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    private long sortsUsingScans;

    public long getSortsUsingScans() {
        return sortsUsingScans;
    }

    public void setSortsUsingScans(long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    private long sortUsingRange;

    public long getSortUsingRange() {
        return sortUsingRange;
    }

    public void setSortUsingRange(long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }

    private long rowsSorted;

    public long getRowsSorted() {
        return rowsSorted;
    }

    public void setRowsSorted(long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    private int avgRowsSorted;

    public int getAvgRowsSorted() {
        return avgRowsSorted;
    }

    public void setAvgRowsSorted(int avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
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
