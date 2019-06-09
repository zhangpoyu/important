package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wait_classes_global_by_avg_latency", schema = "sys", catalog = "")
public class WaitClassesGlobalByAvgLatencyEntity {
    private String eventClass;
    private Long total;
    private String totalLatency;
    private String minLatency;
    private String avgLatency;
    private String maxLatency;

    @Basic
    @Column(name = "event_class", nullable = true, length = 128)
    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    @Basic
    @Column(name = "total", nullable = true, precision = 0)
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
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
    @Column(name = "min_latency", nullable = true, length = -1)
    public String getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency;
    }

    @Basic
    @Column(name = "avg_latency", nullable = true, length = -1)
    public String getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    @Basic
    @Column(name = "max_latency", nullable = true, length = -1)
    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WaitClassesGlobalByAvgLatencyEntity that = (WaitClassesGlobalByAvgLatencyEntity) o;

        if (eventClass != null ? !eventClass.equals(that.eventClass) : that.eventClass != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (totalLatency != null ? !totalLatency.equals(that.totalLatency) : that.totalLatency != null) return false;
        if (minLatency != null ? !minLatency.equals(that.minLatency) : that.minLatency != null) return false;
        if (avgLatency != null ? !avgLatency.equals(that.avgLatency) : that.avgLatency != null) return false;
        if (maxLatency != null ? !maxLatency.equals(that.maxLatency) : that.maxLatency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventClass != null ? eventClass.hashCode() : 0;
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (totalLatency != null ? totalLatency.hashCode() : 0);
        result = 31 * result + (minLatency != null ? minLatency.hashCode() : 0);
        result = 31 * result + (avgLatency != null ? avgLatency.hashCode() : 0);
        result = 31 * result + (maxLatency != null ? maxLatency.hashCode() : 0);
        return result;
    }
}
