package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "schema_tables_with_full_table_scans", schema = "sys", catalog = "")
public class SchemaTablesWithFullTableScansEntity {
    private String objectSchema;
    private String objectName;
    private long rowsFullScanned;
    private String latency;

    @Basic
    @Column(name = "object_schema", nullable = true, length = 64)
    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Basic
    @Column(name = "object_name", nullable = true, length = 64)
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Basic
    @Column(name = "rows_full_scanned", nullable = false)
    public long getRowsFullScanned() {
        return rowsFullScanned;
    }

    public void setRowsFullScanned(long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    @Basic
    @Column(name = "latency", nullable = true, length = -1)
    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemaTablesWithFullTableScansEntity that = (SchemaTablesWithFullTableScansEntity) o;

        if (rowsFullScanned != that.rowsFullScanned) return false;
        if (objectSchema != null ? !objectSchema.equals(that.objectSchema) : that.objectSchema != null) return false;
        if (objectName != null ? !objectName.equals(that.objectName) : that.objectName != null) return false;
        if (latency != null ? !latency.equals(that.latency) : that.latency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = objectSchema != null ? objectSchema.hashCode() : 0;
        result = 31 * result + (objectName != null ? objectName.hashCode() : 0);
        result = 31 * result + (int) (rowsFullScanned ^ (rowsFullScanned >>> 32));
        result = 31 * result + (latency != null ? latency.hashCode() : 0);
        return result;
    }
}
