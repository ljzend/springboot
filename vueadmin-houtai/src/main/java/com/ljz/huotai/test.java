package com.ljz.huotai;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName : test
 * @Description :
 * @Author : ljz
 * @Date: 2022/3/8  19:48
 */

public class test {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("456"));
            System.out.println(bCryptPasswordEncoder.matches("456", "$2a$10$ZdzYHQ78dYOiKM6b8UBl8O8v9pVd/pXMoXfpdgGGM5kbbq9Yv9XKO"));
    }
}
//$2a$10$ZdzYHQ78dYOiKM6b8UBl8O8v9pVd/pXMoXfpdgGGM5kbbq9Yv9XKO
