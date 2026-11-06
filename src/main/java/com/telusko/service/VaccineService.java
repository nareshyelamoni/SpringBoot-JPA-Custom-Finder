package com.telusko.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.entity.Vaccine;
import com.telusko.repo.IVaccineRepo;
@Service
public class VaccineService implements IvaccineService {
	
	private IVaccineRepo repo;
	
	@Autowired
	public void setRepo(IVaccineRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<Vaccine> fetchByCost(Double cost) {
		return repo.findByCost(cost);
	}

	@Override
	public List<Vaccine> fetchByCostGreaterThanEqual(Double cost) {
	
		return repo.findByCostGreaterThanEqual(cost);
	}

	@Override
	public List<Vaccine> fetchByCostBetween(Double startingCost, Double endingCost) {
		return repo.findByCostBetween(startingCost, endingCost);
	}

	@Override
	public List<Vaccine> fetchByVaccineCompanyIs(String name) {
		return repo.findByVaccineCompanyIs(name);
	}

	@Override
	public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names, Double minCost, Double maxCost) {
		return repo.findByVaccineNameInAndCostBetween(names, minCost, maxCost);
	}
	
	
}
