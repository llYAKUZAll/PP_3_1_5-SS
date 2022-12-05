package ru.kata.spring.boot_security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityDemoApplication.class, args);
        System.out.println("ЛОГИН: kladmin@mail.ru ПАРОЛЬ:111");
        System.out.println("ЛОГИН: user@mail.ru ПАРОЛЬ:111");
    }
}
