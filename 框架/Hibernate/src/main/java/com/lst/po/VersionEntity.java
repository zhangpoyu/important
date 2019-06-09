package com.lst.po;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "version", schema = "sys", catalog = "")
public class VersionEntity {
    private String sysVersion;
    private String mysqlVersion;

    @Basic
    @Column(name = "sys_version", nullable = false, length = 5)
    public String getSysVersion() {
        return sysVersion;
    }

    public void setSysVersion(String sysVersion) {
        this.sysVersion = sysVersion;
    }

    @Basic
    @Column(name = "mysql_version", nullable = false, length = 10)
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    public void setMysqlVersion(String mysqlVersion) {
        this.mysqlVersion = mysqlVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionEntity that = (VersionEntity) o;

        if (sysVersion != null ? !sysVersion.equals(that.sysVersion) : that.sysVersion != null) return false;
        if (mysqlVersion != null ? !mysqlVersion.equals(that.mysqlVersion) : that.mysqlVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sysVersion != null ? sysVersion.hashCode() : 0;
        result = 31 * result + (mysqlVersion != null ? mysqlVersion.hashCode() : 0);
        return result;
    }
}
