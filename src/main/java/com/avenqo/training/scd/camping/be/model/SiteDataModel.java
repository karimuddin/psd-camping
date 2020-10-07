package com.avenqo.training.scd.camping.be.model;

import com.avenqo.training.scd.camping.be.entities.Category;
import com.avenqo.training.scd.camping.be.entities.InvalidDataException;
import com.avenqo.training.scd.camping.be.entities.Site;

import java.util.ArrayList;
import java.util.List;

/**
 * Class CampSiteData.
 *
 * @author GFT Technologies SE
 */
public class SiteDataModel {

    List<Site> sites;

    public SiteDataModel() {
        this.sites = createSites();
    }

    public List<Site> getSites() {
        return sites;
    }

    private List<Site> createSites() {
        try {
            List<Site> sites = new ArrayList<>();
            for (int i = 1; i <= 149; i++) {

                // Init category
                Category category = null;
                if (i >= 1 && i <= 46)
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

                sites.add(new Site(Integer.toString(i), category));
            }

            sites.add(new Site("sfr1", Category.Chalet));
            sites.add(new Site("sfr3", Category.Chalet));

            return sites;
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }


    }
}
