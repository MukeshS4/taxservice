package com.citius.taxservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.citius.taxservice.model.Tax;

@Service
public class TaxService {

	private List<Tax> taxes = new ArrayList<Tax>();

	public TaxService() {
		taxes.add(new Tax(1, 1, 0.5));
		taxes.add(new Tax(2, 2, 1.0));
	}

	public List<Tax> getAll() {
		return taxes;
	}

	public Tax getTax(int id) {
		return taxes.stream().filter((c) -> c.getId() == id).findFirst().get();
	}

}
