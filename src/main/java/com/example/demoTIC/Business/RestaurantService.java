package com.example.demoTIC.Business;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantService {

    public List<Restaurant> getRestaurants(){
        return List.of(
                new Restaurant(
                        1L,
                        "Club de la Papa Frita",
                        2L,
                        "Rivera esq 20 de Setiembre"
                ));
    }
}
