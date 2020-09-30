package com.avenqo.training.scd.camping.be.entities;

import org.apache.commons.validator.routines.EmailValidator;

public class Customer {
	private String lastName;
	private String firstName;
	private String eMail;
	private String phone;

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

}
