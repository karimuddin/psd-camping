package com.avenqo.training.scd.camping.be.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.avenqo.training.scd.camping.be.entities.BookingEntry;


public class BookingEntryDao {

	// ----------- Attributes ------------

	private Map<Long, BookingEntry> mapBookings;

	// ----------- Methods ------------

	public BookingEntry getBooking(Long id) {
		return mapBookings.get(id);
	}

	public BookingEntry create(BookingEntry bookingEntry) throws DaoConsistencyException {
		if (mapBookings.containsKey(bookingEntry.getId()))
			throw new DaoConsistencyException("ID [" + bookingEntry.getId() + "] already exists!");
		mapBookings.put(bookingEntry.getId(), bookingEntry);
		return bookingEntry;
	}

	public List<BookingEntry> getAllBookings() {

		List<BookingEntry> list = new ArrayList<BookingEntry>();

		for (BookingEntry booking : mapBookings.values())
			list.add(booking);
		return list;
	}

	// ----------- Construction ------------

	private static BookingEntryDao instance = null;

	private BookingEntryDao() {
		mapBookings = new HashMap<>();
	}

	public static BookingEntryDao getInstance() {
		if (instance == null) {
			instance = new BookingEntryDao();
		}
		return instance;
	}

}
