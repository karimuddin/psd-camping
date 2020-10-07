package com.avenqo.training.scd.camping.be.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.avenqo.training.scd.camping.be.entities.Site;
import com.avenqo.training.scd.camping.be.model.SiteDataModel;

public class SiteDao {

	// ----------- Attributes ------------

	private Map<String, Site> mapSites;

	// ----------- Methods ------------

	public Site getSite(String id) {
		return mapSites.get(id);
	}

	public Site createSite(Site site) throws DaoConsistencyException {
		if (mapSites.containsKey(site.getIdString()))
			throw new DaoConsistencyException("ID [" + site.getIdString() + "] already exists!");
		mapSites.put(site.getIdString(), site);
		return site;
	}

	public void addSites(SiteDataModel siteDataModel) throws DaoConsistencyException {
		for (Site site : siteDataModel.getSites()) {
			createSite(site);
		}
	}

	public List<Site> getAllSites() {

		List<Site> list = new ArrayList<Site>();

		for (Site site : mapSites.values())
			list.add(site);
		return list;
	}

	// ----------- Construction ------------

	public SiteDao() {
		mapSites = new HashMap<>();
	}

}
