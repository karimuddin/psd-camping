package com.avenqo.training.scd.camping.be.model.test;

import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.model.CampSiteModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

    @Test
    void getSiteExisting() {
        assertNotNull(campSiteModel.get("22"));
    }

    @Test
    void getSiteNotExisting() {
        assertNull(campSiteModel.get("150"));
    }

    @Test
    void getCompanyNotNull() {
        assertNotNull(campSiteModel.getCompany());
    }
}
