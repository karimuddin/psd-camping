package com.avenqo.training.scd.camping.be.model.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
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
import com.avenqo.training.scd.camping.be.util.RandomUtility;

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
		bookingEntry.setSite(createSite());

		bookingModel.create(bookingEntry);
		assertEquals(num + 1, bookingModel.getNumberOfBookings());
	}

	@Test
	void createBookingFailed4RedundantId() throws InvalidDataException, DaoConsistencyException {
		BookingEntry bookingEntry = new BookingEntry(createCustomer(), new Date(), new Date(), createSite());
		bookingEntry.setId(1L);

		bookingModel.create(bookingEntry);
		Assertions.assertThrows(DaoConsistencyException.class, () -> {
			bookingModel.create(bookingEntry);
		});
	}
	
	@Test
	void getBooking4Id() throws InvalidDataException, DaoConsistencyException {
		Long ID = RandomUtility.generateLong();
		
		BookingEntry bookingEntry = new BookingEntry(createCustomer(), new Date(), new Date(), createSite());
		bookingEntry.setId(ID);
		bookingModel.create(bookingEntry);
		
		BookingEntry bookingEntry2 = bookingModel.get(ID);
		assertEquals (bookingEntry, bookingEntry2);
		
		assertNull (bookingModel.get(2L));
	}
	
	

	private Customer createCustomer() {
		return new Customer("last", "first", "e@d.de", "987654321");
	}

	private Site createSite() throws InvalidDataException {
		return new Site("someId", Category.Chalet);
	}
}
