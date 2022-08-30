package com.example.demoTIC.Business;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getRestaurants(){
        return restaurantRepository.findAll();
    }

    public void addNewRestaurant(Restaurant restaurant) {
        Optional<Restaurant> temp=restaurantRepository.findRestaurantByNombre(restaurant.getNombre());

        if(temp.isPresent()){
            throw new IllegalStateException("restaurante ya agregado");
        }
        restaurantRepository.save(restaurant);
    }
}
