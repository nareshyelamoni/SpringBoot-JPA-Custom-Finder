package com.telusko;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.VaccineService;

@SpringBootApplication
public class NareshSpringJpaRepositoryCustomFinderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(NareshSpringJpaRepositoryCustomFinderApplication.class, args);
		VaccineService vaccineService = con.getBean(VaccineService.class);
		vaccineService.fetchByCost(950.0).forEach(v->System.out.println(v));
		vaccineService.fetchByCostGreaterThanEqual(950.0).forEach(v->System.out.println(v));
		vaccineService.fetchByCostBetween(1200.0,1500.0).forEach(v->System.out.println(v));
		vaccineService.fetchByVaccineCompanyIs("Serum Institute").forEach(v->System.out.println(v));
		Collection<String> vaccineName=new HashSet<String>();
		vaccineName.add("Rabies");
		vaccineName.add("Typhoid");
		vaccineService.fetchByVaccineNameInAndCostBetween(vaccineName, 500.0, 1500.0).forEach(v->System.out.println(v));
		
	}

}
