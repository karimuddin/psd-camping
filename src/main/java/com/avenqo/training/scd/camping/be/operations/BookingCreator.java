package com.avenqo.training.scd.camping.be.operations;

import java.util.Date;

import com.avenqo.training.scd.camping.be.entities.BookingEntry;
import com.avenqo.training.scd.camping.be.entities.Customer;
import com.avenqo.training.scd.camping.be.entities.Site;

public class BookingCreator {

	public void create(Customer currentCustomer, Site site, Date dateArrival, Date dateDeparture)
			throws OperationFailedException {

		// Check date
		if (dateArrival == null || dateDeparture == null)
			throw new OperationFailedException("NULL date not allowed!");

		if (dateArrival.after(dateDeparture))
			throw new OperationFailedException("Inconsistency: arrival after departure?!");

		if (currentCustomer == null )
			throw new OperationFailedException("NULL customer not allowed!");
		
		if (site == null )
			throw new OperationFailedException("NULL site not allowed!");
		
		BookingEntry bookingEntry = new BookingEntry();
		bookingEntry.setArrivalDate(dateArrival);
		bookingEntry.setDepartureDate(dateDeparture);
		bookingEntry.setCustomer(currentCustomer);
		bookingEntry.setSite(site);

	}

}
