package com.avenqo.training.scd.camping.be.entities.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.Site;

public class SiteTest {

	@Test
	void checkCategory() {
		Site c = new Site();
		c.setCategory(Category.Chalet);
		assertEquals(Category.Chalet, c.getCategory());
	}

	@Test
	void checkId() {
		String parameter = "987";
		Site c = new Site();
		c.setIdString(parameter);
		assertEquals(parameter, c.getIdString());
	}
}
