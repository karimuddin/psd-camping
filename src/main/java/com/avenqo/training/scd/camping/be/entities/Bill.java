package com.avenqo.training.scd.camping.be.entities;

import java.io.File;

public class Bill {

	private String billId;

	private Company company;
	private Customer customer;
	private BookingEntry bookingEntry;

	// MwSt-Satz
	private float taxRate;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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

	public float getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}

}
