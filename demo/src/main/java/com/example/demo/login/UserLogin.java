package com.example.demo.login;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserLogin {
    @PostMapping("login")
    public Map<String,String> login(@RequestBody String username){
        String st = "username";
        String[] usernames=username.split("=");
        System.out.println(st.equals(usernames[0])+":"+username.substring(0,username.length()-1)+":"+username.split("=").length);
        System.out.println(usernames[0]);
        Map<String,String> hashMap  = new HashMap<>();
        hashMap.put("username","admin");
        hashMap.put("password","000000");
        hashMap.put("token","200");
        return hashMap;
    }
}
