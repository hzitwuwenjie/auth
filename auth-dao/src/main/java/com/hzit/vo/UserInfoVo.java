package com.hzit.vo;

/**
 * Created by Administrator on 2017/8/3.
 */
public class UserInfoVo {
    private Integer uid;
    private String uname;
    private String upass;
    private String ustatus;
    private String createTime;
    private String rname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", ustatus='" + ustatus + '\'' +
                ", createTime='" + createTime + '\'' +
                ", rname='" + rname + '\'' +
                '}';
    }
}
