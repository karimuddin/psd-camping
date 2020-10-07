package com.avenqo.training.scd.camping.be.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Company;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;

public class CampSiteModel {

	// ----------- Constants ------------

	final private static Logger LOG = Logger.getLogger(CampSiteModel.class.getName());

	// ----------- Attributes ------------

	private Company company = null;
	private SiteDao siteDao = new SiteDao();

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

	// ----------- Construction ------------

	private static CampSiteModel instance = null;

	static {
		try {
			instance = new CampSiteModel(new SiteDataModel());
		} catch (DaoConsistencyException | InvalidDataException e) {
			LOG.log(Level.SEVERE, "CampSiteModel isn't successfully initialized!", e);
		}
	}

	public CampSiteModel(SiteDataModel sitesDataModel) throws DaoConsistencyException, InvalidDataException {
		// Init Company
		company = new Company("Schöner Blick GmbH & Co. KG, 98765 Pimpelhaus, Am Weinberg 42", "DE12345678");
		if (sitesDataModel != null ) {
			siteDao.addSites(sitesDataModel);
		}
	}

//	public static CampSiteModel getInstance() throws InvalidDataException, DaoConsistencyException {
//		return instance;
//	}

	

}
