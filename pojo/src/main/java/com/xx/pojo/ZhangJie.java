package com.xx.pojo;

import java.io.Serializable;

public class ZhangJie implements Serializable {
    private Long zid;
    private Integer kid;
    private String zname;
    private String zcontent;
    private String ztime;

    public Long getZid() {
        return zid;
    }

    public void setZid(Long zid) {
        this.zid = zid;
    }

    public Integer getKid() {
        return kid;
    }

    public void setKid(Integer kid) {
        this.kid = kid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getZcontent() {
        return zcontent;
    }

    public void setZcontent(String zcontent) {
        this.zcontent = zcontent;
    }

    public String getZtime() {
        return ztime;
    }

    public void setZtime(String ztime) {
        this.ztime = ztime;
    }
}
