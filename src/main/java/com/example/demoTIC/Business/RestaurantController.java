package com.example.demoTIC.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<Restaurant> hola(){
        return restaurantService.getRestaurants();
    }
    @PostMapping
    public void registerNewRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addNewRestaurant(restaurant);
    }
}
