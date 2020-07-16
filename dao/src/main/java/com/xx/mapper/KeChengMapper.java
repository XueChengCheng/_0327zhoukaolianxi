package com.xx.mapper;

import com.xx.pojo.KeCheng;
import com.xx.pojo.ZhangJie;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface KeChengMapper {
    List<KeCheng> findAll(@Param("mohu") String mohu);

    List<ZhangJie> kechenglist(@Param("kid") int kid);

    void upkechengjian(@Param("kid") int kid);

    void del(@Param("zid") int zid);

    void add(@Param("z") ZhangJie zhangJie);

    void upkechengjia(@Param("kid") Integer kid);

    List<ZhangJie> find();

    void dels(@Param("k") int kid);

    void upload(@Param("k") String kname);
}
