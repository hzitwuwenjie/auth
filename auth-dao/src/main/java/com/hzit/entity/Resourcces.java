package com.hzit.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/3.
 */
public class Resourcces {
    private Integer rId;
    private String rName;
    private String resurl;
    private Integer resorderno;
    private String redsdes;
    private String createTime;
    private String updateTime;
    private String createMan;
    private String updateMan;
    private Integer parentId;

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

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    public Integer getResorderno() {
        return resorderno;
    }

    public void setResorderno(Integer resorderno) {
        this.resorderno = resorderno;
    }

    public String getRedsdes() {
        return redsdes;
    }

    public void setRedsdes(String redsdes) {
        this.redsdes = redsdes;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Resourcces{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", resurl='" + resurl + '\'' +
                ", resorderno=" + resorderno +
                ", redsdes='" + redsdes + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createMan='" + createMan + '\'' +
                ", updateMan='" + updateMan + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
