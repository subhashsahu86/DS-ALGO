package com.subh.practice.FI_MR_Stream_api;

public class Student {
    Integer sId;
    String name;
    Double fee;
    String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Student(Integer sId, String name, Double fee, String subject) {
        this.sId = sId;
        this.name = name;
        this.subject = subject;
        this.fee = fee;

    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", name='" + name + '\'' +
                ", subject='"+ subject + '\'' +
                ", fee=" + fee +
                '}';
    }
}
