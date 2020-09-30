package com.example.demo1.controller;

import com.example.demo1.inter.Inheritable;

@Inheritable
public class InheritableFather {
    public  InheritableFather(){
        System.out.println("My name is InheritableFather\n");
        System.out.println("是否有Interitable Annotation接口\n");
        System.out.println(InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}
