package com.telusko.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.entity.Vaccine;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	public List<Vaccine> findByCost(Double cost);
	public List<Vaccine> findByCostGreaterThanEqual(Double cost);
	public List<Vaccine> findByCostBetween(Double startingCost, Double endingCost );
	public List<Vaccine> findByVaccineCompanyIs(String name);
	public List<Vaccine> findByVaccineNameInAndCostBetween(Collection<String> names,Double minCost,Double maxCost);
}
