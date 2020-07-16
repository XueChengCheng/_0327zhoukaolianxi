package com.xx.pojo;

import java.io.Serializable;

public class KeCheng implements Serializable {
    private Long kid;
    private Integer knum;
    private Integer kprice;
    private Integer ktime;
    private String kname;
    private String ktype;

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public Integer getKnum() {
        return knum;
    }

    public void setKnum(Integer knum) {
        this.knum = knum;
    }

    public Integer getKprice() {
        return kprice;
    }

    public void setKprice(Integer kprice) {
        this.kprice = kprice;
    }

    public Integer getKtime() {
        return ktime;
    }

    public void setKtime(Integer ktime) {
        this.ktime = ktime;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public String getKtype() {
        return ktype;
    }

    public void setKtype(String ktype) {
        this.ktype = ktype;
    }
}
