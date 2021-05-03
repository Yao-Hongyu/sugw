package com.biber.sugw.dao;

import io.swagger.annotations.ApiModelProperty;

public class Organization {
    @ApiModelProperty(value = "组织id")
    private Integer orgid;

    @ApiModelProperty(value = "组织名")
    private String orgname;

    @ApiModelProperty(value = "部门名")
    private String branchname;

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