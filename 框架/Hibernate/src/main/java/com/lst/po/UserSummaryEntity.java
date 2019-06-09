package com.lst.po;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "user_summary", schema = "sys", catalog = "")
public class UserSummaryEntity {
    private String user;
    private BigInteger statements;
    private String statementLatency;
    private String statementAvgLatency;
    private BigInteger tableScans;
    private BigInteger fileIos;
    private String fileIoLatency;
    private Long currentConnections;
    private Long totalConnections;
    private long uniqueHosts;
    private String currentMemory;
    private String totalMemoryAllocated;

    @Basic
    @Column(name = "user", nullable = true, length = 32)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "statements", nullable = true, precision = 0)
    public BigInteger getStatements() {
        return statements;
    }

    public void setStatements(BigInteger statements) {
        this.statements = statements;
    }

    @Basic
    @Column(name = "statement_latency", nullable = true, length = -1)
    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    @Basic
    @Column(name = "statement_avg_latency", nullable = true, length = -1)
    public String getStatementAvgLatency() {
        return statementAvgLatency;
    }

    public void setStatementAvgLatency(String statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    @Basic
    @Column(name = "table_scans", nullable = true, precision = 0)
    public BigInteger getTableScans() {
        return tableScans;
    }

    public void setTableScans(BigInteger tableScans) {
        this.tableScans = tableScans;
    }

    @Basic
    @Column(name = "file_ios", nullable = true, precision = 0)
    public BigInteger getFileIos() {
        return fileIos;
    }

    public void setFileIos(BigInteger fileIos) {
        this.fileIos = fileIos;
    }

    @Basic
    @Column(name = "file_io_latency", nullable = true, length = -1)
    public String getFileIoLatency() {
        return fileIoLatency;
    }

    public void setFileIoLatency(String fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    @Basic
    @Column(name = "current_connections", nullable = true, precision = 0)
    public Long getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    @Basic
    @Column(name = "total_connections", nullable = true, precision = 0)
    public Long getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    @Basic
    @Column(name = "unique_hosts", nullable = false)
    public long getUniqueHosts() {
        return uniqueHosts;
    }

    public void setUniqueHosts(long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }

    @Basic
    @Column(name = "current_memory", nullable = true, length = -1)
    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    @Basic
    @Column(name = "total_memory_allocated", nullable = true, length = -1)
    public String getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    public void setTotalMemoryAllocated(String totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSummaryEntity that = (UserSummaryEntity) o;

        if (uniqueHosts != that.uniqueHosts) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (statements != null ? !statements.equals(that.statements) : that.statements != null) return false;
        if (statementLatency != null ? !statementLatency.equals(that.statementLatency) : that.statementLatency != null)
            return false;
        if (statementAvgLatency != null ? !statementAvgLatency.equals(that.statementAvgLatency) : that.statementAvgLatency != null)
            return false;
        if (tableScans != null ? !tableScans.equals(that.tableScans) : that.tableScans != null) return false;
        if (fileIos != null ? !fileIos.equals(that.fileIos) : that.fileIos != null) return false;
        if (fileIoLatency != null ? !fileIoLatency.equals(that.fileIoLatency) : that.fileIoLatency != null)
            return false;
        if (currentConnections != null ? !currentConnections.equals(that.currentConnections) : that.currentConnections != null)
            return false;
        if (totalConnections != null ? !totalConnections.equals(that.totalConnections) : that.totalConnections != null)
            return false;
        if (currentMemory != null ? !currentMemory.equals(that.currentMemory) : that.currentMemory != null)
            return false;
        if (totalMemoryAllocated != null ? !totalMemoryAllocated.equals(that.totalMemoryAllocated) : that.totalMemoryAllocated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = user != null ? user.hashCode() : 0;
        result = 31 * result + (statements != null ? statements.hashCode() : 0);
        result = 31 * result + (statementLatency != null ? statementLatency.hashCode() : 0);
        result = 31 * result + (statementAvgLatency != null ? statementAvgLatency.hashCode() : 0);
        result = 31 * result + (tableScans != null ? tableScans.hashCode() : 0);
        result = 31 * result + (fileIos != null ? fileIos.hashCode() : 0);
        result = 31 * result + (fileIoLatency != null ? fileIoLatency.hashCode() : 0);
        result = 31 * result + (currentConnections != null ? currentConnections.hashCode() : 0);
        result = 31 * result + (totalConnections != null ? totalConnections.hashCode() : 0);
        result = 31 * result + (int) (uniqueHosts ^ (uniqueHosts >>> 32));
        result = 31 * result + (currentMemory != null ? currentMemory.hashCode() : 0);
        result = 31 * result + (totalMemoryAllocated != null ? totalMemoryAllocated.hashCode() : 0);
        return result;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
