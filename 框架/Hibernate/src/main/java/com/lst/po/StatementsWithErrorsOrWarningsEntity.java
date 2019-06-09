package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "statements_with_errors_or_warnings", schema = "sys", catalog = "")
public class StatementsWithErrorsOrWarningsEntity {
    private String query;
    private String db;
    private long execCount;
    private long errors;
    private BigDecimal errorPct;
    private long warnings;
    private BigDecimal warningPct;
    private Timestamp firstSeen;
    private Timestamp lastSeen;
    private String digest;

    @Basic
    @Column(name = "query", nullable = true, length = -1)
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
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
    @Column(name = "exec_count", nullable = false)
    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    @Basic
    @Column(name = "errors", nullable = false)
    public long getErrors() {
        return errors;
    }

    public void setErrors(long errors) {
        this.errors = errors;
    }

    @Basic
    @Column(name = "error_pct", nullable = false, precision = 4)
    public BigDecimal getErrorPct() {
        return errorPct;
    }

    public void setErrorPct(BigDecimal errorPct) {
        this.errorPct = errorPct;
    }

    @Basic
    @Column(name = "warnings", nullable = false)
    public long getWarnings() {
        return warnings;
    }

    public void setWarnings(long warnings) {
        this.warnings = warnings;
    }

    @Basic
    @Column(name = "warning_pct", nullable = false, precision = 4)
    public BigDecimal getWarningPct() {
        return warningPct;
    }

    public void setWarningPct(BigDecimal warningPct) {
        this.warningPct = warningPct;
    }

    @Basic
    @Column(name = "first_seen", nullable = false)
    public Timestamp getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Timestamp firstSeen) {
        this.firstSeen = firstSeen;
    }

    @Basic
    @Column(name = "last_seen", nullable = false)
    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Timestamp lastSeen) {
        this.lastSeen = lastSeen;
    }

    @Basic
    @Column(name = "digest", nullable = true, length = 32)
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatementsWithErrorsOrWarningsEntity that = (StatementsWithErrorsOrWarningsEntity) o;

        if (execCount != that.execCount) return false;
        if (errors != that.errors) return false;
        if (warnings != that.warnings) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (db != null ? !db.equals(that.db) : that.db != null) return false;
        if (errorPct != null ? !errorPct.equals(that.errorPct) : that.errorPct != null) return false;
        if (warningPct != null ? !warningPct.equals(that.warningPct) : that.warningPct != null) return false;
        if (firstSeen != null ? !firstSeen.equals(that.firstSeen) : that.firstSeen != null) return false;
        if (lastSeen != null ? !lastSeen.equals(that.lastSeen) : that.lastSeen != null) return false;
        if (digest != null ? !digest.equals(that.digest) : that.digest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = query != null ? query.hashCode() : 0;
        result = 31 * result + (db != null ? db.hashCode() : 0);
        result = 31 * result + (int) (execCount ^ (execCount >>> 32));
        result = 31 * result + (int) (errors ^ (errors >>> 32));
        result = 31 * result + (errorPct != null ? errorPct.hashCode() : 0);
        result = 31 * result + (int) (warnings ^ (warnings >>> 32));
        result = 31 * result + (warningPct != null ? warningPct.hashCode() : 0);
        result = 31 * result + (firstSeen != null ? firstSeen.hashCode() : 0);
        result = 31 * result + (lastSeen != null ? lastSeen.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        return result;
    }
}
