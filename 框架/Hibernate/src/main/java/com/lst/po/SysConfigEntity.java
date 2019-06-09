package com.lst.po;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_config", schema = "sys", catalog = "")
public class SysConfigEntity {
    private String variable;
    private String value;
    private Timestamp setTime;
    private String setBy;

    @Id
    @Column(name = "variable", nullable = false, length = 128)
    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Basic
    @Column(name = "value", nullable = true, length = 128)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "set_time", nullable = false)
    public Timestamp getSetTime() {
        return setTime;
    }

    public void setSetTime(Timestamp setTime) {
        this.setTime = setTime;
    }

    @Basic
    @Column(name = "set_by", nullable = true, length = 128)
    public String getSetBy() {
        return setBy;
    }

    public void setSetBy(String setBy) {
        this.setBy = setBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysConfigEntity that = (SysConfigEntity) o;

        if (variable != null ? !variable.equals(that.variable) : that.variable != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (setTime != null ? !setTime.equals(that.setTime) : that.setTime != null) return false;
        if (setBy != null ? !setBy.equals(that.setBy) : that.setBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = variable != null ? variable.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (setTime != null ? setTime.hashCode() : 0);
        result = 31 * result + (setBy != null ? setBy.hashCode() : 0);
        return result;
    }
}
