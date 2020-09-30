package com.example.demo1.controller;

import com.example.demo1.inter.Inheritable;

public class InheritableSon extends  InheritableFather {
    public InheritableSon(){
        super();
        System.out.println("是否继承Inheritable接口注解 \n"+InheritableSon.class.isAnnotationPresent(Inheritable.class));
    }

    public static void main(String [] args){
        new InheritableSon();
    }
}
