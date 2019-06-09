package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "schema_auto_increment_columns", schema = "sys", catalog = "")
public class SchemaAutoIncrementColumnsEntity {
    private String tableSchema;
    private String tableName;
    private String columnName;
    private String dataType;
    private String columnType;
    private int isSigned;
    private int isUnsigned;
    private Long maxValue;
    private Long autoIncrement;
    private BigDecimal autoIncrementRatio;

    @Basic
    @Column(name = "table_schema", nullable = false, length = 64)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "table_name", nullable = false, length = 64)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "column_name", nullable = false, length = 64)
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "data_type", nullable = false, length = 64)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "column_type", nullable = false, length = -1)
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Basic
    @Column(name = "is_signed", nullable = false)
    public int getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(int isSigned) {
        this.isSigned = isSigned;
    }

    @Basic
    @Column(name = "is_unsigned", nullable = false)
    public int getIsUnsigned() {
        return isUnsigned;
    }

    public void setIsUnsigned(int isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    @Basic
    @Column(name = "max_value", nullable = true)
    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    @Basic
    @Column(name = "auto_increment", nullable = true)
    public Long getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Basic
    @Column(name = "auto_increment_ratio", nullable = true, precision = 4)
    public BigDecimal getAutoIncrementRatio() {
        return autoIncrementRatio;
    }

    public void setAutoIncrementRatio(BigDecimal autoIncrementRatio) {
        this.autoIncrementRatio = autoIncrementRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemaAutoIncrementColumnsEntity that = (SchemaAutoIncrementColumnsEntity) o;

        if (isSigned != that.isSigned) return false;
        if (isUnsigned != that.isUnsigned) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (columnName != null ? !columnName.equals(that.columnName) : that.columnName != null) return false;
        if (dataType != null ? !dataType.equals(that.dataType) : that.dataType != null) return false;
        if (columnType != null ? !columnType.equals(that.columnType) : that.columnType != null) return false;
        if (maxValue != null ? !maxValue.equals(that.maxValue) : that.maxValue != null) return false;
        if (autoIncrement != null ? !autoIncrement.equals(that.autoIncrement) : that.autoIncrement != null)
            return false;
        if (autoIncrementRatio != null ? !autoIncrementRatio.equals(that.autoIncrementRatio) : that.autoIncrementRatio != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableSchema != null ? tableSchema.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (columnName != null ? columnName.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (columnType != null ? columnType.hashCode() : 0);
        result = 31 * result + isSigned;
        result = 31 * result + isUnsigned;
        result = 31 * result + (maxValue != null ? maxValue.hashCode() : 0);
        result = 31 * result + (autoIncrement != null ? autoIncrement.hashCode() : 0);
        result = 31 * result + (autoIncrementRatio != null ? autoIncrementRatio.hashCode() : 0);
        return result;
    }
}
