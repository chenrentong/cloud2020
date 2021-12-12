package com;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author chenrentong
 * @create 2021-12-11 20:00
 */
public class AA {
    public static void main(String[] args) {
       String aa= new BCryptPasswordEncoder().encode("nacos");
        System.out.println(aa);
    }
}
