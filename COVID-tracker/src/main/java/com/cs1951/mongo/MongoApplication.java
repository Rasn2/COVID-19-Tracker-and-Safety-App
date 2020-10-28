package com.cs1951.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoApplication.class, args);

        String welcomeMessage = "===== 1951U-COVID-FinalProject =====";
        System.out.println(welcomeMessage);
    }

}
