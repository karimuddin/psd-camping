package com.avenqo.training.scd.camping.be.dao.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;

public class SiteDaoTest {

	private SiteDao siteDao = SiteDao.getInstance();

	@Test
	void createRedundantSite() throws DaoConsistencyException, InvalidDataException {
		String ID = "123";
		siteDao.createSite(new Site(ID , Category.Chalet));
		
		Assertions.assertThrows(DaoConsistencyException.class, () -> {
			siteDao.createSite(new Site(ID , Category.Chalet));
	     }); 
	}

}
