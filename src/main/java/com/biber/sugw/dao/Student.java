package com.biber.sugw.dao;

public class Student {
    private Integer stdid;

    private String stdname;

    private Integer major;

    private String classnum;

    private String stdqq;

    private String stdphone;

    private Integer willfirst;

    private String reasonfirst;

    private Integer willsecond;

    private String reasonsecond;

    private String isdispensing;

    public Integer getStdid() {
        return stdid;
    }

    public void setStdid(Integer stdid) {
        this.stdid = stdid;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getClassnum() {
        return classnum;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public String getStdqq() {
        return stdqq;
    }

    public void setStdqq(String stdqq) {
        this.stdqq = stdqq;
    }

    public String getStdphone() {
        return stdphone;
    }

    public void setStdphone(String stdphone) {
        this.stdphone = stdphone;
    }

    public Integer getWillfirst() {
        return willfirst;
    }

    public void setWillfirst(Integer willfirst) {
        this.willfirst = willfirst;
    }

    public String getReasonfirst() {
        return reasonfirst;
    }

    public void setReasonfirst(String reasonfirst) {
        this.reasonfirst = reasonfirst;
    }

    public Integer getWillsecond() {
        return willsecond;
    }

    public void setWillsecond(Integer willsecond) {
        this.willsecond = willsecond;
    }

    public String getReasonsecond() {
        return reasonsecond;
    }

    public void setReasonsecond(String reasonsecond) {
        this.reasonsecond = reasonsecond;
    }

    public String getIsdispensing() {
        return isdispensing;
    }

    public void setIsdispensing(String isdispensing) {
        this.isdispensing = isdispensing;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stdid=").append(stdid);
        sb.append(", stdname=").append(stdname);
        sb.append(", major=").append(major);
        sb.append(", classnum=").append(classnum);
        sb.append(", stdqq=").append(stdqq);
        sb.append(", stdphone=").append(stdphone);
        sb.append(", willfirst=").append(willfirst);
        sb.append(", reasonfirst=").append(reasonfirst);
        sb.append(", willsecond=").append(willsecond);
        sb.append(", reasonsecond=").append(reasonsecond);
        sb.append(", isdispensing=").append(isdispensing);
        sb.append("]");
        return sb.toString();
    }
}