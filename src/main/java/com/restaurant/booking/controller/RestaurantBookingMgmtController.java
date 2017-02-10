package com.restaurant.booking.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.booking.domain.RestaurantBooking;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/manage")
@Slf4j
public class RestaurantBookingMgmtController {

	@RequestMapping(path = "/createBooking", method=RequestMethod.POST)
	public void createBooking(@RequestBody RestaurantBooking restaurantBooking) {
        log.info("inside create booking");
    }

    @RequestMapping(path = "/searchBooking", method = RequestMethod.POST)
    public void searchBooking() {
        log.info("search booking");
    }
}
