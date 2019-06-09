package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "schema_table_statistics", schema = "sys", catalog = "")
public class SchemaTableStatisticsEntity {
    private String tableSchema;
    private String tableName;
    private String totalLatency;
    private long rowsFetched;
    private String fetchLatency;
    private long rowsInserted;
    private String insertLatency;
    private long rowsUpdated;
    private String updateLatency;
    private long rowsDeleted;
    private String deleteLatency;
    private Long ioReadRequests;
    private String ioRead;
    private String ioReadLatency;
    private Long ioWriteRequests;
    private String ioWrite;
    private String ioWriteLatency;
    private Long ioMiscRequests;
    private String ioMiscLatency;

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
    @Column(name = "total_latency", nullable = true, length = -1)
    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    @Basic
    @Column(name = "rows_fetched", nullable = false)
    public long getRowsFetched() {
        return rowsFetched;
    }

    public void setRowsFetched(long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    @Basic
    @Column(name = "fetch_latency", nullable = true, length = -1)
    public String getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency;
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

    @Basic
    @Column(name = "io_read_requests", nullable = true, precision = 0)
    public Long getIoReadRequests() {
        return ioReadRequests;
    }

    public void setIoReadRequests(Long ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    @Basic
    @Column(name = "io_read", nullable = true, length = -1)
    public String getIoRead() {
        return ioRead;
    }

    public void setIoRead(String ioRead) {
        this.ioRead = ioRead;
    }

    @Basic
    @Column(name = "io_read_latency", nullable = true, length = -1)
    public String getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    @Basic
    @Column(name = "io_write_requests", nullable = true, precision = 0)
    public Long getIoWriteRequests() {
        return ioWriteRequests;
    }

    public void setIoWriteRequests(Long ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    @Basic
    @Column(name = "io_write", nullable = true, length = -1)
    public String getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite;
    }

    @Basic
    @Column(name = "io_write_latency", nullable = true, length = -1)
    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    @Basic
    @Column(name = "io_misc_requests", nullable = true, precision = 0)
    public Long getIoMiscRequests() {
        return ioMiscRequests;
    }

    public void setIoMiscRequests(Long ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    @Basic
    @Column(name = "io_misc_latency", nullable = true, length = -1)
    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemaTableStatisticsEntity that = (SchemaTableStatisticsEntity) o;

        if (rowsFetched != that.rowsFetched) return false;
        if (rowsInserted != that.rowsInserted) return false;
        if (rowsUpdated != that.rowsUpdated) return false;
        if (rowsDeleted != that.rowsDeleted) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (fetchLatency != null ? !fetchLatency.equals(that.fetchLatency) : that.fetchLatency != null) return false;
        if (insertLatency != null ? !insertLatency.equals(that.insertLatency) : that.insertLatency != null)
            return false;
        if (updateLatency != null ? !updateLatency.equals(that.updateLatency) : that.updateLatency != null)
            return false;
        if (deleteLatency != null ? !deleteLatency.equals(that.deleteLatency) : that.deleteLatency != null)
            return false;
        if (ioReadRequests != null ? !ioReadRequests.equals(that.ioReadRequests) : that.ioReadRequests != null)
            return false;
        if (ioRead != null ? !ioRead.equals(that.ioRead) : that.ioRead != null) return false;
        if (ioReadLatency != null ? !ioReadLatency.equals(that.ioReadLatency) : that.ioReadLatency != null)
            return false;
        if (ioWriteRequests != null ? !ioWriteRequests.equals(that.ioWriteRequests) : that.ioWriteRequests != null)
            return false;
        if (ioWrite != null ? !ioWrite.equals(that.ioWrite) : that.ioWrite != null) return false;
        if (ioWriteLatency != null ? !ioWriteLatency.equals(that.ioWriteLatency) : that.ioWriteLatency != null)
            return false;
        if (ioMiscRequests != null ? !ioMiscRequests.equals(that.ioMiscRequests) : that.ioMiscRequests != null)
            return false;
        if (ioMiscLatency != null ? !ioMiscLatency.equals(that.ioMiscLatency) : that.ioMiscLatency != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableSchema != null ? tableSchema.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsFetched ^ (rowsFetched >>> 32));
        result = 31 * result + (fetchLatency != null ? fetchLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsInserted ^ (rowsInserted >>> 32));
        result = 31 * result + (insertLatency != null ? insertLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsUpdated ^ (rowsUpdated >>> 32));
        result = 31 * result + (updateLatency != null ? updateLatency.hashCode() : 0);
        result = 31 * result + (int) (rowsDeleted ^ (rowsDeleted >>> 32));
        result = 31 * result + (deleteLatency != null ? deleteLatency.hashCode() : 0);
        result = 31 * result + (ioReadRequests != null ? ioReadRequests.hashCode() : 0);
        result = 31 * result + (ioRead != null ? ioRead.hashCode() : 0);
        result = 31 * result + (ioReadLatency != null ? ioReadLatency.hashCode() : 0);
        result = 31 * result + (ioWriteRequests != null ? ioWriteRequests.hashCode() : 0);
        result = 31 * result + (ioWrite != null ? ioWrite.hashCode() : 0);
        result = 31 * result + (ioWriteLatency != null ? ioWriteLatency.hashCode() : 0);
        result = 31 * result + (ioMiscRequests != null ? ioMiscRequests.hashCode() : 0);
        result = 31 * result + (ioMiscLatency != null ? ioMiscLatency.hashCode() : 0);
        return result;
    }
}
