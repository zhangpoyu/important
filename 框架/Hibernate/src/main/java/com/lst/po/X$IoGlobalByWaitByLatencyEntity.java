package com.lst.po;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class X$IoGlobalByWaitByLatencyEntity {
    private String eventName;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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

    private long avgLatency;

    public long getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
    }

    private long maxLatency;

    public long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }

    private long readLatency;

    public long getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(long readLatency) {
        this.readLatency = readLatency;
    }

    private long writeLatency;

    public long getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(long writeLatency) {
        this.writeLatency = writeLatency;
    }

    private long miscLatency;

    public long getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(long miscLatency) {
        this.miscLatency = miscLatency;
    }

    private long countRead;

    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    private long totalRead;

    public long getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(long totalRead) {
        this.totalRead = totalRead;
    }

    private BigDecimal avgRead;

    public BigDecimal getAvgRead() {
        return avgRead;
    }

    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }

    private long countWrite;

    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    private long totalWritten;

    public long getTotalWritten() {
        return totalWritten;
    }

    public void setTotalWritten(long totalWritten) {
        this.totalWritten = totalWritten;
    }

    private BigDecimal avgWritten;

    public BigDecimal getAvgWritten() {
        return avgWritten;
    }

    public void setAvgWritten(BigDecimal avgWritten) {
        this.avgWritten = avgWritten;
    }
}
