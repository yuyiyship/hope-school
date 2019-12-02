package com.yship.bean;

import java.util.Date;

public class Classes {
    private Integer id;

    private Integer gradeid;

    private Integer specialtyid;

    private String classname;

    private String classadviser;

    private String classteacher;

    private Integer amount;

    private Integer training;

    private Integer backtraining;

    private Integer quitschool;

    private Integer havejobs;

    private Integer unemployed;

    private Float employmentrate;

    private Integer activities;

    private Integer exceptions;

    private Date createdate;

    private Boolean close;

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

    public Integer getSpecialtyid() {
        return specialtyid;
    }

    public void setSpecialtyid(Integer specialtyid) {
        this.specialtyid = specialtyid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getClassadviser() {
        return classadviser;
    }

    public void setClassadviser(String classadviser) {
        this.classadviser = classadviser == null ? null : classadviser.trim();
    }

    public String getClassteacher() {
        return classteacher;
    }

    public void setClassteacher(String classteacher) {
        this.classteacher = classteacher == null ? null : classteacher.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getTraining() {
        return training;
    }

    public void setTraining(Integer training) {
        this.training = training;
    }

    public Integer getBacktraining() {
        return backtraining;
    }

    public void setBacktraining(Integer backtraining) {
        this.backtraining = backtraining;
    }

    public Integer getQuitschool() {
        return quitschool;
    }

    public void setQuitschool(Integer quitschool) {
        this.quitschool = quitschool;
    }

    public Integer getHavejobs() {
        return havejobs;
    }

    public void setHavejobs(Integer havejobs) {
        this.havejobs = havejobs;
    }

    public Integer getUnemployed() {
        return unemployed;
    }

    public void setUnemployed(Integer unemployed) {
        this.unemployed = unemployed;
    }

    public Float getEmploymentrate() {
        return employmentrate;
    }

    public void setEmploymentrate(Float employmentrate) {
        this.employmentrate = employmentrate;
    }

    public Integer getActivities() {
        return activities;
    }

    public void setActivities(Integer activities) {
        this.activities = activities;
    }

    public Integer getExceptions() {
        return exceptions;
    }

    public void setExceptions(Integer exceptions) {
        this.exceptions = exceptions;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Boolean getClose() {
        return close;
    }

    public void setClose(Boolean close) {
        this.close = close;
    }
}