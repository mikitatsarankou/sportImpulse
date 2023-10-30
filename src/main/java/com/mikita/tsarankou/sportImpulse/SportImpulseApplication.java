package com.mikita.tsarankou.sportImpulse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SportImpulseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportImpulseApplication.class, args);
    }

}
