package com.example.demo.login;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        for(int i=0 ; i<100 ;  i++) {
            int ran1 = r.nextInt(99);
            System.out.println(ran1);
        }
    }
}
