package com.example.demoTIC.Business;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

   // @Query("select r from Restaurant r where r.nombre = ?1")
    Optional<Restaurant> findRestaurantByNombre(String nombre);

}
