package com.muhammederen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories //bu rojede mongo kullanıldı bunu göz önünde bulundurur
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
