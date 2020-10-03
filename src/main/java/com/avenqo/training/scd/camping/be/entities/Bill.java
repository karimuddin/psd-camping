package com.avenqo.training.scd.camping.be.entities;

public class Bill {

	private String billId;

	private Company company;
	private Customer customer;
	private BookingEntry bookingEntry;

	public String getId() {
		return billId;
	}

	public void setId(String billId) {
		this.billId = billId;
	}

	public Company getCompany() {
		return new Company(company);
	}

	public void setCompany(Company company) {
		
		this.company = new Company(company);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BookingEntry getBookingEntry() {
		return bookingEntry;
	}

	public void setBookingEntry(BookingEntry bookingEntry) {
		this.bookingEntry = bookingEntry;
	}
}
