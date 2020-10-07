package com.avenqo.training.scd.camping.be.dao;

import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.Site;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class CampSiteDaoImpl.
 *
 * @author GFT Technologies SE
 */
public class CampSiteDaoImpl implements CampSiteDao {

    private SiteDao siteDao;

    public CampSiteDaoImpl(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    @Override
    public List<Site> getSitesByCategory(Category category) {
        return siteDao.getAllSites().stream()
                .filter(s -> category.equals(s.getCategory()))
                .collect(Collectors.toList());
    }
}
