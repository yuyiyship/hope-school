package com.yship.bean;

public class Specialty {
    private Integer id;

    private Integer gradeid;

    private String specialtyname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getSpecialtyname() {
        return specialtyname;
    }

    public void setSpecialtyname(String specialtyname) {
        this.specialtyname = specialtyname == null ? null : specialtyname.trim();
    }
}