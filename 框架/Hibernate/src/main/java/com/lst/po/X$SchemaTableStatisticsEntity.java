package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$SchemaTableStatisticsEntity {
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

    private long totalLatency;

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
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
}
