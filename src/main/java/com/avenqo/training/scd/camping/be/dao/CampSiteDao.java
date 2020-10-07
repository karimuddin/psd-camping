package com.avenqo.training.scd.camping.be.dao;

import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.Site;

import java.util.List;

/**
 * Class CampSiteDao.
 *
 * @author GFT Technologies SE
 */
public interface CampSiteDao {
    public List<Site> getSitesByCategory(Category category);
}
