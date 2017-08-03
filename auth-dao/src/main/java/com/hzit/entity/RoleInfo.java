package com.hzit.entity;

/**
 * Created by Administrator on 2017/8/3.
 */
public class RoleInfo {
    private Integer rId;
    private String rName;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                '}';
    }
}
