package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "statements_with_sorting", schema = "sys", catalog = "")
public class StatementsWithSortingEntity {
    private String query;
    private String db;
    private long execCount;
    private String totalLatency;
    private long sortMergePasses;
    private int avgSortMerges;
    private long sortsUsingScans;
    private long sortUsingRange;
    private long rowsSorted;
    private int avgRowsSorted;
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
    @Column(name = "sort_merge_passes", nullable = false)
    public long getSortMergePasses() {
        return sortMergePasses;
    }

    public void setSortMergePasses(long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    @Basic
    @Column(name = "avg_sort_merges", nullable = false, precision = 0)
    public int getAvgSortMerges() {
        return avgSortMerges;
    }

    public void setAvgSortMerges(int avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    @Basic
    @Column(name = "sorts_using_scans", nullable = false)
    public long getSortsUsingScans() {
        return sortsUsingScans;
    }

    public void setSortsUsingScans(long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    @Basic
    @Column(name = "sort_using_range", nullable = false)
    public long getSortUsingRange() {
        return sortUsingRange;
    }

    public void setSortUsingRange(long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }

    @Basic
    @Column(name = "rows_sorted", nullable = false)
    public long getRowsSorted() {
        return rowsSorted;
    }

    public void setRowsSorted(long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    @Basic
    @Column(name = "avg_rows_sorted", nullable = false, precision = 0)
    public int getAvgRowsSorted() {
        return avgRowsSorted;
    }

    public void setAvgRowsSorted(int avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
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

        StatementsWithSortingEntity that = (StatementsWithSortingEntity) o;

        if (execCount != that.execCount) return false;
        if (sortMergePasses != that.sortMergePasses) return false;
        if (avgSortMerges != that.avgSortMerges) return false;
        if (sortsUsingScans != that.sortsUsingScans) return false;
        if (sortUsingRange != that.sortUsingRange) return false;
        if (rowsSorted != that.rowsSorted) return false;
        if (avgRowsSorted != that.avgRowsSorted) return false;
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
        result = 31 * result + (int) (sortMergePasses ^ (sortMergePasses >>> 32));
        result = 31 * result + avgSortMerges;
        result = 31 * result + (int) (sortsUsingScans ^ (sortsUsingScans >>> 32));
        result = 31 * result + (int) (sortUsingRange ^ (sortUsingRange >>> 32));
        result = 31 * result + (int) (rowsSorted ^ (rowsSorted >>> 32));
        result = 31 * result + avgRowsSorted;
        result = 31 * result + (firstSeen != null ? firstSeen.hashCode() : 0);
        result = 31 * result + (lastSeen != null ? lastSeen.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        return result;
    }
}
