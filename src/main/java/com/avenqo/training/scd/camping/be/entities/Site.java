package com.avenqo.training.scd.camping.be.entities;

public class Site {

	private String idString;
	private Category category;

	public Site(String id, Category c) throws InvalidDataException {
		if (id == null) throw new InvalidDataException();
		if (c == null) throw new InvalidDataException();
		idString = id;
		category = c;
	}

	public String getIdString() {
		return idString;
	}

	public void setIdString(String idString) {
		this.idString = idString;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
