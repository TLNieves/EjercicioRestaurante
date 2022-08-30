package com.example.demoTIC.Business;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RestaurantConfig {
    @Bean
    CommandLineRunner commandLineRunner(RestaurantRepository repository) {
        return args -> {
                    Restaurant club= new Restaurant(
                            1L,
                            "Club de la Papa Frita",
                            2L,
                            "Rivera esq 20 de Setiembre"
                    );

            Restaurant harlem= new Restaurant(
                    2L,
                    "Harlem",
                    3L,
                    "Rivera esq pdte oribe"
            );
            repository.saveAll(List.of(club,harlem));
        };

    }
}
