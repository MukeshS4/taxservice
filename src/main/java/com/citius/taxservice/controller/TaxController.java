package com.citius.taxservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.citius.taxservice.model.Tax;
import com.citius.taxservice.service.TaxService;

@RestController
public class TaxController {
	private static Logger log = LoggerFactory.getLogger(TaxController.class);

	@Autowired
	private TaxService taxService;

	@GetMapping("/taxes")
	public List<Tax> getTaxes() {
		return taxService.getAll();

	}

	@GetMapping("/taxes/{id}")
	public Tax getTax(@PathVariable int id) {
		log.info("Tracing Taxes");

		return taxService.getTax(id);
	}

}
