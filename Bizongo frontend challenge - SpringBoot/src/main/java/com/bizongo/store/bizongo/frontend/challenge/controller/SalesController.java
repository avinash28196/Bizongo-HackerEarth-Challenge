package com.bizongo.store.bizongo.frontend.challenge.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.bizongo.store.bizongo.frontend.challenge.model.GlobalGameSales;
import com.bizongo.store.bizongo.frontend.challenge.repository.GlobalGameSaleRepository;

@CrossOrigin(allowedHeaders = "http://localhost:3000/")
@RestController
public class SalesController {
	
	@Autowired
	private GlobalGameSaleRepository globalGameSaleRepository;
	
	@GetMapping("/Games")
	public Page<GlobalGameSales> getAllGames(Pageable pageable){
		return globalGameSaleRepository.findAll(pageable);
	}
	


}
