package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "latest_file_io", schema = "sys", catalog = "")
public class LatestFileIoEntity {
    private String thread;
    private String file;
    private String latency;
    private String operation;
    private String requested;

    @Basic
    @Column(name = "thread", nullable = true, length = 149)
    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    @Basic
    @Column(name = "file", nullable = true, length = 512)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Basic
    @Column(name = "latency", nullable = true, length = -1)
    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    @Basic
    @Column(name = "operation", nullable = false, length = 32)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "requested", nullable = true, length = -1)
    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LatestFileIoEntity that = (LatestFileIoEntity) o;

        if (thread != null ? !thread.equals(that.thread) : that.thread != null) return false;
        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (latency != null ? !latency.equals(that.latency) : that.latency != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;
        if (requested != null ? !requested.equals(that.requested) : that.requested != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thread != null ? thread.hashCode() : 0;
        result = 31 * result + (file != null ? file.hashCode() : 0);
        result = 31 * result + (latency != null ? latency.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (requested != null ? requested.hashCode() : 0);
        return result;
    }
}
