package com.avenqo.training.scd.camping.be.model;

import com.avenqo.training.scd.camping.be.dao.BookingEntryDao;
import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.entities.BookingEntry;
import com.avenqo.training.scd.camping.be.util.RandomUtility;

public class BookingModel {

	// ----------- Constants ------------

	// ----------- Attributes ------------

	private BookingEntryDao bookingDao = BookingEntryDao.getInstance();

	// ----------- Methods ------------

	public int getNumberOfBookings() {
		return bookingDao.getAllBookings().size();
	}

	public void create(BookingEntry bookingEntry) throws DaoConsistencyException {
		if (bookingEntry.getId() == null)
			bookingEntry.setId(RandomUtility.generateLong());
		bookingDao.create(bookingEntry);
	}
	// ----------- Construction ------------

	private static BookingModel instance = null;

	static {
		instance = new BookingModel();
	}

	private BookingModel() {
	}

	public static BookingModel getInstance() {
		return instance;
	}

	

}
