package com.telusko.service;

import java.util.Collection;
import java.util.List;

import com.telusko.entity.Vaccine;

public interface IvaccineService {
	public List<Vaccine> fetchByCost(Double cost);
	public List<Vaccine> fetchByCostGreaterThanEqual(Double cost);
	public List<Vaccine> fetchByCostBetween(Double startingCost, Double endingCost );
	public List<Vaccine> fetchByVaccineCompanyIs(String name);
	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names,Double minCost,Double maxCost);
}

