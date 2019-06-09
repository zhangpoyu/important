package com.yingjun.test.model;

public class OtherList {
    private Integer id;

    private String name;

    private String number;

    private String carNumber;

    private String unruleRecord;

    private String unruleReason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getUnruleRecord() {
        return unruleRecord;
    }

    public void setUnruleRecord(String unruleRecord) {
        this.unruleRecord = unruleRecord == null ? null : unruleRecord.trim();
    }

    public String getUnruleReason() {
        return unruleReason;
    }

    public void setUnruleReason(String unruleReason) {
        this.unruleReason = unruleReason == null ? null : unruleReason.trim();
    }
}