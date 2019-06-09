package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "session", schema = "sys", catalog = "")
public class SessionEntity {
    private long thdId;
    private Long connId;
    private String user;
    private String db;
    private String command;
    private String state;
    private Long time;
    private String currentStatement;
    private String statementLatency;
    private BigDecimal progress;
    private String lockLatency;
    private Long rowsExamined;
    private Long rowsSent;
    private Long rowsAffected;
    private Long tmpTables;
    private Long tmpDiskTables;
    private String fullScan;
    private String lastStatement;
    private String lastStatementLatency;
    private String currentMemory;
    private String lastWait;
    private String lastWaitLatency;
    private String source;
    private String trxLatency;
    private Object trxState;
    private Object trxAutocommit;
    private String pid;
    private String programName;

    @Basic
    @Column(name = "thd_id", nullable = false)
    public long getThdId() {
        return thdId;
    }

    public void setThdId(long thdId) {
        this.thdId = thdId;
    }

    @Basic
    @Column(name = "conn_id", nullable = true)
    public Long getConnId() {
        return connId;
    }

    public void setConnId(Long connId) {
        this.connId = connId;
    }

    @Basic
    @Column(name = "user", nullable = true, length = 128)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "db", nullable = true, length = 64)
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Basic
    @Column(name = "command", nullable = true, length = 16)
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 64)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Basic
    @Column(name = "current_statement", nullable = true, length = -1)
    public String getCurrentStatement() {
        return currentStatement;
    }

    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    @Basic
    @Column(name = "statement_latency", nullable = true, length = -1)
    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    @Basic
    @Column(name = "progress", nullable = true, precision = 2)
    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    @Basic
    @Column(name = "lock_latency", nullable = true, length = -1)
    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    @Basic
    @Column(name = "rows_examined", nullable = true)
    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    @Basic
    @Column(name = "rows_sent", nullable = true)
    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    @Basic
    @Column(name = "rows_affected", nullable = true)
    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Basic
    @Column(name = "tmp_tables", nullable = true)
    public Long getTmpTables() {
        return tmpTables;
    }

    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    @Basic
    @Column(name = "tmp_disk_tables", nullable = true)
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    @Basic
    @Column(name = "full_scan", nullable = false, length = 3)
    public String getFullScan() {
        return fullScan;
    }

    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    @Basic
    @Column(name = "last_statement", nullable = true, length = -1)
    public String getLastStatement() {
        return lastStatement;
    }

    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }

    @Basic
    @Column(name = "last_statement_latency", nullable = true, length = -1)
    public String getLastStatementLatency() {
        return lastStatementLatency;
    }

    public void setLastStatementLatency(String lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    @Basic
    @Column(name = "current_memory", nullable = true, length = -1)
    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    @Basic
    @Column(name = "last_wait", nullable = true, length = 128)
    public String getLastWait() {
        return lastWait;
    }

    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }

    @Basic
    @Column(name = "last_wait_latency", nullable = true, length = -1)
    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }

    @Basic
    @Column(name = "source", nullable = true, length = 64)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "trx_latency", nullable = true, length = -1)
    public String getTrxLatency() {
        return trxLatency;
    }

    public void setTrxLatency(String trxLatency) {
        this.trxLatency = trxLatency;
    }

    @Basic
    @Column(name = "trx_state", nullable = true)
    public Object getTrxState() {
        return trxState;
    }

    public void setTrxState(Object trxState) {
        this.trxState = trxState;
    }

    @Basic
    @Column(name = "trx_autocommit", nullable = true)
    public Object getTrxAutocommit() {
        return trxAutocommit;
    }

    public void setTrxAutocommit(Object trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }

    @Basic
    @Column(name = "pid", nullable = true, length = 1024)
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "program_name", nullable = true, length = 1024)
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SessionEntity that = (SessionEntity) o;

        if (thdId != that.thdId) return false;
        if (connId != null ? !connId.equals(that.connId) : that.connId != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (db != null ? !db.equals(that.db) : that.db != null) return false;
        if (command != null ? !command.equals(that.command) : that.command != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (currentStatement != null ? !currentStatement.equals(that.currentStatement) : that.currentStatement != null)
            return false;
        if (statementLatency != null ? !statementLatency.equals(that.statementLatency) : that.statementLatency != null)
            return false;
        if (progress != null ? !progress.equals(that.progress) : that.progress != null) return false;
        if (lockLatency != null ? !lockLatency.equals(that.lockLatency) : that.lockLatency != null) return false;
        if (rowsExamined != null ? !rowsExamined.equals(that.rowsExamined) : that.rowsExamined != null) return false;
        if (rowsSent != null ? !rowsSent.equals(that.rowsSent) : that.rowsSent != null) return false;
        if (rowsAffected != null ? !rowsAffected.equals(that.rowsAffected) : that.rowsAffected != null) return false;
        if (tmpTables != null ? !tmpTables.equals(that.tmpTables) : that.tmpTables != null) return false;
        if (tmpDiskTables != null ? !tmpDiskTables.equals(that.tmpDiskTables) : that.tmpDiskTables != null)
            return false;
        if (fullScan != null ? !fullScan.equals(that.fullScan) : that.fullScan != null) return false;
        if (lastStatement != null ? !lastStatement.equals(that.lastStatement) : that.lastStatement != null)
            return false;
        if (lastStatementLatency != null ? !lastStatementLatency.equals(that.lastStatementLatency) : that.lastStatementLatency != null)
            return false;
        if (currentMemory != null ? !currentMemory.equals(that.currentMemory) : that.currentMemory != null)
            return false;
        if (lastWait != null ? !lastWait.equals(that.lastWait) : that.lastWait != null) return false;
        if (lastWaitLatency != null ? !lastWaitLatency.equals(that.lastWaitLatency) : that.lastWaitLatency != null)
            return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (trxLatency != null ? !trxLatency.equals(that.trxLatency) : that.trxLatency != null) return false;
        if (trxState != null ? !trxState.equals(that.trxState) : that.trxState != null) return false;
        if (trxAutocommit != null ? !trxAutocommit.equals(that.trxAutocommit) : that.trxAutocommit != null)
            return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (programName != null ? !programName.equals(that.programName) : that.programName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (thdId ^ (thdId >>> 32));
        result = 31 * result + (connId != null ? connId.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (db != null ? db.hashCode() : 0);
        result = 31 * result + (command != null ? command.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (currentStatement != null ? currentStatement.hashCode() : 0);
        result = 31 * result + (statementLatency != null ? statementLatency.hashCode() : 0);
        result = 31 * result + (progress != null ? progress.hashCode() : 0);
        result = 31 * result + (lockLatency != null ? lockLatency.hashCode() : 0);
        result = 31 * result + (rowsExamined != null ? rowsExamined.hashCode() : 0);
        result = 31 * result + (rowsSent != null ? rowsSent.hashCode() : 0);
        result = 31 * result + (rowsAffected != null ? rowsAffected.hashCode() : 0);
        result = 31 * result + (tmpTables != null ? tmpTables.hashCode() : 0);
        result = 31 * result + (tmpDiskTables != null ? tmpDiskTables.hashCode() : 0);
        result = 31 * result + (fullScan != null ? fullScan.hashCode() : 0);
        result = 31 * result + (lastStatement != null ? lastStatement.hashCode() : 0);
        result = 31 * result + (lastStatementLatency != null ? lastStatementLatency.hashCode() : 0);
        result = 31 * result + (currentMemory != null ? currentMemory.hashCode() : 0);
        result = 31 * result + (lastWait != null ? lastWait.hashCode() : 0);
        result = 31 * result + (lastWaitLatency != null ? lastWaitLatency.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (trxLatency != null ? trxLatency.hashCode() : 0);
        result = 31 * result + (trxState != null ? trxState.hashCode() : 0);
        result = 31 * result + (trxAutocommit != null ? trxAutocommit.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (programName != null ? programName.hashCode() : 0);
        return result;
    }
}
