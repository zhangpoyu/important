package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "innodb_buffer_stats_by_schema", schema = "sys", catalog = "")
public class InnodbBufferStatsBySchemaEntity {
    private String objectSchema;
    private String allocated;
    private String data;
    private long pages;
    private long pagesHashed;
    private long pagesOld;
    private Long rowsCached;

    @Basic
    @Column(name = "object_schema", nullable = true, length = -1)
    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Basic
    @Column(name = "allocated", nullable = true, length = -1)
    public String getAllocated() {
        return allocated;
    }

    public void setAllocated(String allocated) {
        this.allocated = allocated;
    }

    @Basic
    @Column(name = "data", nullable = true, length = -1)
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Basic
    @Column(name = "pages", nullable = false)
    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    @Basic
    @Column(name = "pages_hashed", nullable = false)
    public long getPagesHashed() {
        return pagesHashed;
    }

    public void setPagesHashed(long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    @Basic
    @Column(name = "pages_old", nullable = false)
    public long getPagesOld() {
        return pagesOld;
    }

    public void setPagesOld(long pagesOld) {
        this.pagesOld = pagesOld;
    }

    @Basic
    @Column(name = "rows_cached", nullable = true, precision = 0)
    public Long getRowsCached() {
        return rowsCached;
    }

    public void setRowsCached(Long rowsCached) {
        this.rowsCached = rowsCached;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbBufferStatsBySchemaEntity that = (InnodbBufferStatsBySchemaEntity) o;

        if (pages != that.pages) return false;
        if (pagesHashed != that.pagesHashed) return false;
        if (pagesOld != that.pagesOld) return false;
        if (objectSchema != null ? !objectSchema.equals(that.objectSchema) : that.objectSchema != null) return false;
        if (allocated != null ? !allocated.equals(that.allocated) : that.allocated != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (rowsCached != null ? !rowsCached.equals(that.rowsCached) : that.rowsCached != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = objectSchema != null ? objectSchema.hashCode() : 0;
        result = 31 * result + (allocated != null ? allocated.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (int) (pages ^ (pages >>> 32));
        result = 31 * result + (int) (pagesHashed ^ (pagesHashed >>> 32));
        result = 31 * result + (int) (pagesOld ^ (pagesOld >>> 32));
        result = 31 * result + (rowsCached != null ? rowsCached.hashCode() : 0);
        return result;
    }
}
