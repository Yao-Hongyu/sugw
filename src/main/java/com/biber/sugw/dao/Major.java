package com.biber.sugw.dao;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Major implements Serializable {
    @ApiModelProperty(value = "专业id")
    private Integer majorid;

    @ApiModelProperty(value = "专业名")
    private String majorname;

    private static final long serialVersionUID = 1L;

    public Integer getMajorid() {
        return majorid;
    }

    public void setMajorid(Integer majorid) {
        this.majorid = majorid;
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorid=").append(majorid);
        sb.append(", majorname=").append(majorname);
        sb.append("]");
        return sb.toString();
    }
}