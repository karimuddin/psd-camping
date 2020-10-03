package com.avenqo.training.scd.camping.be.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.avenqo.training.scd.camping.be.bdd.utilities.DateUtility;
import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.entities.BookingEntry;
import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.Customer;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;
import com.avenqo.training.scd.camping.be.model.BookingModel;
import com.avenqo.training.scd.camping.be.model.CampSiteModel;

public class BookingModelTest {

	private BookingModel bookingModel = null;
	
	@BeforeEach
	void initModel() throws InvalidDataException, DaoConsistencyException {
		bookingModel = BookingModel.getInstance();
	}

	@Test
	void createBookingSuccessfully() throws InvalidDataException, DaoConsistencyException {
		int num = bookingModel.getNumberOfBookings();
		
		BookingEntry bookingEntry = new BookingEntry();
		bookingEntry.setCustomer(createCustomer());
		bookingEntry.setArrivalDate(DateUtility.incrementDays(new Date(), 2));
		bookingEntry.setArrivalDate(DateUtility.incrementDays(new Date(), 12));
		bookingEntry.setSite(new Site("someId", Category.Chalet));
		
		bookingModel.create (bookingEntry);
		assertEquals(num+1, bookingModel.getNumberOfBookings());
	}

	private Customer createCustomer() {
		return new Customer("last","first","e@d.de","987654321");
	}
}
