package com.khuong2924.apibanhang;

import com.khuong2924.apibanhang.service.MauSacService;
import com.khuong2924.apibanhang.service.iplm.MauSacServiceIplm;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ApiBanHangApplication implements CommandLineRunner {

    public static void main(String[] args) {
         SpringApplication.run(ApiBanHangApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
