package com.avenqo.training.scd.camping.be.entities;

import java.util.Date;

public class BookingEntry {

	private Long id;
	private Customer customer;
	private Date arrivalDate;
	private Date departureDate;
	private Site site;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getArrivalDate() {
		Object d = arrivalDate.clone();
		return d instanceof Date ? (Date) d : null;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = new Date (arrivalDate.getTime());
	}

	public Date getDepartureDate() {
		Object d = departureDate.clone();
		return d instanceof Date ? (Date) d : null;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = new Date(departureDate.getTime());
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}
