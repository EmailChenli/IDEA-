package com.example.demo1.inter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Inherited //定义可以继承
public @interface Inheritable {
}
