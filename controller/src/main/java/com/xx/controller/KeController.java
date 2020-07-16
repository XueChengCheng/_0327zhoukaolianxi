package com.xx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.xx.KeService;
import com.xx.pojo.KeCheng;
import com.xx.pojo.ZhangJie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin

public class KeController {
     @Reference
    private KeService keService;
     @GetMapping("findAll")
    public List<KeCheng> findAll(String mohu){
         return this.keService.findAll(mohu);
     }

     @GetMapping("zhangjielist")
    public List<ZhangJie> kechenglist(int kid){
         return this.keService.kechenglist(kid);
     }
     @GetMapping("del")
    public void del(int zid,int kid){
         this.keService.del(zid,kid);
     }

     @PostMapping("add")
    public void add(@RequestBody ZhangJie zhangJie){
         this.keService.add(zhangJie);
     }

     @RequestMapping("find")
    @ResponseBody
    public  List<ZhangJie> find(){
         return this.keService.find();
     }

     @GetMapping("dels")
    public void dels(int kid){
    this.keService.dels(kid);
     }

     @GetMapping("upload")
    public void upload(String kname){
         this.keService.upload(kname);
     }
}
