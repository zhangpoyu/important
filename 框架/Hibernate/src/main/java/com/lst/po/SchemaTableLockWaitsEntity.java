package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "schema_table_lock_waits", schema = "sys", catalog = "")
public class SchemaTableLockWaitsEntity {
    private String objectSchema;
    private String objectName;
    private long waitingThreadId;
    private Long waitingPid;
    private String waitingAccount;
    private String waitingLockType;
    private String waitingLockDuration;
    private String waitingQuery;
    private Long waitingQuerySecs;
    private Long waitingQueryRowsAffected;
    private Long waitingQueryRowsExamined;
    private long blockingThreadId;
    private Long blockingPid;
    private String blockingAccount;
    private String blockingLockType;
    private String blockingLockDuration;
    private String sqlKillBlockingQuery;
    private String sqlKillBlockingConnection;

    @Basic
    @Column(name = "object_schema", nullable = true, length = 64)
    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    @Basic
    @Column(name = "object_name", nullable = true, length = 64)
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Basic
    @Column(name = "waiting_thread_id", nullable = false)
    public long getWaitingThreadId() {
        return waitingThreadId;
    }

    public void setWaitingThreadId(long waitingThreadId) {
        this.waitingThreadId = waitingThreadId;
    }

    @Basic
    @Column(name = "waiting_pid", nullable = true)
    public Long getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    @Basic
    @Column(name = "waiting_account", nullable = true, length = -1)
    public String getWaitingAccount() {
        return waitingAccount;
    }

    public void setWaitingAccount(String waitingAccount) {
        this.waitingAccount = waitingAccount;
    }

    @Basic
    @Column(name = "waiting_lock_type", nullable = false, length = 32)
    public String getWaitingLockType() {
        return waitingLockType;
    }

    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    @Basic
    @Column(name = "waiting_lock_duration", nullable = false, length = 32)
    public String getWaitingLockDuration() {
        return waitingLockDuration;
    }

