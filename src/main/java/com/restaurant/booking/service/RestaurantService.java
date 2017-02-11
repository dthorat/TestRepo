package com.restaurant.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.booking.domain.Restaurant;
import com.restaurant.booking.repository.IRestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	IRestaurantRepository restaurantRepository;

	public void saveRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	public List<Restaurant> findRestaurantByPincode(String pincode) {
		return restaurantRepository.findRestaurantByAddressPincode(pincode);
	}

}
