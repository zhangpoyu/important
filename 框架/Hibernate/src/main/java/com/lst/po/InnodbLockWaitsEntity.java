package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "innodb_lock_waits", schema = "sys", catalog = "")
public class InnodbLockWaitsEntity {
    private Timestamp waitStarted;
    private Time waitAge;
    private Long waitAgeSecs;
    private String lockedTable;
    private String lockedIndex;
    private String lockedType;
    private String waitingTrxId;
    private Timestamp waitingTrxStarted;
    private Time waitingTrxAge;
    private long waitingTrxRowsLocked;
    private long waitingTrxRowsModified;
    private long waitingPid;
    private String waitingQuery;
    private String waitingLockId;
    private String waitingLockMode;
    private String blockingTrxId;
    private long blockingPid;
    private String blockingQuery;
    private String blockingLockId;
    private String blockingLockMode;
    private Timestamp blockingTrxStarted;
    private Time blockingTrxAge;
    private long blockingTrxRowsLocked;
    private long blockingTrxRowsModified;
    private String sqlKillBlockingQuery;
    private String sqlKillBlockingConnection;

    @Basic
    @Column(name = "wait_started", nullable = true)
    public Timestamp getWaitStarted() {
        return waitStarted;
    }

    public void setWaitStarted(Timestamp waitStarted) {
        this.waitStarted = waitStarted;
    }

    @Basic
    @Column(name = "wait_age", nullable = true)
    public Time getWaitAge() {
        return waitAge;
    }

    public void setWaitAge(Time waitAge) {
        this.waitAge = waitAge;
    }

    @Basic
    @Column(name = "wait_age_secs", nullable = true)
    public Long getWaitAgeSecs() {
        return waitAgeSecs;
    }