    public void setWaitingLockDuration(String waitingLockDuration) {
        this.waitingLockDuration = waitingLockDuration;
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
    @Column(name = "waiting_query_secs", nullable = true)
    public Long getWaitingQuerySecs() {
        return waitingQuerySecs;
    }

    public void setWaitingQuerySecs(Long waitingQuerySecs) {
        this.waitingQuerySecs = waitingQuerySecs;
    }

    @Basic
    @Column(name = "waiting_query_rows_affected", nullable = true)
    public Long getWaitingQueryRowsAffected() {
        return waitingQueryRowsAffected;
    }

    public void setWaitingQueryRowsAffected(Long waitingQueryRowsAffected) {
        this.waitingQueryRowsAffected = waitingQueryRowsAffected;
    }

    @Basic
    @Column(name = "waiting_query_rows_examined", nullable = true)
    public Long getWaitingQueryRowsExamined() {
        return waitingQueryRowsExamined;
    }

    public void setWaitingQueryRowsExamined(Long waitingQueryRowsExamined) {
        this.waitingQueryRowsExamined = waitingQueryRowsExamined;
    }

    @Basic
    @Column(name = "blocking_thread_id", nullable = false)
    public long getBlockingThreadId() {
        return blockingThreadId;
    }

    public void setBlockingThreadId(long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    @Basic
    @Column(name = "blocking_pid", nullable = true)
    public Long getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    @Basic
    @Column(name = "blocking_account", nullable = true, length = -1)
    public String getBlockingAccount() {
        return blockingAccount;
    }

    public void setBlockingAccount(String blockingAccount) {
        this.blockingAccount = blockingAccount;
    }

    @Basic
    @Column(name = "blocking_lock_type", nullable = false, length = 32)
    public String getBlockingLockType() {
        return blockingLockType;
    }

    public void setBlockingLockType(String blockingLockType) {
        this.blockingLockType = blockingLockType;
    }

    @Basic
    @Column(name = "blocking_lock_duration", nullable = false, length = 32)
    public String getBlockingLockDuration() {
        return blockingLockDuration;
    }

    public void setBlockingLockDuration(String blockingLockDuration) {
        this.blockingLockDuration = blockingLockDuration;
    }

    @Basic
    @Column(name = "sql_kill_blocking_query", nullable = true, length = 31)
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    @Basic
    @Column(name = "sql_kill_blocking_connection", nullable = true, length = 25)
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

        SchemaTableLockWaitsEntity that = (SchemaTableLockWaitsEntity) o;

        if (waitingThreadId != that.waitingThreadId) return false;
        if (blockingThreadId != that.blockingThreadId) return false;
        if (objectSchema != null ? !objectSchema.equals(that.objectSchema) : that.objectSchema != null) return false;
        if (objectName != null ? !objectName.equals(that.objectName) : that.objectName != null) return false;
        if (waitingPid != null ? !waitingPid.equals(that.waitingPid) : that.waitingPid != null) return false;
        if (waitingAccount != null ? !waitingAccount.equals(that.waitingAccount) : that.waitingAccount != null)
            return false;
        if (waitingLockType != null ? !waitingLockType.equals(that.waitingLockType) : that.waitingLockType != null)
            return false;
        if (waitingLockDuration != null ? !waitingLockDuration.equals(that.waitingLockDuration) : that.waitingLockDuration != null)
            return false;
        if (waitingQuery != null ? !waitingQuery.equals(that.waitingQuery) : that.waitingQuery != null) return false;
        if (waitingQuerySecs != null ? !waitingQuerySecs.equals(that.waitingQuerySecs) : that.waitingQuerySecs != null)
            return false;
        if (waitingQueryRowsAffected != null ? !waitingQueryRowsAffected.equals(that.waitingQueryRowsAffected) : that.waitingQueryRowsAffected != null)
            return false;
        if (waitingQueryRowsExamined != null ? !waitingQueryRowsExamined.equals(that.waitingQueryRowsExamined) : that.waitingQueryRowsExamined != null)
            return false;
        if (blockingPid != null ? !blockingPid.equals(that.blockingPid) : that.blockingPid != null) return false;
        if (blockingAccount != null ? !blockingAccount.equals(that.blockingAccount) : that.blockingAccount != null)
            return false;
        if (blockingLockType != null ? !blockingLockType.equals(that.blockingLockType) : that.blockingLockType != null)
            return false;
        if (blockingLockDuration != null ? !blockingLockDuration.equals(that.blockingLockDuration) : that.blockingLockDuration != null)
            return false;
        if (sqlKillBlockingQuery != null ? !sqlKillBlockingQuery.equals(that.sqlKillBlockingQuery) : that.sqlKillBlockingQuery != null)
            return false;
        if (sqlKillBlockingConnection != null ? !sqlKillBlockingConnection.equals(that.sqlKillBlockingConnection) : that.sqlKillBlockingConnection != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = objectSchema != null ? objectSchema.hashCode() : 0;
        result = 31 * result + (objectName != null ? objectName.hashCode() : 0);
        result = 31 * result + (int) (waitingThreadId ^ (waitingThreadId >>> 32));
        result = 31 * result + (waitingPid != null ? waitingPid.hashCode() : 0);
        result = 31 * result + (waitingAccount != null ? waitingAccount.hashCode() : 0);
        result = 31 * result + (waitingLockType != null ? waitingLockType.hashCode() : 0);
        result = 31 * result + (waitingLockDuration != null ? waitingLockDuration.hashCode() : 0);
        result = 31 * result + (waitingQuery != null ? waitingQuery.hashCode() : 0);
        result = 31 * result + (waitingQuerySecs != null ? waitingQuerySecs.hashCode() : 0);
        result = 31 * result + (waitingQueryRowsAffected != null ? waitingQueryRowsAffected.hashCode() : 0);
        result = 31 * result + (waitingQueryRowsExamined != null ? waitingQueryRowsExamined.hashCode() : 0);
        result = 31 * result + (int) (blockingThreadId ^ (blockingThreadId >>> 32));
        result = 31 * result + (blockingPid != null ? blockingPid.hashCode() : 0);
        result = 31 * result + (blockingAccount != null ? blockingAccount.hashCode() : 0);
        result = 31 * result + (blockingLockType != null ? blockingLockType.hashCode() : 0);
        result = 31 * result + (blockingLockDuration != null ? blockingLockDuration.hashCode() : 0);
        result = 31 * result + (sqlKillBlockingQuery != null ? sqlKillBlockingQuery.hashCode() : 0);
        result = 31 * result + (sqlKillBlockingConnection != null ? sqlKillBlockingConnection.hashCode() : 0);
        return result;
    }
}
