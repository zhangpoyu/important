package com.lst.po;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class X$StatementsWithErrorsOrWarningsEntity {
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    private String db;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    private long execCount;

    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    private long errors;

    public long getErrors() {
        return errors;
    }

    public void setErrors(long errors) {
        this.errors = errors;
    }

    private BigDecimal errorPct;

    public BigDecimal getErrorPct() {
        return errorPct;
    }

    public void setErrorPct(BigDecimal errorPct) {
        this.errorPct = errorPct;
    }

    private long warnings;

    public long getWarnings() {
        return warnings;
    }

    public void setWarnings(long warnings) {
        this.warnings = warnings;
    }

    private BigDecimal warningPct;

    public BigDecimal getWarningPct() {
        return warningPct;
    }

    public void setWarningPct(BigDecimal warningPct) {
        this.warningPct = warningPct;
    }

    private Timestamp firstSeen;

    public Timestamp getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Timestamp firstSeen) {
        this.firstSeen = firstSeen;
    }

    private Timestamp lastSeen;

    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
    }

    private String digest;

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
}
