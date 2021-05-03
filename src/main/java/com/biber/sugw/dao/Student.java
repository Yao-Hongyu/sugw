package com.biber.sugw.dao;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Student implements Serializable {
    @ApiModelProperty(value = "学生id")
    private Integer stdid;

    @ApiModelProperty(value = "学生姓名")
    private String stdname;

    @ApiModelProperty(value = "专业")
    private Integer major;

    @ApiModelProperty(value = "班级")
    private String classnum;

    @ApiModelProperty(value = "qq")
    private String stdqq;

    @ApiModelProperty(value = "手机号")
    private String stdphone;

    @ApiModelProperty(value = "第一志愿")
    private Integer willfirst;

    @ApiModelProperty(value = "第二志愿")
    private Integer willsecond;

    @ApiModelProperty(value = "是否调剂")
    private String isdispensing;

    @ApiModelProperty(value = "第一志愿原因")
    private String reasonfirst;

    @ApiModelProperty(value = "第二志愿原因")
    private String reasonsecond;

    private static final long serialVersionUID = 1L;

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

    public Integer getWillsecond() {
        return willsecond;
    }

    public void setWillsecond(Integer willsecond) {
        this.willsecond = willsecond;
    }

    public String getIsdispensing() {
        return isdispensing;
    }

    public void setIsdispensing(String isdispensing) {
        this.isdispensing = isdispensing;
    }

    public String getReasonfirst() {
        return reasonfirst;
    }

    public void setReasonfirst(String reasonfirst) {
        this.reasonfirst = reasonfirst;
    }

    public String getReasonsecond() {
        return reasonsecond;
    }

    public void setReasonsecond(String reasonsecond) {
        this.reasonsecond = reasonsecond;
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
        sb.append(", willsecond=").append(willsecond);
        sb.append(", isdispensing=").append(isdispensing);
        sb.append(", reasonfirst=").append(reasonfirst);
        sb.append(", reasonsecond=").append(reasonsecond);
        sb.append("]");
        return sb.toString();
    }
}