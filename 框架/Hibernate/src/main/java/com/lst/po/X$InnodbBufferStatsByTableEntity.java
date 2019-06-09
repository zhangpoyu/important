package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$InnodbBufferStatsByTableEntity {
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

    private Long allocated;

    public Long getAllocated() {
        return allocated;
    }

    public void setAllocated(Long allocated) {
        this.allocated = allocated;
    }

    private Long data;

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    private long pages;

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    private long pagesHashed;

    public long getPagesHashed() {
        return pagesHashed;
    }

    public void setPagesHashed(long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    private long pagesOld;

    public long getPagesOld() {
        return pagesOld;
    }

    public void setPagesOld(long pagesOld) {
        this.pagesOld = pagesOld;
    }

    private long rowsCached;

    public long getRowsCached() {
        return rowsCached;
    }

    public void setRowsCached(long rowsCached) {
        this.rowsCached = rowsCached;
    }
}
