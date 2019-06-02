package com.bizongo.store.bizongo.frontend.challenge.repository;

import com.bizongo.store.bizongo.frontend.challenge.model.GlobalGameSales;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins="http://localhost:3000", allowedHeaders="http://localhost:3000", allowCredentials= "false")
@Repository
public interface GlobalGameSaleRepository extends PagingAndSortingRepository<GlobalGameSales, Integer>{

	Page<GlobalGameSales> findAll(Pageable pageable);
	

}
