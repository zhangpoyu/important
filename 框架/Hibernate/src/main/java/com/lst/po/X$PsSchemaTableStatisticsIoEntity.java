package com.lst.po;

import javax.persistence.Entity;

@Entity
public class X$PsSchemaTableStatisticsIoEntity {
    private String tableSchema;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    private String tableName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private Long countRead;

    public Long getCountRead() {
        return countRead;
    }

    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    private Long sumNumberOfBytesRead;

    public Long getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    public void setSumNumberOfBytesRead(Long sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    private Long sumTimerRead;

    public Long getSumTimerRead() {
        return sumTimerRead;
    }

    public void setSumTimerRead(Long sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    private Long countWrite;

    public Long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    private Long sumNumberOfBytesWrite;

    public Long getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    public void setSumNumberOfBytesWrite(Long sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    private Long sumTimerWrite;

    public Long getSumTimerWrite() {
        return sumTimerWrite;
    }

    public void setSumTimerWrite(Long sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    private Long countMisc;

    public Long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    private Long sumTimerMisc;

    public Long getSumTimerMisc() {
        return sumTimerMisc;
    }

    public void setSumTimerMisc(Long sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }
}