    public void setWaitAgeSecs(Long waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    @Basic
    @Column(name = "locked_table", nullable = false, length = 1024)
    public String getLockedTable() {
        return lockedTable;
    }

    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    @Basic
    @Column(name = "locked_index", nullable = true, length = 1024)
    public String getLockedIndex() {
        return lockedIndex;
    }

    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    @Basic
    @Column(name = "locked_type", nullable = false, length = 32)
    public String getLockedType() {
        return lockedType;
    }

    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    @Basic
    @Column(name = "waiting_trx_id", nullable = false, length = 18)
    public String getWaitingTrxId() {
        return waitingTrxId;
    }

    public void setWaitingTrxId(String waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    @Basic
    @Column(name = "waiting_trx_started", nullable = false)
    public Timestamp getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    public void setWaitingTrxStarted(Timestamp waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    @Basic
    @Column(name = "waiting_trx_age", nullable = true)
    public Time getWaitingTrxAge() {
        return waitingTrxAge;
    }

    public void setWaitingTrxAge(Time waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    @Basic
    @Column(name = "waiting_trx_rows_locked", nullable = false)
    public long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    public void setWaitingTrxRowsLocked(long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    @Basic
    @Column(name = "waiting_trx_rows_modified", nullable = false)
    public long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    public void setWaitingTrxRowsModified(long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    @Basic
    @Column(name = "waiting_pid", nullable = false)
    public long getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(long waitingPid) {
        this.waitingPid = waitingPid;
    }

    @Basic
    @Column(name = "waiting_query", nullable = true, length = -1)
    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    @Basic
    @Column(name = "waiting_lock_id", nullable = false, length = 81)
    public String getWaitingLockId() {
        return waitingLockId;
    }

    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    @Basic
    @Column(name = "waiting_lock_mode", nullable = false, length = 32)
    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    @Basic
    @Column(name = "blocking_trx_id", nullable = false, length = 18)
    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    @Basic
    @Column(name = "blocking_pid", nullable = false)
    public long getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(long blockingPid) {
        this.blockingPid = blockingPid;
    }

    @Basic
    @Column(name = "blocking_query", nullable = true, length = -1)
    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }

    @Basic
    @Column(name = "blocking_lock_id", nullable = false, length = 81)
    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    @Basic
    @Column(name = "blocking_lock_mode", nullable = false, length = 32)
    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    @Basic
    @Column(name = "blocking_trx_started", nullable = false)
    public Timestamp getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    public void setBlockingTrxStarted(Timestamp blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    @Basic
    @Column(name = "blocking_trx_age", nullable = true)
    public Time getBlockingTrxAge() {
        return blockingTrxAge;
    }

    public void setBlockingTrxAge(Time blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    @Basic
    @Column(name = "blocking_trx_rows_locked", nullable = false)
    public long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    public void setBlockingTrxRowsLocked(long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    @Basic
    @Column(name = "blocking_trx_rows_modified", nullable = false)
    public long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    public void setBlockingTrxRowsModified(long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    @Basic
    @Column(name = "sql_kill_blocking_query", nullable = true, length = 32)
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    @Basic
    @Column(name = "sql_kill_blocking_connection", nullable = true, length = 26)
    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InnodbLockWaitsEntity that = (InnodbLockWaitsEntity) o;

        if (waitingTrxRowsLocked != that.waitingTrxRowsLocked) return false;
        if (waitingTrxRowsModified != that.waitingTrxRowsModified) return false;
        if (waitingPid != that.waitingPid) return false;
        if (blockingPid != that.blockingPid) return false;
        if (blockingTrxRowsLocked != that.blockingTrxRowsLocked) return false;
        if (blockingTrxRowsModified != that.blockingTrxRowsModified) return false;
        if (waitStarted != null ? !waitStarted.equals(that.waitStarted) : that.waitStarted != null) return false;
        if (waitAge != null ? !waitAge.equals(that.waitAge) : that.waitAge != null) return false;
        if (waitAgeSecs != null ? !waitAgeSecs.equals(that.waitAgeSecs) : that.waitAgeSecs != null) return false;
        if (lockedTable != null ? !lockedTable.equals(that.lockedTable) : that.lockedTable != null) return false;
        if (lockedIndex != null ? !lockedIndex.equals(that.lockedIndex) : that.lockedIndex != null) return false;
        if (lockedType != null ? !lockedType.equals(that.lockedType) : that.lockedType != null) return false;
        if (waitingTrxId != null ? !waitingTrxId.equals(that.waitingTrxId) : that.waitingTrxId != null) return false;
        if (waitingTrxStarted != null ? !waitingTrxStarted.equals(that.waitingTrxStarted) : that.waitingTrxStarted != null)
            return false;
        if (waitingTrxAge != null ? !waitingTrxAge.equals(that.waitingTrxAge) : that.waitingTrxAge != null)
            return false;
        if (waitingQuery != null ? !waitingQuery.equals(that.waitingQuery) : that.waitingQuery != null) return false;
        if (waitingLockId != null ? !waitingLockId.equals(that.waitingLockId) : that.waitingLockId != null)
            return false;
        if (waitingLockMode != null ? !waitingLockMode.equals(that.waitingLockMode) : that.waitingLockMode != null)
            return false;
        if (blockingTrxId != null ? !blockingTrxId.equals(that.blockingTrxId) : that.blockingTrxId != null)
            return false;
        if (blockingQuery != null ? !blockingQuery.equals(that.blockingQuery) : that.blockingQuery != null)
            return false;
        if (blockingLockId != null ? !blockingLockId.equals(that.blockingLockId) : that.blockingLockId != null)
            return false;
        if (blockingLockMode != null ? !blockingLockMode.equals(that.blockingLockMode) : that.blockingLockMode != null)
            return false;
        if (blockingTrxStarted != null ? !blockingTrxStarted.equals(that.blockingTrxStarted) : that.blockingTrxStarted != null)
            return false;
        if (blockingTrxAge != null ? !blockingTrxAge.equals(that.blockingTrxAge) : that.blockingTrxAge != null)
            return false;
        if (sqlKillBlockingQuery != null ? !sqlKillBlockingQuery.equals(that.sqlKillBlockingQuery) : that.sqlKillBlockingQuery != null)
            return false;
        if (sqlKillBlockingConnection != null ? !sqlKillBlockingConnection.equals(that.sqlKillBlockingConnection) : that.sqlKillBlockingConnection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = waitStarted != null ? waitStarted.hashCode() : 0;
        result = 31 * result + (waitAge != null ? waitAge.hashCode() : 0);
        result = 31 * result + (waitAgeSecs != null ? waitAgeSecs.hashCode() : 0);
        result = 31 * result + (lockedTable != null ? lockedTable.hashCode() : 0);
        result = 31 * result + (lockedIndex != null ? lockedIndex.hashCode() : 0);
        result = 31 * result + (lockedType != null ? lockedType.hashCode() : 0);
        result = 31 * result + (waitingTrxId != null ? waitingTrxId.hashCode() : 0);
        result = 31 * result + (waitingTrxStarted != null ? waitingTrxStarted.hashCode() : 0);
        result = 31 * result + (waitingTrxAge != null ? waitingTrxAge.hashCode() : 0);
        result = 31 * result + (int) (waitingTrxRowsLocked ^ (waitingTrxRowsLocked >>> 32));
        result = 31 * result + (int) (waitingTrxRowsModified ^ (waitingTrxRowsModified >>> 32));
        result = 31 * result + (int) (waitingPid ^ (waitingPid >>> 32));
        result = 31 * result + (waitingQuery != null ? waitingQuery.hashCode() : 0);
        result = 31 * result + (waitingLockId != null ? waitingLockId.hashCode() : 0);
        result = 31 * result + (waitingLockMode != null ? waitingLockMode.hashCode() : 0);
        result = 31 * result + (blockingTrxId != null ? blockingTrxId.hashCode() : 0);
        result = 31 * result + (int) (blockingPid ^ (blockingPid >>> 32));
        result = 31 * result + (blockingQuery != null ? blockingQuery.hashCode() : 0);
        result = 31 * result + (blockingLockId != null ? blockingLockId.hashCode() : 0);
        result = 31 * result + (blockingLockMode != null ? blockingLockMode.hashCode() : 0);
        result = 31 * result + (blockingTrxStarted != null ? blockingTrxStarted.hashCode() : 0);
        result = 31 * result + (blockingTrxAge != null ? blockingTrxAge.hashCode() : 0);
        result = 31 * result + (int) (blockingTrxRowsLocked ^ (blockingTrxRowsLocked >>> 32));
        result = 31 * result + (int) (blockingTrxRowsModified ^ (blockingTrxRowsModified >>> 32));
        result = 31 * result + (sqlKillBlockingQuery != null ? sqlKillBlockingQuery.hashCode() : 0);
        result = 31 * result + (sqlKillBlockingConnection != null ? sqlKillBlockingConnection.hashCode() : 0);
        return result;
    }
}
