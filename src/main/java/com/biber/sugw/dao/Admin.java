package com.biber.sugw.dao;

import io.swagger.annotations.ApiModelProperty;

public class Admin {
    @ApiModelProperty(value = "管理员id")
    private Integer id;

    @ApiModelProperty(value = "管理员用户名")
    private String username;

    @ApiModelProperty(value = "管理员密码")
    private String password;

    @ApiModelProperty(value = "角色")
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", role=").append(role);
        sb.append("]");
        return sb.toString();
    }
}