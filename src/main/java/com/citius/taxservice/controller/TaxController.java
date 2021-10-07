package com.citius.taxservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citius.taxservice.model.Tax;
import com.citius.taxservice.service.TaxService;

@RestController
public class TaxController {

	@Autowired
	private TaxService taxService;
	@GetMapping("/taxes")
	public List<Tax> getTaxes(){
		return taxService.getAll();
		
	}
}
