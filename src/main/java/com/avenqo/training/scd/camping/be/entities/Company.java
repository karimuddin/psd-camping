package com.avenqo.training.scd.camping.be.entities;

import java.util.Objects;

public class Company {

	private String address;
	private String taxNumber;

	public Company(String adr, String taxNum) {
		address = adr;
		taxNumber = taxNum;
	}

	public Company(Company company) {
		address = company.address;
		taxNumber = company.taxNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Company) {
			Company c = (Company) o;
			return Objects.equals(c.address, address) && Objects.equals(c.taxNumber, taxNumber);
		}
		return false;
	}

	@Override
	public int hashCode() {
	    return Objects.hash(address, taxNumber);
	}
}
