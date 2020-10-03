package com.avenqo.training.scd.camping.be.model.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.model.CampSiteModel;

public class CampSiteModelTest {

	private CampSiteModel campSiteModel = null;
	
	@BeforeEach
	void initModel() throws InvalidDataException, DaoConsistencyException {
		campSiteModel = CampSiteModel.getInstance();
	}
	
	
	@Test
	void checkNumerOfPlaces() {
		assertEquals(122, campSiteModel.getNumberOfPlaces());
	}
}
