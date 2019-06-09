package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "schema_redundant_indexes", schema = "sys", catalog = "")
public class SchemaRedundantIndexesEntity {
    private String tableSchema;
    private String tableName;
    private String redundantIndexName;
    private String redundantIndexColumns;
    private Long redundantIndexNonUnique;
    private String dominantIndexName;
    private String dominantIndexColumns;
    private Long dominantIndexNonUnique;
    private int subpartExists;
    private String sqlDropIndex;

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
    @Column(name = "redundant_index_name", nullable = false, length = 64)
    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName;
    }

    @Basic
    @Column(name = "redundant_index_columns", nullable = true, length = -1)
    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns;
    }

    @Basic
    @Column(name = "redundant_index_non_unique", nullable = true)
    public Long getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    public void setRedundantIndexNonUnique(Long redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    @Basic
    @Column(name = "dominant_index_name", nullable = false, length = 64)
    public String getDominantIndexName() {
        return dominantIndexName;
    }

    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName;
    }

    @Basic
    @Column(name = "dominant_index_columns", nullable = true, length = -1)
    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns;
    }

    @Basic
    @Column(name = "dominant_index_non_unique", nullable = true)
    public Long getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    public void setDominantIndexNonUnique(Long dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    @Basic
    @Column(name = "subpart_exists", nullable = false)
    public int getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(int subpartExists) {
        this.subpartExists = subpartExists;
    }

    @Basic
    @Column(name = "sql_drop_index", nullable = true, length = 223)
    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SchemaRedundantIndexesEntity that = (SchemaRedundantIndexesEntity) o;

        if (subpartExists != that.subpartExists) return false;
        if (tableSchema != null ? !tableSchema.equals(that.tableSchema) : that.tableSchema != null) return false;
        if (tableName != null ? !tableName.equals(that.tableName) : that.tableName != null) return false;
        if (redundantIndexName != null ? !redundantIndexName.equals(that.redundantIndexName) : that.redundantIndexName != null)
            return false;
        if (redundantIndexColumns != null ? !redundantIndexColumns.equals(that.redundantIndexColumns) : that.redundantIndexColumns != null)
            return false;
        if (redundantIndexNonUnique != null ? !redundantIndexNonUnique.equals(that.redundantIndexNonUnique) : that.redundantIndexNonUnique != null)
            return false;
        if (dominantIndexName != null ? !dominantIndexName.equals(that.dominantIndexName) : that.dominantIndexName != null)
            return false;
        if (dominantIndexColumns != null ? !dominantIndexColumns.equals(that.dominantIndexColumns) : that.dominantIndexColumns != null)
            return false;
        if (dominantIndexNonUnique != null ? !dominantIndexNonUnique.equals(that.dominantIndexNonUnique) : that.dominantIndexNonUnique != null)
            return false;
        if (sqlDropIndex != null ? !sqlDropIndex.equals(that.sqlDropIndex) : that.sqlDropIndex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tableSchema != null ? tableSchema.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (redundantIndexName != null ? redundantIndexName.hashCode() : 0);
        result = 31 * result + (redundantIndexColumns != null ? redundantIndexColumns.hashCode() : 0);
        result = 31 * result + (redundantIndexNonUnique != null ? redundantIndexNonUnique.hashCode() : 0);
        result = 31 * result + (dominantIndexName != null ? dominantIndexName.hashCode() : 0);
        result = 31 * result + (dominantIndexColumns != null ? dominantIndexColumns.hashCode() : 0);
        result = 31 * result + (dominantIndexNonUnique != null ? dominantIndexNonUnique.hashCode() : 0);
        result = 31 * result + subpartExists;
        result = 31 * result + (sqlDropIndex != null ? sqlDropIndex.hashCode() : 0);
        return result;
    }
}
