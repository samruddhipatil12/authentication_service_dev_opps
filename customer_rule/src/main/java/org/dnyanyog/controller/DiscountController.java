package org.dnyanyog.controller;

import java.util.Optional;

import org.dnyanyog.dto.DiscountRequest;
import org.dnyanyog.dto.DiscountResponse;
import org.dnyanyog.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

	@Autowired
	private DiscountService discountService;

	 @PostMapping(path = "/api/v1/cust/discount", consumes = { "application/json", "application/xml" }, produces = {
				"application/json", "application/xml" })
	 public Optional<DiscountResponse> addDiscount(@RequestBody DiscountRequest request) {
	       
	            return discountService.addDiscount(request);
	 }  
}