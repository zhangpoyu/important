package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$SchemaTableStatisticsWithBufferEntity {
    private String tableSchema;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    private String tableName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private long rowsFetched;

    public long getRowsFetched() {
        return rowsFetched;
    }

    public void setRowsFetched(long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    private long fetchLatency;

    public long getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(long fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    private long rowsInserted;

    public long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    private long insertLatency;

    public long getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(long insertLatency) {
        this.insertLatency = insertLatency;
    }

    private long rowsUpdated;

    public long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    private long updateLatency;

    public long getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(long updateLatency) {
        this.updateLatency = updateLatency;
    }

    private long rowsDeleted;

    public long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    private long deleteLatency;

    public long getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(long deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    private Long ioReadRequests;

    public Long getIoReadRequests() {
        return ioReadRequests;
    }

    public void setIoReadRequests(Long ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    private Long ioRead;

    public Long getIoRead() {
        return ioRead;
    }

    public void setIoRead(Long ioRead) {
        this.ioRead = ioRead;
    }

    private Long ioReadLatency;

    public Long getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(Long ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    private Long ioWriteRequests;

    public Long getIoWriteRequests() {
        return ioWriteRequests;
    }

    public void setIoWriteRequests(Long ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    private Long ioWrite;

    public Long getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(Long ioWrite) {
        this.ioWrite = ioWrite;
    }

    private Long ioWriteLatency;

    public Long getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(Long ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    private Long ioMiscRequests;

    public Long getIoMiscRequests() {
        return ioMiscRequests;
    }

    public void setIoMiscRequests(Long ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    private Long ioMiscLatency;

    public Long getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(Long ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    private Long innodbBufferAllocated;

    public Long getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    public void setInnodbBufferAllocated(Long innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    private Long innodbBufferData;

    public Long getInnodbBufferData() {
        return innodbBufferData;
    }

    public void setInnodbBufferData(Long innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    private Long innodbBufferFree;

    public Long getInnodbBufferFree() {
        return innodbBufferFree;
    }

    public void setInnodbBufferFree(Long innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree;
    }

    private Long innodbBufferPages;

    public Long getInnodbBufferPages() {
        return innodbBufferPages;
    }

    public void setInnodbBufferPages(Long innodbBufferPages) {
        this.innodbBufferPages = innodbBufferPages;
    }

    private Long innodbBufferPagesHashed;

    public Long getInnodbBufferPagesHashed() {
        return innodbBufferPagesHashed;
    }

    public void setInnodbBufferPagesHashed(Long innodbBufferPagesHashed) {
        this.innodbBufferPagesHashed = innodbBufferPagesHashed;
    }

    private Long innodbBufferPagesOld;

    public Long getInnodbBufferPagesOld() {
        return innodbBufferPagesOld;
    }

    public void setInnodbBufferPagesOld(Long innodbBufferPagesOld) {
        this.innodbBufferPagesOld = innodbBufferPagesOld;
    }

    private Long innodbBufferRowsCached;

    public Long getInnodbBufferRowsCached() {
        return innodbBufferRowsCached;
    }

    public void setInnodbBufferRowsCached(Long innodbBufferRowsCached) {
        this.innodbBufferRowsCached = innodbBufferRowsCached;
    }
}
