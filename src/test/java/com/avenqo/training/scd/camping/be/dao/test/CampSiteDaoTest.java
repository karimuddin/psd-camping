package com.avenqo.training.scd.camping.be.dao.test;

import com.avenqo.training.scd.camping.be.dao.CampSiteDao;
import com.avenqo.training.scd.camping.be.dao.CampSiteDaoImpl;
import com.avenqo.training.scd.camping.be.dao.DaoConsistencyException;
import com.avenqo.training.scd.camping.be.dao.SiteDao;
import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Class CampSiteDaoTest.
 *
 * @author GFT Technologies SE
 */
public class CampSiteDaoTest {

    private SiteDao siteDao;
    private CampSiteDao campSiteDao;

    @Before
    public void setup() {
        siteDao = SiteDao.getInstance();
        campSiteDao = new CampSiteDaoImpl(siteDao);
    }

    @Test
    public void getSitesByCategory() throws InvalidDataException, DaoConsistencyException {
        siteDao.createSite(new Site("1", Category.Chalet));
        siteDao.createSite(new Site("2", Category.BC));
        siteDao.createSite(new Site("3", Category.A));
        siteDao.createSite(new Site("4", Category.Chalet));

        List<Site> chalets = campSiteDao.getSitesByCategory(Category.Chalet);
        Assert.assertNotNull(chalets);
        Assert.assertEquals(2, chalets.size());
    }
}
