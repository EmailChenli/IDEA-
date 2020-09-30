package com.example.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("输出测试");
    }

    @Deprecated
    void getSystem(){
        System.out.print("Deprecated测试");
        System.out.print("Deprecated测试");
        System.out.print("Deprecated测试");
        System.out.print("Deprecated测试");
    }
    @Test
    void getDeprecated(){
        this.getSystem();
        Date date = new Date(113,8,5);
    }
}
