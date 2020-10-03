package com.avenqo.training.scd.camping.be.entities;

import java.util.Objects;

import org.apache.commons.validator.routines.EmailValidator;

public class Customer {
	private String lastName;
	private String firstName;
	private String eMail;
	private String phone;

	public Customer() {	
	}
	
	public Customer(String _lastName, String _firstName, String _eMail, String _phone) {
		lastName = _lastName;
		firstName = _firstName;
		eMail = _eMail;
		phone = _phone;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String email) throws InvalidDataException {
		if (EmailValidator.getInstance().isValid(email))
			this.eMail = email;
		else
			throw new InvalidDataException("EMail-Format is invalid for [" + email + "].");
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer) {
			Customer c = (Customer) o;
			return Objects.equals(c.eMail, eMail) && Objects.equals(c.lastName, lastName)
					&& Objects.equals(c.firstName, firstName) && Objects.equals(c.phone, phone);
		}
		return false;
	}
}
