package com.restaurant.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.restaurant.booking.domain.Restaurant;
import com.restaurant.booking.service.RestaurantService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class RestaurantMgmtController {
	
	@Autowired
	RestaurantService restaurantService; 

	@RequestMapping(value = "/createRestaurant", method=RequestMethod.POST)
	public ResponseEntity<?> createRestaurant(@RequestBody Restaurant restaurant) {
        log.info("inside create restaurant");
        restaurantService.saveRestaurant(restaurant);
        return new ResponseEntity<String>("Restaurant Saved successfully...",HttpStatus.OK);
    }

    @RequestMapping(value = "/searchRestaurant", method = RequestMethod.GET)
    public ResponseEntity<?> searchRestaurant(@RequestParam String pincode) {
        log.info("search booking");
        List<Restaurant> resultList = restaurantService.findRestaurantByPincode(pincode);
        return new ResponseEntity<List<Restaurant>>(resultList,HttpStatus.OK);
    }
}
