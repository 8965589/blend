package com.ander.service;


import org.springframework.stereotype.Service;

@Service
public class AspectJService {


    public void save(){

        System.out.println("进入切入点了");
    }
}
