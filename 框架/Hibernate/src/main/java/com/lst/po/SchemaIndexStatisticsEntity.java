package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "schema_index_statistics", schema = "sys", catalog = "")
public class SchemaIndexStatisticsEntity {
    private String tableSchema;
    private String tableName;
    private String indexName;
    private long rowsSelected;
    private String selectLatency;
    private long rowsInserted;
    private String insertLatency;
    private long rowsUpdated;
    private String updateLatency;
    private long rowsDeleted;
    private String deleteLatency;

    @Basic
    @Column(name = "table_schema", nullable = true, length = 64)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "table_name", nullable = true, length = 64)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "index_name", nullable = true, length = 64)
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Basic
    @Column(name = "rows_selected", nullable = false)
    public long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    @Basic
    @Column(name = "select_latency", nullable = true, length = -1)
    public String getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency;
    }

    @Basic
    @Column(name = "rows_inserted", nullable = false)
    public long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    @Basic
    @Column(name = "insert_latency", nullable = true, length = -1)
    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    @Basic
    @Column(name = "rows_updated", nullable = false)
    public long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    @Basic
    @Column(name = "update_latency", nullable = true, length = -1)
    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    @Basic
    @Column(name = "rows_deleted", nullable = false)
    public long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    @Basic
    @Column(name = "delete_latency", nullable = true, length = -1)
    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemaIndexStatisticsEntity that = (SchemaIndexStatisticsEntity) o;

        if (rowsSelected != that.rowsSelected) return false;
        if (rowsInserted != that.rowsInserted) return false;
        if (rowsUpdated != that.rowsUpdated) return false;
        if (rowsDeleted != that.rowsDeleted) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (indexName != null ? !indexName.equals(that.indexName) : that.indexName != null) return false;
        if (selectLatency != null ? !selectLatency.equals(that.selectLatency) : that.selectLatency != null)
            return false;
        if (insertLatency != null ? !insertLatency.equals(that.insertLatency) : that.insertLatency != null)
            return false;
        if (updateLatency != null ? !updateLatency.equals(that.updateLatency) : that.updateLatency != null)
            return false;
        if (deleteLatency != null ? !deleteLatency.equals(that.deleteLatency) : that.deleteLatency != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableSchema != null ? tableSchema.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (indexName != null ? indexName.hashCode() : 0);
        result = 31 * result + (int) (rowsSelected ^ (rowsSelected >>> 32));
        result = 31 * result + (selectLatency != null ? selectLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsInserted ^ (rowsInserted >>> 32));
        result = 31 * result + (insertLatency != null ? insertLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsUpdated ^ (rowsUpdated >>> 32));
        result = 31 * result + (updateLatency != null ? updateLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsDeleted ^ (rowsDeleted >>> 32));
        result = 31 * result + (deleteLatency != null ? deleteLatency.hashCode() : 0);
        return result;
    }
}
