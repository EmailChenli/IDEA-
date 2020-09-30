package com.example.demo1.controller;

import com.example.demo1.inter.SignDefinte;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Person {

    /*
    * 此时的Sign为默认值
    * empty
    * */
    @SignDefinte
    @Deprecated
    //@Override重写定义
    public  void  empty(){
        System.out.println("\n empty");
    }
    /*
    *定义值属性
    * SiginDefinte
    * */
    @SignDefinte(value = {"chenLi01","chenLi02"})
    public  void someBody(String name,int age){
        System.out.println("\n someBody"+"::name::"+name+"::age::"+age);
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<Person> c = Person.class;
        System.out.println(c);
        Method methodSomeBody = c.getMethod("someBody",new Class[] { String.class, int.class});
        System.out.println(methodSomeBody);
        //System.out.println(methodSomeBody.invoke(person,new Object[]{}));
        methodSomeBody.invoke(person,new Object[]{"lily",18});
        iteratorAnnotations(methodSomeBody);

        Method methodEmpty = c.getMethod("empty",new Class[] {});
        methodEmpty.invoke(person,new Object[]{});
        iteratorAnnotations(methodEmpty);
    }

    public static void iteratorAnnotations(Method method){
        if(method.isAnnotationPresent(SignDefinte.class)){
            SignDefinte signDefinte = method.getAnnotation(SignDefinte.class);
            String[] values = signDefinte.value();
            for (String str: values){
                System.out.println(str+",");
            }
            System.out.println();
        }

        Annotation[] annotations = method.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation);
        }
    }
}
