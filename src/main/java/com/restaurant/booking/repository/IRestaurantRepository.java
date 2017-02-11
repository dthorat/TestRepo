package com.restaurant.booking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.booking.domain.Restaurant;

@Repository
public interface IRestaurantRepository extends CrudRepository<Restaurant, String>{
	List<Restaurant> findRestaurantByAddressPincode(String pincode);
}
