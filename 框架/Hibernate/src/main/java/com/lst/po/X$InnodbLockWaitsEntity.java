package com.lst.po;

import javax.persistence.Entity;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class X$InnodbLockWaitsEntity {
    private Timestamp waitStarted;

    public Timestamp getWaitStarted() {
        return waitStarted;
    }

    public void setWaitStarted(Timestamp waitStarted) {
        this.waitStarted = waitStarted;
    }

    private Time waitAge;

    public Time getWaitAge() {
        return waitAge;
    }

    public void setWaitAge(Time waitAge) {
        this.waitAge = waitAge;
    }

    private Long waitAgeSecs;

    public Long getWaitAgeSecs() {
        return waitAgeSecs;
    }

    public void setWaitAgeSecs(Long waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    private String lockedTable;

    public String getLockedTable() {
        return lockedTable;
    }

    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    private String lockedIndex;

    public String getLockedIndex() {
        return lockedIndex;
    }

    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    private String lockedType;

    public String getLockedType() {
        return lockedType;
    }

    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    private String waitingTrxId;

    public String getWaitingTrxId() {
        return waitingTrxId;
    }

    public void setWaitingTrxId(String waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    private Timestamp waitingTrxStarted;

    public Timestamp getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    public void setWaitingTrxStarted(Timestamp waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    private Time waitingTrxAge;

    public Time getWaitingTrxAge() {
        return waitingTrxAge;
    }

    public void setWaitingTrxAge(Time waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    private long waitingTrxRowsLocked;

    public long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    public void setWaitingTrxRowsLocked(long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    private long waitingTrxRowsModified;

    public long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    public void setWaitingTrxRowsModified(long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    private long waitingPid;

    public long getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(long waitingPid) {
        this.waitingPid = waitingPid;
    }

    private String waitingQuery;

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    private String waitingLockId;

    public String getWaitingLockId() {
        return waitingLockId;
    }

    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    private String waitingLockMode;

    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    private String blockingTrxId;

    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    private long blockingPid;

    public long getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(long blockingPid) {
        this.blockingPid = blockingPid;
    }

    private String blockingQuery;

    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }

    private String blockingLockId;

    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    private String blockingLockMode;

    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    private Timestamp blockingTrxStarted;

    public Timestamp getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    public void setBlockingTrxStarted(Timestamp blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    private Time blockingTrxAge;

    public Time getBlockingTrxAge() {
        return blockingTrxAge;
    }

    public void setBlockingTrxAge(Time blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    private long blockingTrxRowsLocked;

    public long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    public void setBlockingTrxRowsLocked(long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    private long blockingTrxRowsModified;

    public long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    public void setBlockingTrxRowsModified(long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    private String sqlKillBlockingQuery;

    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    private String sqlKillBlockingConnection;

    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }
}
