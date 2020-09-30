package com.avenqo.training.scd.camping.be.entities;

public enum BookingState {

	NEW, // booking is created, but not payed yet
	VERIFIED, // booking is possible, the site is in reservation
	CONFIRMED; // payment is confirmed
}
