package com.hzit.entity;

/**
 * Created by Administrator on 2017/8/3.
 */
public class RoleResource {
    private Integer roleId;
    private Integer resourceId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "RoleResource{" +
                "roleId=" + roleId +
                ", resourceId=" + resourceId +
                '}';
    }
}
