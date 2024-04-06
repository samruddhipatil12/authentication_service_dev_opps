package org.dnyanyog.service;

import java.util.Optional;

import org.dnyanyog.dto.DiscountRequest;
import org.dnyanyog.dto.DiscountResponse;
import org.dnyanyog.entity.Discount;
import org.dnyanyog.repo.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountImpl implements DiscountService {
	@Autowired
	DiscountRepository discountRepo; 
	@Override
	public Optional<DiscountResponse> addDiscount(DiscountRequest request) {
		 try {
	            DiscountResponse response = new DiscountResponse();

	            int discount = calculateDiscount(request.getAge());

	            if ("female".equalsIgnoreCase(request.getGender())) {
	                discount += 5;
	            }

	            saveDiscount(request.getAge(), request.getGender(), discount);

	            response.setDiscount(discount);

	            return Optional.of(response);
	        } catch (Exception e) {
	            return Optional.empty();
	        }
		
	}

	private int calculateDiscount(int age) {
		        if (age < 30) {
		            return 10;
		        } else if (age >= 30 && age < 60) {
		            return 5;
		        } else {
		            return 15;
		        }
	}

	private void saveDiscount(int age, String gender, int discount) {
		// TODO Auto-generated method stub
		  
        Discount discountTable = new Discount();
        discountTable.setAge(age);
        discountTable.setGender(gender);
        discountTable.setDiscount(discount);

        discountRepo.save(discountTable);
		
	}
	
}
