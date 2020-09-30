package com.example.demo1.inter;


import java.lang.annotation.*;

@Documented
// @Target(ElementType.TYPE) //指定Anntation接口修饰类型添加如果是类这个就是TYPE类型
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)//标注编译器处理类型
//@Inherited//只可以标注Annotation，标注的Annotation具有继承性
//@Retention(RetentionPolicy.RUNTIME)//只标注Annotation注解接口用于编译器处理使用
public @interface SignDefinte {
  String[] value() default "UnKnow";
}
