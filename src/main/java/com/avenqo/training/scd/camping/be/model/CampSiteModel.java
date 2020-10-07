package com.avenqo.training.scd.camping.be.model;

import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Company;
import com.avenqo.training.scd.camping.be.entities.Site;

import java.util.logging.Logger;

public class CampSiteModel {

    // ----------- Constants ------------

    // ----------- Attributes ------------
    private Company company;
    private SiteDao siteDao = new SiteDao();

    // ----------- Construction ------------
    public CampSiteModel(SiteDataModel sitesDataModel) throws DaoConsistencyException {
        // Init Company
        company = new Company("Schöner Blick GmbH & Co. KG, 98765 Pimpelhaus, Am Weinberg 42", "DE12345678");
        if (sitesDataModel != null) {
            siteDao.addSites(sitesDataModel);
        }
    }

    // ----------- Methods ------------
    public Integer getNumberOfPlaces() {
        return siteDao.getAllSites().size();
    }

    public Company getCompany() {
        return new Company(company);
    }

    public Site get(String id) {
        return siteDao.getSite(id);
    }

}
