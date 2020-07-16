package com.xx;

import com.xx.pojo.KeCheng;
import com.xx.pojo.ZhangJie;

import java.util.List;

public interface KeService {
    List<KeCheng> findAll(String mohu);

    List<ZhangJie> kechenglist(int kid);

    void del(int zid, int kid);

    void add(ZhangJie zhangJie);

    List<ZhangJie> find();

    void dels(int kid);

    void upload(String kname);
}
