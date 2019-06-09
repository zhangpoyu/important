package com.lst.po;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class X$UserSummaryEntity {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private BigInteger statements;

    public BigInteger getStatements() {
        return statements;
    }

    public void setStatements(BigInteger statements) {
        this.statements = statements;
    }

    private BigInteger statementLatency;

    public BigInteger getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(BigInteger statementLatency) {
        this.statementLatency = statementLatency;
    }

    private BigDecimal statementAvgLatency;

    public BigDecimal getStatementAvgLatency() {
        return statementAvgLatency;
    }

    public void setStatementAvgLatency(BigDecimal statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    private BigInteger tableScans;

    public BigInteger getTableScans() {
        return tableScans;
    }

    public void setTableScans(BigInteger tableScans) {
        this.tableScans = tableScans;
    }

    private BigInteger fileIos;

    public BigInteger getFileIos() {
        return fileIos;
    }

    public void setFileIos(BigInteger fileIos) {
        this.fileIos = fileIos;
    }

    private BigInteger fileIoLatency;

    public BigInteger getFileIoLatency() {
        return fileIoLatency;
    }

    public void setFileIoLatency(BigInteger fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    private Long currentConnections;

    public Long getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    private Long totalConnections;

    public Long getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    private long uniqueHosts;

    public long getUniqueHosts() {
        return uniqueHosts;
    }

    public void setUniqueHosts(long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }

    private BigInteger currentMemory;

    public BigInteger getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(BigInteger currentMemory) {
        this.currentMemory = currentMemory;
    }

    private BigInteger totalMemoryAllocated;

    public BigInteger getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    public void setTotalMemoryAllocated(BigInteger totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }
}
