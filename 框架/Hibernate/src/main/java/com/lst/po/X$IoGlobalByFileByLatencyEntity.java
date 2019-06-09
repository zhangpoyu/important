package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$IoGlobalByFileByLatencyEntity {
    private String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    private long total;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    private long totalLatency;

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }

    private long countRead;

    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    private long readLatency;

    public long getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(long readLatency) {
        this.readLatency = readLatency;
    }

    private long countWrite;

    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    private long writeLatency;

    public long getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(long writeLatency) {
        this.writeLatency = writeLatency;
    }

    private long countMisc;

    public long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(long countMisc) {
        this.countMisc = countMisc;
    }

    private long miscLatency;

    public long getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(long miscLatency) {
        this.miscLatency = miscLatency;
    }
}
