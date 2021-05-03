package com.biber.sugw.dao;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Organization implements Serializable {
    @ApiModelProperty(value = "组织id")
    private Integer orgid;

    @ApiModelProperty(value = "组织名称")
    private String orgname;

    @ApiModelProperty(value = "下属部门名称")
    private String branchname;

    private static final long serialVersionUID = 1L;

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgid=").append(orgid);
        sb.append(", orgname=").append(orgname);
        sb.append(", branchname=").append(branchname);
        sb.append("]");
        return sb.toString();
    }
}