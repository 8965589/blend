package com.ander.controller;


import com.ander.aspect.SysLogService;
import com.ander.service.AspectJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aspectj")
public class AspectJController {
    @Autowired
    AspectJService aspectJService;


    //@SysLogAnnotation("测试注解")
    @RequestMapping("/menthodAnnotation")
    public ResponseEntity menthodAnnotation(){

        aspectJService.save();

        return  ResponseEntity.ok().build();
    }


    @RequestMapping("/noMenthodAnnotation")
    public ResponseEntity noMenthodAnnotation(){
        //System.out.println("调用没有添加SysLogAnnotation注解的方法了");

        aspectJService.save();
        return  ResponseEntity.ok().build();
    }





}
