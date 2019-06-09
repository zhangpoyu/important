package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$SchemaIndexStatisticsEntity {
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

    private String indexName;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    private long rowsSelected;

    public long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    private long selectLatency;

    public long getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(long selectLatency) {
        this.selectLatency = selectLatency;
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
}
