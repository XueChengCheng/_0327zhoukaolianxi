package com.xx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xx.KeService;
import com.xx.mapper.KeChengMapper;
import com.xx.pojo.KeCheng;
import com.xx.pojo.ZhangJie;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class KeServiceImpl implements KeService {
    @Autowired
    private KeChengMapper keChengMapper;
    @Override
    public List<KeCheng> findAll(String mohu) {
        return this.keChengMapper.findAll(mohu);
    }

    @Override
    public List<ZhangJie> kechenglist(int kid) {
        return this.keChengMapper.kechenglist(kid);
    }

    @Override
    public void del(int zid, int kid) {
        this.keChengMapper.upkechengjian(kid);
        this.keChengMapper.del(zid);
    }

    @Override
    public void add(ZhangJie zhangJie) {
        this.keChengMapper.add(zhangJie);
        this.keChengMapper.upkechengjia(zhangJie.getKid());
    }

    @Override
    public List<ZhangJie> find() {
        return this.keChengMapper.find();
    }

    @Override
    public void dels(int kid) {
         this.keChengMapper.dels(kid);
    }

    @Override
    public void upload(String kname) {
        this.keChengMapper.upload(kname);
    }
}
