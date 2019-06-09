package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$SchemaTablesWithFullTableScansEntity {
    private String objectSchema;

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    private String objectName;

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    private long rowsFullScanned;

    public long getRowsFullScanned() {
        return rowsFullScanned;
    }

    public void setRowsFullScanned(long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    private long latency;

    public long getLatency() {
        return latency;
    }

    public void setLatency(long latency) {
        this.latency = latency;
    }
}
