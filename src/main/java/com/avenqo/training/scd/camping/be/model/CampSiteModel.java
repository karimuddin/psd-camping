package com.avenqo.training.scd.camping.be.model;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.Company;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;

public class CampSiteModel {

	final private static Logger LOG = Logger.getLogger(CampSiteModel.class.getName());
	
	// ----------- Attributes ------------

	private Company company = null;
	private SiteDao siteDao = SiteDao.getInstance();

	// ----------- Methods ------------

	public Integer getNumberOfPlaces() {
		return siteDao.getAllSites().size();
	}

	// ----------- Construction ------------
	private static CampSiteModel instance = null;

	static {
		try {
			instance = new CampSiteModel();
		} catch (DaoConsistencyException | InvalidDataException e) {
			LOG.log(Level.SEVERE, "CampSiteModel isn't successfully initialized!", e);
		}
	}

	
	private CampSiteModel() throws DaoConsistencyException, InvalidDataException {
		// Init Company
		company = new Company();
		company.setAddress("Schöner Blick GmbH & Co. KG, 98765 Pimpelhaus, Am Weinberg 42");
		company.setTaxNumber("DE12345678");

		for (int i = 1; i <= 149; i++) {

			// Init category
			Category category = null;
			if (i > 0 && i <= 46)
				category = Category.BC;
			else if (i >= 47 && i <= 70)
				category = Category.D;
			else if (i == 72)
				category = Category.Chalet;
			else if (i == 77)
				category = Category.Chalet;
			else if (i >= 83 && i <= 87)
				category = Category.Chalet;
			else if (i >= 90 && i <= 93)
				category = Category.Chalet;
			else if (i >= 106 && i <= 118)
				category = Category.BC;
			else if (i >= 119 && i <= 143)
				category = Category.D;
			else if (i == 149)
				category = Category.Chalet;
			else
				continue;

			Site site = new Site(Integer.toString(i), category);
			siteDao.createSite(site);
		}

		siteDao.createSite(new Site("sfr1", Category.Chalet));
		siteDao.createSite(new Site("sfr3", Category.Chalet));
	}

	public static CampSiteModel getInstance() throws InvalidDataException, DaoConsistencyException {
		return instance;
	}

}
