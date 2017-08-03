package com.hzit.entity;

/**
 * Created by Administrator on 2017/8/3.
 */
public class Urinfo {
    private  Integer uId;
    private  Integer rId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    @Override
    public String toString() {
        return "Urinfo{" +
                "uId=" + uId +
                ", rId=" + rId +
                '}';
    }
}
